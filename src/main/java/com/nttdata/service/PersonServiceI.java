package com.nttdata.service;

import com.nttdata.clases.Person;

import reactor.core.publisher.Flux;

/**
 * Servicio
 * @author Angel
 *
 */
public interface PersonServiceI
{
	public Flux<Person> getAllPerson();
}
