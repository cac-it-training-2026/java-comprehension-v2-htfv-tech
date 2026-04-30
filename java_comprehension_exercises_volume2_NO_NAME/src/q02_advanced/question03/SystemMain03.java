package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) throws IOException {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する

		ConsoleReader c = new ConsoleReader();
		Member memberlogin = null;
		int id = 0;
		String pass = null;
		while (!isLogin) {
			System.out.print("input id>>");
			try {
				id = c.inputNumber();
			} catch (NumberFormatException e) {
				System.out.println("不正な入力です。再度入力してください");
				continue;
			}
			System.out.print("input password>>");
			try {
				pass = c.inputString();
			} catch (IOException e) {
				System.out.println("不正な入力です。再度入力してください");
				e.printStackTrace();
				continue;
			}
			if (loginService.doLogin(id, pass) != null) {
				isLogin = true;
				memberlogin = loginService.doLogin(id, pass);
				System.out.println("ログインに成功しました");
				System.out.println("ログインユーザ情報を表示します。");
			} else {
				System.out.println("IDまたはパスワードが違っています。再度入力してください。");
			}
		}
		memberlogin.showMember();
	}

}
