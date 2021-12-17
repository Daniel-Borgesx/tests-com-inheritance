package br.com.tests;

public class PermanentEmployee extends Employee {
	private double basicPay;
	private double hra;
	private int experience;

	public PermanentEmployee(int empId, String name, double basicPay, double hra, int experience) {
		super.setEmpId(empId);
		super.setName(name);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void calculateSalary() {
		double percentageOfBasicPay = 0.0;
		if (experience < 3) {
			percentageOfBasicPay = basicPay;
		} else if (experience >= 3 && experience < 5) {
			percentageOfBasicPay = basicPay * (5.0 / 100);
		} else if (experience >= 5 && experience < 7) {
			percentageOfBasicPay = basicPay * (7.0 / 100);
		} else if (experience >= 10) {
			percentageOfBasicPay = basicPay * (12.0 / 100);
		}
		double salary = percentageOfBasicPay + basicPay + hra;

		super.setSalary(salary);
	}
}
