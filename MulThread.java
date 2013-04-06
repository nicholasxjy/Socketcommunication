import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class MulThread implements Runnable {
  private Socket client;

	public ClientThread(Socket client) {
		super();
		this.client = client;
	}

	@Override
	public void run() {
		try {
			boolean flag = true;
			while (flag) {
				DataOutputStream dos = new DataOutputStream(
						client.getOutputStream());
				DataInputStream dis = new DataInputStream(
						client.getInputStream());
				int number = dis.readInt();
				double x = dis.readDouble();
				double y = dis.readDouble();
				MenuData mc = new MenuData();
				double result = mc.getCalculate(number, x, y);
				dos.writeDouble(result);
			}
		} catch (Exception e) {

		}
	}

}
