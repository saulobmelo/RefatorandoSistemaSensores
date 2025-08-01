package adapter;

import legacy.SensorTemperatura;

public class SensorTemperaturaAdapter implements ISensor {
    private SensorTemperatura sensor = new SensorTemperatura();

    @Override
    public String lerValor() {
        return sensor.lerTemperatura() + " °C";
    }

    @Override
    public String getTipo() {
        return "Temperatura";
    }
}