package Tasks;

import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {
        // Import ArrayList from java.util 
        ArrayList<String> names = new ArrayList<>();

        names.add("Niraj");
        names.add("Rijan");
        names.add("Ayush");
        names.add("Adhar");
        names.add("Aayam");

        // To loop, find the length/element count, .Size() 
        int namesLength = names.size();
        // Loop same as array 
        for(int index = 0; index<namesLength; index ++){
            // Get each element with .get(index) 
            String singleName = names.get(index);
            System.out.println("Index : " + index + " Value " + singleName);
        }

        // Using foreach in java, iterate with element/actual value 
        for(String element: names){

            System.out.println(element);
        }

        // Task 
        // Make an ArrayList animals 
        // ['cat',"tiger","Dog","Elephant"] 
        // MAke two more ArrayList called, wildAnimal, domesticAnimal 
        // Loop the animals 
        // IF the element/value is "cat","Dog" add in domesticAnimal
        // IF the element/value is "tiger","elephant" add in wildAnimal
        // then print 

        ArrayList<String> animals = new ArrayList<>();
        ArrayList<String> wildAnimals = new ArrayList<>();
        ArrayList<String> domesticAnimals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Dog");
        animals.add("Elephant");

        int listlen = animals.size();
        for(int index = 0;index<listlen;index++ ){
            if (animals.get(index) == "Cat" || animals.get(index) == "Dog") {
                domesticAnimals.add(animals.get(index));
            }else{
                wildAnimals.add(animals.get(index));
            }
        }
        System.out.println(wildAnimals);
        System.out.println(domesticAnimals);

        // using for - each 
        for(String elem: animals){
            if (elem == "Cat" || elem == "Dog") {
                domesticAnimals.add(elem);
            }else{
                wildAnimals.add(elem);
            }
        }

    }
}
