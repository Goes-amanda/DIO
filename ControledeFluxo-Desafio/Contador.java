public class Contador {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Por favor, forneça exatamente dois parâmetros.");
            return;
        }

        try {
            // Parsing dos parâmetros
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Verificação de parâmetros
            if (num1 >= num2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            // Calculando a quantidade de interações
            int totalInteracoes = num2 - num1;

            // Imprimindo os números incrementados
            for (int i = 1; i <= totalInteracoes; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (NumberFormatException e) {
            System.out.println("Parâmetros inválidos. Por favor, forneça números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
