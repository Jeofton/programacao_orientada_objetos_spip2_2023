import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome, por favor:\n");
        String name = input.nextLine();
        System.out.printf("Boa noite, %s!\nVamos jogar super-trunfo", name);
    }
}