package com.example.carsharingservice.repository;

import com.example.carsharingservice.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByFirstName(String firstName);

    Optional<User> findByEmail(String email);
}
