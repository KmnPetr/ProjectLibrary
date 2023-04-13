package com.example.projectLibrary.repositories;

import com.example.projectLibrary.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<Person,Integer> {
    Optional<Person> findByFullName(String fullName);//нужен для валидации проверки на уникальность имени
}
