package com.generation.callejonDiagonal.repository;

import com.generation.callejonDiagonal.model.CasasHogwarts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasasHogwartsRepository extends CrudRepository<CasasHogwarts, Integer> {

}
