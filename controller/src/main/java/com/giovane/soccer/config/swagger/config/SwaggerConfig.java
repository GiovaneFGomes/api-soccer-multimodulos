package com.giovane.soccer.config.swagger.config;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;
import org.springframework.context.annotation.*;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("Soccer API REST")
                        .description("Soccer API to register football teams from all over the world")
                        .version("v1.0")
                        .contact(new Contact()
                                .name("Giovane Gomes")
                                .url("https://www.linkedin.com/in/giovane-gomes/")
                                .email("giovanefernandes35@gmail.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")))
                .externalDocs(new ExternalDocumentation()
                        .description("Link to the project on GitHub")
                        .url(""));
    }

}
