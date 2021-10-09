package truckbuilder;

public class TruckState implements State {

	@Override
	public void buildTruck() {

		System.out.println("Truck building process");

	}

	@Override
	public void changeTrcuk() {

		System.out.println("Change the trcuk type ");

	}

}
