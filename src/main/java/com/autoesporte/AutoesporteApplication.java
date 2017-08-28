package com.autoesporte;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.controller.AutoesporteController;
import com.service.AutoesporteService;

@SpringBootApplication
@ComponentScan(basePackageClasses = AutoesporteController.class)
public class AutoesporteApplication extends SpringBootServletInitializer {	
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AutoesporteApplication.class);
    }

	@Bean
	public AutoesporteService autoesporteService(){
		return new AutoesporteService();
	}
	
	@Bean	
	public DataSource dataSource(Environment environment) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/Condominio");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        
        return dataSource;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(AutoesporteApplication.class, args);
	}
}
