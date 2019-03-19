package ListCar;

public class NewCar extends Car {
     private int id;
     private boolean havePositioningDevice =true;
     public NewCar(boolean havePositioningDevice){
         super();
     }
     public NewCar(int numberPlate,int yearOfManufacture ,String brand ,boolean haveInsurance) {
         super(numberPlate, yearOfManufacture, brand, haveInsurance);
         this.havePositioningDevice = haveInsurance;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isHavePositioningDevice() {
        return havePositioningDevice;
    }

    public void setHavePositioningDevice(boolean havePositioningDevice) {
        this.havePositioningDevice = havePositioningDevice;
    }
}
