package ListCar;

public class OldCar  extends  Car{
     private int id;
     private int actionDuration;
     public OldCar(){

     }
    public  OldCar(int id , int ActionDuration){
        super( );

     }
    public OldCar(int numberPlate,int yearOfManufacture ,String brand ,boolean haveInsurance){
        super(numberPlate,yearOfManufacture,brand,haveInsurance);
       this.actionDuration = actionDuration;
       this.id = id;

     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getActionDuration() {
        return actionDuration;
    }

    public void setActionDuration(int actionDuration) {
        this.actionDuration = actionDuration;
    }

}
