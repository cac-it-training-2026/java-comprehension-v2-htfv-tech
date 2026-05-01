package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");
		//TODO ここから実装する
		Member m1 = new Member(1, "PasswOrd", "Miura Manabu", 28, 2);
		Member m2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);

		m1.showMember();
		m2.showMember();

	}

}
