# 📡 Sistema de Sensores Refatorado com Padrões de Projeto

Este projeto é uma refatoração de um sistema legado de sensores utilizando **padrões de projeto GOF** com foco em modularidade, baixo acoplamento e fácil manutenção. A aplicação simula sensores de **temperatura**, **umidade** e **luminosidade**, apresentando suas leituras em um display.

---

## 🎯 Objetivos

- Refatorar o sistema legado com foco em coesão e baixo acoplamento.
- Aplicar os padrões de projeto:
  - **Factory Method**
  - **Singleton**
  - **Adapter**
  - **Decorator**
- Garantir fácil manutenção e extensibilidade para ambientes IoT.

---

## 🛠️ Padrões Utilizados

### 🔨 Factory Method

Utilizado para encapsular a criação dos sensores. Cada tipo de sensor tem sua própria fábrica:

- `TemperaturaFactory`
- `UmidadeFactory`
- `LuminosidadeFactory`

Isso facilita a adição de novos sensores no futuro sem alterar o código principal.

---

### 🧩 Singleton

Aplicado na classe `SensorManagerSingleton`, garantindo uma única instância responsável pela coordenação dos sensores e envio dos dados ao display.

---

### 🔌 Adapter

Permite integrar os sensores legados (`SensorTemperatura`, `SensorUmidade`, `SensorLuminosidade`) a uma interface comum `ISensor`. Cada sensor legado tem seu adaptador correspondente, promovendo a **inversão de dependência**.

---

### 🎁 Decorator

Adiciona funcionalidades aos sensores de forma flexível, sem alterar as classes originais. Decoradores implementados:

- `LogDecorator`: exibe logs de leitura.
- `FormatDecorator`: aplica formatação personalizada.
- `AlertaDecorator`: exibe alertas para leituras críticas (ex: temperatura > 50°C).

---

## 📦 Estrutura do Projeto

    /src
    ├── Main.java
    ├── factory/
    │ ├── SensorFactory.java
    │ ├── TemperaturaFactory.java
    │ ├── UmidadeFactory.java
    │ └── LuminosidadeFactory.java
    ├── singleton/
    │ └── SensorManagerSingleton.java
    ├── adapter/
    │ ├── ISensor.java
    │ ├── SensorTemperaturaAdapter.java
    │ ├── SensorUmidadeAdapter.java
    │ └── SensorLuminosidadeAdapter.java
    ├── decorator/
    │ ├── SensorDecorator.java
    │ ├── LogDecorator.java
    │ ├── FormatDecorator.java
    │ └── AlertaDecorator.java
    ├── legacy/
    │ ├── SensorTemperatura.java
    │ ├── SensorUmidade.java
    │ ├── SensorLuminosidade.java
    │ └── DisplayConsole.java


---

## ▶️ Como Executar

1. Compile todos os arquivos `.java`.
2. Execute a classe `Main`.

Exemplo com terminal:
```bash
javac */*.java *.java
java Main
```

## 📈 Benefícios da Refatoração

| Problema no Código Legado                            | Solução com Padrões Aplicados                             |
|-------------------------------------------------------|-----------------------------------------------------------|
| SensorManager instanciando diretamente os sensores    | Uso do **Factory Method** para encapsular a criação       |
| Dependência direta de implementações concretas        | Introdução da interface `ISensor` com o padrão **Adapter**|
| Falta de flexibilidade para novos comportamentos      | Adoção do padrão **Decorator** para extensões dinâmicas   |
| Baixa coesão e responsabilidade concentrada           | Separação de responsabilidades com o **Singleton**        |
| Código difícil de manter e testar                     | Modularização com classes independentes e reutilizáveis   |



## 👨‍💻 Autores

Este projeto foi desenvolvido como parte da disciplina **Padrões de Projeto**, do curso de **Análise e Desenvolvimento de Sistemas** do **Instituto Federal da Bahia – Campus Santo Antônio de Jesus (IFBA-SAJ)**, no semestre 2025.1.

**Equipe de Desenvolvimento:**
- Saulo Melo
- Flávio Costa
- Vinícius Xavier
