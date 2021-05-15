package com.konecta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KonectaApplication  {

	public static void main(String[] args) {
		SpringApplication.run(KonectaApplication.class, args);
	}

	/*private ApplicationContext applicationContext;
	
	@Bean
	public SpringResourceTemplateResolver templateResolver() {
	    SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
	    templateResolver.setApplicationContext(this.applicationContext);
	    templateResolver.setPrefix("/resources/templates/");
	    templateResolver.setSuffix("index.html");
	    return templateResolver;
	}

	@Bean
	public SpringTemplateEngine templateEngine() {
	    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	    templateEngine.setTemplateResolver(templateResolver());
	    templateEngine.setEnableSpringELCompiler(true);
	    return templateEngine;
	}
	
	@Bean
	public ThymeleafViewResolver viewResolver() {
	    ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
	    viewResolver.setTemplateEngine(templateEngine());
	    return viewResolver;
	}*/
}
