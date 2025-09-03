import java.util.Scanner;
public class nota {
public static void main(String[] args) {
    double nota1, nota2,nota3,nota4, media;
    Scanner teclado = new Scanner(System.in);
    System.out.println("digite sua nota 1:");
    nota1 = teclado.nextDouble();

    System.out.println("digite sua nota2:");
    nota2 = teclado.nextDouble();

    System.out.println("digite sua nota3:");
    nota3 = teclado.nextDouble();

    System.out.println("digite sua nota4:");
    nota4 = teclado.nextDouble();

    media = nota1+nota2+nota3+nota4 / 2;
    System.out.println("A sua média é: " + media);

}    
}
