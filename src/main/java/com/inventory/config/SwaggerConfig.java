/*package com.inventory.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	private String applicationName;

	public SwaggerConfig(@Value("${spring.application.name}") String applicationName) {
		this.applicationName = applicationName;
	}

	@Bean
	public Docket apiV1(TypeResolver typeResolver) {
		String version = "v1";

		return new Docket(DocumentationType.SWAGGER_2)
				.groupName(version)
				.apiInfo(getApiInfo(version, applicationName))
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.inventory.controller.v1"))
				.paths(PathSelectors.any())
				.build()
				.pathMapping("/");
	}

	private ApiInfo getApiInfo(String version, String applicationName) {
		return new ApiInfoBuilder()
				.title(applicationName)
				.version(version)
				.build();
	}
}*/