package net.javaguides.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
//@Component
@ComponentScan
@Entity
//@Table(name = "role")

//@Configuration

public class Role {
	
	@org.springframework.beans.factory.annotation.Autowired(required=true)
	@javax.persistence.Id()
	@javax.persistence.GeneratedValue(strategy=GenerationType.IDENTITY, generator="")
	
	//@Autowired
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String name;
	
	public Role() {
		
	}
	
	public Role(String name) {
		super();
		this.name = name;
	}
    @Bean
	public Long getId() {
		return id;
		
	}
	@Bean
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}