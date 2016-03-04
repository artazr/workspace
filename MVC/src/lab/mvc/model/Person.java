package lab.mvc.model;

public class Person {
	private String  firstName;
	private String  lastName;
	private String  birthday;
	private String  sex;
	
	
	public Person(String first, String last, String birth, String sex){
		this.firstName = first;
		this.lastName = last;
		this.birthday = birth;
		this.sex = sex;
	}
	
	public String getFirst(){
		return this.firstName;
	}
	public String getLast(){
		return this.lastName;
	}
	public String getBirth(){
		return this.birthday;
	}
	public String getSex(){
		return this.sex;
	}
	public void setFirst(String first){
		this.firstName = first;
	}
	public void setLast(String last){
		this.lastName = last;
	}
	public void setBirth(String birth){
		this.birthday = birth;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
}