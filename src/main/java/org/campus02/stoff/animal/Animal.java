package org.campus02.stoff.animal;

public class Animal {
	private final String name;
	private final int age;
	private final String species;
	private final String animalLoud;

	public Animal(String name, int age, String species, String animalLoud) {
		if (age < 0) {
			throw new IllegalArgumentException("age must be >= 0");
		}

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

	public String ageCategory() {
		if (age <= 2)
			return "baby animal";
		else if (age <= 4)
			return "young animal";
		else
			return "old animal";
	}
}
