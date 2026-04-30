package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//TODO ここから実装する
		List<Member> members = new ArrayList<>();
		ConsoleReader c = new ConsoleReader();
		Member m1 = Member.getInstance(1, "PasswOrd", "Miura Manabu", 28, 2);
		Member m2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);
		members.add(m1);
		members.add(m2);

		MemberManager.showAllMembers(members);

		int id;
		System.out.print("input target id>>");
		try {
			id = c.inputNumber();
		} catch (IOException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}
		String pass;
		System.out.print("input new password>>");
		try {
			pass = c.inputString();
		} catch (IOException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}

		MemberManager.updatePassword(members, id, pass);

		MemberManager.showAllMembers(members);
	}

}
