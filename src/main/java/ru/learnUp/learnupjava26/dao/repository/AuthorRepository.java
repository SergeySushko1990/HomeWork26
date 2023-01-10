package ru.learnUp.learnupjava26.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.learnUp.learnupjava26.dao.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
