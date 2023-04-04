import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double fahrenheit,celsius;

        System.out.println("digite a temperatura em Fahrenheit ?");
        fahrenheit = entrada.nextDouble();

        celsius = 5 *((fahrenheit-32)/9);

        System.out.println("a temperatura em celsius é: " + celsius );

        entrada.close();   
    }
}
