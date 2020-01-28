# Classes and Objects

## Table of Contents

- Inheritance
- Overiding methods
- What is a class?
- What is an Object?
- Writing your first Object
- Using main()

## Inheritance

To understand inheritance, think of it as getting a gift from someone. A Father gives a gift to his child. In this case "Father" is the Super class and the child is the subclass. The "gifts" he gives out are his `methods & instance variables` that the subclasses can use.

```java
class Father {
    void fatherDetails() {
        System.out.println("Father");
        }
    }

class Child extends Father {
    void childDetails() {
        System.out.println("Child");
        }
    }
```

## Overiding methods

The Child might not use the gift the exact same way as his Father. Same goes for a subclass, just because a subclass inherits methods from a superclass does not mean it has to do the exact same thing. The author of the code can modify the existing methods by overiding it.You do this when you need to change what the method does for that certain subclass or extend the behavior of that method.

```java
class Father {
    void fatherDetails() {
        System.out.println("Father");
        }
    void fatherNate(){
        System.out.println("Im Father Nate!")
    }
}

class Child extends Father {
    void childDetails() {
        System.out.println("Child");
        }
    void fatherNate(){
        System.out.println("Im Father Nate's Child!")
    }
}

```

## What is a Class?

When you design a class think about these:

- Things the Object knows
- Things the Object does

### Things the object Knows

These are called instance variables. They represent the objects state and can have unique values for each object of that type. The variables below are an example of instance variables.

```java
class Father {
//These are instance variables
    String name;
    String age;

    void fatherDetails() {
        System.out.println("Father");
        }
    void fatherNate(){
        System.out.println("Im Father Nate!")
    }
}
```

### Things the object does

The thing an object can do are called it's methods. When you design a class, think about what you want the object to do. It is common to have a method that can read, write, and operate on the instance variables given.

```java
class Father {
//These are instance
    String name;
    String age;
//These are the static methods
    void fatherDetails() {
        System.out.println("Father");
        }
    void fatherNate(){
        System.out.println("Im Father Nate!")
    }
}
```

## What is an object

First things first. A class is not an object, it is used to construct an object. Each object made from this "template" can have its own values in the instance variables and can be very different from the last. You will more than likely end up with one class and many objects made from that class.

## Writing your first object

When you are creating your first object there are two things you will need:

- The class for the object
- A class to test the object

### The class for the object

```java
class Father {
//These are instance
    String name;
    int age;
//These are the static methods
    void fatherDetails() {
        System.out.println("Father");
        }
    void fatherNate(){
        System.out.println("Im Father Nate!")
    }
}
```

The example above is a simple class that has instance variables and methods.

### A class to test the object

```java
public class FatherTestDrive{
    public static void main(String[] args){
        Father one = new Father();
        one.name = "Nate";
        one.age = 28;
        Father two = new Father();
        two.name = "Sean";
        two.age = 30;
    }
}
```

This is the class that your main() method will live in. In the main method you will create and access objects of your new class type. The tester class has one job: Try out the methods and variables on your objects.

## Using your main()

You should have two uses on your main():

- To test your real class
- To launch/start your Java App

```java
class Father {
//These are instance
    String name;
    int age;
//These are the static methods
    void fatherDetails() {
        System.out.println("Father");
        }
    void fatherNate(){
        System.out.println("Im Father Nate!")
    }
}
public class FatherTestDrive{
    public static void main(String[] args){
        Father one = new Father();
        one.name = "Nate";
        one.age = 28;
        Father two = new Father();
        two.name = "Sean";
        two.age = 30;
    }
}
```

Above is a full example on how you should use a main() method. Used here, It is only testing a class and that's really all it needs to do. In a true Object Oriented program obects will be talking to other objects as opposed to a static main.
