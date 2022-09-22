package interfaces;

// Salmon implements prey interface that has the flee method
// there is no method for predator because we are implementing the prey interface method not the predator interface method


public class Salmon implements Prey{
    @Override
    public void flee() {
        System.out.println("the Salmon flees away");
    }
}
