import java.util.Scanner;

public class ATM {
	
	public static void showMenu() {
		System.out.println("Main Menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		System.out.print("Enter a choice:");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// 初始化账户ID和收支
		Account[] act = new Account[10];
		for(int i = 0; i < act.length; i++) {
			act[i] = new Account();
			act[i].setId(i);
			act[i].setBalance(100);
		}
		
		int id;
		int choice;
		double amount;
		int flag;
		while(true) {
			System.out.print("Enter an id:");
			id = input.nextInt();
			System.out.println();
			
			while(id < 0 || id > 9) {
				System.out.println("Id doesn't existed");
				System.out.print("Enter an id:");
				id = input.nextInt();
				System.out.println();
			}
			while(true) {
				flag = 1;
				showMenu();
				choice = input.nextInt();
				switch(choice) {
				case 1: System.out.println("Your balance is $" + act[id].getBalance());break;
				case 2: System.out.println("Enter an amount to withdraw");
						amount = input.nextDouble();
						act[id].withDraw(amount);break;
				case 3: System.out.println("Enter an amount to deposit");
						amount = input.nextDouble();
						act[id].deposit(amount);break;
				case 4: flag = 0;
				}
				System.out.println();
				if(flag == 0) break;
			}
			if(flag == 0) continue;
		}

	}

}
