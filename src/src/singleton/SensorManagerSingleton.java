package singleton;

import adapter.ISensor;
import legacy.DisplayConsole;

import java.util.ArrayList;
import java.util.List;

public class SensorManagerSingleton {
    private static SensorManagerSingleton instancia;
    private List<ISensor> sensores = new ArrayList<>();
    private DisplayConsole display = new DisplayConsole();

    private SensorManagerSingleton() {}

    public static SensorManagerSingleton getInstancia() {
        if (instancia == null) {
            instancia = new SensorManagerSingleton();
        }
        return instancia;
    }

    public void adicionarSensor(ISensor sensor) {
        sensores.add(sensor);
    }

    public void exibirTodos() {
        for (ISensor s : sensores) {
            display.mostrarDados(s.getTipo(), s.lerValor());
        }
    }
}