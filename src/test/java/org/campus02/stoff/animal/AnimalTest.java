package org.campus02.stoff.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

	@Test
	void animalReportsTheCorrectLoud() {
		Animal roaringAnimal = anAnimal()
				.withLoud("Roar")
				.create();

		assertEquals("Roar", roaringAnimal.giveAnimalLoud());
	}

	@Test
	void animalReportsTheCorrectSpecies() {
		Animal lion = anAnimal()
				.withSpecies("Lion")
				.create();

		assertEquals("Lion", lion.getSpecies());
	}

	@Test
	void animalReportsTheCorrectNameAndAge() {
		Animal fiveYearOldToni = anAnimal()
				.withName("Toni")
				.withAge(5)
				.create();

		Animal threeYearOldSusi = anAnimal()
				.withName("Susi")
				.withAge(3)
				.create();

		Animal oneYearOldBaby = anAnimal()
				.withName("Baby")
				.withAge(1)
				.create();

		assertEquals("Toni, 5 years", fiveYearOldToni.getNameAndAge());
		assertEquals("Susi, 3 years", threeYearOldSusi.getNameAndAge());
		assertEquals("Baby, 1 year", oneYearOldBaby.getNameAndAge());
	}

	private static AnimalBuilder anAnimal() {
		return new AnimalBuilder();
	}
}