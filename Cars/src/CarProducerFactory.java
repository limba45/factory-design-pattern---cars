
public class CarProducerFactory {
	
public static CarFactory getCarFactory(String factoryType) {
        
        if("Toyota".equalsIgnoreCase(factoryType)) {
            return new ToyotaCarFactory();
        }  
        if("MG".equalsIgnoreCase(factoryType)) {
            return new MGCarFactory();
        }
        if("Honda".equalsIgnoreCase(factoryType)) {
            return new HondaCarFactory();
        }
        
        return null;
    }
}
