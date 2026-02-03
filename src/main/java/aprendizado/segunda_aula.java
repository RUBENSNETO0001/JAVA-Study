package aprendizado;

public class segunda_aula {

    public static void main(String[] args) {
        // essa pagina mostra os operadores basicos que iremos usar(https://www.w3schools.com/java/java_operators_arithmetic.asp)
        // aparti daqui o java vai se assemelhar um pouco com o js ou c kkkkkkkkkkkkkkkk

        //olha o if e else
        int idade = 18;

        if(idade >= 15){
            System.out.println("ok");
        }
        else{
            System.out.println("não deu ok");
        }
        
        // esse if e else e bem bem semelhante ao if e else do js ne?
        //temos aqui tbm outra forma melhor de fazer o mesmo
        String idadeJoao = (idade >= 15) ? "ok": "deu red";
        System.out.println(idadeJoao);

        // como js continua a mesma coisa tbm
        switch (idade) {
            case 18 :
                System.out.println("ok tbm");
                break;
            default:
                throw new AssertionError();
        }

        // vamos para o while 
        int numeroCrescendo = 0;
        while (true) { 
            System.out.println("Deu ruim: "+ numeroCrescendo);
            numeroCrescendo++;
        }
    }

}
