# Chapter 5


## High Level Design

Your java program should start with a high level design.
Typically you’ll write three things when you create a new class:

- prepcode
- testcode
- real(java) code.

Prepcode should descibe what to do, not how to do it. Implementation comes later.
Use the prepcode to help design the test code.

Write test code before you implement the methods.

for Loops.

Regular (non-enhanced) for loops.

```java
for(int i =0; i < 100; i++)
```

Part One: initialization.

```java
int i =0;
```

Part two: boolean test.

```java
i < 100;
```

Part three: iteration expression

```java
i++;
```

The enhanced for loop

```java
for(String name : nameArray){}
```

Part One: iteration variable declaration.

```java
String name
```

Part two: The Actual collection

```java
nameArray
```
