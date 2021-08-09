package Degree;

public class Kelvin implements ConverterT {
    private double celsium;

    @Override
    public double convert (double celsium) {
        return  (celsium + 273.15);
    }

    @Override
    public void writeResult() {
        System.out.println("Result of convert Celsium to Kelvin equals: " + convert(celsium));
    }

}
