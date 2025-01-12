package capg.exercises;

public class EXE1 {
	
	public static void main(String[] args) {
		SavingsAccount obj = new SavingsAccount(1234, 2000, new Person("smith", 24));
		SavingsAccount obj1 = new SavingsAccount(5678, 3000, new Person("kathy" , 26));
		obj.deposit(2000);
		obj1.withdraw(2000);
		System.out.println(obj.getBalance());
		System.out.println(obj1.getBalance());
		
	}

}



class Person {
	String name;
	float age;
	
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	
}


class Account {
	long accnum;
	double balance;
	Person accHolder;
	
	public Account(long accnum, double balance, Person accHolder) {
		super();
		this.accnum = accnum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public long getAccnum() {
		return accnum;
	}
	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double dep) {
		balance +=dep;
	}
	
	public void withdraw(double withd) {
		balance -= withd;
	}
}

class SavingsAccount extends Account{
    public SavingsAccount(long accnum, double balance, Person accHolder) {
		super(accnum, balance, accHolder);
	}

	final double minimumBalance = 500;
	
	@Override
	public void withdraw(double value) {
		if((balance - value) >= minimumBalance) {
			System.out.println("Allow Withdrawl");
			balance =  balance - value;
		}
		else {
			System.out.println("Withdrawl not allowed as the balance amount is less than minimumBalance: " + (balance - value));
		}
	}
}

class CurrentAccount extends Account {
	public CurrentAccount(long accnum, double balance, Person accHolder) {
		super(accnum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	double overdraftLimit = 5000;

	@Override
	public void withdraw(double withd) {
		if(withd > overdraftLimit) {
			System.out.println("Overdraft limit reached");
			
		}
		else {
			System.out.println("It is within overdraft limit");
			overdraftLimit -= withd;
			balance -= withd;
		}
	}
	
	
}
