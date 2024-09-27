package com.campusdual.classroom;

public class Car {
    public static final short MAX_SPEED = 120;
    public String brand;
    public String model;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car() {  }

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se pode apagar o vehículo, primero ten que estar detido");
        }
    }

    //We assume that with each acceleration the speed increases by 20
    public void accelerate() {
        int actualSpeed = this.speedometer;
        if ((actualSpeed + 20) > MAX_SPEED) {
            System.out.println("No puedes acelerar");
        } else {
            this.speedometer = actualSpeed + 20;
            System.out.println("Velocidad actual: " + this.speedometer);
        }
    }

    //We assume that with each braking the speed is reduced by 20
    public void brake() {
        int actualSpeed = this.speedometer;
        if ((actualSpeed - 20) < 0) {
            System.out.println("No puedes frenar");
        } else {
            this.speedometer = actualSpeed - 20;
            System.out.println("Velocidad actual: " + this.speedometer);
        }
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public void turnAngleOfWheels(int num) {
        int actual = this.wheelsAngle;
        if (num >= -45 && num <= 45) {
            this.wheelsAngle = actual + num;
        } else if (num > 45) {
            this.wheelsAngle = 45;
        } else if (num < 45) {
            this.wheelsAngle = -45;
        }
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer == 0) {
            this.reverse = reverse;
            this.gear = "R";
        }
    }
}
