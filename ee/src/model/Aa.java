package model;
// Generated Jan 26, 2018 1:04:18 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Aa generated by hbm2java
 */
@Entity(name = "aa")
public class Aa implements java.io.Serializable {

	
	@Id
	private int name;
	private String pass;

	public Aa() {
	}

	public Aa(int name, String pass) {
		this.name = name;
		this.pass = pass;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Aa [name=" + name + ", pass=" + pass + "]";
	}
	

	
//
//	@Column(name = "name", unique = true, nullable = false)
//	public int getName() {
//		return this.name;
//	}
//
//	public void setName(int name) {
//		this.name = name;
//	}
//
//	@Column(name = "pass", nullable = false, length = 45)
//	public String getPass() {
//		return this.pass;
//	}
//
//	public void setPass(String pass) {
//		this.pass = pass;
//	}

}
