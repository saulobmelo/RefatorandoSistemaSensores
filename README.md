# Sistema de Sensores Refatorado com Padrões de Projeto (GOF)

Este projeto é uma refatoração de um sistema legado de leitura de sensores utilizando padrões de projeto do catálogo GoF. A proposta é tornar o sistema mais modular, reutilizável, coeso e de fácil manutenção.


## 🎯 Objetivos

- Reduzir o acoplamento entre componentes
- Aumentar a coesão e modularidade do sistema
- Permitir extensões sem modificar o código legado
- Aplicar os padrões:
  - Factory Method
  - Singleton
  - Adapter
  - Decorator

## ⚙️ Como executar

1. Pré-requisitos:

    - JDK 17+
    - Maven (opcional)

2. Compile todos os arquivos `.java`:

   ```bash
   javac -d bin src/*.java src/**/*.java

3. Execute a aplicação:

    ```bash
    java -cp bin Main

4. Saída esperada no console:
    ```bash
    [LOG] Dado lido: 36.5 °C
    [Temperatura]: 36.5 °C
    [LOG] Dado lido: 72.3 %
    [Umidade]: 72.3 %
    [Luminosidade]: 850 lux

    ```

## 🧩 Padrões de Projeto Utilizados
1. Adapter

    O que faz: Adapta sensores legados (SensorTemperatura, SensorUmidade, SensorLuminosidade) para a interface comum Sensor.

    Benefício: Permite que todos os sensores sejam tratados de forma uniforme, promovendo polimorfismo.

2. Decorator

    O que faz: Adiciona funcionalidades extras aos sensores sem alterar suas implementações.

    Exemplos utilizados:
    
    - LogDecorator: adiciona logging de leituras.
    VerificadorLimiteDecorator: emite alertas se a temperatura ultrapassar certo limite.

3. Factory Method + Singleton

    Classe: SensorFactory
    O que faz: Centraliza a criação de sensores, evitando instâncias espalhadas e promovendo encapsulamento da lógica de construção.
    Singleton: garante que apenas uma instância da fábrica exista.

## 📐 Benefícios alcançados

| Problema no código legado                   | Solução com padrões GOF                                 |
|---------------------------------------------|----------------------------------------------------------|
| Alto acoplamento (uso direto de classes)    | Uso de `SensorFactory` e interface `Sensor`              |
| Baixa coesão (uma classe faz tudo)          | Divisão clara de responsabilidades                       |
| Dificuldade de extensão                     | Decorators permitem adicionar comportamento novo         |
| Falta de polimorfismo entre sensores        | Interface `Sensor` com Adapters soluciona isso           |


## 📁 Estrutura do Projeto

```
SistemaSensoresRefatorado/
├── Main.java
├── interfaces/
│ └── Sensor.java
├── sensores_legados/
│ ├── SensorTemperatura.java
│ ├── SensorUmidade.java
│ └── SensorLuminosidade.java
├── adapters/
│ ├── SensorTemperaturaAdapter.java
│ ├── SensorUmidadeAdapter.java
│ └── SensorLuminosidadeAdapter.java
├── decorators/
│ ├── SensorDecorator.java
│ ├── LogDecorator.java
│ └── VerificadorLimiteDecorator.java
├── factory/
│ └── SensorFactory.java
├── manager/
│ └── SensorManager.java
└── display/
└── DisplayConsole.java
```

## 👨‍💻 Autores

Este projeto foi desenvolvido como parte da disciplina **Padrões de Projeto**, do curso de **Análise e Desenvolvimento de Sistemas** do **Instituto Federal da Bahia – Campus Santo Antônio de Jesus (IFBA-SAJ)**, no semestre 2025.1.

**Equipe de Desenvolvimento:**
- Saulo Melo
- Flávio Costa
- Vinícius Xavier
