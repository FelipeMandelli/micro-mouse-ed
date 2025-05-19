# 🐭 Micro Mouse ED

Simulador de um robô autônomo que explora um labirinto, mapeia obstáculos e encontra o melhor caminho entre o ponto de partida e a saída, baseado na competição Micro Mouse.

## 🎯 Objetivo

Este projeto foi desenvolvido como parte da disciplina de **Estrutura de Dados** no curso de Engenharia da Computação (Centro Universitário SENAC, 2025/1). O foco principal é aplicar conceitos de estruturas de dados, algoritmos de grafos e programação orientada a objetos em Java.

---

## ⚙️ Tecnologias e Ferramentas

- Java 17+
- Apache Maven
- JUnit 4 (para testes)
- Console (visualização básica)
- [PlantUML](https://plantuml.com/) (para diagramação)
- IDE: IntelliJ IDEA / Eclipse / VS Code

---

## 🗂️ Estrutura de Pacotes

```
src/main/java/br/senac/micromouse/
├── labirinto/         # Representação da matriz do labirinto
├── robo/              # Comportamento do robô e movimentação
├── mapeamento/        # Armazenamento do que foi descoberto
├── caminho/           # Algoritmos para encontrar o caminho ótimo
├── visualizacao/      # Impressão/visualização do labirinto
└── integracao/        # Classe Main e orquestração da aplicação
```

---

## 🧠 Principais Funcionalidades

- 🔍 Visão parcial do robô (vizinhaça imediata)
- 🧭 Mapeamento dinâmico do labirinto
- 💾 Memorização do caminho durante a exploração
- 🚀 Cálculo do melhor caminho com algoritmo de busca (BFS, A* ou Dijkstra)
- 📺 Visualização textual do labirinto e caminho final

---

## 🚀 Como Executar

```bash
# Compile o projeto
mvn compile

# Execute o projeto
mvn exec:java -Dexec.mainClass="br.senac.micromouse.integracao.Main"
```

---

## 🧪 Testes

```bash
# Executar testes unitários (JUnit)
mvn test
```

---

## 📝 Equipe

| Nome                 | Responsável por |
|----------------------|------------------|
| Fulano               | Labirinto        |
| Ciclano              | Robô             |
| Beltrano             | Mapeamento       |
| Maria                | Cálculo de Caminho |
| João                 | Visualização     |
| Todos                | Integração e Apresentação |

---

## 📅 Entregas

- 📄 Relatório ABNT: até **30/05/2025**
- 💻 Código em .zip: até **30/05/2025**
- 🗣️ Apresentação: **06/06/2025**

---

## 📌 Observações

- O robô **não tem visão total** do labirinto: ele só conhece as células ao redor da sua posição atual.
- O labirinto é fornecido pelo professor como uma matriz 20x20 com valores:
  - `0`: célula livre
  - `1`: parede
  - `2`: ponto inicial
  - `3`: ponto final

---

## 📎 Licença

Projeto acadêmico - uso exclusivo para fins educacionais.
