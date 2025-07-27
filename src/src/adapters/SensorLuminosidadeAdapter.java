package adapters;

import interfaces.Sensor;
import sensores_legados.SensorLuminosidade;

public class SensorLuminosidadeAdapter implements Sensor {
    private SensorLuminosidade sensor = new SensorLuminosidade();
    public String lerDados() {
        return sensor.lerLuminosidade() + " lux";
    }
}