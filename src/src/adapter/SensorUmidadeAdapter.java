package adapter;

import legacy.SensorUmidade;

public class SensorUmidadeAdapter implements ISensor {
    private SensorUmidade sensor = new SensorUmidade();

    @Override
    public String lerValor() {
        return sensor.lerUmidade() + " %";
    }

    @Override
    public String getTipo() {
        return "Umidade";
    }
}