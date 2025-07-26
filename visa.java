class visa {
    public static void main(String[] args) {
     double age = 18;
     boolean hasPassport = false;
     if(age>=18 && hasPassport){
         System.out.println("Visa application is accepted");
     }else if(age>=18 && !hasPassport){
         System.out.println("Application is rejected");
     }else{
         System.out.println("visa not allowed");
     }
   }
}