import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
  public static void main(String[] args) throws Exception {

		Socket client = new Socket("localhost", 8888);
		boolean flag = true;
		while (flag) {
			DataOutputStream dos = new DataOutputStream(
					client.getOutputStream());
			DataInputStream dis = new DataInputStream(client.getInputStream());
			MenuData menu = new MenuData();
			menu.getMenu();
			int number = menu.getNumber();
			String[] str = menu.getTwoNumber();
			double x = Double.valueOf(str[0]);
			double y = Double.valueOf(str[1]);
			if (number == 0) {
				System.exit(1);
				break;
			}
			dos.writeInt(number);
			dos.writeDouble(x);
			dos.writeDouble(y);
			System.out.println("the result is:" + dis.readDouble());
		}

	}

}
