package com.education.demoeducation;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lib")
public class BookLibrary {

    @GetMapping("/display")
    public List<String> displayBooks() {
        System.out.println("display the books in Lib");
        return LibBooks.books;
    }

    @PostMapping("/add/{book}")
    public void addBook(@PathVariable String book) {
        LibBooks.books.add(book);
    }

}
