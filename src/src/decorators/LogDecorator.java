package decorators;

import interfaces.Sensor;

public class LogDecorator extends SensorDecorator {
    public LogDecorator(Sensor sensor) {
        super(sensor);
    }
    public String lerDados() {
        String dados = sensor.lerDados();
        System.out.println("[LOG] Dado lido: " + dados);
        return dados;
    }
}