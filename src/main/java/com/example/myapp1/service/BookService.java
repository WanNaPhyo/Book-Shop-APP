package com.example.myapp1.service;

import com.example.myapp1.dao.AuthorDao;
import com.example.myapp1.dao.BookDao;
import com.example.myapp1.dao.CategoryDao;
import com.example.myapp1.ds.Author;
import com.example.myapp1.ds.Book;
import com.example.myapp1.ds.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private AuthorDao authorDao;
    @Autowired
    private BookDao bookDao;
    @Autowired
    private CategoryDao categoryDao;

    public void saveCategory(Category category){
        categoryDao.save(category);
    }

    public List<Category> findAllCategory(){
        return categoryDao.findAll();
    }

    public Category findCategoryById(int id){
        return categoryDao.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public void saveAuthor(Author author){
        authorDao.save(author);
    }

    public List<Author> findAllAuthors(){
        return authorDao.findAll();
    }

    public List<Book> findAllBooks(){
        return bookDao.findAll();
    }

    public Book findBookById(int id){
        return bookDao.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Transactional
    public void saveBook(Book book, int categoryId, int authorId){
//        String[] comments=comment.split(",");
//        for (String s:comments){
//            book.getComments().add(s);
//        }

        Category category=categoryDao.findById(categoryId).orElseThrow(EntityNotFoundException::new);
        Author author=authorDao.findById(authorId).orElseThrow(EntityNotFoundException::new);
        category.addBook(book);
        author.addBook(book);

        bookDao.save(book);
    }

}
