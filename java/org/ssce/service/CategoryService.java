package org.ssce.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.ssce.model.Category;
@Service
public interface CategoryService {
	
	public Category addCategory(Category cat);
	public Category updateCategory(Category cat);
	public Category deleteCategory(Integer catId);
	public Category viewCategory(Integer catId);
	public List<Category> viewAllCategory();
	public Category findById(Integer catId);
	

}
