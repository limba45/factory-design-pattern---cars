


//This is a small effort by learning from the lecture and the code provided by the professor
//Cars Factory can be created in many ways
//Here many factory classes can be created, for example, We can create a class for colors, And for other categories of the cars.

public class CarTest {
	 public static void main(String[] args) {
	        
	     //MG Car Company   
		 CarFactory MGCarFactory = CarProducerFactory.getCarFactory("MG");       
	     
		 Cars MG3 = MGCarFactory.createCar("MG 3");
	     MG3.drive();
	        
	     Cars MG5 = MGCarFactory.createCar("MG 5");
	     MG5.drive();
	     
	     
	     //Toyota Car Company   
	     CarFactory ToyotaCarFactory = CarProducerFactory.getCarFactory("Toyota");
	     
	     Cars Corolla = ToyotaCarFactory.createCar("Corolla");
	     Corolla.drive();
	        
	     Cars Camry = ToyotaCarFactory.createCar("Camry");
	     Camry.drive();
	     
	     //Honda Car company
	     CarFactory HondaCarFactory = CarProducerFactory.getCarFactory("Honda");
	     
	     Cars Accord = HondaCarFactory.createCar("Accord");
	     Accord.drive();
	        
	     Cars Insight = HondaCarFactory.createCar("Insight");
	     Insight.drive();
	 }
}
