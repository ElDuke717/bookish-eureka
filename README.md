# bookish-eureka

A Repo of Java code to learn and understand the language.

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
