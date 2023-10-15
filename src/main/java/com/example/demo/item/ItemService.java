package com.example.demo.item;

import java.util.List;
import java.util.Optional;rk.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ItemService {
    private ItemRepository itemRepository;

    public ItemService(){

    }

    @Autowired
    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public List<Item> getItens(){
        return itemRepository.findAll();
    }

    public void createItem(Item item){
        itemRepository.save(item);
    }

    public void deleteItem(Long itemId){
        Boolean existe = itemRepository.existsById(itemId);

        if(!existe){
            throw new IllegalStateException("id nao exist");
        }

        itemRepository.deleteById(itemId);
    }

    @Transactional
    public void updateItem(Long itemId){
        Optional<Item> item = itemRepository.findById(itemId);
    }
}
