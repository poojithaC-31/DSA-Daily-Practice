public class EvenOdd {
   public EvenOdd() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if (var2 % 2 == 0) {
         System.out.println("Even");
      } else {
         System.out.println("Odd");
      }

   }
}