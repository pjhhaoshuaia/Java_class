public class Collection {
	public static void main(String[] args) {
		int color,card,count=0;
		boolean flag=true;
		boolean[] cset=new boolean[4];
		while (cset[0]==false || cset[1]==false || cset[2]==false || cset[3]==false) {
			color=(int)(Math.random()*4);
			count+=1;
			if (cset[color]==true)
				flag=false;
			if (flag==false)
				continue;
			else {
				card=(int)(Math.random()*13);
				if (color==0) {
					switch (card) {
					case 0:System.out.println("Ace of Clubs");break;
					case 1:System.out.println("2 of Clubs");break;
					case 2:System.out.println("3 of Clubs");break;
					case 3:System.out.println("4 of Clubs");break;
					case 4:System.out.println("5 of Clubs");break;
					case 5:System.out.println("6 of Clubs");break;
					case 6:System.out.println("7 of Clubs");break;
					case 7:System.out.println("8 of Clubs");break;
					case 8:System.out.println("9 of Clubs");break;
					case 9:System.out.println("10 of Clubs");break;
					case 10:System.out.println("Jack of Clubs");break;
					case 11:System.out.println("Queen of Clubs");break;
					case 12:System.out.println("King of Clubs");break;
					}
					cset[color]=true;
				}
				else if (color==1) {
					switch (card) {
					case 0:System.out.println("Ace of Diamonds");break;
					case 1:System.out.println("2 of Diamonds");break;
					case 2:System.out.println("3 of Diamonds");break;
					case 3:System.out.println("4 of Diamonds");break;
					case 4:System.out.println("5 of Diamonds");break;
					case 5:System.out.println("6 of Diamonds");break;
					case 6:System.out.println("7 of Diamonds");break;
					case 7:System.out.println("8 of Diamonds");break;
					case 8:System.out.println("9 of Diamonds");break;
					case 9:System.out.println("10 of Diamonds");break;
					case 10:System.out.println("Jack of Diamonds");break;
					case 11:System.out.println("Queen of Diamonds");break;
					case 12:System.out.println("King of Diamonds");break;
					}
					cset[color]=true;
				}
				else if (color==2) {
					switch (card) {
					case 0:System.out.println("Ace of Hearts");break;
					case 1:System.out.println("2 of Hearts");break;
					case 2:System.out.println("3 of Hearts");break;
					case 3:System.out.println("4 of Hearts");break;
					case 4:System.out.println("5 of Hearts");break;
					case 5:System.out.println("6 of Hearts");break;
					case 6:System.out.println("7 of Hearts");break;
					case 7:System.out.println("8 of Hearts");break;
					case 8:System.out.println("9 of Hearts");break;
					case 9:System.out.println("10 of Hearts");break;
					case 10:System.out.println("Jack of Hearts");break;
					case 11:System.out.println("Queen of Hearts");break;
					case 12:System.out.println("King of Hearts");break;
					}
					cset[color]=true;
				}
				else if (color==3) {
					switch (card) {
					case 0:System.out.println("Ace of Spades");break;
					case 1:System.out.println("2 of Spades");break;
					case 2:System.out.println("3 of Spades");break;
					case 3:System.out.println("4 of Spades");break;
					case 4:System.out.println("5 of Spades");break;
					case 5:System.out.println("6 of Spades");break;
					case 6:System.out.println("7 of Spades");break;
					case 7:System.out.println("8 of Spades");break;
					case 8:System.out.println("9 of Spades");break;
					case 9:System.out.println("10 of Spades");break;
					case 10:System.out.println("Jack of Spades");break;
					case 11:System.out.println("Queen of Spades");break;
					case 12:System.out.println("King of Spades");break;
					}
					cset[color]=true;
				}
			}
		}
		System.out.println("Number of picks:"+count);
	}
}
