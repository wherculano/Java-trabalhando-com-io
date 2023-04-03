package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class TesteCopiaArquivo {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada do arquivo
        FileInputStream fileInputStream = new FileInputStream("java-io/file.txt");  // criando fluxo em binário
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);  // convertendo os binarios em caracteres
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // Fluxo de escrita do arquivo
        FileOutputStream fileOutputStream = new FileOutputStream("java-io/file_copied.txt");
        Writer writer = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String linha = bufferedReader.readLine();

        while (linha != null) {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
