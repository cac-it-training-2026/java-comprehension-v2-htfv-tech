package q02_advanced.question03;

import java.util.List;

class MemberManager {
	private MemberManager() {
	}

	public static void showAllMembers(List<Member> members) {
		for (Member m : members) {
			m.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		boolean foundFlag = false;
		for (Member m : members) {
			if (m.getId() == targetId) {
				m.setPassword(newPassword);
				foundFlag = true;
				break;
			}
		}
		if (!foundFlag) {
			System.out.println("該当者はいませんでした。");
		}

	}
}