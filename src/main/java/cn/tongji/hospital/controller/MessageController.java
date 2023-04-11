package cn.tongji.hospital.controller;

import cn.tongji.hospital.util.HttpClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**  
 * @Title: http://www.smschinese.cn/api.shtml
 * @date 2011-3-22
 * @version V1.2  
 */
@CrossOrigin
@RestController
public class MessageController {
	@Autowired
	private RedisTemplate<String,Object> redisTemplate;
	//用户名
	private static String Uid = "cyff";
	
	//接口安全秘钥
	private static String Key = "3BDC775318043406D9B365F5E379C3C7";
	
	//手机号码，多个号码如13800000000,13800000001,13800000002
	private static String smsMob = "19117215562";
	
	//短信内容
	private static String smsText = "验证码：";


	@GetMapping("/pin")
	public  boolean sendMsg(String mob) {

		HttpClientUtil client = HttpClientUtil.getInstance();
		//生成随机验证码
		String code="";
		for (int i = 0; i < 100000; i++) {
			code =  String.valueOf((int)((Math.random()*9+1)*Math.pow(10,5)));
		}
		String text=smsText+code;

		//UTF发送
		int result = client.sendMsgUtf8(Uid, Key, text, mob);
		if(result>0){
			System.out.println("UTF8成功发送条数=="+result);
		}else{
			System.out.println(client.getErrorMsg(result));
		}

		//设置redis的key，这里设置为项目名:使用的字段:手机号
		String redisKey=mob;
		//将这个验证码存入redis中，并设置失效时间为1分钟
		redisTemplate.opsForValue().set(redisKey,code,60, TimeUnit.SECONDS);
		return true;
	}

	@PostMapping(value = "/user/pin")
	public boolean checkCode(String phone,String pin){
		String redisKey=phone;
		String realCode= (String) redisTemplate.opsForValue().get(redisKey);
		if (realCode!=null&&realCode.equals(pin)){
			return true;
		}else {
			return false;
		}
	}
}
