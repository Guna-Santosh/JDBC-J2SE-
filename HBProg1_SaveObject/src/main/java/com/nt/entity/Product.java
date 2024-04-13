//ENTITY CLASS FOR HIBERNATE
package com.nt.entity;
//JAVA BEAN CLASS
public class Product 
{
 private Integer pid;
 private String name;
 private Float price;
 private Float qty;
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Float getPrice() {
	return price;
}
public void setPrice(Float price) {
	this.price = price;
}
public Float getQty() {
	return qty;
}
public void setQty(Float qty) {
	this.qty = qty;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
}
 
 
 
}
