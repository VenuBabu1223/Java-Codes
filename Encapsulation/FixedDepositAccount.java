package com.encapsulation;

public class FixedDepositAccount {
	 private String customerName;
	 private double principalAmount;
	 private double interestRate;
	 private int duration;
	 private double maturityAmount; 
	 public FixedDepositAccount(String customerName, double principalAmount,double interestRate,int duration, double maturityAmount) {
		 this.customerName=customerName;
		 this.principalAmount=principalAmount;
		 this.interestRate=interestRate;
		 this.duration=duration;
		 this.maturityAmount=maturityAmount;
	}
	 public void setCustomerName(String customerName) {
		 this.customerName=customerName;
    }
	 public void setPrincipalAmount(double principalAmount) {
		 this.principalAmount=principalAmount;
    }
	 public void setInterestRate(double interestRate ) {
		 this.interestRate=interestRate;
    }
	 public void setDurattion(int duration) {
		 this.duration=duration;
    }
public void setMaturityAmount(double maturityAmount ) {
	this.maturityAmount=maturityAmount;
    }
public String getCustomerName() {
	return customerName;
    }
public double getprincipalAmount() {
	return principalAmount;
	
	}
public double getInterestRate() {
	return interestRate;
	}
public int getDuration () {
	return duration;
	}
public double getMaturityAmount() {
	return maturityAmount;
	}
public double calculateMaturityAmount() {
	return principalAmount*Math.pow(1+(interestRate/100), duration);
}
public void withdrawBeforeMaturity(int yearsCompleted) {
	if(yearsCompleted<=1) {
		System.out.println("Cannot withdraw before oneyear");
	} 
	else {
		double currentAmount=principalAmount*Math.pow(1+(interestRate/100), duration);
		double penalty=currentAmount*0.02;
		double payOut=currentAmount-penalty;
		System.out.println("Penalty is:"+penalty);
		System.out.println("PayOut Amount is:"+payOut);
	}
	
}
public static void main(String[] args) {
	FixedDepositAccount fixed=new FixedDepositAccount("Venu", 2000, 2, 2, 500);
	double maturity=fixed.calculateMaturityAmount();
	System.out.println(maturity);
	fixed.withdrawBeforeMaturity(3);
	
}


}
