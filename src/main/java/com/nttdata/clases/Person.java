package com.nttdata.clases;

/**
 * Clase Persona
 * @author Angel
 *
 */
public class Person
{
	/** Nombre de la persona */
	private String name;
	
	/** Apellidos de la persona */
	private String lastname;
	
	/** Edad de la persona */
	private int age;

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname()
	{
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Person [name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	
}
