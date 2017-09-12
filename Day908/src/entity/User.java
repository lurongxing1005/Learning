package entity;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	private String username;
	private String password;
	private String sex;
	private String birthday;
	private String hobby;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long id, String username, String password, String sex,
			String birthday, String hobby) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.birthday = birthday;
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", sex=" + sex + ", birthday=" + birthday
				+ ", hobby=" + hobby + "]";
	}
}
