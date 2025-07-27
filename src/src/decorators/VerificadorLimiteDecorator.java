package decorators;

import interfaces.Sensor;

public class VerificadorLimiteDecorator extends SensorDecorator {
    private double limite;
    public VerificadorLimiteDecorator(Sensor sensor, double limite) {
        super(sensor);
        this.limite = limite;
    }
    public String lerDados() {
        String dados = sensor.lerDados();
        try {
            double valor = Double.parseDouble(dados.split(" ")[0]);
            if (valor > limite) {
                System.out.println("[ALERTA] Temperatura acima do limite!");
            }
        } catch (Exception e) {
            System.out.println("[ERRO] Não foi possível verificar limite: " + e.getMessage());
        }
        return dados;
    }
}