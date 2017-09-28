package com.xinyi.rent.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by wxy on 2017/9/25.
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    private final Logger log = LoggerFactory.getLogger(Swagger2.class);
    public static final String DEFAULT_INCLUDE_PATTERN = "/api/.*";
    @Bean
    public Docket createRestApi() {
        StopWatch watch = new StopWatch();
        watch.start();
        Docket swaggerSpringMvcPlugin = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .genericModelSubstitutes(ResponseEntity.class)
                .select()
                .paths(regex(DEFAULT_INCLUDE_PATTERN))
                .apis(RequestHandlerSelectors.basePackage("com.xinyi.rent.app.controller"))
                .build();
        watch.stop();
        log.debug("Started Swagger in {} ms", watch.getTotalTimeMillis());
        return swaggerSpringMvcPlugin;
    }



    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("rent接口说明")
                .description("")
                .termsOfServiceUrl("")
                .contact("team")
                .version("1.0")
                .build();
    }

}
