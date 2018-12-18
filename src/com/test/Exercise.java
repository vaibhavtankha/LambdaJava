package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {

	
	
	public static void main(String[] args )
	{
		List<Person> people = Arrays.asList( (new Person("abc" ,"def" ,10) ) , (new Person("abc1" ,"def1" ,102) )) ;             
		List<String> firstnames=   people.stream().map(p -> p.getFirstname()).collect(Collectors.toList()) ;
		List<Person>seniors = people.stream().filter(p -> p.getAge() >11).collect(Collectors.toList()) ;
		System.out.println(firstnames);
		System.out.println(seniors);
	}
}
