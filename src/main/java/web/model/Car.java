package web.model;

public class Car {
    private String carBrand;
    private String color;
    private int age;

    public Car() {
    }

    public Car(String carBrand, String color, int age) {
        this.carBrand = carBrand;
        this.color = color;
        this.age = age;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
