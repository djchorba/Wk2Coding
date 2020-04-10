
public class Week2Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Question #1");
		 System.out.println(true && false);
		 System.out.println(true || false);
		 System.out.println(false && false);
		 System.out.println(true && (false || true));
		 System.out.println(false || (true && false));
		 System.out.println(false || 1 < 5);
		 System.out.println(5 >= 4 && 1 > 3);
		 System.out.println(10 < 4 || 1 > 4);
		 System.out.println(12 >= 2 && 1 < 24);
		 System.out.println("Hello".charAt(0) == 'h');
		 System.out.println("------");
		  //
		
		 boolean isHotOutside = true;
		 boolean isWeekday = true;
		 boolean hasMoneyInPocket = true;
		
		 double costOfMilk = 2.49;
		 double moneyInWallet = 27;
		 int thirstLevel = 7;
		 
		 // 4.a shouldByIcecream – this should be true if it is hot outside and there is money in your pocket
		 boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		 
		 //4.b willGoSwimming – this should be true if it is hot outside and it is not a weekday
		 boolean willGoSwimming = isHotOutside && !isWeekday;		 
		
		 //4.c isAGoodDay – this should be true if it is hot outside, there is money in your pocket, 
		 // and it is not a weekday
		 boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		
		 // 4.d willBuyMilk – this should be true if it is hot outside, 
		 // and thirstLevel is greater than or equal to 3, 
		 // and moneyInWallet is greater than or equal to 2 times the cost of milk.
		 boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= (2*costOfMilk));
		
		
	}

}
