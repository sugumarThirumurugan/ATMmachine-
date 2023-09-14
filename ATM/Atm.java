package org.exp;
import java.util.Scanner;

public class Atm{
	
	public static void lang(int language) throws Exception {
        if (language > 2) {
            throw new Exception("Invalid Enter");
        }
    }

	public static void main(String args[]) {
		
		
		double balance=20000;
		int language =2;
		Scanner sc=new Scanner(System.in);
		
		try {
		
		System.out.println("Select Your Language");
		System.out.println("1.English");
		System.out.println("2.தமிழ் (Tamil)");
		System.out.println("Please Select Your Language : ");
		int langOpt=sc.nextInt();
		
		
		lang(langOpt);
		language=langOpt;
	
		while(true) {
			
			if(langOpt==1) {
	
			System.out.println();
			System.out.println("Welcome***");
			System.out.println("Press 1 To Show Balance");
			System.out.println("Press 2 To Withdraw Amount");
			System.out.println("Press 3 To Exit");
			System.out.println();
			System.out.print("Enter Your Choice : ");
			System.out.println();}
			
			else if(langOpt==2){
				System.out.println();
				System.out.println("வரவேற்பு!!!!!");
				System.out.println("இருப்பு தொகையை பார்க்க[1] ஐ அழுத்தவும்");
				System.out.println("பணம் எடுக்க[2] ஐ  அழுத்தவும்");
				System.out.println("நிராகரிக்க[3] ஐ  அழுத்தவும்");
				System.out.println();
				System.out.println("தங்கள் விருப்பதை பதிவு செய்யலாம்: ");
	
			}
			
			int choice=sc.nextInt();
	
				
			switch(choice) {
			
			case 1:
				if(langOpt==1) {
				System.out.println("Balance amount is : " + balance);}
				else if(langOpt==2){
					System.out.println("இருப்பு தொகை : " + balance);
				}
				break;
			case 2:
				if(langOpt==1) {
				System.out.println("Enter the amonut : ");}
				else if(langOpt==2){
					System.out.println("தேவையான பணத்தை பதிவு செய்யலாம் : ");
				}
				
				double withdraw=sc.nextInt();
				if(withdraw<balance && withdraw>0) {
					balance=balance-withdraw;
					
					
					if(langOpt==1) {
						 System.out.println("___________________________________");
							System.out.println("Take your Cash : " + withdraw);    
							System.out.println("Available Balance is : " + balance);
							System.out.println("___________________________________");	}
					else if(langOpt==2){
						System.out.println("____________________________________");
						System.out.println("பணத்தை பெற்று கொள்ளலாம் : " + withdraw);
						System.out.println("மீதம் இருப்பு தொகை : " + balance);
						System.out.println(" நன்றி");
						System.out.println("___________________________________");	

						
					}}
					else {
						if(langOpt==1) {
							System.out.println("InSufficient Funds");}
						else if(langOpt==2){
							System.out.println("போதிய பணம் இல்லை");}}
							break;
				case 3:
					if(langOpt==1) {
				System.out.println("Thanks For Using Indian Bank");}
					else if(langOpt==2){
						System.out.println("_________________________________");
						System.out.println("இந்தியன் வங்கியை தேர்வு செய்ததற்கு நன்றி!!");
						System.out.println("_________________________________");
					}
				
				sc.close();
				 return; 
				
			default:
				if(langOpt==1) {
				System.out.println("Please Enter Valid Option");}
				else if(langOpt==2){
					System.out.println("________________________________________");
					System.out.println("தயவ செய்து சரியான விருப்பங்களை தேர்வு செய்யுங்கள்");
					System.out.println("________________________________________");

				}
			}
				}
		}
			catch(Exception e) {
				
				System.out.println("Error : " + e.getMessage());
				System.out.println("Thank You!!");
				
					System.out.println("பிழை:: தவறான உள்ளிடை");
					System.out.println("நன்றி!!");
			}
		}
	}

	