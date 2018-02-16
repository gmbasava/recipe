package com.nalhan.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nalhan.recipe.model.Recipe;
@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
