package testes;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada do arquivo
        BufferedWriter bw = new BufferedWriter(new FileWriter("java-io/file_escrita_simplificada.txt"));

        bw.write("Seja qual for o lugar onde está na vida, agradeça a Deus por isso.");
        bw.newLine();
        bw.newLine();
        bw.write("O que está vivendo fará com que fique mais forte e reconheça mais facilmente todas " +
                "as bênçãos que Deus tem guardadas para você.");

        bw.close();
    }
}
