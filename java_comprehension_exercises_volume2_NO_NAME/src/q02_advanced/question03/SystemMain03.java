package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) throws IOException {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する

		ConsoleReader c = new ConsoleReader();
		MemberStorage mStorage = new MemberStorage();
		LoginService login = new LoginService(mStorage);
		Member memberlogin = null;

		while (isLogin) {
			System.out.print("input id>>");
			try {
				c.inputNumber();
			} catch (NumberFormatException e) {
				System.out.println("数字を入力してください。");
				e.printStackTrace();
			}
		}

	}

}
