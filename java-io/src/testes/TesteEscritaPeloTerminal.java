package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class TesteEscritaPeloTerminal {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada do arquivo
        InputStream inputStream = System.in;  //  new FileInputStream("java-io/file.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);  // convertendo os binarios em caracteres
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // Fluxo de escrita do arquivo
        OutputStream fileOutputStream = new FileOutputStream("java-io/file_terminal.txt");
        Writer writer = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String linha = bufferedReader.readLine();

        while (linha != null && !linha.isEmpty()) {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
