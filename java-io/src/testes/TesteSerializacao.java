package testes;


import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String nome = "Wagner";

        // Serializacao
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("java-io/objeto.bin"));
        objectOutputStream.writeObject(nome);
        objectOutputStream.close();

        // Desserializacao
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("java-io/objeto.bin"));
        String objString = (String) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(objString);
    }
}
