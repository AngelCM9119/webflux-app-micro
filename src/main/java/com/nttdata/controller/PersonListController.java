package com.nttdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	
	@GetMapping("/person-list")
	public String personList(Model model)
	{
		Flux<Person> list = service.getAllPerson();
		model.addAttribute("personlist", list);
		return "personlist";
	}
}
