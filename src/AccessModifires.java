import java.util.Scanner;
 class AccessModifires {
 static class circle{
     private double r;
     Scanner sc = new Scanner(System.in);
   /* int r = sc.nextInt();*/
     double pi = 3.14;
     public void setR(int t){
         this.r = (double) (pi*(double)t*(double)t);
     }
     public double getR(){
         return r;
     }
 }
    public static void main(String[] args) {
     circle mycircle = new circle();
        System.out.println("The Area of the circle is : ");
        mycircle.setR(9);
        System.out.println(mycircle.getR());
    }
}
