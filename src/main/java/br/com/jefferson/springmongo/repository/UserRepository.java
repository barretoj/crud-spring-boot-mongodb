package br.com.jefferson.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.jefferson.springmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}