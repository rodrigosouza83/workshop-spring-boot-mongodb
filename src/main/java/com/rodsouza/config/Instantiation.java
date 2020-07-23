package com.rodsouza.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.rodsouza.domain.User;
import com.rodsouza.repository.UserRepository;

//Anotação para o Spring entender que é uma configuração

@Configuration
public class Instantiation implements CommandLineRunner {

	//Injetar os dados no banco
	@Autowired
	
	 private UserRepository userRepository; 	
	
	@Override
	public void run(String... args) throws Exception {

		/*instanciar os objetos e salvar no banco de dados (MongoDB)
		O ID será Null, pois o próprio Mongo irá definir o ID de cada objeto.
		*/
		
		//método para limpar a coleção user no MongoDB
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		
		//método para salvar usuários no MongoDB
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		
	}

	
}
