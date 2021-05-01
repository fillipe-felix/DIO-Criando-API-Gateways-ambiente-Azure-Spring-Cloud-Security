package com.api.dio.springbootjtw;

import com.api.dio.springbootjtw.entity.UserEntity;
import com.api.dio.springbootjtw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CriandoApiGatewaysNoAmbienteAzureSpringCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CriandoApiGatewaysNoAmbienteAzureSpringCloudApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
