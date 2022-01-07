package com;

class Bank {
	float getRateOfInterest() {
		return 6.7f;
	}
}

class SBI extends Bank {
	float getRateOfInterest() {
		return 7.0f;

	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}
}

class HDFC extends Bank {
	float getRateOfInterest() {
		return 6.8f;
	}
}

class ICICI extends Bank {
	float getRateOfInterest() {
		return 6.9f;
	}
}

class BOB extends Bank {
	float getRateOfInterest() {
		return 7.5f;
	}
}

public class MethodOverridingDemo {
	public static void main(String arg[]) {
		SBI obj = new SBI();
		System.out.println(obj.getRateOfInterest());

		Bank obj1 = new SBI();
		System.out.println(obj1.getRateOfInterest());

		Bank obj2 = new HDFC();
		System.out.println(obj2.getRateOfInterest());

		Bank obj3 = new ICICI();
		System.out.println(obj3.getRateOfInterest());

		Bank obj4 = new BOB();
		System.out.println(obj4.getRateOfInterest());
		
		System.out.println(obj.hashCode());

	}
}
