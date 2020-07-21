package com.rodsouza.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodsouza.domain.User;
import com.rodsouza.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired // para instanciar um objeto do tipo UserRepository, para "conversar" com a camada de Serviço
	private UserRepository repo;
	
	public List<User> findAll(){
		
		return repo.findAll();

	}
}
