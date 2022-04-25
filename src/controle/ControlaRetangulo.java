package controle;
import dominio.Retangulo;
import java.util.Scanner;

public class ControlaRetangulo {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o primeiro a base: ");
        int base = leia.nextInt();
        System.out.print("Digite o segundo a altura : ");
        int altura = leia.nextInt();
        leia.close();
        
        Retangulo res = new Retangulo(base, altura);
        
        System.out.println("RESULTADOS");
        System.out.println("Area :" + res.area());
       
    }
}