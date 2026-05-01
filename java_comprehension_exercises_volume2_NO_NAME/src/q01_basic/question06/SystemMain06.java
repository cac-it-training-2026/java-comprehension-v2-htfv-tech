package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する
		System.out.print("input id>>");
		try {
			inputId = cr.inputNumber();
		} catch (NumberFormatException e) {
			System.out.println("error");
			e.printStackTrace();
			return;

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("input password>>");
		inputPassword = cr.inputString();
		try {
			inputPassword = cr.inputString();
		} catch (NumberFormatException e) {
			System.out.println("error");
			e.printStackTrace();
			return;

		} catch (IOException e) {
			e.printStackTrace();
		}

		Member m = new Member(inputId, inputPassword, name, age, rank);
		m.showMember();
	}

}
