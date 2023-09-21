package org.ssce.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.ssce.model.Customer;
import org.ssce.model.ItemList;
import org.ssce.model.Restaurant;
@Service
public interface ItemListService {
	public ItemList addItemList(ItemList itemList);
	public ItemList updateItemList(ItemList itemList);
	public ItemList deleteItemList(Integer itemListId);
	public ItemList viewItemListById(Integer itemListId);
	public List<ItemList> viewAllItemList(ItemList itemList);
	public List<ItemList> viewAllItemList(Restaurant res);
    public List<ItemList> viewAllItemListByName(String name);
    public List<ItemList> getAllItemList();
    public ItemList getItemListById(Integer itemListId);
}
