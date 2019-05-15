package boc.cn.eurakerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakerServiceApplication.class, args);
    }

}
