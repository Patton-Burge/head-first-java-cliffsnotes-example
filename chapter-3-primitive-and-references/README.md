# Chapter Know your Variables

## Table of Contents

- Declaring a Variable
- Primitive Types
- Java Keywords
- Reference Variables
- Objects on the garbage
- Arrays!

## Declaring a Variable

Java really cares about what the type a variable. It won't really let you mess things up that are simple to catch. The compiler will catch most of those. For example:

```java
int code = "I'm an integer";
```

A compiler will yell at your if you were to write something quite like this. Variables come in two different flavors : Primitive and Reference.

## Primitive Variables

A variable is like a box and a box holds things. There are really big boxes and then there are small boxes that hold different size of types. Primitives in Java come in all different sizes. Whenever you put things into the box you must give the box a name.

```java
// Types with their max numbers for integers
byte code = 127;
short code1 = 32767;
int code2 = 214783647;
long code3 = 9999999999999999;
```

```java
// Types with their numbers for floats/decimals
float code = 12.5f;
double code1 = 7704.26;
```

```java
// Types with their values
boolean code = true;
char code1 = 65535
```

## Java Keywords

There are 8 keywords you should remember

```java
boolean char byte short int long float double
```

There are many more but you just need to know that they are key words and that you cant use them for variable names.

## Refernce Variables

You can't stuff an object into a box. But you can reference a variable, an object reference is just another variable value. Something goes into a cup only this time the cup is a remote control that can do things.

## Objects on the Trash

If a variable is referencing an object than the object is still being used. When there is no variable referencing it the object is gone and will need to be re-referenced before being used again.

## Array(s)

Arrays (ordered, efficient list of things) give you fast random access by letting you use an index position to get any element in the array. Everey element in an array is just a variable. In other words, one of the eight primitive variable types or a reference variable. Anything you would put in a variable of that type can be assigned to an array element of that type. So in an array of type int (int[]), each element can hold an int. In a Cat array (Cat[]) each element can hold... a Cat? No, remember that a reference variable just hold a reference (a remote control), not the object itself. So in a Cat array, each element can hold a remote control to a Cat.
the array is an object, even though it's an array of primitives.

Arrays are always objects, whether they're declared to hold primitives or object references. But you can have an array of object that's declared to hold primitive values. In other words, the array object can have elements which are primitives, but the array itself is never a primitive. Regardless of what the array holds, the array itself is always an object!
Making an array
