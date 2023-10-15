package com.example.demo.item;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ItemConfig {   
    @Bean
    CommandLineRunner commandLineRunner(ItemRepository itemRepository){
        return args -> {
            Item i1 = new Item(
                "Bisturi",
                "serve para cortar",
                true,
                "ADFF",
                30,
                200,
                50,
                Item.TipoItem.USO,
                Item.Unidade.G,
                LocalDate.now(),
                LocalDate.now(),
                LocalDate.now(),
                LocalDate.now(),
                LocalDate.now(),
                LocalDate.now());

            itemRepository.save(i1);
        };
    }
}
