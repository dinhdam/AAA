package ListCar;

public class AvergeCar extends Car {
    private int id;
    private boolean  HavePowerSteering;
    public AvergeCar(){
    }
    public AvergeCar(int id , boolean HavePowerSteering){
        super();


    }
    public AvergeCar(int numberPlate,int yearOfManufacture ,String brand ,boolean haveInsurance){
        super(numberPlate,yearOfManufacture,brand,haveInsurance);
        this.HavePowerSteering = haveInsurance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isHavePowerSteering() {
        return HavePowerSteering;
    }

    public void setHavePowerSteering(boolean havePowerSteering) {
        HavePowerSteering = havePowerSteering;
    }
}
