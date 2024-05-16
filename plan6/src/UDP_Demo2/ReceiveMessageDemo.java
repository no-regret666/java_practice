package UDP_Demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        while (true) {
            ds.receive(dp);

            byte[] data = dp.getData();
            int len = data.length;
            String ip = dp.getAddress().getHostAddress();
            String name = dp.getAddress().getHostName();

            System.out.println("ip为：" + ip + ",主机为：" + name + "的人，发送了数据：" + new String(data,0,len));
        }
    }
}