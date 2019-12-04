package exemplocliente;

import java.util.Scanner;

public class ExemploCliente {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu codigo: ");
        String codigoc = ler.nextLine();
        
        System.out.println("Digite o seu nome: ");
        String nomec = ler.nextLine();
        
        Cliente c1 = new Cliente(codigoc);
        c1.imprimircodigoc(codigoc);
     
        
        
        
    }
    
}
