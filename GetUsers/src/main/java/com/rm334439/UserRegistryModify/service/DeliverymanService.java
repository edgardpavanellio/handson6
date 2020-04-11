package com.rm334439.UserRegistryModify.service;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.rm334439.UserRegistryModify.repository.DeliverymanRepository;
import com.rm334439.UserRegistryModify.domain.Deliveryman;


@ComponentScan("com.rm334439.domain")
@Configuration
@Service
public class DeliverymanService implements UserService {
	
	
	private final DeliverymanRepository deliveryman_Repository;
	
	//@Autowired
	private Deliveryman deliveryman;

	//public ClientService(Client client, ClientRepository client_repository) {this.client = client;this.client_repository = client_repository;}
	
	@Autowired
	public DeliverymanService(final DeliverymanRepository deliveryman_Repository) {
		this.deliveryman_Repository = deliveryman_Repository;
		}
	
	

	@Override
	@Transactional
	public void add() {
		deliveryman_Repository.save(this.deliveryman);

	}

	@Override
	@Transactional
	public void remove() {
		// TODO Auto-generated method stub
		deliveryman_Repository.delete(this.deliveryman);

	}

	@Transactional
	public Optional<Deliveryman> findById(Long deliverymanId) {
		// TODO Auto-generated method stub
		return this.deliveryman_Repository.findById(deliverymanId);
	}
	
	@Transactional
	public Page<Deliveryman> listAll() {
		// TODO Auto-generated method stub
		return deliveryman_Repository.findAll(PageRequest.of(0, 20));
	}
	
	
	public void setDeliveryman(Deliveryman deliveryman)
	{
		this.deliveryman = deliveryman;
	}

	public Deliveryman getDeliveryman()
	{
		return this.deliveryman;
	}

	



	

}
