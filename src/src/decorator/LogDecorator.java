package decorator;

import adapter.ISensor;

public class LogDecorator extends SensorDecorator {
    public LogDecorator(ISensor sensor) {
        super(sensor);
    }

    @Override
    public String lerValor() {
        String valor = super.lerValor();
        System.out.println("Log: Leitura de " + getTipo() + " -> " + valor);
        return valor;
    }
}