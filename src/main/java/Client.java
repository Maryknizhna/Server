import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        try (Socket clientSocket = new Socket("127.0.0.1", 8070);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ) {
            out.println("man");
            System.out.println(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
