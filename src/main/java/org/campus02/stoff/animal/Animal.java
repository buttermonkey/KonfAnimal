package org.campus02.stoff.animal;

public class Animal {
	private String name;
	private int age;
	private String species;
	private String animalLoud;

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
}
