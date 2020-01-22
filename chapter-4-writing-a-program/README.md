# How objects behave

## Table of Contents

- Methods use object state
- Method arguments and return types
- Pass by value
- Getters and Setters
- Encapsulation
- Using references in an array

## Methods use object state

State affects behavior, behavior affects state. If your instance variables are different why should the outcome be the same? You can add parts to your objects that use instance variable values that can change what the code does.

## Method arguments and return types / pass by value

A method uses parameters and a Caller passes arguments. If you give a method a parameter just know that you must pass it something.

```java
int numberYouWantBack(int number){
    return number;
}
```

Methods can return values but since we have been just using the void() return type. If you declare a value to have a return type. It must return a value of that declared type.

```java
int brockFavNumber(){
    return 0;
}
```

So say you pass a variable into a method. That variable once inside the method can be altered and changed but the variable on the outside of the method won't change due to your manipulation inside the method.

```java
int brock = 0;

foo.doSomething(brock)
```

## Getters and Setters

It's pretty self explanitory what they do. A getter goes out and gets things and a setter goes and sets things (usually instance variables).A getters sole purpose in life is to send back as a return value.A setters sole purpose is to get a value and set it to its instance variables.

```java
class Clothing{
    String shoes;

    String getShoes(){
        return shoes
    }
    void setShoes(String someShoes){
        shoes = someShoes
    }
}
```

## Encapulation

So far all of the data that has been written has been exposing all of our data for people to change. So how can we change that. Step one: is by making all of our instance variables private so that adds a little safety to our code. Step two: is making all of our getters and setters public.

Turning this:

```java
class Clothing{
    String shoes;

    String getShoes(){
        return shoes
    }
    void setShoes(String someShoes){
        shoes = someShoes
    }
}
```

Into:

```java
class Clothing{
    private String shoes;

    public String getShoes(){
        return shoes
    }
    public void setShoes(String someShoes){
        shoes = someShoes
    }
}
```

## References in an array

Objects in an array behave just like any other object. How you access them is a little different.

```java
Cat[] pets;
pets = new Cat[10]
pets[0] = new Cat()
pets[0].setTailLength("Massive")
```

See Above: ^^^
