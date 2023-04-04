package testes;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String letra = "C";
        System.out.println(letra.codePointAt(0));

        // Descobre o encoding utilizado como padrão pelo SO
        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = letra.getBytes("windows-1252");
        System.out.println(bytes.length + ", windows-1252");

        bytes = letra.getBytes(StandardCharsets.UTF_16);
        System.out.println(bytes.length + ", UTF-16");

        bytes = letra.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + ", US-ASCII");
    }
}
