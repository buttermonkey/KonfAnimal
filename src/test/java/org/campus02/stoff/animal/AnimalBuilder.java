package org.campus02.stoff.animal;

public class AnimalBuilder {
	private String name;
	private int age;
	private String species;
	private String loud;

	public AnimalBuilder withLoud(String loud) {
		this.loud = loud;
		return this;
	}

	public Animal create() {
		return new Animal(name, age, species, loud);
	}

	public AnimalBuilder withSpecies(String species) {
		this.species = species;
		return this;
	}

	public AnimalBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public AnimalBuilder withAge(int age) {
		this.age = age;
		return this;
	}
}
