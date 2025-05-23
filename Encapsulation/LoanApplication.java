package com.encapsulation;

public class LoanApplication {
	private String customerName;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double outstandingBalance;

	public LoanApplication(String customerName,double loanAmount,double interestRate,int loanTerm) {
 	this.customerName=customerName;
 	this.loanAmount=loanAmount;
 	this.interestRate=interestRate;
 	this.loanTerm=loanTerm;
 	this.outstandingBalance=loanAmount;
 }
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	    	
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount=loanAmount;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
		
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm=loanTerm;
	}
	public void setOutstandingBalance(double outstandingBalance) {
		this.outstandingBalance=outstandingBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public double getOutstandingBalance() {
		return outstandingBalance;
	}
	public void makePayment(double amount) {
		if(amount<=0) {
			System.out.println("You have Negative or Zero in your account");
		}
		else if(amount>outstandingBalance) {
			System.out.println("Invalid amount");
		}
		else {
			 outstandingBalance=outstandingBalance-amount;
			 System.out.println("Payment exceeds loan balance"+outstandingBalance);
			 }
	}
	public double calculateEMI() {
		double monthlyRate = interestRate / (12 * 100);
	    int totalMonths = loanTerm * 12;
	    double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, totalMonths)) /
	                 (Math.pow(1 + monthlyRate, totalMonths) - 1);
	    return emi;
	}
	public void displayLoanDetails() {
		System.out.println("Total Loan Amount:"+loanAmount);
		System.out.println("Interest rate:"+interestRate);
		System.out.println("EMI:"+calculateEMI());
		outstandingBalance+=calculateEMI();
		System.out.println("Remaining Balance:"+outstandingBalance);
	}
	public static void main(String[]args) {
		LoanApplication loan=new LoanApplication("ramu",40000,2,3);
		loan.displayLoanDetails();
		}
	
}
