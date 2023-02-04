package org.campus02.stoff.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

	@Test
	void giveAnimalLoudReportsTheCorrectSound() {
		Animal lion = new Animal("Toni", 5, "Lion", "Roar");

		assertEquals("Roar", lion.giveAnimalLoud());
	}

	@Test
	void animalReportsTheCorrectSpecies() {
		Animal lion = new Animal("Toni", 5, "Lion", "Roar");

		assertEquals("Lion", lion.getSpecies());
	}
}