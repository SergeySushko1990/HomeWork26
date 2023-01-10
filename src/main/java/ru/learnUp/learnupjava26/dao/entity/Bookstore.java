package ru.learnUp.learnupjava26.dao.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "book_store")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Bookstore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Column
    private int amountOfBooks;
}
