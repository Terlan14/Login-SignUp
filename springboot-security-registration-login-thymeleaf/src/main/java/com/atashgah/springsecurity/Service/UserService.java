package com.atashgah.springsecurity.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.atashgah.springsecurity.model.User;
import com.atashgah.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

}
