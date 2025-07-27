package manager;

import decorators.LogDecorator;
import decorators.VerificadorLimiteDecorator;
import display.DisplayConsole;
import factory.SensorFactory;
import interfaces.Sensor;

public class SensorManager {
    private DisplayConsole display = new DisplayConsole();

    public void exibirDadosSensores() {
        SensorFactory factory = SensorFactory.getInstance();

        Sensor temperatura = new VerificadorLimiteDecorator(
                new LogDecorator(factory.criarSensor("temperatura")), 50.0);
        Sensor umidade = new LogDecorator(factory.criarSensor("umidade"));
        Sensor luminosidade = factory.criarSensor("luminosidade");

        display.mostrarDados("Temperatura", temperatura.lerDados());
        display.mostrarDados("Umidade", umidade.lerDados());
        display.mostrarDados("Luminosidade", luminosidade.lerDados());
    }
}