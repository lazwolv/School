/*
@author Lazaro Martinez
I pledge my word of honor that I have abided
by the CSN Academic Integrity Policy while
completing this assignment.
@file TestAnimalHW9A.java
@version The date as 2024-04-14
@note Time taken ~3 hours, spread out
@program this program uses OOP and inheritance to create three classes (one for testing)
and show how a class inherits its parents' attributes and methods.
*/

import java.util.Scanner;

public class TestAnimalHW9A { // TestAnimal class
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nProgram completed by Lazaro Martinez.");
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(null, 0, null, 0);
        Dog dog1 = new Dog();
        Animal animalArray[] = new Animal[2];
        animalArray[0] = new Animal();
        animalArray[1] = new Animal("Bird", 1, "White", .5);
        animalArray[1].setColor("Red");
        /* System.out.println("Array of animals:");
        for (int i = 0; i < animalArray.length; i++) {
            System.out.println(animalArray[i]);
        } */

        Dog dogArray[] = new Dog[1];
        dogArray[0] = new Dog();
        /* System.out.println("\nArray of dogs:");
        for (int i = 0; i < dogArray.length; i++) {
            System.out.println(dogArray[i]);
        } */
        //it asks to display the arrays but the sample run didn't do it so I commented it out
        //System.out.println("Enter breed: "); this is 3-d but it's not how the the sample run starts
        //System.out.println("Enter name: ");
        //System.out.println("Enter age: ");
        //System.out.println("Enter color: ");


        //I'm overall not satisfied with this assignment
        //the following code was written to try to obtain the output shown in the sample run
        //it will feel incomplete and sloppy just like the sample run did
        System.out.println("\nHere are the animal information when I run the default animal");
        System.out.println(animal1);//call the first object created with the default constructor
        
        //use setters to mutate data on the second object that used the second constructor
        System.out.println("\nWhat is the species ");
        animal2.setSpecies(input.nextLine());
        System.out.println("What is the age ");
        animal2.setAge(input.nextInt());
        input.nextLine();//flush newline character
        System.out.println("What is the color ");
        animal2.setColor(input.nextLine());
        System.out.println("What is the weight ");
        animal2.setWeight(input.nextDouble());
        input.nextLine();// flush newline character
        System.out.println(animal2);

        System.out.println("\nHere are the Dog information when I run the default Dog");
        //default dog object is not called in the sample run

        //mutate data using setters again
        System.out.println("\nWhat is the breed ");
        dog1.setBreed(input.nextLine());
        System.out.println("What is the name ");
        dog1.setName(input.nextLine());
        System.out.println("What is the age ");
        dog1.setAge(input.nextInt());
        input.nextLine();// flush newline character
        System.out.println("What is the color ");
        dog1.setColor(input.nextLine());
        System.out.println("What is the weight ");
        dog1.setWeight(input.nextDouble());
        input.nextLine();// flush newline character
        System.out.println(dog1);

        //random but change the color to animal 2 object
        System.out.println("We need to change the color");
        System.out.println("What is the color ");
        animal2.setColor(input.nextLine());
        System.out.println("\nAll the new inforamtion are");
        System.out.println(animalArray[1]);//I guess it wanted that object with the bird information
        
        System.out.println("\nArray of squares");//???
        System.out.println(dog1);
        System.out.println("change the breed");
        System.out.println("Enter breed: ");
        dog1.setBreed(input.nextLine());
        System.out.println("Enter name: ");
        dog1.setName(input.nextLine());
        System.out.println("Enter age: ");
        dog1.setAge(input.nextInt());
        input.nextLine();// flush newline character
        System.out.println(dog1);
        //get specified information using our getters
        System.out.println("Getting information");
        System.out.println("How old is the " + animal2.getSpecies() + ": " + animal2.getAge());
        System.out.println("What is the color of the second Animal array: " + animalArray[1].getColor());
        System.out.println("What breed is " + dog1.getName() + ": " + dog1.getBreed());

        input.close();
    }
}