package q02_advanced.question01;

class Coupon {

	private int id;
	private double discountRate;
	private String description;

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
	 * @return discountRate
	 */
	public double getDiscountRate() {
		return discountRate;
	}

	/**
	 * @param discountRate セットする discountRate
	 */
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description セットする description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public Coupon() {

	}

	public Coupon(int id, double discount, String desString) {
		setId(id);
		setDiscountRate(discount);
		setDescription(desString);
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountRate=" + discountRate + ", description=" + description + "]";
	}
}
