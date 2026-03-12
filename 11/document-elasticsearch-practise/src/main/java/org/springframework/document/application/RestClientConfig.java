package org.springframework.document.application;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.document.person.entity.Person;
import org.springframework.document.person.entity.PersonRepository;

import javax.annotation.PostConstruct;

@Configuration
@EnableElasticsearchRepositories(basePackages = "org.springframework.document.person.entity")
public class RestClientConfig extends AbstractElasticsearchConfiguration {

    @Autowired
    private ElasticsearchOperations operations;
	@Autowired private PersonRepository repository;

    @PostConstruct
	public void insertDataSample() {

		operations.indexOps(Person.class).refresh();

		// Save data sample
		repository.save(Person.builder().firstname("GeoPoint").lastname("London").build());
	}

    @Bean
    public RestHighLevelClient elasticsearchClient() {

//        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//                .connectedTo("localhost:9200")
//                .build();

        final ClientConfiguration clientConfiguration = ClientConfiguration.localhost();
        return RestClients.create(clientConfiguration).rest();
    }
}
