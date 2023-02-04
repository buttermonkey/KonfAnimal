package org.campus02.stoff.animal;

public class Animal {
	private final String name;
	private final int age;
	private final String species;
	private final String animalLoud;

	public Animal(String name, int age, String species, String animalLoud) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.animalLoud = animalLoud;
	}

	public String getSpecies() {
		return species;
	}

	public String giveAnimalLoud() {
		return animalLoud;
	}

	public String getNameAndAge() {
		return name + ", " + age + " " + ((age == 1) ? "year" : "years");
	}
}
