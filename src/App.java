import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

        double raio, area;
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o raio do circulo: ");
        raio = sc.nextDouble();
        
        area = (Math.PI * raio * raio);

        System.out.print ("O valor da area é: " +area);
        
        sc.close();




    }
}
