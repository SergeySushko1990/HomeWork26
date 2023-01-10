package ru.learnUp.learnupjava26.dao.service;

import org.springframework.stereotype.Service;
import ru.learnUp.learnupjava26.dao.entity.BooksOrder;
import ru.learnUp.learnupjava26.dao.repository.BooksOrderRepository;

import java.util.List;

@Service
public class BooksOrderService {

    private final BooksOrderRepository booksOrderRepository;

    public BooksOrderService(BooksOrderRepository booksOrderRepository) {
        this.booksOrderRepository = booksOrderRepository;
    }

    public BooksOrder createBooksOrder(BooksOrder booksOrder) {
        return booksOrderRepository.save(booksOrder);
    }

    public List<BooksOrder> getBooksOrders() {
        return booksOrderRepository.findAll();
    }

    public BooksOrder getBooksOrderById(Long id) {
        return booksOrderRepository.getById(id);
    }
}
