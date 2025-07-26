class insurance {
    public static void main(String[] args) {
     int age = 15;
     if(age>60){
            System.out.println("Premium: ₹5000");
     }else if(age>40 && age<=60){
            System.out.println("Premium: ₹3000");
     }else if(age>20 && age<=39){
            System.out.println("Premium: ₹1500");
     }else{
            System.out.println("Premium: ₹1000");
     }
   }
}