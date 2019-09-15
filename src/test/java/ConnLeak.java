import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ConnLeak {

    public static void main(String[] args) throws InterruptedException, IOException {
        for (;;) {
            Thread.sleep(1000);
            leak();
        }
    }

    static void leak() throws IOException {
        System.out.println("connecting ");
        String hostName = "localhost";
        int portNumber = 8080;
        Socket echoSocket = new Socket(hostName, portNumber);
        BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
        System.out.println(in.readLine());
        in.close();
        echoSocket.close();
        System.out.println("done");
    }
}
