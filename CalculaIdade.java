import java.time.LocalDate;
import java.util.Scanner;

public class CalculaIdade {

    public static void main (String[] args) {

        Scanner entry = new Scanner(System.in);
        System.out.println("Digite o ano em que você nasceu:");
        int anoNascimento = entry.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;
        System.out.printf("Estamos em %d, e ao final do ano você terá %d anos.", anoAtual, idade);
    }
}
