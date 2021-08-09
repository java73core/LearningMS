package Degree;

public class Delilah  implements ConverterT {
    private double celsium;

    @Override
    public double convert(double celsium) {
        return 100 - (celsium * 1.5);
    }

    @Override
    public void writeResult() {
        System.out.println("Result of convert Celsium to Delilah equals: " + convert(celsium));
    }
}
