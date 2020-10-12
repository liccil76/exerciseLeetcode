package ParkingSystem;

public class Main {
    public static void main(String[] args){
        ParkingSystem obj = new ParkingSystem(1, 1, 0);
        System.out.println(obj.addCar(1));
        System.out.println(obj.addCar(2));
        System.out.println(obj.addCar(3));
        System.out.println(obj.addCar(1));
    }
}