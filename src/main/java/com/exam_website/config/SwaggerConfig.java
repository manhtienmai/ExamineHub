package com.exam_website.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI examOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Exam API")
                        .description("API for exam management system^^")
                        .version("1.1.1"));
    }
}
