package com.example.restApi.service;

import com.example.restApi.model.Person;
import com.example.restApi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public class PersonService {

    @Autowired
    private PersonRepository repo;
    private Person message;


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

    public Boolean seek_account(String email,String password){

        message = this.repo.findByEmailAndPassword(email,password);

        if (message != null){

            return true;
        }else {
            return false;
        }

    }

}
