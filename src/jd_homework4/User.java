package jd_homework4;

public class User {
String userName;
Basket userBasket;
String email;
String password;
public User(String userName, Basket userBasket, String email, String password) {
	super();
	this.userName = userName;
	this.userBasket = userBasket;
	this.email = email;
	this.password = password;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public Basket getUserBasket() {
	return userBasket;
}
public void setUserBasket(Basket userBasket) {
	this.userBasket = userBasket;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



}
