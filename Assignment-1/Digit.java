class Digit  {
 
   
    public static void main(String[] args)
    {
        
        int number = 320025;
 
       
        String Num = Integer.toString(number);
 
        
        for (int i = 0; i < Num.length(); i++) {
 
            
            System.out.println(Num.charAt(i));
        }
    }
}