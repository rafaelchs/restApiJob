package com.example.restApi.controller;

import com.example.restApi.model.Person;
import com.example.restApi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person/")
public class ControllerPerson {

    @Autowired
    private PersonService service;
    private Boolean message;


    @PostMapping
    @RequestMapping("add")
    public void insert_person(@RequestBody Person objPerson){

        service.add(objPerson);

    }

    @PutMapping
    @RequestMapping("update")
    public void update_person(@RequestBody Person objPerson){

        service.update(objPerson);
    }

    @DeleteMapping(value = "/{id}")
    public void delete_person(@PathVariable("id") Integer id){

        service.delete(id);
    }

    @GetMapping
    @RequestMapping("show")
    public List<Person> findAll(){

        return service.list();
    }

    @GetMapping(value = "login/{email}/{password}")
    public Boolean search_account(@PathVariable("email") String email,@PathVariable("password") String password){

         message = this.service.seek_account(email,password);

         if (message.equals(true)){

             return true;

         }else {

             return false;
         }
    }

}
