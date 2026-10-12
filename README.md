# Exercício 1080 – Maior e Posição | Java

## 📌 Descrição

Este projeto é baseado no exercício **1080 – Maior e Posição**, da plataforma [Beecrowd](https://judge.beecrowd.com/pt/problems/view/1080).

O programa recebe uma sequência de números inteiros e identifica o **maior valor informado**, assim como sua **posição na sequência de entrada**.

Nesta implementação, são analisados 5 números para praticar a lógica de comparação e contagem.

## 🛠️ Tecnologias utilizadas

- Java
- Scanner para entrada de dados
- Estrutura de repetição `for`
- Estrutura condicional `if`
- Operadores relacionais
- Variáveis contadoras

## 💻 Código-fonte

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i, contador = 0, maior = 0, numero, posicao = 0;

        for (i = 1; i <= 5; i++) {
            numero = scanner.nextInt();
            contador++;

            if (numero > maior) {
                maior = numero;
                posicao = contador;
            }
        }

        System.out.println(posicao);
        System.out.println(maior);
    }
}
```

## 🧠 Lógica do programa

1. Inicializa o contador, o maior valor e a posição com zero.
2. Utiliza um `for` para realizar a leitura de 5 números inteiros.
3. A cada número lido, incrementa o contador.
4. Compara o número atual com o maior valor encontrado anteriormente.
5. Se o número for maior, atualiza a variável `maior`.
6. Armazena a posição em que o novo maior valor foi encontrado.
7. Ao
