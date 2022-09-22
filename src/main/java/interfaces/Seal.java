package interfaces;

// Seal implements predator and prey interface that has the hunt and flee method
// So it would have two methods

public class Seal implements Prey, Predator{
    @Override
    public void hunt() {
        System.out.println("this seal is hunting for prey");
    }

    @Override
    public void flee() {
        System.out.println("this seal flees from predator");
    }
}
