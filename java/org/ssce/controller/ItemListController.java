package org.ssce.controller;

import org.ssce.model.Category;
import org.ssce.model.Customer;
import org.ssce.model.ItemList;
import org.ssce.service.ItemListService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/itemList")
public class ItemListController {
	
	@Autowired
	private ItemListService itemListService;
	
	@GetMapping("/additemList")
	public String addItemList(Model model)
	{
		ItemList itemList=new ItemList();
		itemList.setCategory(new Category());
		model.addAttribute("itemList",itemList);
		return "additemList";
	}
	
	@PostMapping("/additemList")	
	public  String addItemListProcess(@ModelAttribute("itemList") ItemList itemList)
	{
		if(itemListService.addItemList(itemList)==null){
			return "unsuccessitemList";
		}else 
			return "successitemList";
	}
	
	@GetMapping("/updateitemList")
	  public String updateItemList(Model model)
	  {
		ItemList itemList=new ItemList();
		itemList.setCategory(new Category());
		model.addAttribute("itemList",itemList);
		return "updateitemList";  
	  }
	
	
	@PostMapping("/fetchitemList")
	public String fetchItemList(@ModelAttribute("itemList") ItemList itemList,Model model) {
		ItemList add = itemListService.viewItemListById(itemList.getItemListId());
		if(add == null) {
			return "itemListnotfound";
		}
		model.addAttribute("itemList",itemList);
		return "itemListupdatefound";
	}

	@PostMapping("/updateitemListprocess")
	public String processUpdateItemList(@ModelAttribute("itemList")ItemList itemList)
	{
		ItemList add1=itemListService.updateItemList(itemList);
		if(add1==null)
		{
			return "itemListupdateunsuccess";
		}
		else
		{
			return "itemListupdatesuccess";
		}
   }
	
	@GetMapping("/deleteitemList")
	public String deleteItemList(Model model) {
		ItemList itemList=new ItemList();
		itemList.setCategory(new Category());
		model.addAttribute("itemList",itemList);
		return "deleteitemList";
	}
	
	@PostMapping("/fetchdeleteitemList")
	public String fetchDeleteItemList(@ModelAttribute("driver") ItemList itemList,Model model) {
		itemList = itemListService.viewItemListById(itemList.getItemListId());
		if(itemList == null) {
			return "itemListnotfound";
		}
		model.addAttribute("itemList",itemList);
		return "itemListdeletefound";
	}
	@PostMapping("/deleteitemListprocess")
	public String deleteItemListProcess(@ModelAttribute("itemList") ItemList itemList,Model model) {
		ItemList itm1 = itemListService.deleteItemList(itemList.getItemListId());
		if(itm1 == null) {
			return "deleteunsuccess";
		}else {
			return "deletesuccess";
		}
	}
	@GetMapping("/listitemList")
	public String listItemList(Model model) {
		List<ItemList> list=itemListService.getAllItemList();
		
		model.addAttribute("itemLists",list);
		return "listitemList";
	}
	@GetMapping("/viewitemList")
	public String viewItemList(@RequestParam("itemListId")Integer itemListId, Model model) {
		
		ItemList itemList = itemListService.viewItemListById(itemListId);
		model.addAttribute("itemList", itemList);
		return "viewitemList";
	}
}
