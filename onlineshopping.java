class onlineshopping {
    public static void main(String[] args) {
     double amount = 4000;
     boolean isMember = true;
     if(amount>=10000 && isMember){
         System.out.println("30% discount");
     }else if(amount>=5000 && isMember){
         System.out.println("20% discount");
     }else{
         System.out.println("5% discount");
     }
   }
}