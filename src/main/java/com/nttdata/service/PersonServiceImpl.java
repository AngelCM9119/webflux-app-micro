package com.nttdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

import com.nttdata.clases.Person;
import com.nttdata.controller.PersonServiceI;

import reactor.core.publisher.Flux;

/**
 * Servicio
 * @author Angel
 *
 */
@Service
public class PersonServiceImpl implements PersonServiceI
{
	
	@Override
	public Flux<Person> getAllPerson()
	{
		WebClient.create("http://localhost:8080/person-list-1");
		WebClient.create("http://localhost:8080/person-list-2");
		WebClient.create("http://localhost:8080/person-list-3");
		WebClient.create("http://localhost:8080/person-list-4");
		return null;
	}
	
}
