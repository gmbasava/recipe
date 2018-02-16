package com.nalhan.recipe.services;

import java.util.Set;

import com.nalhan.recipe.commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {
	
	Set<UnitOfMeasureCommand> listAllUoms();

}
