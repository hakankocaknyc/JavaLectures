package Week8_base;

public abstract class Shape {
	
	public static double pi = Math.PI;
	
	protected float height;
	protected float width;
	
	abstract float area();
	

}


class Square extends Shape{
	
  public Square(float height,float width) {
		super .height =height;
		super.width= width;
	}

	@Override
	float area() {
	 
		return height *width;
	}
	
	
	
}


class Rectangle extends Shape{
	public Rectangle(float height,float width) {
		super .height =height;
		super.width= width;
	}

	@Override
	float area() {
		 
		return height *width;
	}}

class Circle extends Shape{
	
		float radius;
	 public Circle(float radius) {
			this.radius = radius;
			 
		}
	@Override
	float area() {
		 
		return (float) Shape.pi * radius* radius;
	}}