package testes;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cliente cliente = new Cliente();
        cliente.setNome("Wagner Herculano");
        cliente.setProfissao("Python Developer");
        cliente.setCpf("111.222.333-45");

        // Serializacao
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("java-io/cliente.bin"));
        objectOutputStream.writeObject(cliente);
        objectOutputStream.close();

        // Desserializacao
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("java-io/cliente.bin"));
        Cliente objString = (Cliente) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(objString);

    }
}
