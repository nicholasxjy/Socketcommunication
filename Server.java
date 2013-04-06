import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8888);
		Socket client = null;
		boolean flag = true;
		System.out.println("waiting for clients connect...");
		while (flag) {
			
			new Thread(new MulThread(ss.accept())).start();
		}
		ss.close();
	}
}
