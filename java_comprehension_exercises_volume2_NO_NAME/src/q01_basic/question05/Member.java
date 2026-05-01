package q01_basic.question05;

class Member extends AbstMember {
	//TODO ここから実装する
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return passward
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param passward セットする passward
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return name
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	public Member() {

	}

	public Member(int id, String password, String name, int age, int rank) {
		setId(id);
		setPassword(password);
		setName(name);
		setAge(age);
		setRank(rank);
	}

	@Override
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + getId());
		System.out.println("password:" + getPassword());
		System.out.println("name:" + getName());
		System.out.println("age:" + getAge());
		System.out.println("rank:" + getRank());
		System.out.println("*****************");
	}

	@Override
	public void buyItem() {
		System.out.println(getName() + " purchased the item at 50% off");
	}
}
