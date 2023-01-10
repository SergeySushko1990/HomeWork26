package ru.learnUp.learnupjava26.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.learnUp.learnupjava26.dao.entity.Book;
import ru.learnUp.learnupjava26.dao.entity.Bookstore;

@Repository
public interface BookstoreRepository extends JpaRepository<Bookstore, Long> {

    @Query(value = "select * from book_store bs " +
            "where bs.book_id = ?1 for update",
            nativeQuery = true)
    Bookstore getByBook(Book book);

}
