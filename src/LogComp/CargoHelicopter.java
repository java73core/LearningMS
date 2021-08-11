package LogComp;

public class CargoHelicopter extends CargoTransport {
    public CargoHelicopter(String type, double length, double width, double height, double weight) {
        super(type, length, width, height, weight);
    }

    @Override
    public void canMove() {
        System.out.println(getClass().getSimpleName() + " Move on air. ");
    }

    @Override
    public boolean loadCargo() {
        return false;
    }

    @Override
    public boolean unLoadCargo() {
        return false;
    }
}
