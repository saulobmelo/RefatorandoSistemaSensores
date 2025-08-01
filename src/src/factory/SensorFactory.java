package factory;

import adapter.ISensor;

public abstract class SensorFactory {
    public abstract ISensor criarSensor();
}