package net.javaguides.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.dto.UserRegistrationDto;
import net.javaguides.springboot.model.User;
@Service
public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}