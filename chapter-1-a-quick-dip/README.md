# A Quick Dip

Chapter One is really broken down into 2 sections. "How it Works" and "Code Structure in Java"
are the main 2 sections of this chapter. In "How it Works" it goes over the flow of writing and running Java files and a little bit of the history of Java. "Code Structure in Java" goes over some of the syntax,anatomy of a class, and some datatypes that are commonly used.

## Questions and Answers

- What is a Compiler?

The Compiler checks for errors and won't let you compile until it is satisfied with your code. The compiler also creates a new document coded into java bytecode. Compile your code using javac (the compiler application)

- How is java code structured?

Create a source document that you can write your code in. When done or to a certain point compile the code and run it through a JVM(Virtual Java Machine).

- What is the anatomy of a class?

The anatomy of a class is structured in a few main pieces. Public class. Class. Name of the class. Name of the method. The arguments for the method if any. Every statement must end in a semicolon. See Below.

```java
    public class ThisClass{
    	public static void main(String[] args){
    		System.out.print("This is Java!");
    	}
    }
```

-What is the main method?
The Main method is where your program starts running. Your program could be 1000 lines long but without a main method your code will never actually start.The main method is where all the magic happens and what lets the code actually do things.

-what is a loop?
There are 3 types of loops in java: a while loop, a do-while loop, and a for loop. Loops work while the condition is true.It will keep going until it is either false or you break out of the loop.

```java
    public class ThisClass{
    	public static void main(String[] args){
            int x = 5;
    		while(x > 2){
                System.out.println("How are you today?");
                x = X-1;
            }
    	}
    }
```

-What is conditional branching?
Almost like a loop except it wont loop. Think of it like instead of "while theres still a glass" think "if theres still a glass". You can also expand into an if else statement from just a single if statement.

```java
    public class ThisClass{
    	public static void main(String[] args){
        int x = 5;
        if (x==5){
            System.out.println("Hi there friend");
            }
        System.out.println("I run everytime);
    	}
    }
```

- Do you have to declare the value type of every variable?

  Yes,you declare a variable unlike other languages.

- What is the syntax like in java?

The syntax is a lot like javascript and python once you get inside the class and the main.
