package com.example.spring.bug.demoapp.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.spring.bug.demoapp.model.Person;

public interface PersonRepo extends PagingAndSortingRepository<Person, Long>{

}
