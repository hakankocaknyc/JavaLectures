package Week10_PLY_Shape;

public class Shape {
	

    void draw() {
        System.out.println("drawing...");
    }
} 


    class Rectangle extends Shape {
        int width;
        int length;

        void draw() {
            System.out.println("drawing rectangle...");
        }

        void calculateArea() {
            System.out.println("Area is : " + width * length);
        }
    }

    class Circle extends Shape
    {
        void draw() {
            System.out.println("drawing circle...");
        }

        void calculateArea() {
        }
    }

    class Triangle extends Shape
    {
        void draw() {
            System.out.println("drawing triangle...");
        }

        void calculateArea() {
        }
    }






