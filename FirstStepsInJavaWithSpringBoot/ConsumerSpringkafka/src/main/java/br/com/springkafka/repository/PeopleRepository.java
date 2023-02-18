package br.com.springkafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springkafka.domain.People;

@Repository
public interface PeopleRepository extends JpaRepository<People, String> {

}
