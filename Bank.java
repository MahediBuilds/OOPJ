import java.util.Scanner;

class Bank{
	double balance;
    	double money;

    	void deposit(double money){
        	balance += money;
		System.out.println("Succesfully deposited " + money + " your new balance is : " + balance);
    	}

    	void withdraw(double money){
		if(money > balance){
			System.out.println("Insufficient Balance!");
		} else {
			balance -= money;
			System.out.println("Succesfully withdrawn " + money + " your new balance is : " + balance);
		}
	}

	double getBalance(){
		return balance;
	}

	public static void main(String[] args){
		
		int userchoice, choice;
		Scanner sc = new Scanner(System.in);
		
		Bank bank[]=new Bank[15];
		for(int  i=0;i<10;i++) {
			bank[i]=new Bank();
		}
		
		
		while(true){
			
			System.out.println("Welcome to the bank");
			System.out.println("Which user ?");
			System.out.print(">> ");
			userchoice = sc.nextInt();
			
			if(userchoice < 1 || userchoice > 15){
				System.out.println("Invalid choice!");
				continue;
				
			} else {
				while(true){
			
					double cash;
					
					System.out.println("\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Change User\n5.Exit");
					System.out.print("Enter choice : ");
					choice = sc.nextInt();
					
					switch(choice){
					
						case 1:
							System.out.print("Enter amount : ");
							cash = sc.nextInt();
							bank[userchoice-1].deposit(cash);
							break;
						case 2:
							System.out.print("Enter amount : ");
							cash = sc.nextInt();
							bank[userchoice-1].withdraw(cash);
							break;
						case 3:
							System.out.println("Your balance : " + bank[userchoice].getBalance());
							cash = sc.nextInt();
							bank[userchoice-1].deposit(cash);
							break;
						case 4:
							break;
						case 5:
							System.exit(0);
						default:
							System.out.println("Invalid Choice!");
					}
					
					if(choice == 4)
						break;	
				}
			}
			
		}
		
	}	

}

