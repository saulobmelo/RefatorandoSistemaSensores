package adapters;

import interfaces.Sensor;
import sensores_legados.SensorTemperatura;

public class SensorTemperaturaAdapter implements Sensor {
    private SensorTemperatura sensor = new SensorTemperatura();
    public String lerDados() {
        return sensor.lerTemperatura() + " °C";
    }
}