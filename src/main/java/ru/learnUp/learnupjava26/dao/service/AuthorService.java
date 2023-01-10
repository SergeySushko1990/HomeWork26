package ru.learnUp.learnupjava26.dao.service;

import org.springframework.stereotype.Service;
import ru.learnUp.learnupjava26.dao.entity.Author;
import ru.learnUp.learnupjava26.dao.repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id) {
        return authorRepository.getById(id);
    }

}
