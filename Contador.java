
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();  // Lê o primeiro parâmetro
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();  // Lê o segundo parâmetro
        
        try {
            // Chama o método que contém a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Imprime a mensagem de erro caso o primeiro parâmetro seja maior que o segundo
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se parametroUm é maior que parametroDois e lança a exceção personalizada
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        // Calcula a quantidade de interações
        int contagem = parametroDois - parametroUm;
        
        // Realiza o loop (for) e imprime as mensagens
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
