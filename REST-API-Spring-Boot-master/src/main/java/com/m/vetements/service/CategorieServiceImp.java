package com.m.vetements.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m.vetements.entities.Categorie;
import com.m.vetements.repos.CategorieRepository;

@Service
public class CategorieServiceImp implements CategorieService {
		@Autowired
		CategorieRepository CategorieRepository;
		
		@Override
		public Categorie saveCategorie(Categorie b) {
		return CategorieRepository.save(b);
		}
		@Override
		public Categorie updateCategorie(Categorie b) {
		return CategorieRepository.save(b);
		}
		@Override
		public void deleteCategorie(Categorie b) {
		CategorieRepository.delete(b);
		}
		@Override
		public void deleteCategorieById(Long id) {
		CategorieRepository.deleteById(id);
		}
		@Override
		public Categorie getCategorie(Long id) {
		return CategorieRepository.findById(id).get();
		}
		@Override
		public List<Categorie> getAllCategories() {
		return CategorieRepository.findAll();
		}
		
	}
