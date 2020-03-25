package com.rm334439.UserRegistryModify.service;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.rm334439.UserRegistryModify.repository.ClientRepository;
import com.rm334439.domain.user.Client;


@ComponentScan("com.rm334439.domain")
@Configuration
@Service
public class ClientService implements UserService {
	
	
	private final ClientRepository client_repository;
	
	//@Autowired
	private Client client;

	//public ClientService(Client client, ClientRepository client_repository) {this.client = client;this.client_repository = client_repository;}
	
	@Autowired
	public ClientService(final ClientRepository client_repository) {
		this.client_repository = client_repository;
		}
	
	

	@Override
	@Transactional
	public void add() {
		client_repository.save(this.client);

	}

	@Override
	@Transactional
	public void remove() {
		// TODO Auto-generated method stub
		client_repository.delete(this.client);

	}

	@Transactional
	public Optional<Client> findById(Long clientId) {
		// TODO Auto-generated method stub
		return this.client_repository.findById(clientId);
	}
	
	@Transactional
	public Page<Client> listAll() {
		// TODO Auto-generated method stub
		return client_repository.findAll(PageRequest.of(0, 20));
	}
	
	
	public void setClient(Client client)
	{
		this.client = client;
	}

	public Client getClient()
	{
		return this.client;
	}

	



	

}
