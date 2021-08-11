package LogComp;

public class PassAirplane extends PassTransport{

    public PassAirplane(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void canMove() {
        System.out.println(getClass().getSimpleName() + " Move on air. ");
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
