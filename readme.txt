1. 后端用到了redis因此要运行首先要在本地部署redis数据库
2. 数据库修改部分：
    actor表： 
	gender、age、department改成了int类型，
	introduction、telephone改成了string类型

3.目前上传的版本注册时可以不输入验证码就注册成功，因为短信平台每个用户的免费短信条数只有五条，
所以注释掉了短信验证的部分。
要实现短信验证：登录http://www.smschinese.cn/进行注册
		messageController中的Uid字段改为自己的用户名，key字段改为
		自己的key即可