package com.utn.spring.service;

import com.utn.spring.model.Person;
import com.utn.spring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void add(Person person){
        personRepository.save(person);
    }

    public List<Person> getPerson(){
        return personRepository.findAll();
    }

    public Person getPersonById(Integer personId) {
        return personRepository.findById(personId).get();
        /*
                .orElseThrow(new HTTPException(HttpStatus.NOT_FOUND.value()))*/

    }

    public List<Person> getPersonByEdad(Integer edad) {
        List<Person> personList = getPerson();
        return personList.stream().filter(person -> person.getEdad() == edad).collect(Collectors.toList());

    }
}
