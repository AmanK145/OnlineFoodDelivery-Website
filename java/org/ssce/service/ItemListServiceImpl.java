package org.ssce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssce.model.Customer;
import org.ssce.model.ItemList;
import org.ssce.model.Restaurant;
import org.ssce.repository.CategoryRepository;
import org.ssce.repository.CustomerRepository;
import org.ssce.repository.ItemListRepository;
@Service
public class ItemListServiceImpl implements ItemListService {
	@Autowired
	 private ItemListRepository itemListRepository;
	
	@Autowired
	 private CategoryRepository categoryRepository;
	
	
	@Override
	public ItemList addItemList(ItemList itemList) {
		categoryRepository.save(itemList.getCategory());
		return itemListRepository.save(itemList);
	}

	@Override
	public ItemList updateItemList(ItemList itemList) {
		categoryRepository.save(itemList.getCategory());
		return itemListRepository.save(itemList);
	}
	
	@Override
	public ItemList deleteItemList(Integer itemListId) {
		Optional<ItemList> it = itemListRepository.findById(itemListId);
		if (it.isPresent()) {
			ItemList itemList = it.get();
			itemListRepository.delete(itemList);
			return itemList;
		}
		return null;
	}

	@Override
	public List<ItemList> viewAllItemList(ItemList itemList) {
		return null;
	}

	@Override
	public List<ItemList> viewAllItemList(Restaurant res) {
		return null;
	}

	@Override
	public List<ItemList> viewAllItemListByName(String name) {
		return null;
	}

	@Override
	public ItemList viewItemListById(Integer itemListId) {
		Optional<ItemList> it=itemListRepository.findById(itemListId);
		if(it.isPresent())
		{
			return it.get();
		}
		else
			
		return null;
	}

	@Override
	public List<ItemList> getAllItemList() {
		
		return itemListRepository.findAll();
	}

	@Override
	public ItemList getItemListById(Integer itemListId) {
		Optional<ItemList> opt = itemListRepository.findById(itemListId);
		if(opt.isPresent()) {
			return opt.get();
		}else {
		return null;
	}

}
}