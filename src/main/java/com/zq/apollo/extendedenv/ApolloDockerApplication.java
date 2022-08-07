package com.zq.apollo.extendedenv;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig(value = "application")
public class ApolloDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloDockerApplication.class, args);
    }

}
