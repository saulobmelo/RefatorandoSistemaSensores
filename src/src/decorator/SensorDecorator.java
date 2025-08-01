package decorator;

import adapter.ISensor;

public abstract class SensorDecorator implements ISensor {
    protected ISensor sensorDecorado;

    public SensorDecorator(ISensor sensor) {
        this.sensorDecorado = sensor;
    }

    @Override
    public String lerValor() {
        return sensorDecorado.lerValor();
    }

    @Override
    public String getTipo() {
        return sensorDecorado.getTipo();
    }
}