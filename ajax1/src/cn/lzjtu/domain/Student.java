package cn.lzjtu.domain;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String sn;
	private String name;
	private String clazzid;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String sn, String name,String clazzid) {
		super();
		this.id = id;
		this.sn = sn;
		this.name = name;
		this.clazzid = clazzid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getClazzid() {
		return clazzid;
	}

	public void setClazzid(String clazzid) {
		this.clazzid = clazzid;
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
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sn=" + sn + ", name=" + name + ", clazzid=" + clazzid + "]";
	}


	
	
}
