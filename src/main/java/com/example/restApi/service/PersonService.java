package com.example.restApi.service;

import com.example.restApi.model.Person;
import com.example.restApi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {

    @Autowired
    private PersonRepository repo;

    public PersonService() {
    }

    public void add(Person obj){

        this.repo.save(obj);
    }

    public void update(Person obj){

        this.repo.save(obj);
    }

    public void delete(int id){

        this.repo.deleteById(id);
    }

    public List<Person> list(){

        return this.repo.findAll();
    }


}
