package LogComp;

public class MainLogistic {
    public static void main(String[] args) {
        Bus bus = new Bus("Anton", "Antonov");
        PassAirplane passAirplane = new PassAirplane("Ivan", "Ivanov");
        PassHelicopter passHelicopter = new PassHelicopter("Piter", "Petrov");
        CargoAuto cargoAuto = new CargoAuto("box1", 3.0, 5.0, 4.0, 2.0);
        CargoAir cargoAir = new CargoAir("box2", 11.0, 25.0, 14.0, 22.0);
        CargoHelicopter cargoHelicopter = new CargoHelicopter("box3", 10.0, 15.0, 8.0, 12.0);
        Transport[] array = new Transport[]{bus, passAirplane, passHelicopter, cargoAuto, cargoAir, cargoHelicopter};
        for (Transport a : array) {
            a.canMove();
        }
    }
}
