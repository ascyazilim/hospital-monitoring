package com.birkil.hospitalmonitoring.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//@EnableSwagger2
public class SwaggerConfiguration {

    /*@Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.birkil"))
                .paths(PathSelectors.any())
                .build();
    }
*/
    @Bean
    public OpenAPI myApiDocumentation(){
        return new OpenAPI()
                .info(new Info()
                        .title("Birkil")
                        .description("Swagger 3")
                        .version("@"));
    }

}


