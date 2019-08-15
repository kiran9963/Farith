package org.bank;

public class Bankdetails implements AxisBank {

	public void savings() {
		System.out.println("%5");
	}
	public void diposit() {
		System.out.println("%6");
	}
	public static void main(String[] args) {
		Bankdetails b=new Bankdetails();
		b.diposit();
		
		b.savings();
	}
	@Override
	public void GT() {
System.out.println("hi");		
	}
}
