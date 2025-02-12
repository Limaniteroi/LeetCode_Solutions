/* Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not. */


public class Solution{

    public int newNumber(int n) {
        int soma = 0;
        
        while (n > 0) {
            int digito = n % 10;  // Obtém o último dígito
            soma += digito * digito;  // Adiciona o quadrado do dígito
            n /= 10;  // Remove o último dígito
        }

        return soma;
    }

    public boolean isHappy(int n) {
        Set<Integer> visitados = new HashSet<>();

        while (n != 1 && !visitados.contains(n)) {
            visitados.add(n);  // Armazena os números já visitados
            n = newNumber(n);  // Calcula a soma dos quadrados dos dígitos
        }

        return n == 1;
    }
}
