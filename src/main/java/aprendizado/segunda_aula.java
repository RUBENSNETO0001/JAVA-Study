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
    }
}
