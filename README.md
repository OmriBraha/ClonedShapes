<h1>📐 Geometric Shapes Hierarchy</h1>

<p>
  <img src="https://img.shields.io/badge/language-Java-orange.svg" alt="Java">
  <img src="https://img.shields.io/badge/GUI-JavaFX-blue.svg" alt="JavaFX">
</p>

<p>This program is a collection of geometric shapes, implemented in Java and utilizing the JavaFX GUI to display them on a canvas. The program defines a hierarchy of geometric shapes, starting with the abstract class <code>MyShape</code> which contains all common properties and methods shared by all shapes.</p>

<h2>🚀 Features</h2>

<ul>
  <li>A hierarchy of geometric shapes: <code>MyShape</code>, <code>MyBoundedShape</code>, <code>MyLine</code>, <code>MyOval</code>, and <code>MyRectangle</code> classes.</li>
  <li>Each shape is represented by 4 numbers (x1, y1), (x2, y2) and a color, and can draw itself using the <code>GraphicsContext</code> method.</li>
  <li>Constructors that take shape's data as input and initialize the variables.</li>
  <li><code>equals</code> method implemented to compare shapes by length.</li>
  <li>Cloneable interface and the <code>clone</code> method of <code>Object</code> to clone shapes.</li>
  <li>Main program creates 2 shapes of each kind with random values of location and size between 0 and 200, all shapes are initialized with the red color.</li>
  <li>Cloned shapes will be moved by x+10 and y+10 and will be green instead of red.</li>
  <li>Displayed on a Canvas inside an Application window in the JavaFX GUI.</li>
</ul>
</pre>

