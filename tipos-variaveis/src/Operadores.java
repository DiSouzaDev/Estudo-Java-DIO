public class Operadores {
    public static void main(String[] args) {
        boolean variavel = false;
        variavel = !variavel;
        
        System.out.println(variavel);
        int numero = 1;

        if(numero == 1){
            numero++;
            System.out.println(numero);
        }else if(numero > 1){
            numero--;
            System.out.println(numero);
        }else{
            System.out.println(Error.class);
        }

        int a,b;
        a = 10;
        b = 10;

        String resultado = "";

        if(a == 10){
            resultado = "Verdadeiro";
            System.out.println(resultado);
        }else{
            resultado = "Falso";
            System.out.println(resultado);
        }

        String resultadoNumero = a == b ? "verdadeiro" : "Falso";
        System.out.println(resultadoNumero);
    }
}