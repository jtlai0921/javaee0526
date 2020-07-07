package Model;

import java.util.Date;

public class porder {
	private Integer id;
	private Integer product1;
	private Integer product2;
	private Integer product3;
	private Integer sum;
	private Integer discountprice;
	private Date pdate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProduct1() {
		return product1;
	}
	public void setProduct1(Integer product1) {
		this.product1 = product1;
	}
	public Integer getProduct2() {
		return product2;
	}
	public void setProduct2(Integer product2) {
		this.product2 = product2;
	}
	public Integer getProduct3() {
		return product3;
	}
	public void setProduct3(Integer product3) {
		this.product3 = product3;
	}
	public Integer getSum() {
		
		sum=product1*100+product2*200+product3*300;
		
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public Integer getDiscountprice() {
		
		sum=product1*100+product2*200+product3*300;
		if(sum>=2000) sum=(int)(sum*0.95);
		discountprice=sum;
		return discountprice;
	}
	public void setDiscountprice(Integer discountprice) {
		this.discountprice = discountprice;
	}
	public Date getPdate() {
		
		
		return new java.util.Date();
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	
	
	public void add(int p1,int p2,int p3)
	{
		setProduct1(p1);
		setProduct2(p2);
		setProduct3(p3);
		getSum();
		getDiscountprice();
		
		
	}
	
	
	

}