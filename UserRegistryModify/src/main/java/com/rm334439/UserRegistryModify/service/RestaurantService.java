package com.rm334439.UserRegistryModify.service;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.rm334439.UserRegistryModify.repository.RestaurantRepository;
import com.rm334439.domain.user.Restaurant;


@ComponentScan("com.rm334439.domain")
@Configuration
@Service
public class RestaurantService implements UserService {
	
	
	private final RestaurantRepository restaurant_repository;
	
	//@Autowired
	private Restaurant restaurant;

	//public ClientService(Client client, ClientRepository client_repository) {this.client = client;this.client_repository = client_repository;}
	
	@Autowired
	public RestaurantService(final RestaurantRepository restaurant_repository) {
		this.restaurant_repository = restaurant_repository;
		}
	
	

	@Override
	@Transactional
	public void add() {
		restaurant_repository.save(this.restaurant);

	}

	@Override
	@Transactional
	public void remove() {
		// TODO Auto-generated method stub
		restaurant_repository.delete(this.restaurant);

	}

	@Transactional
	public Optional<Restaurant> findById(Long restaurantId) {
		// TODO Auto-generated method stub
		return this.restaurant_repository.findById(restaurantId);
	}
	
	@Transactional
	public Page<Restaurant> listAll() {
		// TODO Auto-generated method stub
		return restaurant_repository.findAll(PageRequest.of(0, 20));
	}
	
	
	public void setRestaurant(Restaurant restaurant)
	{
		this.restaurant = restaurant;
	}

	public Restaurant getRestaurant()
	{
		return this.restaurant;
	}

	



	

}
