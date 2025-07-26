class car {
    public static void main(String[] args) {
     int km = 1500;
     if(km>20000){
         System.out.println("Needs full service");
     }else if(km>10000){
         System.out.println("Needs semi service");
     }else{
         System.out.println("only general checkup needed");
     }
   }
}