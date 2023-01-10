package ru.learnUp.learnupjava26;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnUp.learnupjava26.dao.entity.Book;
import ru.learnUp.learnupjava26.dao.service.BookService;
import ru.learnUp.learnupjava26.dao.service.BookstoreService;
import ru.learnUp.learnupjava26.exceptions.NotEnoughBooksException;

@Slf4j
@SpringBootApplication
@EnableCaching
public class Learnupjava26Application {

    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext context = SpringApplication.run(Learnupjava26Application.class, args);

        BookService bookService = context.getBean(BookService.class);
        BookstoreService bookstoreService = context.getBean(BookstoreService.class);

        updateAsync(bookstoreService, bookService.getBookById(1L));
    }

    static void updateAsync(BookstoreService service, Book book) {

        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                try {
                    service.buyBook(book, 1);
                    log.info("Book purchase completed!");
                } catch (NotEnoughBooksException e) {
                    log.warn("Sorry, there are no such number of books... try again later");
                }
            }).start();
        }
    }
}
