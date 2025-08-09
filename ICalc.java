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
					
					System.out.print("\n\nEnter an Hexadecimal number: ");
					String h=scanner.next();
					
					boolean valid = true;
					for (int i = 0; i < h.length(); i++) {
						char ch = h.charAt(i);
						if (!((ch>='0' && ch<='9') || (ch>='A' && ch<='F') || (ch>='a' && ch<='f'))) {
							valid = false;
							break;
						}
					}
					
					if(valid){
						int decimalNumber=Integer.parseInt(h,16);
						int d=decimalNumber;
						int temp=decimalNumber;
						
						String binary="";
						do{
							binary=d%2+binary;
							d/=2;
						}while(d!=0);
						
						String octal="";
						do{
							octal=temp%8+octal;
							temp/=8;
						}while(temp!=0);
						
						System.out.println("\n\tDecimal number: "+decimalNumber);
						System.out.println("\tBinary number: "+binary);
						System.out.println("\tOctal number: "+octal);
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
				
				case 5:
				while(true){
					System.out.println("\n\n\n+-------------------------------------------------+");
					System.out.println("|             Roman Number Converter              |");
					System.out.println("+-------------------------------------------------+");
					
					System.out.println("\n\n\t[01] Decimal Number to Roman Number Converter\n");
					System.out.println("\t[02] Roman number to Decimal Number Converter\n");
					
					System.out.print("\n\nEnter an option: ");
					int option1=scanner.nextInt();
					
					switch(option1){
						case 1:
							while(true){
								System.out.println("\n\n\n+------------------------------------------------+");
								System.out.println("|    Decimal Number to Roman Number Converter    |");
								System.out.println("+------------------------------------------------+");
					
								System.out.print("\n\nEnter an Decimal number: ");
								int d=scanner.nextInt();
								
								String s="";
								if (d>=1 && d<=1000){
									while (d>=1000) {
										s+="M";
										d-=1000;
									}
									while (d>=900) {
										s+="CM";
										d-=900;
									}
									while (d>=500) {
										s+="D";
										d-=500;
									}
									while (d>=400) {
										s+="CD";
										d-=400;
									}
									while (d>=100) {
										s+="C";
										d-=100;
									}
									while (d>=90) {
										s+="XC";
										d-=90;
									}
									while (d>=50) {
										s+="L";
										d-=50;
									}
									while (d>=40) {
										s+="XL";
										d-=40;
									}
									while (d>=10) {
										s+="X";
										d-=10;
									}
									while (d>=9) {
										s+="IX";
										d-=9;
									}
									while (d>=5) {
										s+="V";
										d-=5;
									}
									while (d >= 4) {
										s+="IV";
										d-=4;
									}
									while (d>=1) {
										s+="I";
										d-=1;
									}    
									System.out.println("\n\tRoman numeral: "+s);
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
							WL1:while(true){
								System.out.println("\n\n\n+------------------------------------------------+");
								System.out.println("|    Roman Number to Decimal Number Converter    |");
								System.out.println("+------------------------------------------------+");
					
								System.out.print("\n\nEnter an Roman number: ");
								String r=scanner.next().toUpperCase();
								
								int decimal=0;
								
								for(int i=0; i<r.length(); i++){
									char d=r.charAt(i);
									
									switch(d){
										case 'M':
											decimal+=1000;
											break;
										case 'D':
											decimal+=500;
											break;
										case 'C':
											decimal+=100;
											break;
										case 'L':
											decimal+=50;
											break;
										case 'X':
											decimal+=10;
											break;
										case 'V':
											decimal+=5;
											break;
										case 'I':
											decimal+=1;
											break;
										default:
											System.out.println("\tInvalid input...");
											System.out.print("\nDo you want to input number again? (Y/N) -> ");
											char ch = scanner.next().charAt(0);

											if (ch=='Y' || ch=='y') {
												continue WL1;
											} else {
												break WL1;
											}
									}
								}
								if (r.contains("IV")){
									decimal-=2;
								}
								if (r.contains("IX")){
									decimal-=2;
								}
								if (r.contains("XL")){
									decimal-=10;
								}
								if (r.contains("XC")){
									decimal-=10;
								}
								if (r.contains("CD")){
									decimal-=100;
								}
								if (r.contains("CM")){
									decimal-=100;
								}
								System.out.println("\n\tDecimal number: "+decimal);
								break;	
							}
							break;
						default:
							System.out.println("Invalid option");
					}
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
