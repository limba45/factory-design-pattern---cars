
public class ToyotaCarFactory implements CarFactory{
    
    public Cars createCar(String cartype) {
        
        if("Corolla".equalsIgnoreCase(cartype)) {
            return new Corolla();
        }  
        if("Camry".equalsIgnoreCase(cartype)) {
            return new Camry();
        }
        return null;
    }
}
