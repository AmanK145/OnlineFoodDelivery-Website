package org.ssce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.ssce.model.Category;
import org.ssce.model.Customer;
import org.ssce.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController 
{
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/addcategory")
	public String addCategory(Model model)
	{
		Category category =new Category();
		model.addAttribute("category",category);
		return "addCategory";
		
	}
	@PostMapping("/addcategory")
	public String AddCategoryProcess(@ModelAttribute("category")Category category,Model model)
	{
		Category cat=categoryService.addCategory(category);
		if(cat==null)
		{
			return "categoryAddUnsucess";
		}
		else
		{
			return "categoryAddSucess";
		}
	}
	
	@GetMapping("/updatecategory")
	  public String updateCategory(Model model)
	  {
		  Category category=new Category();
		  model.addAttribute("category", category);  
		return "updateCategory";
		  
	  }
	@PostMapping("/fetchcategory")
	public String fetchCategory(@ModelAttribute("category") Category category,Model model) {
		category = categoryService.findById(category.getCatId());
		if(category== null) {
			return "categorynotfound";
		}
		model.addAttribute("category",category);
		return "categoryupdatefound";
	}

	@PostMapping("/updatecategoryprocess")
	public String processUpdateCategory(@ModelAttribute("category")Category category)
	{
		Category cat=categoryService.updateCategory(category);
		if(cat==null)
		{
			return "categoryUpdateUnsucess";
		}
		else
		{
			return "categoryUpdateSucess";
		}
	}
	@GetMapping("/deletecategory")
	public String deleteCategory(Model model) {
		Category category= new Category();
		model.addAttribute("category",category);
		return "deletecategory";
	}
	
	@PostMapping("/fetchdeletecategory")
	public String fetchDeleteCategory(@ModelAttribute("category")Category category,Model model) {
		category = categoryService.findById(category.getCatId());
		if(category == null) {
			return "categorynotfound";
		}
		model.addAttribute("category",category);
		return "categorydeletefound";
	}
	@GetMapping("/delcategory")
	public String fetchDeleteCategory(@RequestParam("catId")Integer catId,Model model) {
		Category category = categoryService.findById(catId);
		if(category == null) {
			return "categorynotfound";
		}
		model.addAttribute("category",category);
		return "categorydeletefound";
	}
	@PostMapping("/deletecategoryprocess")
	public String deleteCategoryProcess(@ModelAttribute("category") Category category,Model model) {
		Category category2 = categoryService.deleteCategory(category.getCatId());
		if(category2 == null) {
			return "deleteUnsuccess";
		}else {
			return "deletesuccess";
		}
	}
	@GetMapping("/listcategory")
	public String listCategory(Model model)
	{
		List<Category> list=categoryService.viewAllCategory();
		model.addAttribute("categories",list);
		return "listcategory";
	}

	@GetMapping("/viewcategory")
	public String viewCategory(@RequestParam("catId")Integer catId,Model model)
	{
		Category category=categoryService.viewCategory(catId);
	    model.addAttribute("category", category);
	    return "viewcategory";
	}
	
	

}
