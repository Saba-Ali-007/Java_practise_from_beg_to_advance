// Source code is decompiled from a .class file using FernFlower decompiler.
package oops_concept;

public class Constructor {
   String name;
   int rollNo;

   Constructor(String var1, int var2) {
      this.name = var1;
      this.rollNo = var2;
   }

   Constructor(String var1) {
      this.name = var1;
   }

   void displayDetails() {
      System.out.println("Name: " + this.name);
      if (this.rollNo != 0) {
         System.out.println("Roll No: " + this.rollNo);
      }

   }

   public static void main(String[] var0) {
      Constructor var1 = new Constructor("Alice", 101);
      Constructor var2 = new Constructor("Bob");
      var1.displayDetails();
      var2.displayDetails();
   }
}
