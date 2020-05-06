package com.utn.spring.controller;

import com.utn.spring.model.GetSalaryfForStudentImpA;
import com.utn.spring.model.GetSalaryfForStudentImpB;
import com.utn.spring.model.Person;
import com.utn.spring.model.Student;
import com.utn.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static java.util.stream.Stream.builder;

@RestController
@RequestMapping("/person")
public class PersonController {


    private PersonService servicePerson;

    @Autowired
    public PersonController(PersonService servicePerson) {
        this.servicePerson = servicePerson;
    }

    @GetMapping("/{personId}")
    public Person getPersonById(@PathVariable Integer personId){
        return servicePerson.getPersonById(personId);
    }

    @GetMapping(value = "/",params = "edad")
    public List<Person> getPersonByEdad(@RequestParam Integer edad){
        return servicePerson.getPersonByEdad(edad);
    }

    @GetMapping("/")
    public List<Person> getPerson(){
        return servicePerson.getPerson();
    }

    @PostMapping("/")
    public void addPerson(@RequestBody @Valid Person p){
        servicePerson.add(p);
    }

    //Patron Builder
    /*
    @PostMapping("/builder")
    public void addPerson2(){
        Person p2 = Person.builder().nombre("Nico").apellido("Pettinato").edad(32).build();
        servicePerson.add(p2);
    }*/

    /*
    //Ejemplo Interfaz - Esto tendria que ir en StudentController!
    @PostMapping("/getSalary")
    public void getSalary(){
        Student student = new Student();
        student.setiGetSalaryStudent(new GetSalaryfForStudentImpA());
        int salary = student.getSalary();
        System.out.println(salary);

        student.setiGetSalaryStudent(new GetSalaryfForStudentImpB());
        salary = student.getSalary();
        System.out.println(salary);

    }
     */

}
