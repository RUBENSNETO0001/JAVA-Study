package aprendizado;

public class segunda_aula {

    public static void main(String[] args) {
        // essa pagina mostra os operadores basicos que iremos usar(https://www.w3schools.com/java/java_operators_arithmetic.asp)
        // aparti daqui o java vai se assemelhar um pouco com o js ou c kkkkkkkkkkkkkkkk

        //olha o if e else
        int idade = 18;

        if (idade >= 15) {
            System.out.println("ok");
        } else {
            System.out.println("não deu ok");
        }

        // esse if e else e bem bem semelhante ao if e else do js ne?
        //temos aqui tbm outra forma melhor de fazer o mesmo
        String idadeJoao = (idade >= 15) ? "ok" : "deu red";
        System.out.println(idadeJoao);

        // como js continua a mesma coisa tbm
        switch (idade) {
            case 18:
                System.out.println("ok tbm");
                break;
            default:
                throw new AssertionError();
        }

        // vamos para o while 
        int qtd = 0;
        while (qtd <= 4) {
            System.out.println("Deu ruim: ");
            qtd++;
        }
        // aqui vou testar o do while
        do {
            System.out.println("testa");
            qtd++;

        } while (qtd <= 6);

        // loop for
        for (int i = 0; i < 5; i++) {
            System.out.println("loop for");
        }

        //foreach
        String[] frutas = {"mamao", "banana", "maça"};

        for (String i : frutas) {
            System.out.println(i);
            System.out.println(frutas);
        }

        // java break e continue
        /*
        A break é declaração também pode ser usada para sair de um loop .
        A continue é uma instrução interrompe uma iteração (no loop) se uma 
        condição específica ocorrer e continua com a próxima iteração no loop.

        break;

        continue;
         */
        // array list
        //aqui vamos declarar um simples array em java
        // String[] nomedaVariavel = {};
        String[] nomeLindos = {"nome1", "nome2", "nome3"};
        // e com o array da de selecionar só ele 
        // nao esqueça que a contagem é 0, 1, 2, ...
        System.out.println(nomeLindos[2]);

        //aluno olha isso aqui. isso agora e um for each, fiz uma String nome e comparei com o nomelindos
        // ele vai pecorrer a lista toda
        for (String nome : nomeLindos) {
            // imprimir o nomelindos com a tag length que so faz a lista cada vez virar numero e imprimir
            // o nome de cada casa na tela
            System.out.println("lista [" + nomeLindos.length + "] " + nome);
        }

        //agora olha que legal meu rei
        // vamos agora criar uma lista com 4 espaços
        String[] frutasArray = new String[4];

        frutasArray[0] = "chuchu";
        frutasArray[1] = "pinga";
        frutasArray[2] = "leite";
        frutasArray[3] = "uva";

        //se você já conhece os valores, não precisa escrever new. Ambas as opções criam o mesmo array: 
        // vamos mecher com uma coisa mais dificil: matriz
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(matriz[1][2]);
        //agora so para mostra como e colocar tudo

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
        System.out.println(" ");

        // agora com for each
        for (int i[] : matriz) {
            for (int j : i) {
                System.out.println(j);
            }
        }
        //exercicio

        /*
        Exercício 1 — Condicional + Operador ternário:
        Crie uma variável int nota = 7.

        Use if  / else para imprimir: "Aprovado" se a nota for maior ou igual a {6}"Reprovado" caso contrário
        Depois, faça a mesma lógica usando o operador ternário e imprima o resultado.

        Objetivo: fixar if  /else e operador ternário.
         */
        //variavel que vou usar
        int nota = 8;

        // forma 1
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // forma 2
        String resultadoExecicio = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println("Resultado:" + resultadoExecicio);

        /* 
        Exercício 2 — while + do while:
        Crie uma variável int contador = 1.

        Usando while, imprima os números de 1 até 5. Depois, usando do while, imprima os números de 5 até 1.

        Objetivo: entender a diferença entre while e do while.
         */
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Contador 1: " + contador++);
        }

        do {
            System.out.println("Contador 2: " + contador--);
        } while (contador >= 0);

        /* 
        Exercício 3 — for + switch:
        Crie um for que vá de 1 até 7. Dentro do loop, use switch para imprimir:

        1 → "Domingo"

        2 → "Segunda"

        3 → "Terça"

        4 → "Quarta"

        5 → "Quinta"

        6 → "Sexta"

        7 → "Sábado"

        Objetivo: treinar for com switch.
         */
        int diaSemana = 9;
        switch (diaSemana) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.err.println("Sem o numero aqui");
                break;
        }

        /* 
        Exercício 4 — Array + foreach:

        Crie um array de String com 5 nomes de frutas. Use foreach para imprimir: Fruta X

        No final, imprima: Total de frutas: X usando o length.

        Objetivo: fixar array simples + foreach.

         */
        String[] frutasExecicio = {"mamao", "limao", "laranja", "banana", "uva"};
        int contadorFrutas = 1;
        for (String fruta: frutasExecicio) {
            System.out.println("Fruta [" + contadorFrutas++ + "]: "+ fruta);
        }

        /* 
        Exercício 5 — Matriz + loops

        Crie uma matriz int 3x3 com números de 1 a 9.

        Exemplo:

        1 2 3
        4 5 6
        7 8 9

        Imprima todos os valores usando for normal.

        Depois, imprima novamente usando foreach.

        Por fim, imprima a soma de todos os números da matriz.

        Objetivo: dominar matriz + loops aninhados.
         */
        int[][] matrizExercicio = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i[] : matrizExercicio){
            for(int j: i){
                System.out.print(j);
            }
        }
    }
}
