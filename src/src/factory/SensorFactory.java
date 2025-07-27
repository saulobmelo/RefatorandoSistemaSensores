package factory;

import adapters.SensorLuminosidadeAdapter;
import adapters.SensorTemperaturaAdapter;
import adapters.SensorUmidadeAdapter;
import interfaces.Sensor;

public class SensorFactory {
    private static SensorFactory instancia;
    private SensorFactory() {}
    public static SensorFactory getInstance() {
        if (instancia == null) {
            instancia = new SensorFactory();
        }
        return instancia;
    }
    public Sensor criarSensor(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "temperatura" -> new SensorTemperaturaAdapter();
            case "umidade" -> new SensorUmidadeAdapter();
            case "luminosidade" -> new SensorLuminosidadeAdapter();
            default -> throw new IllegalArgumentException("Tipo de sensor inválido");
        };
    }
}