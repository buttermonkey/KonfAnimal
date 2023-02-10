package org.campus02.stoff.animal;

public record Animal (String name, int age, String species, String animalLoud) {
	public Animal {
		if (age < 0) {
			throw new IllegalArgumentException("age must be >= 0");
		}
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
