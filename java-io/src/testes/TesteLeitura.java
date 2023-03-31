package testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com arquivo
        FileInputStream fileInputStream = new FileInputStream("java-io/file.txt");  // criando fluxo em binário
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);  // convertendo os binarios em caracteres
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linha = bufferedReader.readLine();
        System.out.println(linha);

        bufferedReader.close();
    }
}
