package firstdemo;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int convertedinput;
		
		Scanner scanner = new Scanner(System.in);

			System.out.println("what is your numberd");

			
			String userinput = scanner.nextLine();
			convertedinput = Integer.parseInt(userinput);
			
			if (convertedinput >= 50 && convertedinput <= 300) {
				System.out.println("yessss");
			}
			
			else {
				System.out.println("no");
			}
						
						scanner.close();
						
						
					}
				
			
			
				
	}


