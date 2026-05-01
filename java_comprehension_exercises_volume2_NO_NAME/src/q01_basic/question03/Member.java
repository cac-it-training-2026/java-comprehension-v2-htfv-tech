package q01_basic.question03;

class Member {
	//TODO ここから実装する
	private String name;
	private int age;
	private int rank;

	public Member() {

	}

	public Member(String name, int age, int rank) {
		setName(name);
		setAge(age);
		setRank(rank);
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
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
		System.out.println("---GET RANK---");
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}

	public void rankUp() {
		System.out.println(">>>RANK UP>>>");
		setRank(this.rank + 1);
	}

}
