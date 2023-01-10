package ru.learnUp.learnupjava26.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.learnUp.learnupjava26.dao.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
