package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sms.es.Book;
import com.example.sms.es.BookService;

@RestController
@RequestMapping(value= "/employee")
public class MyController {
    @Autowired
    private BookService bookService;
    
    @PostMapping(value= "/saveemployees")
    public @ResponseBody Book saveEmployee(@RequestBody Book book) {
        bookService.save(book);
        return book;
    }

}
