package org.springframework.document.person.boundary;

import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.GetQuery;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.document.person.control.PersonService;
import org.springframework.document.person.entity.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final ElasticsearchOperations elasticsearchOperations;

    private final PersonService service;

    public PersonController(ElasticsearchOperations elasticsearchOperations, PersonService personService) {
        this.elasticsearchOperations = elasticsearchOperations;
        this.service = personService;
    }

    public String save(@RequestBody Person person) {

        IndexCoordinates indexCoordinatesForPerson = elasticsearchOperations.getIndexCoordinatesFor(Person.class);
        IndexQuery indexQuery = new IndexQueryBuilder()
                .withId(person.getId().toString())
                .withObject(person)
                .build();
//        String documentId = elasticsearchOperations.index(indexQuery);
        String documentId = elasticsearchOperations.index(indexQuery, indexCoordinatesForPerson);
        return documentId;

    }

    @GetMapping("/person/{id}")
    public Person findById(@PathVariable("id")  Long id) {
//        Person person = elasticsearchOperations.queryForObject(GetQuery.getById(id.toString()), Person.class);
        Person person = elasticsearchOperations.get(id.toString(), Person.class);
        return person;
    }

}
