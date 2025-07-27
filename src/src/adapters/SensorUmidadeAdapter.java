package adapters;

import interfaces.Sensor;
import sensores_legados.SensorUmidade;

public class SensorUmidadeAdapter implements Sensor {
    private SensorUmidade sensor = new SensorUmidade();
    public String lerDados() {
        return sensor.lerUmidade() + " %";
    }
}