package factory;

import adapter.ISensor;
import adapter.SensorTemperaturaAdapter;

public class TemperaturaFactory extends SensorFactory {
    public ISensor criarSensor() {
        return new SensorTemperaturaAdapter();
    }
}