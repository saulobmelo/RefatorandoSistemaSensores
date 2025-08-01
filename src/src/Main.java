import adapter.ISensor;
import decorator.AlertaDecorator;
import decorator.FormatDecorator;
import decorator.LogDecorator;
import factory.LuminosidadeFactory;
import factory.TemperaturaFactory;
import factory.UmidadeFactory;
import singleton.SensorManagerSingleton;

public class Main {
    public static void main(String[] args) {
        SensorManagerSingleton manager = SensorManagerSingleton.getInstancia();

        ISensor temp = new TemperaturaFactory().criarSensor();
        ISensor umid = new UmidadeFactory().criarSensor();
        ISensor lumi = new LuminosidadeFactory().criarSensor();

        temp = new AlertaDecorator(new LogDecorator(new FormatDecorator(temp)));
        umid = new LogDecorator(umid);
        lumi = new FormatDecorator(lumi);

        manager.adicionarSensor(temp);
        manager.adicionarSensor(umid);
        manager.adicionarSensor(lumi);

        manager.exibirTodos();
    }
}