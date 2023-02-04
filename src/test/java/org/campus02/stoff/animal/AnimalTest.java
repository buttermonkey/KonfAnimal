package org.campus02.stoff.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

	@Test
	void animalReportsTheCorrectLoud() {
		Animal lion = new Animal("Toni", 5, "Lion", "Roar");

		assertEquals("Roar", lion.giveAnimalLoud());
	}

	@Test
	void animalReportsTheCorrectSpecies() {
		Animal lion = new Animal("Toni", 5, "Lion", "Roar");

		assertEquals("Lion", lion.getSpecies());
	}

	@Test
	void animalReportsTheCorrectNameAndAge() {
		Animal lion = new Animal("Toni", 5, "Lion", "Roar");
		Animal susi = new Animal("Susi", 3, "", "");
		Animal baby = new Animal("Baby", 1, "", "");

		assertEquals("Toni, 5 years", lion.getNameAndAge());
		assertEquals("Susi, 3 years", susi.getNameAndAge());
		assertEquals("Baby, 1 year", baby.getNameAndAge());
	}
}