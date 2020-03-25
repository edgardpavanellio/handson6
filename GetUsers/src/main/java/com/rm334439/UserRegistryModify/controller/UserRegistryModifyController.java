package com.rm334439.UserRegistryModify.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.rm334439.UserRegistryModify.service.ClientService;
import com.rm334439.UserRegistryModify.service.DeliverymanService;
import com.rm334439.UserRegistryModify.service.RestaurantService;
import com.rm334439.domain.user.Client;
import com.rm334439.domain.user.Deliveryman;
import com.rm334439.domain.user.Restaurant;
import com.rm334439.domain.user.User;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")	
public class UserRegistryModifyController {
	
	private final ClientService clientService;
	private final RestaurantService restaurantService;
	private final DeliverymanService deliverymanService;
	
	public UserRegistryModifyController(final ClientService clientService,
										final DeliverymanService deliverymanService,
										final RestaurantService restaurantService)
	{
		this.restaurantService = restaurantService;
		this.deliverymanService = deliverymanService;
		this.clientService = clientService;
	}
	
	//GET /users --> user list
	@GetMapping
	 public ResponseEntity<List<Page<UserReponse>>> userlist(){
		
		Page<UserReponse> clients = this.clientService.listAll().map(UserReponse::new);
		Page<UserReponse> restaurantes = this.restaurantService.listAll().map(UserReponse::new);
		Page<UserReponse> deliverymans = this.deliverymanService.listAll().map(UserReponse::new);
		
		List<Page<UserReponse>> users = new ArrayList<Page<UserReponse>>();
		users.add(clients);
		users.add(restaurantes);
		users.add(deliverymans);
		
	 return ResponseEntity.ok(users);
	 }
	 
	
	//GET /users/1 -- user details
	
	 @GetMapping(path = "{id}")
	 public ResponseEntity<User> userDetails(@PathVariable("id") Long userId){
		 
		final Optional<Client> clientbById = this.clientService.findById(userId);
		
		if(clientbById.isPresent()) {
			return ResponseEntity.ok(clientbById.get());
		}
		else
		{
			final Optional<Restaurant> restaurantById = this.restaurantService.findById(userId);
			
			if(restaurantById.isPresent()) {
				return ResponseEntity.ok(restaurantById.get());
			}
			else
			{
				final Optional<Deliveryman> deliverymanById = this.deliverymanService.findById(userId);
				
				if(deliverymanById.isPresent()) {
					return ResponseEntity.ok(deliverymanById.get());
				}
			}
			
		}
			
		
		return ResponseEntity.notFound().build();
	 }
	 
}
