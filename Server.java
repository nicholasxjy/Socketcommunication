import java.net.ServerSocket;

public class Server {

  public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8888);
		boolean flag = true;
		System.out.println("waiting for clients connect...");
		while (flag) {
			
			new Thread(new MulThread(ss.accept())).start();
		}
		ss.close();
	}
}
