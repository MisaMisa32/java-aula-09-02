import java.util.Scanner;

public class algoritmo {
    public static void main(String[] args) {
double peso, altura, imc;

Scanner teclado = new Scanner(System.in);
System.out.println("digite seu peso:");
peso = teclado.nextDouble();

System.out.println("digite sua altura:");
altura = teclado.nextDouble();

imc = peso / altura*altura;
System.out.println("O IMC da pessoa é: " + imc + "kg/m²");

    }
}
