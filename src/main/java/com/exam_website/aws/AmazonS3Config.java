package com.exam_website.aws;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class AmazonS3Config {
    @Value("${AWS_ACCESS_KEY_ID}")
    private String accessKeyId;

    @Value("${AWS_SECRET_ACCESS_KEY}")
    private String secretAccessKey;

    @Value("${AWS_S3_REGION}")
    private String region;

    @Bean
    public AmazonS3 amazonS3() {
        Basic
    }
}
