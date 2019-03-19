package ListCar;


import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public abstract class Car {

    private int id;
    private int numberPlate;
    private int yearOfManufacture;
    private String brand;
    private boolean haveInsurance;

    public Car() {


    }

    public Car(int numberPlate, int yearOfManufacture, String brand, boolean haveInsurance) {
        this.yearOfManufacture = yearOfManufacture;
        this.numberPlate = numberPlate;
        this.brand = brand;
        this.haveInsurance = haveInsurance;

    }

}