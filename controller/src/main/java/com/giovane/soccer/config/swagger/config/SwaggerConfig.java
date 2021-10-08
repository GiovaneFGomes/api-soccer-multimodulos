package com.giovane.soccer.config.swagger.config;

import java.util.ArrayList;
import org.springframework.context.annotation.*;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.giovane.soccer"))
                .paths(regex("/api/v1/soccer/team.*"))
                .build()
                .apiInfo(metaInfo())
                .useDefaultResponseMessages(false);
    }

    private ApiInfo metaInfo() {
        return new ApiInfo(
                "Soccer API REST",
                "Soccer API to register football teams from all over the world",
                "v1.0",
                "Terms of service",
                new Contact(
                        "Giovane Gomes",
                        "https://www.linkedin.com/in/giovane-gomes/",
                        "giovanefernandes35@gmail.com"),
                "Apache 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0.html", new ArrayList<>()
        );
    }

}
