package aprendizado;

public class primeira_aula {

    public static void main(String[] args) {
        //para começa no java, assim que imprimi no java
        System.out.println("Olá mundo!!");

        // so o print ele e só um texto e com o ln ele pula linha!!
        System.out.print("Olá mundo!!");
        System.out.println("mundo bom!!");

        // impressão numerica com o System.out.println
        // aqui vc imprime o 3
        System.out.println(3);

        // vc pode somar, multiplicar, dividir, diminuir, dessa forma.
        System.out.println(3 - 3);

        // Variaveis do java

        /*como no c ou c++ aqui temos que indentificar o tipo da variavel 
         por exemplo: "int variavel = 4;". Com isso, a maquina-virtual do java 
         indentifica que a variavel é do tipo ou type [TEXTO]*/

 /* indentificação de variavel: https://www.w3schools.com/java/java_variables_identifiers.asp */
        // tipos de variaveis
        String Meunome = "Rubens";// String = texto
        int idade = 20;// int = inteiro
        float altura = 1.41f; //float = numero quebrado
        boolean bool = true; // true or false = verdadeiro ou falso
        char inicialNome = 'R'; // armazenador de 1 unico caracterer 

        // caso naou= queira muda o valor da variavel coloque no comelo dela final
        final int valor = 0;

        System.out.println(valor);

        //execicio
        //1.junte primeiro nome ou segundo nome, exemplo: Rubens Neto:
        //forma 1
        String nomeprimario = "Rubens ";
        String nomesecundario = "Neto";
        System.out.println(nomeprimario + nomesecundario);

        //forma 2
        String nomeprimario2 = "Rubens ";
        String nomesecundario2 = "Neto";
        String nomePeS = nomeprimario2 + nomesecundario2;
        System.out.println(nomePeS);

        //2.junte primeiro numero com o segundo, exexplo: 3 + 3
        //forma 1
        int numeropri = 3;
        int numeroseg = 4;
        System.out.println(numeropri + numeroseg);
        //forma 2
        int numeropri1 = 3;
        int numeroseg2 = 4;
        int numeroPeS = numeropri1 + numeroseg2;
        System.out.println(numeroPeS);
        
        // 3. faça um imc usuando oque vc aprendeu

        float pesoExercicio = 80.5f;
        float alturaExercicio = 1.70f;
        float imc = 0;

        imc = pesoExercicio / (alturaExercicio * alturaExercicio);

        System.out.println(imc);

    }
}
