package Degree;

public class Rankin implements ConverterT {
    private double celsium;

    @Override
    public double convert (double celsium) {
        return celsium * 1.8 +491.67;
    }

    @Override
    public void writeResult() {
        System.out.println("Result of convert Celsium to Rankin equals: " + convert(celsium));
    }
}
