package net.javaguides.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import net.javaguides.springboot.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import net.javaguides.springboot.model.Role;

@Entity
//@Table(name = "role")


//@Configuration

public class Role {
	
	//@org.springframework.beans.factory.annotation.Autowired(required=true)
	//@javax.persistence.Id()
	//@javax.persistence.GeneratedValue(strategy=GenerationType.IDENTITY, generator="")
	
	//@Autowired
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String name;
	
	public Role() {
		
	
		
	}
	
//	public Role(Long id) {
//		super();
//		this.id = id;
//	}
	
	public Role(String name) {
		super();
		this.name = name;
	}
	
	public Long getId() {
		return id;
		
	}
	
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