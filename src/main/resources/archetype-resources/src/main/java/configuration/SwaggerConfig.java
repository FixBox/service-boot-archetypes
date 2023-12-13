package ${package}.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.beans.factory.annotation.Value;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${base.package}")
    private String basePkg;

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("standard")
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePkg.concat(".controllers.standard")))
                //.paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    @Bean
    public Docket productApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("mobile")
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePkg.concat(".controllers.mobile")))
                //.paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo2());
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot REST API")
                .description("Spring Boot REST API")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0").build();
    }

    private ApiInfo apiInfo2() {
        return new ApiInfoBuilder()
                .title("Spring Boot REST API 2")
                .description("Spring Boot REST API")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0").build();
    }


}