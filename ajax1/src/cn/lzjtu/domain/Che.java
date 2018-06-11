package cn.lzjtu.domain;

import java.io.Serializable;

public class Che implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double fullPrice;
	private double discountPrice;
	private int count;
	private String type;
	private String thumeImg;
	private String fullImg;
	
	public Che() {
	}

	public Che(int id, String name, double fullPrice, double discountPrice, int count, String type, String thumeImg,
			String fullImg) {
		this.id = id;
		this.name = name;
		this.fullPrice = fullPrice;
		this.discountPrice = discountPrice;
		this.count = count;
		this.type = type;
		this.thumeImg = thumeImg;
		this.fullImg = fullImg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFullPrice() {
		return fullPrice;
	}

	public void setFullPrice(double fullPrice) {
		this.fullPrice = fullPrice;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getThumeImg() {
		return thumeImg;
	}

	public void setThumeImg(String thumeImg) {
		this.thumeImg = thumeImg;
	}

	public String getFullImg() {
		return fullImg;
	}

	public void setFullImg(String fullImg) {
		this.fullImg = fullImg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Che other = (Che) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Che [id=" + id + ", name=" + name + ", fullPrice=" + fullPrice + ", discountPrice=" + discountPrice
				+ ", count=" + count + ", type=" + type + ", thumeImg=" + thumeImg + ", fullImg=" + fullImg + "]";
	}
	
	
	
	

}
