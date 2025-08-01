package decorator;

import adapter.ISensor;

public class AlertaDecorator extends SensorDecorator {
    public AlertaDecorator(ISensor sensor) {
        super(sensor);
    }

    @Override
    public String lerValor() {
        String valor = super.lerValor();
        if (getTipo().equals("Temperatura")) {
            double temp = Double.parseDouble(valor.replace(" °C", "").replace("*", "").trim());
            if (temp > 50) {
                valor += " [ALERTA: Temperatura elevada!]";
            }
        }
        return valor;
    }
}