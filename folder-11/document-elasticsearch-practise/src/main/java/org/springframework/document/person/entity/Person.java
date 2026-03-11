package org.springframework.document.person.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

//@NoArgsConstructor
@Builder
@Getter
@Setter
@Document(indexName = "persons")
public class Person {

    @Id private String id;
    private String firstname;
    private String lastname;

}
