package com.nalhan.recipe.services;

import java.util.Set;

import com.nalhan.recipe.commands.RecipeCommand;
import com.nalhan.recipe.model.Recipe;

public interface RecipeService {
	
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
