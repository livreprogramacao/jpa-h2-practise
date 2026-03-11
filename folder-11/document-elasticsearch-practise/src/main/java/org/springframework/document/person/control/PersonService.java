package org.springframework.document.person.control;

import org.springframework.document.person.entity.Person;
import org.springframework.document.person.entity.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

//    public void doWork() {
//
//        repository.deleteAll();
//
//        Person person = new Person();
//        person.setFirstname("Oliver");
//        person.setLastname("Gierke");
//        repository.save(person);
//
//        List<Person> lastNameResults = repository.findByLastname("Gierke");
//        List<Person> firstNameResults = repository.findByFirstnameLike("Oli");
//    }

}