package adapter;

import legacy.SensorLuminosidade;

public class SensorLuminosidadeAdapter implements ISensor {
    private SensorLuminosidade sensor = new SensorLuminosidade();

    @Override
    public String lerValor() {
        return sensor.lerLuminosidade() + " lux";
    }

    @Override
    public String getTipo() {
        return "Luminosidade";
    }
}