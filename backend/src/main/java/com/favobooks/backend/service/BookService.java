package com.favobooks.backend.service;
import com.favobooks.backend.model.BookModel;
import com.favobooks.backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public  BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookModel createBook(BookModel bookModel) {
        return bookRepository.save(bookModel);
    }

    public BookModel getBook(int id) {
        return bookRepository.findById(id).get();
    }

    public BookModel updateBook(BookModel bookModel, int id) {

        BookModel storedBookModel = bookRepository.findById(id).get();

        storedBookModel.setAuthor(bookModel.getAuthor());
        storedBookModel.setMainTitle(bookModel.getMainTitle());
        storedBookModel.setSubTitle(bookModel.getSubTitle());
        storedBookModel.setGenre(bookModel.getGenre());
        storedBookModel.setImage(bookModel.getImage());

        return bookRepository.save(storedBookModel);

    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

}
