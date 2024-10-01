import java.util.Scanner;

interface Transport {
    void Move();
    void FuelUp();
}

class Car implements Transport {
    String model;
    int speed;
    @Override
    public void Move() {
        System.out.println("Mashina Edet");
    }

    @Override
    public void FuelUp() {
        System.out.println("Mashina zapravka");
    }
    void setModel(String Model){
        this.model = Model;
    }
    void setSpeed(int Speed){
        this.speed = Speed;
    }
    void getModel(){
        System.out.println(model);
    }
    void getSpeed(){
        System.out.println(speed);
    }
}

class Moto implements Transport {
    String model;
    int speed;
    @Override
    public void Move() {
        System.out.println("Moto Edet");
    }

    @Override
    public void FuelUp() {
        System.out.println("Moto zapravka");
    }
    void setModel(String Model){
        this.model = Model;
    }
    void setSpeed(int Speed){
        this.speed = Speed;
    }
    void getModel(){
        System.out.println(model);
    }
    void getSpeed(){
        System.out.println(speed);
    }
}

class Plane implements Transport {
    String model;
    int speed;
    @Override
    public void Move() {
        System.out.println("Plane Edet");
    }

    @Override
    public void FuelUp() {
        System.out.println("Plane zapravka");
    }
    void setModel(String Model){
        this.model = Model;
    }
    void setSpeed(int Speed){
        this.speed = Speed;
    }
    void getModel(){
        System.out.println(model);
    }
    void getSpeed(){
        System.out.println(speed);
    }
}
class Velo implements Transport {
    String model;
    int speed;
    @Override
    public void Move() {
        System.out.println("Velo Edet");
    }

    @Override
    public void FuelUp() {
        System.out.println("Velo zapravka");
    }
    void setModel(String Model){
        this.model = Model;
    }
    void setSpeed(int Speed){
        this.speed = Speed;
    }
    void getModel(){
        System.out.println(model);
    }
    void getSpeed(){
        System.out.println(speed);
    }
}

abstract class TransportFactory {
    abstract Transport CreateTransport();
}

class CarFactory extends TransportFactory {
    @Override
    public Transport CreateTransport() {
        return new Car();
    }
}

class MotoFactory extends TransportFactory {
    @Override
    public Transport CreateTransport() {
        return new Moto();
    }
}

class PlaneFactory extends TransportFactory {
    @Override
    public Transport CreateTransport() {
        return new Plane();
    }
}
class VeloFactory extends TransportFactory {
    @Override
    public Transport CreateTransport() {
        return new Velo();
    }
}
public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        Moto moto = new Moto();
        Plane plane = new Plane();
        Velo velo = new Velo();
        System.out.println("1 - Car 2 - Moto 3 - Plane 4 - Velo");
        int num = scanner.nextInt();
        System.out.println("Model = ");
        String model = scanner.next();
        System.out.println("Speed = ");
        int speed = scanner.nextInt();
        switch (num) {
            case 1:
                car.Move();
                car.FuelUp();
                car.setModel(model);
                car.setSpeed(speed);
                car.getModel();
                car.getSpeed();
                break;
            case 2:
                moto.Move();
                moto.FuelUp();
                moto.setModel(model);
                moto.setSpeed(speed);
                moto.getModel();
                moto.getSpeed();
                break;
            case 3:
                plane.Move();
                plane.FuelUp();
                plane.setModel(model);
                plane.setSpeed(speed);
                plane.getModel();
                plane.getSpeed();
                break;
            case 4:
                velo.Move();
                velo.FuelUp();
                velo.setModel(model);
                velo.setSpeed(speed);
                velo.getModel();
                velo.getSpeed();
                break;
            default:
                System.out.println("ot 1 do 4");
            break;
    }
}}
