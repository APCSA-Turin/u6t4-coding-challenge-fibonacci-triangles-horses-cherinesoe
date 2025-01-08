package com.example.project;

public class Main {
    public static void main(String args[]) {
        TriangleCollection collection1 = new TriangleCollection(6,4,7);
        TriangleCollection collection2 = new TriangleCollection(10,7,3);

        System.out.println(collection1.totalPerimeter());
    }
}
