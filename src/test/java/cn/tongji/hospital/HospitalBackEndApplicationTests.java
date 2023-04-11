package cn.tongji.hospital;

import com.alibaba.druid.pool.DruidDataSource;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
class HospitalBackEndApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    private StringEncryptor encryptor;

    @Test
    void contextLoads() throws SQLException {
    }

    @Test
    public void getPass() {
        String host = encryptor.encrypt("aa");
        String password = encryptor.encrypt("aa");
        System.out.println("database host: " + host);
        System.out.println("database password: " + password);
        Assert.assertTrue(host.length() > 0);
        Assert.assertTrue(password.length() > 0);
    }

}
