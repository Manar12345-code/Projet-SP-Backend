package com.m.vetements.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.m.vetements.entities.Categorie;
import com.m.vetements.service.*;

@RestController
@RequestMapping("/api/categorie")
@CrossOrigin
public class CategorieRESTController {
		@Autowired
		CategorieService CategorieService;
		@RequestMapping(path = "all",method = RequestMethod.GET)
		public List<Categorie> getAllCategories() {
		return CategorieService.getAllCategories();
		}
		@RequestMapping(value="/{id}",method = RequestMethod.GET)
		public Categorie getCategorieById(@PathVariable("id") Long id) { 
			return CategorieService.getCategorie(id);
		}
		
		@RequestMapping(method = RequestMethod.POST)
		public Categorie createCategorie(@RequestBody Categorie Categorie) {
		return CategorieService.saveCategorie(Categorie);
		}
		
		@RequestMapping(method = RequestMethod.PUT)
		public Categorie updateCategorie(@RequestBody Categorie Categorie) {
		return CategorieService.updateCategorie(Categorie);
		}
		@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
		public void deleteCategorie(@PathVariable("id") Long id)
		{
		CategorieService.deleteCategorieById(id);
		}
		
		
		}
