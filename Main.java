package br.com.tests;

public class Main {

	public static void main(String[] args) {
		PermanentEmployee permanent = new PermanentEmployee(101, "Anil", 10000, 1500, 3);
		ContractEmployee contract = new ContractEmployee(102, "Ankit", 500, 10);
		
		permanent.calculateSalary();
		contract.calculateSalary();
		
		System.out.println("Permanent Employee: Your salary is: " + permanent.getSalary());
		System.out.println("Contract Employee: Your salary is: " + contract.getSalary());
	}

}
