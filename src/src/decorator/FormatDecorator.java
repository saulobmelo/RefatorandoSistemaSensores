package decorator;

import adapter.ISensor;

public class FormatDecorator extends SensorDecorator {
    public FormatDecorator(ISensor sensor) {
        super(sensor);
    }

    @Override
    public String lerValor() {
        return "*** " + super.lerValor() + " ***";
    }
}