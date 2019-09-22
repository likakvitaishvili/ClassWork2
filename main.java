//1
public class Main {
  public static void main(String[] args) {
System.out.println("C++");
System.out.println("Java");
System.out.println("C#");
System.out.println("pascal");
System.out.println("PHP");
System.out.println("JavaScript");
System.out.println("ActionScript");
} }

//2
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int a=input.nextInt();
int b=input.nextInt();
System.out.println("Ganayofi = "+(a/b));
System.out.println("Nashti = "+(b%a));
  }
}

//3
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int a=input.nextInt();
int b=input.nextInt();
int c=input.nextInt();
System.out.println("Jami = " + (a+b+c));
System.out.println("Namravli = "+(a*b*c));
  }
}

//4
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Sheikvane samnishna ricxvi: ");
Scanner input=new Scanner(System.in);
int number=input.nextInt();
String str = Integer.toString(number);
for(int i=0;i<str.length();i++){
System.out.println(str.charAt(i));
}}}

//5


//6
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
 int num=input.nextInt();
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum); 
}}
