package testes;

import java.io.*;

public class TesteEscritaPrintWriter {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada do arquivo
        PrintWriter printWriter = new PrintWriter("java-io/file_escrita_simplificada.txt");
        // PrintStream printStream = new PrintStream("java-io/file_escrita_simplificada.txt");  // mesma coisa

        printWriter.println("Seja qual for o lugar onde está na vida, agradeça a Deus por isso.");
        printWriter.println();
        printWriter.println("O que está vivendo fará com que fique mais forte e reconheça mais facilmente todas " +
                "as bênçãos que Deus tem guardadas para você.");

        printWriter.close();
    }
}
