import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {

    private HashMap<RegistrationPlate,String> vehicleRegister;

    public VehicleRegister(){
        this.vehicleRegister = new HashMap<RegistrationPlate,String>();
    }


    public boolean add(RegistrationPlate plate, String owner){
        if(!this.vehicleRegister.containsKey(plate)){
            vehicleRegister.put(plate,owner);
            return true;
        } else {
            return false;
        }
    }


    public String get(RegistrationPlate plate){
        if(!this.vehicleRegister.containsKey(plate)){
            return null;
        } else {
            return this.vehicleRegister.get(plate);
        }
    }

    public boolean delete(RegistrationPlate plate){
        if(this.vehicleRegister.containsKey(plate)){
            vehicleRegister.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates(){
        for (RegistrationPlate plate : this.vehicleRegister.keySet()){
            System.out.println(plate);
        }
    }

    public void printOwners(){

        ArrayList<String> owners = new ArrayList<String>();
        String addedOwner = "";

        for(RegistrationPlate plate : this.vehicleRegister.keySet()){
            addedOwner = this.vehicleRegister.get(plate);
            if(!owners.contains(addedOwner)){
                owners.add(addedOwner);
            }
        }

        for (String str : owners){
            System.out.println(str);
        }

    }







}
