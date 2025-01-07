package com.example.project;

public class Triangle {
    // array of Point objects
    private Point[] vertices;
    
    // Constructor: initializes the vertices array
    // to contain the three Point objects
    public Triangle(Point p1, Point p2, Point p3) {
      /* IMPLEMENT ME */
      Point[] vertices = {p1, p2, p3};
    }

    public Point[] getVertices() {
        return vertices;
    }
    
    // Returns the perimeter of the Triangle
    // HINT: use the distanceTo method that you wrote in the Point class
    public double perimeter() {
      /* IMPLEMENT ME */
      double s1 = vertices[0].distanceTo(vertices[1]);
      double s2 = vertices[0].distanceTo(vertices[2]);
      double s3 = vertices[1].distanceTo(vertices[2]);
      return s1 + s2 + s3;
    }
  
    // Returns a String with the three vertices that make up the Triangle;
    // if the vertices are the points (6, 10), (11, 15), and (18, 7),
    // this method should return: "[(6, 10), (11, 15), (18, 7)]"
    public String triangleInfo() {
      /* IMPLEMENT ME */
      return "[" + vertices[0].pointInfo() + vertices[1].pointInfo() + vertices[2].pointInfo() + "]";
    }
  }
  
  
  
  