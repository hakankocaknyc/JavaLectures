package MarchWeek3_01;

public class MultiLevelInheritance {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Rectangle rectangle = new Rectangle();
	rectangle.width = 9;
	rectangle.length = 8;
	rectangle.area();
	}
}
class Shape {
	int area ;
}
class twoDimensiononalShape {
}
class Circle extends twoDimensiononalShape{
	int radius;
	void area() {
		System.out.println("area of the circle :" + 3.14d*radius*radius);
	}
}
class Rectangle extends twoDimensiononalShape {
	int width;
	int length;
	void area() {
		System.out.println("area of the rectangle :" + width*length);
	}
}
