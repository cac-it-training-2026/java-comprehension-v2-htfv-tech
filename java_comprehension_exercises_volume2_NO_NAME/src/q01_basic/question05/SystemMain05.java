package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		NonMember nom = new NonMember("Sato Kensuke");
		members[0] = nom;

		Member m = new Member(1, "PasswOrd", "Miura Manabu", 28, 2);
		members[1] = m;

		MemberManager.showAllMembers(members);

		nom.buyItem();
		m.buyItem();

	}

}
