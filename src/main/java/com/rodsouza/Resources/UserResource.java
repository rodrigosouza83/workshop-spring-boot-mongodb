package com.rodsouza.Resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodsouza.domain.User;
import com.rodsouza.dto.UserDTO;
import com.rodsouza.services.UserService;

@RestController // Anotação para mostrar que a classe Resource é do tipo Rest.
@RequestMapping(value="/users")//Define o caminho do endpoint
public class UserResource {
	
	@Autowired
	
	private UserService service;
	
	
	//Criar um método que liste todos usuários:
	@GetMapping //Informa que o método abaixo será implementado no endpoint acima
	public ResponseEntity<List<UserDTO>> findAll(){
	
	/*	
	 * Código refatorado,após implementar Mongo.
	 * User maria = new User("1", "Maria Motta Russo", "maria_mota@gmail.com");
		User carlos = new User("2", "Carlos Dalberto Russo", "carlos.russo@gmail.com");
		User suellen = new User("3", "Suellen Russo de Souza", "suellensouza@gmail.com");
		User bruno = new User("4", "Bruno Motta Russo", "bruno_mota@gmail.com"); */
	
		List<User> list = service.findAll();
		List<UserDTO> listDto = list.stream().map(x ->  new UserDTO(x)).collect(Collectors.toList());
		// Refatorado -> list.addAll(Arrays.asList(maria, carlos, suellen, bruno));
		return ResponseEntity.ok(listDto);
		
		//ResponseEntity encapsula toda estrutura necessária para retornar resposta HTTP, como cabeçalhos etc.
  		
	} 

}
