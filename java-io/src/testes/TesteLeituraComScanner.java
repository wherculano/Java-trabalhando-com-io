package testes;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraComScanner {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("java-io/conta.csv"));
        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            // System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int numConta = linhaScanner.nextInt();
            int agenciaConta = linhaScanner.nextInt();
            String titularConta = linhaScanner.next();
            double saldoConta = linhaScanner.nextDouble();

            System.out.format(new Locale("pt", "BR"),
                    "%s, %04d-%06d, %s, R$%.2f %n", tipoConta, numConta, agenciaConta, titularConta, saldoConta);
        }
        scanner.close();
    }
}
