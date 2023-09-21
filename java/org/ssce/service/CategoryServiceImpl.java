package org.ssce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssce.model.Bill;
import org.ssce.model.Category;
import org.ssce.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	 private CategoryRepository categoryRepository;

	@Override
	public Category addCategory(Category cat) {
		
		return categoryRepository.save(cat);
	}

	@Override
	public Category updateCategory(Category cat) {
		
		return categoryRepository.save(cat);
	}

	@Override
	public Category deleteCategory(Integer catId) {
		Optional<Category> opt = categoryRepository.findById(catId);
		if (opt.isPresent()) {
			Category category = opt.get();
			categoryRepository.delete(category);
			return category;
		}
		return null;
	}

	@Override
	public Category viewCategory(Integer catId) {
		Optional<Category> add=categoryRepository.findById(catId);
		if(add.isPresent())
		{
			return add.get();
		}
		else
		return null;
	}

	@Override
	public List<Category> viewAllCategory() {
	
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(Integer catId) {
		Optional<Category> opt = categoryRepository.findById(catId);
		if(opt.isPresent()) {
			Category category = opt.get();
			return category;
		}
		return null;
	}
	  
	
	

}
