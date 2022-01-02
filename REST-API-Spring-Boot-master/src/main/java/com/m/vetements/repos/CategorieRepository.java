package com.m.vetements.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.m.vetements.entities.Categorie;

	@RepositoryRestResource(path = "marq")
	public interface CategorieRepository extends JpaRepository<Categorie, Long> {
		
		
	}

