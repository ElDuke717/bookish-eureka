# bookish-eureka

A Repo of Java code to learn and understand the language.
# Java Basics

Java is a popular, versatile, and platform-independent programming language used for building a wide range of applications, from mobile apps to large-scale enterprise systems. It's known for its portability, performance, and robustness. Here's a brief introduction to some of the basics of Java, with code examples:

### 1. Basics of Java Syntax:

- **Class Definition**: In Java, everything is an object, and all code resides inside a class.

  ```java
  public class Main {
      // code goes here
  }
  ```

- **The `main` Method**: Any application must have a `main` method as the entry point.

  ```java
  public static void main(String[] args) {
      System.out.println("Hello, World!");
  }
  ```

- **Case Sensitivity**: Java is case-sensitive, meaning that `Hello` and `hello` are different identifiers.

### 2. Data Types and Variables:

- **Primitive Data Types**: Java has eight primitive data types (e.g., `int`, `double`, `boolean`).

  ```java
  int myNum = 5;               // Integer (whole number)
  float myFloatNum = 5.99f;    // Floating point number
  char myLetter = 'D';         // Character
  boolean myBool = true;       // Boolean
  String myText = "Hello";     // String (not a primitive data type)
  ```

### 3. Control Structures:

- **If-Else Statement**:

  ```java
  if (20 > 18) {
      System.out.println("20 is greater than 18");
  } else {
      System.out.println("18 is greater than 20");
  }
  ```

- **Loops (for, while, do-while)**:

  ```java
  // for loop
  for (int i = 0; i < 5; i++) {
      System.out.println(i);
  }

  // while loop
  int i = 0;
  while (i < 5) {
      System.out.println(i);
      i++;
  }

  // do-while loop
  int i = 0;
  do {
      System.out.println(i);
      i++;
  } while (i < 5);
  ```

### 4. Methods:

- **Method Definition**: A method is a collection of statements that are grouped together to perform an operation.

  ```java
  public static int sum(int a, int b) {
      return a + b;
  }

  public static void main(String[] args) {
      int result = sum(5, 10);
      System.out.println("The sum is: " + result);
  }
  ```

### 5. Object-Oriented Programming (OOP) Principles:

Java is an OOP language, meaning it's based on concepts like Classes, Objects, Inheritance, Polymorphism, Abstraction, and Encapsulation.

- **Class and Objects**:

  ```java
  public class Car {
      // Attributes
      int modelYear;
      String modelName;

      // Constructor
      public Car(int year, String name) {
          modelYear = year;
          modelName = name;
      }

      // Method
      public void display() {
          System.out.println("Model Year: " + modelYear);
          System.out.println("Model Name: " + modelName);
      }
  }

  public class Main {
      public static void main(String[] args) {
          Car myCar = new Car(1969, "Mustang");
          myCar.display();
      }
  }
  ```

This is a high-level overview and there's a lot more to Java. But these basics should help you get started with understanding how Java works and how to write simple programs.

## SmileyFace

A simple program that prints a smiley face. Some of the code is taken from Educative.io's Java course, and SmileyFace is expanded upon and will work on it's own to create a smiley face output.

The window that pops up is not the Java runtime itself, but rather a graphical user interface (GUI) window created and managed by the Java runtime using the Abstract Window Toolkit (AWT) and Swing libraries. The Java runtime does not directly "recognize" the `Canvas`, `Graphics`, `Color`, and `JFrame` classes. Instead, these are classes provided by the Java Standard Edition API, specifically from the AWT and Swing libraries, which are used for creating and managing GUI elements in a Java application. Here's how they work together:

1. **JFrame**:

   - `JFrame` is part of the Swing library (`javax.swing` package). It represents the main window where your application's components (like a `Canvas`) can be added. When you create and show a `JFrame`, it becomes the main window of your application.

2. **Canvas**:

   - `Canvas` is a component from the AWT library (`java.awt` package) that allows for custom drawing and rendering. It's a blank rectangular area where you can draw or render other graphical components.

3. **Graphics**:

   - The `Graphics` class, also from the AWT library, provides the basic drawing methods. When you override the `paint` method of a `Canvas` or a `Component`, the Java runtime passes a `Graphics` object to this method. You use this `Graphics` object to draw shapes, text, and images onto the component.

4. **Color**:
   - The `Color` class, from the AWT library as well, is used to encapsulate colors in the default sRGB color space. You can use this class to define the colors for your drawing on the `Canvas`.

When you run a Java application with a GUI, the Java runtime creates and manages a window for you through these classes. The runtime itself handles the low-level operations like interacting with the operating system's windowing system, but it exposes high-level classes and methods that you use to create and manage the GUI elements. The window that pops up is a result of the `JFrame` you create and display in your code. The `JFrame` recognizes and manages the `Canvas` you add to it, and it uses the `Graphics` and `Color` classes to render the smiley face according to the drawing commands you've written in your `paint` method.

## Replicating with JavaScript

I replicated the functionality with JavaScript with ChatGPT and the Canvas API. The code is in the `smileyface.js` file. See the `smileyface.html` file for the HTML and JavaScript code.

For smileyFace.js, it requires the canvas module to be installed.

There are two approaches to drawing the smiley face with JavaScript.

