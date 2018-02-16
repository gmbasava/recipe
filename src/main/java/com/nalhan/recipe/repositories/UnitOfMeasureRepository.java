package com.nalhan.recipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nalhan.recipe.model.UnitOfMeasure;
@Repository
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{

	Optional<UnitOfMeasure> findByUnitOfMeasure(String description);
}
