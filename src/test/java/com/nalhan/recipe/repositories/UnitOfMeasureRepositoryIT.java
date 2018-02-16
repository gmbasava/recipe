package com.nalhan.recipe.repositories;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nalhan.recipe.model.UnitOfMeasure;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

	 @Autowired
	    UnitOfMeasureRepository unitOfMeasureRepository;

	    @Before
	    public void setUp() throws Exception {
	    }

	    @Test
	    public void findByDescription() throws Exception {

	        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByUnitOfMeasure("Teaspoon");

	        assertEquals("Teaspoon", uomOptional.get().getUnitOfMeasure());
	    }

	    @Test
	    public void findByDescriptionCup() throws Exception {

	        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByUnitOfMeasure("Cup");

	        assertEquals("Cup", uomOptional.get().getUnitOfMeasure());
	    }

}
