package interfaces;

// Shark implements predator interface that has the hunt method
// there is no method for prey because we are implementing the predator interface method not the prey interface method

public class Shark implements Predator{
    @Override
    public void hunt() {
        System.out.println("The Shark is hunting");
    }
}