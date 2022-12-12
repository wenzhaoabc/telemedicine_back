package cn.tongji.hospital.util;

/**
 * @Author 赵帅涛
 * @Createtime 2022年12月9日
 */
public class UniqueIdUtil {
    private static final long LIMIT = 10000000000L;
    private static long next = 0;

    public static String getID() {
        // 生成10位唯一ID
        long id = System.currentTimeMillis() % LIMIT;
        if (id <= next) {
            id = (next + 1) % LIMIT;
        }
        next = id;
        return String.valueOf(id);
    }
}
