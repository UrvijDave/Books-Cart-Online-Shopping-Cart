package com.BooksCart.model;
//import java.beans.Transient;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User implements Serializable{

    private static final long serialVersionUID = -3532377236419382983L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

	@NotEmpty (message = "The UserName not be null.")
    private String userName;
	private String userEmail;
    private String password;
    private String mobileNo;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		password = password;
	}
	public String getmobileNo() {
		return mobileNo;
	}
	public void setmobileNo(String mobileNo) {
		mobileNo = mobileNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
    
    
    
    
	


//    private List<CartItem> cartItemList;



/*    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }*/
