/*
@author Lazaro Martinez
I pledge my word of honor that I have abided
by the CSN Academic Integrity Policy while
completing this assignment.
@file DogHW9A.java
@version The date as 2024-04-14
@note Time taken ~3 hours, spread out
@program this program uses OOP and inheritance to create three classes (one for testing)
and show how a class inherits its parents' attributes and methods.
*/

class Dog extends Animal {
    private String breed;
    private String name;

    Dog() {
        super("Dog", 0, "Unknown", 0); // default constructor of the superclass
        this.breed = "Husky";
        this.name = "Blue";
    }

    Dog(String breed, String name) {
        super();
        this.breed = breed;
        this.name = name;
    }

    Dog(int age, String color, double weight, String breed, String name) {
        super("Dog", age, color, weight);
        setBreed(breed);
        this.breed = breed;
        this.name = name;
    }

    // Getters and setters for breed and name
    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return super.toString() + "\nDog breed: " + breed + "\nName: " + name;
    }
}