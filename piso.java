import java.util.Scanner;

public class piso {
    public static void main(String[] args){
        double custo, caixas, comprimento, largura, area, valorTotal;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("(informe o comprimento)");
        comprimento = teclado.nextDouble();

          System.out.println("(informe a largura)");
        largura = teclado.nextDouble();

          System.out.println("(informe o custo das caixas)");
        custo = teclado.nextDouble();

        area = largura * comprimento;
        caixas = area / 2.5;

        valorTotal = caixas * area;

        System.out.println("Quantidade de caixas: " + caixas);
        System.out.println("Total: " + valorTotal);

    }
}
