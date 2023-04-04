package testes;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class LeituraEscritaComProperties {
    public static void main(String[] args) throws IOException {

        Properties props = new Properties();
        props.setProperty("login", "alura"); //chave, valor
        props.setProperty("senha", "alurapass");
        props.setProperty("endereco", "www.alura.com.br");

        props.store(new FileWriter("java-io/conf.properties"), "algum comentário");

        Properties propReader = new Properties();
        propReader.load(new FileReader("java-io/conf.properties"));

        String login = propReader.getProperty("login");
        String senha = propReader.getProperty("senha");
        String endereco = propReader.getProperty("endereco");

        System.out.println(login + ", " + senha  + ", " +  endereco);

    }
}
