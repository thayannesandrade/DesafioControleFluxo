import java.util.Scanner;

public class Contador {

    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
            
        if (segundoParametro <= primeiroParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    
        int quantidade = segundoParametro - primeiroParametro;
       
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            solicitarNumeros(scanner);
        }
    }
    
    public static void solicitarNumeros(Scanner scanner) {
        try {
            System.out.println("Digite o primeiro número:");
            int primeiroNumero = scanner.nextInt();
    
            System.out.println("Digite o segundo número:");
            int segundoNumero = scanner.nextInt();
    
            contar(primeiroNumero, segundoNumero);
    
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
            System.out.println("Por favor, insira os números novamente.");
            scanner.nextLine(); 
            solicitarNumeros(scanner);  
    
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira números inteiros.");
            scanner.nextLine();  
            solicitarNumeros(scanner);  
        }
    }
}