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

//5 da 6
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

//7
import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    System.out.println("GCD = " + findGCD(a,b));
    System.out.println("LCD = " + (a*b)/findGCD(a,b));}
        private static int findGCD(int a, int b) {
        if(b == 0){
            return a;}
        return findGCD(b, a%b);}}

//8
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int number, number2;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter First Number : ");
		number = sc.nextInt();	
    System.out.print(" Please Enter 2nd Number : ");
    number2=sc.nextInt();
		while(number <= number2){
			System.out.print(number++ +("\t")); }}}
//9
public class Main{
  public static void main(String[] args){
    int array[]=new int[]{5,8,10,15,25,36,40,50};
    int max = getMax(array);
    System.out.println("Maximum Value is: "+max);
    int min = getMin(array);
    System.out.println("Minimum Value is: "+min);}
  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; } } 
    return maxValue; }
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } } 
    return minValue; }}
//10
public class Main {
  public static void main (String [] args) {
   int [] array = {45,12,32,39,69,42,1,6};
   int temp;
   for (int i = 1; i < array.length; i++) {
    for (int j = i; j > 0; j--) {
     if (array[j] < array [j - 1]) {
      temp = array[j];
      array[j] = array[j - 1];
      array[j - 1] = temp;
     }}}
   for (int i = 0; i < array.length; i++) {
     System.out.println(array[i]);}}}

//11
import java.util.Random;
public class Main {
   public static void main(String[] args) {
      Random rd = new Random(); 
      int[] arr = new int[8];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt();
         System.out.println(arr[i]);}}}
//12












