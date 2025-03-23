public class Car {
    public String name;
    public int speed;

    public void  my_car(String name, int speed) {
        this.name = name;
        this.speed = speed;

        System.out.println("Your car is" + " " + this.name + " and have " + this.speed + " " + "Kmh");
    }
}
