package com.m.vetements.service;

import java.util.List;

import com.m.vetements.entities.Categorie;



public interface CategorieService {
	
		Categorie saveCategorie(Categorie b);
		Categorie updateCategorie(Categorie b);
		void deleteCategorie(Categorie b);
		void deleteCategorieById(Long id);
		Categorie getCategorie(Long id);
		List<Categorie> getAllCategories();
		
	}
