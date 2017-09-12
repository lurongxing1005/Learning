package SocketDemo;

import java.io.Serializable;

public class User implements Serializable {
	private String name;
	private String passWord;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String passWord) {
		super();
		this.name = name;
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", passWord=" + passWord + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
