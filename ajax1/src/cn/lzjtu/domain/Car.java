package cn.lzjtu.domain;

import java.io.Serializable;
/**
 * 
 * @author soft01
 * id name price count brand city
 */
public class Car implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double price;
	private int count;
	private String brand;
	private String city;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String name, double price, int count, String brand, String city) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.count = count;
		this.brand = brand;
		this.city = city;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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
		Car other = (Car) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + ", count=" + count + ", brand=" + brand
				+ ", city=" + city + "]";
	}

}
