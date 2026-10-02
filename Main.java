import java.util.Scanner;
public class Main {

   public static void main(String []args) { 
      System.out.println("Hello World");
      Scanner scan = new Scanner(System.in);
      

       

      // Yesterday I tried to bake a [clean]  cake in my [house].
      // First, I mixed 3 cups of [rubber ducks]  with a splace of [orange juice].
      // Then, I added a pinch of [sparkly] salt and stirred it with a[lightsaber].
      // Suddenly, the bowl began to [bike] and turned bright [neon pink]!
      // I panicked and tried to [somersault] out the kitchen window, but I tripped over a [clock].
      // In the end, the cake tasted like [smelly] [broccoli], and my [pet dog] ate the whole thing.  

      System.out.print("Enter an adjective: ");
      String adjective1 = scan.nextLine();

      System.out.print("Enter a place: ");
      String place1 = scan.nextLine();

      System.out.print("Enter a verb: ");
      String verb1 = scan.nextLine();

      System.out.print("Enter a noun: ");
      String noun2 = scan.nextLine();

      System.out.print("Enter a liquid: ");
      String liquid = scan.nextLine();

      System.out.print("Enter another adjective: ");
      String adjective2 = scan.nextLine();

      System.out.print("Enter another noun: ");
      String noun3 = scan.nextLine();

      System.out.print("Enter a color: ");
      String color = scan.nextLine();

      System.out.print("Enter another verb: ");
      String verb2 = scan.nextLine();

      System.out.print("Enter another noun: ");
      String noun4 = scan.nextLine();

      System.out.print("Enter another adjective: ");
      String adjective3 = scan.nextLine();

      System.out.print("Enter a food: ");
      String food = scan.nextLine();

      System.out.print("Enter another noun: ");
      String noun5 = scan.nextLine();




      String sentence1 = "Yesterday, I tried to bake a " +  adjective1 +  "cake in my" + place1;
      String sentence2 = "First, I mixed 3 cups of" + noun2 + "with a splash of" + liquid;
      String sentence3 = "Then, I added a pinch of" + adjective2 + "salt and stirred it with a" + noun3;
      String sentence4 = "Suddenly, the bowl began to" + verb1 + "and turned bright" + color;
      String sentence5 = "I panicked and tried to" + verb2 + "out of the kitchen window,but I tripped over a " + noun4;
      String sentence6 = "In the end, the cake tasted like " + adjective3 + food + "and my" + noun5 + "ate the whole thing";
      
      System.out.println(sentence1);
      System.out.println(sentence2);
      System.out.println(sentence3);
      System.out.println(sentence4);
      System.out.println(sentence5);
      System.out.println(sentence6);

      scan.close();
      
      
      
   
      


      
   }
}
