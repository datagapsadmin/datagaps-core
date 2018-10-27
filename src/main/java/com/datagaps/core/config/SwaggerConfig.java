package com.datagaps.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.datagaps.core.controllers"))
                .paths(regex("/api.*"))
                .build().apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        ApiInfo info = new ApiInfo("Datagaps Core Spring API", "Datagaps Core Spring boot with swagger", "1.0",
                "Terms of service", new Contact("Datagaps", "www.datagaps.com", "contact@datagaps.com"),
                "datagaps license version 1.0", "www.datagaps.com/license", new ArrayList<>());
        return info;
    }
}
