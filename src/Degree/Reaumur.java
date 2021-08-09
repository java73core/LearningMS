package Degree;

public class Reaumur implements ConverterT  {
    private double celsium;

    @Override
    public double convert (double celsium) {
        return celsium * 0.8;
    }

    @Override
    public void writeResult() {
        System.out.println("Result of convert Celsium to Reaumur equals: " + convert(celsium));
    }
}
