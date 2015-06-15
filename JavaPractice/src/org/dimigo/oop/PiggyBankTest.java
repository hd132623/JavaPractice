package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember.printMemberCnt();//a
		FamilyMember m1 = new FamilyMember("아빠");
		FamilyMember m2 = new FamilyMember("엄마");
		FamilyMember m3 = new FamilyMember("나");
		FamilyMember m4 = new FamilyMember("남동생");
		
		PiggyBank.putMoney(m1, 10000);
		PiggyBank.putMoney(m2, 5000);
		PiggyBank.putMoney(m3, 2000);
		PiggyBank.putMoney(m4, 1000);
		
		PiggyBank.printBalance();
		PiggyBank.putMoney(m3,1000);
		PiggyBank.printBalance();
		

	}

}
