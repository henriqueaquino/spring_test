package com.example.demo.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "item")
public class ItemController {
    private ItemService itemService;

    public ItemController(){

    }

     @Autowired
    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @GetMapping
	public List<Item> getItens(){
        return itemService.getItens();
    }

    @PostMapping
    public void createItem(
        @RequestBody Item item){
        itemService.createItem(item);
    }

    @DeleteMapping (path = "{itemId}")
    public void deleteItem(
        @PathVariable("itemId") Long itemId){
        itemService.deleteItem(itemId);
    }

    @PutMapping (path = "{itemId}")
    public void updateItem(
        @PathVariable("itemId") Long itemId
        //@RequestParam(required = false) String name
        ){
        itemService.updateItem(itemId);
    }
}
