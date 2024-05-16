package UDP_Demo2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入您要说的话：");
            String str = sc.nextLine();
            if(str.equals("886")){
                break;
            }
            byte[] buf = str.getBytes();

            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10086;
            DatagramPacket dp = new DatagramPacket(buf, buf.length, address, port);

            ds.send(dp);
        }

        ds.close();
    }
}
