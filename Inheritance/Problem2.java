package com.scenario;

class Employee{
	String name;
	int baseSalary;
	public int calculateAnnualSalary() {
		this.baseSalary=baseSalary*12;
		return baseSalary;
	}
}
class Manager extends Employee{
	int bouns;
	int numberOfEmployeesmanaged;
	public Manager(String name,int baseSalary,int bonus,int numberOfEmployeesManaged) {
		this.name=name;
		this.baseSalary=baseSalary;
		this.bouns=bonus;
		this.numberOfEmployeesmanaged=numberOfEmployeesManaged;
	}
	public int calculateManagerSalary() {
		return baseSalary+bouns;
	}
}
class Engineer extends Employee{
	int projectCount;
	private static final int bonus_percount=1000;
	public Engineer(String name,int baseSalary,int projectCount) {
		this.name=name;
		this.baseSalary=baseSalary;
		this.projectCount=projectCount;
	}
	public int calculateEngineerSalary() {
		return baseSalary+(projectCount*bonus_percount);
		}
}
class SalesPerson extends Employee{
	double comissionRate;
	int totalSales;
	public SalesPerson(String name,int baseSalary,double comissionRate,int totalSales) {
		this.name=name;
		this.baseSalary=baseSalary;
		this.comissionRate=comissionRate;
		this.totalSales=totalSales;
	}
	public double calculateSalespersonSalary() {
		return baseSalary+(comissionRate*totalSales);
	}
}
public class Problem2 {
	public static void main(String[] args) {
		Employee manager=new Manager("Alice", 50000, 1000, 5);
		System.out.println(manager.calculateAnnualSalary());
		System.out.println(((Manager)manager).calculateManagerSalary());
		Employee engineer=new Engineer("Bob", 50000, 5);
		System.out.println(engineer.calculateAnnualSalary());
		System.out.println(((Engineer)engineer).calculateEngineerSalary());
		Employee salesPerson=new SalesPerson("Charlie", 50000, 0.5, 6);
		System.out.println(salesPerson.calculateAnnualSalary());
		System.out.println(((SalesPerson)salesPerson).calculateSalespersonSalary());
	}
}

