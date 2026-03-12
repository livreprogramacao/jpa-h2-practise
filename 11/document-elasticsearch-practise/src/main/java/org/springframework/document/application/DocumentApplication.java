package org.springframework.document.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.document.person.entity.PersonRepository;

@SpringBootApplication
public class DocumentApplication {


	public static void main(String[] args) {
		SpringApplication.run(DocumentApplication.class, args);
	}

}
