package com.company.appname.repos;


	import com.company.appname.collection.Site;
import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
	import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

	@Repository
	public interface SiteRepository extends CrudRepository<Site, String> {

	    void findBySiteNumber(String siteNumber);
	   
	    Site save(Site entity);
	}

