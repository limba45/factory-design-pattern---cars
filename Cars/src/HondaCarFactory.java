
public class HondaCarFactory implements CarFactory{
    
    public Cars createCar(String cartype) {
        
        if("Accord".equalsIgnoreCase(cartype)) {
            return new Accord();
        }  
        if("Insight".equalsIgnoreCase(cartype)) {
            return new Insight();
        }
        return null;
    }
}
	
