package testes;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com arquivo
        FileOutputStream fileOutputStream = new FileOutputStream("java-io/file_output.txt");
        Writer writer = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Seja qual for o lugar onde está na vida, agradeça a Deus por isso.");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("O que está vivendo fará com que fique mais forte e reconheça mais facilmente todas " +
                "as bênçãos que Deus tem guardadas para você.");

        bufferedWriter.close();
    }
}
