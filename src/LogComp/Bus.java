package LogComp;

public class Bus extends PassTransport{
    public Bus(String name, String surname) {
        super(name,surname);
    }

    @Override
    public void canMove() {
        System.out.println(getClass().getSimpleName() + " Move on a road. ");
    }

    @Override
    public void getOnPassenges(int count) {
        System.out.println("Count of passengers: " + count);
    }

    @Override
    public void getOffPassengers(int count) {
        System.out.println("Count of passengers: " + count);
    }
}
