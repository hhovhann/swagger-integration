package com.hhovhann.swaggerintegration.configuration.swagger;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class OpenApiConfig implements WebMvcConfigurer {
    @Bean
    public GroupedOpenApi userOpenApi() {
        String packagesToScan[] = {"com.hhovhann.swaggerintegration.controller.Api", "com.hhovhann.swaggerintegration.controller.FileController", "com.hhovhann.swaggerintegration.controller.TestApi"};
        return GroupedOpenApi.builder()
                .group("sec")
                .packagesToScan(packagesToScan)
//                .pathsToMatch("**/sec/api/**")
                .build();
    }

    @Bean
    public OpenAPI customOpenAPI(@Value("${application-description}") String appDesciption, @Value("${application-version}") String appVersion) {
        return new OpenAPI()
                .components(new Components().addSecuritySchemes("basicScheme", new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
                .info(new Info().title("Spring API").version(appVersion).description(appDesciption).license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}