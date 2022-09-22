Notes
1) Know Your Variables 
     -primitive data types: char, boolean
     -numerical primitives: byte, short, int, long, float, double
     -reference variables: Datatype objectName{declared reference variable} = new Datatype()
     -one object can be stored in another if the data type permits
     -null to cancel reference
     -array: datatype[] arrayName = {elements}
     -default values are 0 or "empty"

2) How Objects Behave
     -objects reference instance variables and methods contained within a template class
     -class without a main method can be used as a template
     -to call object method: objectName.methodNameInTemplate()
     -methods can request parameters in main if required in template
     -access modifiers of a template can be privatized: use private over public when establishing attributes
     -getters and setters are required to access private attributes
     -objects can be stored in arrays
     -instance variables are declare inside a class with no method
     -local variables are declared within a method and must be initialized
     -to compare similar data type use == operator
     -to compare different objects use .equals() method

3) Serious Polymorphism
     -can be used for an object class to inherit attributes and methods of a parent class
     -abstract stops the main from creating an object from the template
     -to use an abstract class it must be extended in a subclass to inherit its properties and methods
     -concrete subclasses cannot be abstract
     -methods can also be declared abstract but only in an abstract class
     -abstract methods have no body: accessModifier abstract returnType methodName(parameters);
     -subclass must inherit all abstract methods
     -an array based on the super class can store concrete objects of the subclasses
     -use interfacing to avoid inheritance of multiple supers

4) Life and Death of an Object
     -java has 2 area of memory Stack and Heap
     -local variables live on the stack, where variables are declared within a method
     -all objects live in heap, regardless if the reference is local or instance
     -if you don't put a constructor in a class the compiler will put in a default constructor
     -default constructor is a no-argument constructor
     -cannot have 2 constructors with the same argument list