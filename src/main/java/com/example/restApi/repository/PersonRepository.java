package com.example.restApi.repository;

import com.example.restApi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

    Person findByEmailAndPassword(String email,String password);

}
