//Name: Elmer Pres Urbano
//Email address: eurbano@calpoly.edu

public class sequence {
	static String number;
	static char tens_place;
	static char ones_place;
	static int number_of_letters=0;
	static boolean flag=true;
	
	public static void main(String [] args){
		number=args[0];
		System.out.print(number + "-->");
		while(flag){
			//divide number into 2 parts, tens_place and ones_place
			if(number.length()==2){
				tens_place=number.charAt(0);
				ones_place=number.charAt(1);
			}
			else{
				tens_place=0;
				ones_place=number.charAt(0);
			}
			if(tens_place==0 && ones_place=='4'){
				flag=false;
				break;
			}
			//check tens_place and add accordingly
			if(tens_place=='2' || tens_place=='3' || tens_place=='8' || tens_place=='9'){
				number_of_letters=number_of_letters+6;
			}
			else if(tens_place=='4' || tens_place=='5' || tens_place=='6'){
				number_of_letters=number_of_letters+5;
			}
			else if(tens_place=='7'){
				number_of_letters=number_of_letters+7;
			}
			
			//check ones_place and add accordingly
			if(ones_place=='1' || ones_place=='2' || ones_place=='6'){
				number_of_letters=number_of_letters+3;
			}
			else if(ones_place=='3' || ones_place=='7' || ones_place=='8'){
				number_of_letters=number_of_letters+5;
			}
			else if(ones_place=='4' || ones_place=='5' || ones_place=='9'){
				number_of_letters=number_of_letters+4;
			}
			//the teens
			if(tens_place=='1'){
				if(ones_place=='0'){
					number_of_letters=3;
				}
				else if(ones_place=='1' || ones_place=='3' || ones_place=='2'){
					number_of_letters=6;
				}
				else if(ones_place=='5' || ones_place=='6'){
					number_of_letters=7;
				}
				else if(ones_place=='3' || ones_place=='4' || ones_place=='8' || ones_place=='9'){
					number_of_letters=8;
				}
				else if(ones_place=='7'){
					number_of_letters=9;
				}
			}
			number=new Integer(number_of_letters).toString();
			number_of_letters=0;
			System.out.print(number + "-->");
			if(tens_place==0 && ones_place=='4'){
				flag=false;
				break;
			}
		}
		System.out.print(4);
	}
}
