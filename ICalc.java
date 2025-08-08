import java.util.*;
class ICalc{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		
		while(true){
			System.out.println("          				 __   ______             __");
			System.out.println("          				|  \\ /      \\           |  \\");
			System.out.println("          				 \\$$|  $$$$$$\\  ______  | $$  _______");
			System.out.println("          				|  \\| $$   \\$$ |      \\ | $$ /       \\");
			System.out.println("          				| $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
			System.out.println("          				| $$| $$   __  /      $$| $$| $$");
			System.out.println("          				| $$| $$__/  \\|  $$$$$$$| $$| $$_____");
			System.out.println("          				| $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
			System.out.println("          				 \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$");
		
			System.out.println(" _   _                       _                       _____                                          _");
			System.out.println("| \\ | |                     | |                     / ____|                                        | |");
			System.out.println("|  \\| |  _   _   _ __ ___   | |__     ___   _ __   | |        ___    _ __   __    __   ___   _ __  | |_    ___   _ __");
			System.out.println("| . ` | | | | | | '_  `_ \\  | '_ \\   / _ \\ | '__|  | |       / _ \\  | '_ \\  \\ \\  / /  / _ \\ | '__| | __|  / _ \\ | '__|");
			System.out.println("| |\\  | | |_| | | | | | | | | | ) | |  __/ | |     | |____  | (_) | | | | |  \\ \\/ /  |  __/ | |    | |_  |  __/ | |");
			System.out.println("|_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|      \\_____|  \\___/  |_| |_|   \\__/    \\___| |_|     \\__|  \\___| |_|\n");
			System.out.println("======================================================================================================================\n\n\n");
		
			System.out.println("\t[01] Decimal Converter\n");
			System.out.println("\t[02] Binary Converter\n");
			System.out.println("\t[03] Octal Converter\n");
			System.out.println("\t[04] Hexadecimal Converter\n");
			System.out.println("\t[05] Roman Number Converter\n\n");
		
			System.out.print("Enter Option -> ");
			int option=scanner.nextInt();
			
			switch(option){
				case 1:				
				while(true){
					System.out.println("\n\n\n+-------------------------------------------------+");
					System.out.println("|                Decimal Converter                |");
					System.out.println("+-------------------------------------------------+");
					
					System.out.print("\n\nEnter an Decimal number: ");
					int d=scanner.nextInt();
					if(d>0){
					
						int temp1=d;
						int temp2=d;
					
						String binary="";
						do{
							binary=d%2+binary;
							d/=2;
						}while(d!=0);
					
						String octal="";
						do{
							octal=temp1%8+octal;
							temp1/=8;
						}while(temp1!=0);
					
						String hex="";
						do{
							int remainder=temp2%16;
							switch(remainder){
								case 10:
									hex="a"+hex;
									break;
								case 11:
									hex="b"+hex;
									break;
								case 12:
									hex="c"+hex;
									break;
								case 13:
									hex="d"+hex;
									break;
								case 14:
									hex="e"+hex;
									break;
								case 15:
									hex="f"+hex;
									break; 
								default:
									hex=remainder+hex;
							}
							temp2/=16;
						}while(temp2!=0);
					
						System.out.println("\n\tBinary number: "+binary);
						System.out.println("\tOctal number: "+octal);
						System.out.println("\tHexadecimal number: "+hex);
						
					}else{
						System.out.println("\tInvalid input...");
						System.out.print("\nDo you want to input number again? (Y/N) -> ");
						char ch = scanner.next().charAt(0);

						if (ch=='Y' || ch=='y') {
							continue;
						} else {
							break;
						}
					}
					break;
				}
				break;
				
				case 2:
				while(true){
					System.out.println("\n\n\n+-------------------------------------------------+");
					System.out.println("|                 Binary Converter                |");
					System.out.println("+-------------------------------------------------+");
					
					System.out.print("\n\nEnter an Binary number: ");
					int b=scanner.nextInt();
					
					String binary=""+b;
					
					if(b>0){
						int decimal=0;
						for(int i=binary.length()-1,j=0; i>=0; i--, j++){
							char ch=binary.charAt(i);
							int num=ch-48;
							decimal+=Math.pow(2,j)*num;
						}
						int temp1=decimal, temp2=decimal;
					
						String octal="";
						do{
							octal=temp1%8+octal;
							temp1/=8;
						}while(temp1!=0);
					
						String hex="";
						do{
							int remainder=temp2%16;
							switch(remainder){
								case 10:
									hex="a"+hex;
									break;
								case 11:
									hex="b"+hex;
									break;
								case 12:
									hex="c"+hex;
									break;
								case 13:
									hex="d"+hex;
									break;
								case 14:
									hex="e"+hex;
									break;
								case 15:
									hex="f"+hex;
									break; 
								default:
									hex=remainder+hex;
							}
							temp2/=16;
						}while(temp2!=0);

					
						System.out.println("\n\tDecimal number: "+decimal);
						System.out.println("\tOctal number: "+octal);
						System.out.println("\tHexadecimal number: "+hex);
					
					}else{
						System.out.println("\tInvalid input...");
						System.out.print("\nDo you want to input number again? (Y/N) -> ");
						char ch = scanner.next().charAt(0);

						if (ch=='Y' || ch=='y') {
							continue;
						} else {
							break;
						}
					}
					
					break;
				}
				break;
				
				case 3:
				while(true){
					System.out.println("\n\n\n+-------------------------------------------------+");
					System.out.println("|                 Octal Converter                 |");
					System.out.println("+-------------------------------------------------+");
					
					System.out.print("\n\nEnter an octal number: ");
					int o=scanner.nextInt();
					
					String octal=""+o;
					boolean valid=true;
					
					if(o>0){
						
						int d=0;
						for(int i=octal.length()-1,j=0; i>=0; i--, j++){			
							char ch=octal.charAt(i);
							int num=ch-48;
							d+=Math.pow(8,j)*num;
							
							if(ch<'0'||ch>'7'){
								valid=false;
								break;
							}
						}
						
						if(valid){
							int decimal=d;
							int temp=d;
						
							String binary="";
							do{
								binary=decimal%2+binary;
								decimal/=2;
							}while(decimal!=0);
						
							String hex="";
							do{
								int remainder=temp%16;
								switch(remainder){
									case 10:
										hex="a"+hex;
										break;
									case 11:
										hex="b"+hex;
										break;
									case 12:
										hex="c"+hex;
										break;
									case 13:
										hex="d"+hex;
										break;
									case 14:
										hex="e"+hex;
										break;
									case 15:
										hex="f"+hex;
										break; 
									default:
										hex=remainder+hex;
									}
									temp/=16;
							}while(temp!=0);
							
							System.out.println("\n\tDecimal number: "+d);
							System.out.println("\tBinary number: "+binary);
							System.out.println("\tHexadecimal number: "+hex);
						
						}else{
							System.out.println("\tInvalid input...");
							System.out.print("\nDo you want to input number again? (Y/N) -> ");
							char ch = scanner.next().charAt(0);

							if (ch=='Y' || ch=='y') {
								continue;
							} else {
								break;
							}
						}
						
					}
					break;
				}
				break;
				
				case 4:
				while(true){
					System.out.println("\n\n\n+-------------------------------------------------+");
					System.out.println("|              Hexadecimal Converter              |");
					System.out.println("+-------------------------------------------------+");
					
					System.out.print("\n\nEnter an octal number: ");
					String h=scanner.next();
					int hexNum=Integer.parseInt(h, 16);
					
					
					break;
				}
				break;
				
				case 5:
				while(true){
					System.out.println("+-------------------------------------------------+");
					System.out.println("|             Roman Number Converter              |");
					System.out.println("+-------------------------------------------------+");
					break;
				}
				break;
				
				default:
					System.out.println("Invalid option...");
					continue;
			}
			
			System.out.print("\nDo you want to go back to homepage? (Y/N) -> ");
            char ch = scanner.next().charAt(0);

            if (ch == 'Y' || ch == 'y') {
                continue;
            } else {
                System.out.println("Thank you for using Number Converter!");
                break;
            }
		}
	}
}
