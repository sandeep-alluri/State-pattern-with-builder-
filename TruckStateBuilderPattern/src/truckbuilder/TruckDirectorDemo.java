package truckbuilder;

public class TruckDirectorDemo {
	
	
	public static void main(String[] args) {
		
		// adding truck state in mauin method 
		State state = new TruckState();
		
		state.buildTruck();
		
		TruckTypeBuilder truckBuilder = new FireTruckTypeBuilder();
		
		System.out.println("Truck builder with different states \n ");
		
		Truck fireTruck = new Truck("FireTruckBody", "fireEngine", "Mrf Tyres", "ABs Break system", "Light orange");
		
		truckBuilder.setTruck(fireTruck);
		
		truckBuilder.setTruckType(TruckType.FIRE);
		truckBuilder.addBody();
		truckBuilder.addEngine();
		truckBuilder.addTyres();
		truckBuilder.addBreaks();
		truckBuilder.addColor();
		
		
	}

}
