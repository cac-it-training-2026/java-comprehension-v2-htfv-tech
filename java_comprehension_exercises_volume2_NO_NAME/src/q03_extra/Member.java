package q03_extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Member {

	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons;
	private Date birthday;

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
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
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
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @return coupons
	 */
	public List<Coupon> getCoupons() {
		return coupons;
	}

	/**
	 * @param coupons セットする coupons
	 */
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	public Member() {

	}

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param birthday
	 * @param rank
	 * @param coupons
	 */
	public Member(int id, String password, String name, Date birthday, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.rank = rank;
		this.coupons = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", birthday=" + birthday + ", age="
				+ age + ", rank=" + rank
				+ ", coupons=" + coupons + "]";
	}

	public void showMember() {
		System.out.println(toString());
		System.out.println("*******************");
	}

	public static Member getInstance(int id, String password, String name, String birthday2)
			throws ParseException {

		//文字列 → 日付に変換
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date birthday = sdf.parse(birthday2);

		int rank = (int) (Math.random() * 3) + 1;

		Member m = new Member(id, password, name, birthday, rank);

		Coupon c1 = Coupon.getInstance(1, 0.5, "最初の特典");
		Coupon c2 = Coupon.getInstance(2, 0.25, "今月の特典");

		m.coupons = new ArrayList<>();
		m.coupons.add(c1);
		m.coupons.add(c2);

		return m;
	}
}