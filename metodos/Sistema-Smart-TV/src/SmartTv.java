import java.util.Scanner;

public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    Scanner entrada = new Scanner(System.in);

    public void ligar(){
        ligada = true;
        System.out.println("Tv ligada: " + ligada);
    }

    public void desligar(){
        ligada = false;
        System.out.println("Tv ligada: " + ligada);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual: " + canal);
    }

    public void mudarCanal(){
        System.out.print("Digite o canal que quer assitir: ");
        int novoCanal = entrada.nextInt();
        System.out.println("Canal atual: " + novoCanal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume: " + volume);
    }
}