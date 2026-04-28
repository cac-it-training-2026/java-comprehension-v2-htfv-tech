package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member m1 = new Member();
		Member m2 = new Member();

		m1.name = "Miura Manabu";
		m2.name = "Sato Kensuke";

		m1.age = 24;
		m2.age = 36;

		m1.rank = 1;
		m2.rank = 2;

		m1.showMember();
		m2.showMember();

	}

}
