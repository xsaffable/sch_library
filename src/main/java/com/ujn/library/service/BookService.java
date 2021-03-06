package com.ujn.library.service;

import com.ujn.library.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllByPage(String curr, String limit, String bookCategory) throws Exception;

    int count() throws Exception;

    int countByCat(String bookCategory) throws Exception;

    List<Book> getByBookName(String bookName) throws Exception;

    Book getByBookId(String bookId) throws Exception;

}
