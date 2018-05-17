package challange;

public class base {

	
	public static void main(String[] args) {
		player[] ar= new player[5];
		String s1 = "EbAAdbBEaBaaBBdAccbeebaec";
	/*	player a=new player('a');
		player b=new player('b');
		player c=new player('c');
		player d=new player('d');
		player e=new player('e');
		*/
		for (int i=0; i<=4; i++)
		ar[i] = new player( (char) (i+97) );
		
		
		for(int i=0; i<s1.length(); i++) {
		char	p=s1.charAt(i);
			switch(p) {
			
			case('a'): ar[0].addpoint(true); break;
			case('b'): ar[1].addpoint(true); break;
			case('c'): ar[2].addpoint(true); break;
			case('d'): ar[3].addpoint(true); break;
			case('e'): ar[4].addpoint(true); break;
			case('A'): ar[0].addpoint(false); break;
			case('B'): ar[1].addpoint(false); break;
			case('C'): ar[2].addpoint(false); break;
			case('D'): ar[3].addpoint(false); break;
			case('E'): ar[4].addpoint(false); break;
			
			default: break;
			}
		}	
		MyQuickSort sorter = new MyQuickSort();
	
		sorter.sort(ar);
		for (int i=0; i<=4; i++) {
			System.out.print(ar[i].name + " : " + ar[i].score + "   ");
		}
		System.exit(0);
	}
		
	}

