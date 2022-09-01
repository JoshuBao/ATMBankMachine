
public class ATMOriginalTester {

	public static void main(String[] args) {
		ATM monkCoin = new ATM();
		//open ACCT
		monkCoin.openAccount(0003,300);
		System.out.println(monkCoin.checkBalance(0003));
		
		//deposit ACCT
		monkCoin.depositMoney(3, 220);
		System.out.println("deposit 220(expectedBalance-520): " + monkCoin.checkBalance(0003));
		
		
		//Withdraw
		monkCoin.withdrawMoney(3, 20);
		System.out.println("withdraw 20(expectedBalance-500): " + monkCoin.checkBalance(0003));
		
		//invalid deposit
		monkCoin.depositMoney(2, 3434234324324.22);
		System.out.println("should be 0-invalid deposit: " + monkCoin.checkBalance(0002)); 

		//invalid withdraw
		monkCoin.withdrawMoney(04, -12.10);
		System.out.println("invalid withdraw should be 0: " + monkCoin.checkBalance(4));
		monkCoin.withdrawMoney(3, 22922929);
		System.out.println("invalid withdraws(expectedBalance-500): " + monkCoin.checkBalance(0003));
		monkCoin.withdrawMoney(3, -3430);
		System.out.println("invalid withdraws(expectedBalance-500): " + monkCoin.checkBalance(0003));
		

		//close account
		monkCoin.closeAccount(3);
		monkCoin.openAccount(300);
		//printing accounts listed- should be id 3, and 300
		monkCoin.printAccounts();
		
		monkCoin.closeAccount(300);
		System.out.println("account 3 still has money and shouldnt close thus it should have a balance of 500: " + monkCoin.checkBalance(0003));
		System.out.println("account 300 shouldnt exist" + monkCoin.checkBalance(300));
		
		//printing accounts should only have id 3
		monkCoin.printAccounts();
		
		


	}

}
