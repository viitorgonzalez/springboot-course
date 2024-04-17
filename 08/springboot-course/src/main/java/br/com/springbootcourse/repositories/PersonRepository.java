package br.com.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import br.com.springbootcourse.model.Person;

// @Repository não é mais necessário
public interface PersonRepository extends JpaRepository<Person, Long>{}
