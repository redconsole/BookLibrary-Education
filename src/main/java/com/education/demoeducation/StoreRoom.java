package com.education.demoeducation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreRoom {

//    private StoreBooks store = new StoreBooks();

    @Autowired
//    @Qualifier("storeB")
    private StoreBooks store;

    @GetMapping("/display")
    public List<String> displayBooks() {
        System.out.println("display the books in Store");

        return store.getBooks();
    }
}
