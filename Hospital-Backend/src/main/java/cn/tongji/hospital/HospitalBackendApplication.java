package cn.tongji.hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.tongji.hospital.mapper")
@SpringBootApplication(scanBasePackages={ "cn" })
public class HospitalBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalBackendApplication.class, args);
    }

}
