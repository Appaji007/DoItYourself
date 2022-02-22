class Palindrome {
  public static void main(String[] args) {
    
    int num = 3553, Num1 = 0, rem;
    
    
    int Num2 = num;
    
   
    while (num != 0) {
      rem = num % 10;
      Num1 = Num1 * 10 + rem;
      num /= 10;
    }
    
    
    if (Num2 == Num1) {
      System.out.println(Num2 + " is Palindrome.");
    }
    else {
      System.out.println(Num2 + " is not Palindrome.");
    }
  }
}