package interfaces;

public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark();
        shark.hunt();

        Seal seal = new Seal();
        seal.hunt();
        seal.flee();

        Salmon salmon = new Salmon();
        salmon.flee();


        //  shark.flee will have no method because it doesn't implement prey
        //  salmon.hunt will have no method because it doesn't implement prey


        //Interfaces are used to avoid inheritance overloading
        //Interfaces are an abstract type not class
        //to use an interface's methods and attributes in a class it must be implemented
        //Interfaces cant create an object because it ia not a class
        // interface methods don't need bodies because they are abstract
        // classes are limited to one super but could have more than one interface
        //All Interface methods are abstract
        // when the interface is implemented the method overrides to the other class from the interface class
        // An interface doesn't have subclasses because it is implementation not inheritance
        //Interface methods are always by default abstract and public
        // Interface attributes are by default public, static and final
        // An interface cannot have a constructor




    }
}
