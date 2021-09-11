
public class MGCarFactory implements CarFactory{
    @Override
    public Cars createCar(String carType) {
        
        if("MG 5".equalsIgnoreCase(carType)) {
            return new MG5();
        }  
        if("MG 3".equalsIgnoreCase(carType)) {
            return new MG3();
        }
        return null;
    }

}
