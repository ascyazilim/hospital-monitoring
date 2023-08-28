package com.birkil.hospitalmonitoring.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public OpenAPI myApiDocumentation(){
        return new OpenAPI()
                .info(new Info()
                        .title("Birkil")
                        .description("Swagger 3")
                        .version("@"));
    }

}


