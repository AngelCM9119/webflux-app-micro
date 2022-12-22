package com.nttdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nttdata.clases.Person;
import com.nttdata.service.PersonServiceImpl;

import reactor.core.publisher.Flux;

/**
 * Controlador
 * @author Angel
 *
 */
@Controller
public class PersonListController
{
	@Autowired
	private PersonServiceImpl service;
	
	public String personList()
	{
		Flux<Person> list = service.getAllPerson();
		return "personlist";
	}
}
