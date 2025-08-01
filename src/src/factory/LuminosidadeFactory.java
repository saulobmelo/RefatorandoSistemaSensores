package factory;

import adapter.ISensor;
import adapter.SensorLuminosidadeAdapter;

public class LuminosidadeFactory extends SensorFactory {
    public ISensor criarSensor() {
        return new SensorLuminosidadeAdapter();
    }
}