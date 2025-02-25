
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();

        while (true) {
            System.out.println("\nCalculatrice : Choisissez une opération (+, -, *, /) ou 'q' pour quitter : ");
            String operation = scanner.next();

            if (operation.equals("q")) {
                System.out.println("Fin du programme.");
                break;
            }

            System.out.print("Entrez le premier nombre : ");
            double num1 = scanner.nextDouble();
            System.out.print("Entrez le deuxième nombre : ");
            double num2 = scanner.nextDouble();

            try {
                double resultat;
                switch (operation) {
                    case "+":
                        resultat = calc.addition(num1, num2);
                        break;
                    case "-":
                        resultat = calc.soustraction(num1, num2);
                        break;
                    case "*":
                        resultat = calc.multiplication(num1, num2);
                        break;
                    case "/":
                        resultat = calc.division(num1, num2);
                        break;
                    default:
                        System.out.println("Opération invalide !");
                        continue;
                }
                System.out.println("Résultat : " + resultat);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
