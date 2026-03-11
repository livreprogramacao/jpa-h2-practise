package org.springframework.document.person.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {

    List<Person> findByLastname(String lastname);
    List<Person> findByFirstnameLike(String firstname);

}
