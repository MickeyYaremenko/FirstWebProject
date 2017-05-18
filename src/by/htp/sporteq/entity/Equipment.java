package by.htp.sporteq.entity;

public class Equipment {

	private Long equipID;
	private String name;
	private double price;

	public Equipment() {
		super();
	}

	public Equipment(Long id, String name, double price) {
		super();
		this.equipID = id;
		this.name = name;
		this.price = price;
	}
	
	public Equipment(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getEquipID() {
		return equipID;
	}

	public void setEquipID(long equipID) {
		this.equipID = equipID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (equipID ^ (equipID >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		if (equipID != other.equipID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Equipment [equipID=" + equipID + ", name=" + name + ", price=" + price + "]";
	}

}
