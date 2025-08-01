package factory;

import adapter.ISensor;
import adapter.SensorUmidadeAdapter;

public class UmidadeFactory extends SensorFactory {
    public ISensor criarSensor() {
        return new SensorUmidadeAdapter();
    }
}