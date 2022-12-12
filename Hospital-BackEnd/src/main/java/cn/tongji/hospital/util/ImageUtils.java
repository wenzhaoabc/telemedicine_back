package cn.tongji.hospital.util;

import org.apache.commons.codec.binary.Base64;
import org.springframework.web.multipart.MultipartFile;

public class ImageUtils {
    public static MultipartFile base64ToMultipartFile(String base64) {
        //base64编码后的图片有头信息所以要分离出来 [0]data:image/png;base64, 图片内容为索引[1]
        String[] baseStrs = base64.split(",");
//
        //取索引为1的元素进行处理
        byte[] b = Base64.decodeBase64(base64);
        for (int i = 0; i < b.length; ++i) {
            if (b[i] < 0) {
                b[i] += 256;
            }
        }

        //处理过后的数据通过Base64DecodeMultipartFile转换为MultipartFile对象
        return new Base64DecodeMultipartFile(b, baseStrs[0]);
    }
}