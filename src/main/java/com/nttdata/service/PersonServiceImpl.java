package com.nttdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

import com.nttdata.clases.Person;

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
		WebClient c1 = WebClient.create("http://localhost:8080/person-list-1");
		WebClient c2 = WebClient.create("http://localhost:8080/person-list-2");
		WebClient c3 = WebClient.create("http://localhost:8080/person-list-3");
		WebClient c4 = WebClient.create("http://localhost:8080/person-list-4");
		
		Flux<Person> f1 = c1.get().retrieve().bodyToFlux(Person.class);
		Flux<Person> f2 = c2.get().retrieve().bodyToFlux(Person.class);
		Flux<Person> f3 = c3.get().retrieve().bodyToFlux(Person.class);
		Flux<Person> f4 = c4.get().retrieve().bodyToFlux(Person.class);
		
		return Flux.merge(f1, f2, f3, f4);
	}
	
}
