class Demo{
      int  num1;
      int  num2;
      Demo(){
         num1 = 10;
         num2 = 20;
         System.out.println("Inside Constructor");
     }
 
     public void display(){
        System.out.println("num1 === "+num1);
        System.out.println("num2 === "+num2);
    }
    public static void main(String args[]){
       Demo d1 = new Demo();
      d1.display();
  }
}