package Week10_PLY_Car;

public class Car {
	private String model;
    private String color;
    private int wheels;
    private int engine;
    private int door;


    public Car()
    {

    }
    public Car(String color, int engine, int door) {
        this.color = color;
        this.engine = engine;
        this.door = door;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;

    }
}

 
