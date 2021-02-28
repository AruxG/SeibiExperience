package es.codeurjc.SeibiExperiencieSpring.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	private User user;
	@ManyToMany
	private List<Product> products = new ArrayList<>();
	private boolean complete;
	private Date date;
	
	//Pago con tarjeta
	private String mail;
	private String cardNumber;
	private int CVV;
	
	public Order() {
	}

	public Order(User user) {
		super();
		this.user = user;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public List<Product> getProducts(){
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public int getCVV() {
		return CVV;
	}
	
	public void setCVV(int CVV) {
		this.CVV = CVV;
	}
	
	public Order orElseThrow() {
		// TODO Auto-generated method stub
		return null;
	}
}
