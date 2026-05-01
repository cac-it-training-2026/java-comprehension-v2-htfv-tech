package q03_extra;

/**
 * MemberStorageにアクセスし、ユーザ登録処理を行う
 */
class CreateUserService {
	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TODO ここから実装する
	public CreateUserService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	public boolean execute(int id, String password, String name, String birthday) {
		for (Member m : memberStorage.getMembers()) {
			if (m.getId() == id) {
				throw new IllegalInputException("ID が重複しています。再度入力してください");//Exceptionのクラスを作ってないからエラー？
				return false;
			} else {
				Member.getInstance(id, password, name, birthday);
				return true;
			}
		}

	}
}
