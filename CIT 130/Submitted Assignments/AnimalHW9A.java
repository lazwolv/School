/*
@author Lazaro Martinez
I pledge my word of honor that I have abided
by the CSN Academic Integrity Policy while
completing this assignment.
@file AnimalHW9A.java
@version The date as 2024-04-14
@note Time taken ~3 hours, spread out
@program this program uses OOP and inheritance to create three classes (one for testing)
and show how a class inherits its parents' attributes and methods.
*/

class Animal {
    private String species;
    private int age;
    private String color;
    private double weight;

    Animal() {
        species = "Unknown";
        age = 0;
        color = "Unknown";
        weight = 0;
    }

    Animal(String species, int age, String color, double weight) {
        this.species = species;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    // getters
    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    // setters
    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // toString() method
    public String toString() {
        return "\nSpecies: " + species + "\nAge: " + age + "\nColor: " + color + "\nWeight: " + weight;
    }

}