package com.rodsouza.Resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodsouza.domain.User;

@RestController // Anotação para mostrar que a classe Resource é do tipo Rest.
@RequestMapping(value="/users")//Define o caminho do endpoint
public class UserResource {
	
	
	//Criar um método que liste todos usuários:
	@GetMapping //Informa que o método abaixo será implementado no endpoint acima
	public ResponseEntity<List<User>> findAll(){
	
		User maria = new User("1", "Maria Motta Russo", "maria_mota@gmail.com");
		User carlos = new User("2", "Carlos Dalberto Russo", "carlos.russo@gmail.com");
		User suellen = new User("3", "Suellen Russo de Souza", "suellensouza@gmail.com");
		User bruno = new User("4", "Bruno Motta Russo", "bruno_mota@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, carlos, suellen, bruno));
		return ResponseEntity.ok(list);
		
		//ResponseEntity encapsula toda estrutura necessário para retornar resposta HTTP, como cabeçalhos etc.
  		
	} 

}
