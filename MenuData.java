import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MenuData {
  public void getMenu() {
		System.out.println("[1]plus");
		System.out.println("[2]addition");
		System.out.println("[3]multiply");
		System.out.println("[4]devided");
		System.out.println("[0]exit");
		System.out.println("input1-4 number:");
	}

	public int getNumber() throws Exception {
		int number = 0;
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(System.in));
		String str = buf.readLine();
		number = Integer.parseInt(str);
		return number;
	}

	public String[] getTwoNumber() throws Exception {
		String[] tn = null;
		System.out.println("input two number(like10,10):");
		BufferedReader buf1 = null;
		buf1 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = buf1.readLine();
		tn = str1.split(",");
		return tn;
	}

	public double getCalculate(int number, double x, double y) {
		double result = 0.0;
		switch (number) {
		case 0: {
			System.exit(1);
			break;
		}
		case 1: {
			result = x + y;
			break;
		}
		case 2: {
			result = x - y;
			break;
		}
		case 3: {
			result = x * y;
			break;
		}
		case 4: {
			if (y == 0) {
				System.out.println("wrong!");
			} else {
				result = x / y;
				break;
			}
		}

		}
		return result;
	}
}
