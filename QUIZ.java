import java.util.Scanner;

class QuizGame{
Scanner sc = new Scanner(System.in);
int count;
int p;
String[] ans ={"A","D","A","C","B","B","A","B","A","C"};
String[] user = new String[10];
int checkAns(int i){
    boolean res;
    res = user[i].equals(ans[i]);
    if(res){
      count++;
    }
    else{
      count+=0;
    }
    return count;
  }
void questions(){
System.out.println("Q1: What is class in java?");
System.out.println("\nA - A class is a blue print from which individual objects are created. A class can contain fields and methods to describe the behavior of an object.\nB - class is a special data type.\nC - class is used to allocate memory to a data type.\nD - none of the above.");
System.out.print("\nAnswer: ");
user[0]=sc.next();
p=checkAns(0);
System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tScore: "+p);
System.out.println("\nQ2: What is the size of double variable?");
System.out.println("\nA - 8 bit\nB - 16 bit\nC - 32 bit\nD - 64 bit");
System.out.print("\nAnswer: ");
user[1]=sc.next();
p=checkAns(1);
System.out.println("Score: "+p);
System.out.println("\nQ3: What is the default value of double variable?");
System.out.println("\nA - 0.0d\nB - 0.0f\nC - 0\nD - not defined");
System.out.print("\nAnswer: ");
user[2]=sc.next();
p=checkAns(2);
System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tScore: "+p);
System.out.println("\nQ4: What is the default value of Object variable?");
System.out.println("\nA - undefined\nB - 0\nC - null\nD - not defined");
System.out.print("\nAnswer: ");
user[3]=sc.next();
p=checkAns(3);
System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tScore: "+p);
System.out.println("\nQ5: What is TreeSet Interface?");
System.out.println("\nA - It is a Set implemented when we want elements in a tree based order.\nB - It is a Set implemented when we want elements in a sorted order.\nC - It is a Set implemented when we want elements in a binary tree format.\nD - It is a Set implemented when we want elements in a hiearchical order.");
System.out.print("\nAnswer: ");
user[4]=sc.next();
p=checkAns(4);
System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tScore: "+p);
System.out.println("\nQ6: When static binding occurs?");
System.out.println("\nA - Static binding occurs during Compile time.\nB - Static binding occurs during load time.\nC - Static binding occurs during runtime.\nD - None of the above.");
System.out.print("\nAnswer: ");
user[5]=sc.next();
p=checkAns(5);
System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tScore: "+p);
System.out.println("\nQ7:  What is Serialization?");
System.out.println("\nA - Serialization is the process of writing the state of an object to another object.\nB - Serialization is the process of writing the state of an object to a byte stream.\nC - Both of the above.\nD - None of the above.");
System.out.print("\nAnswer: ");
user[6]=sc.next();
p=checkAns(6);
System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tScore: "+p);
System.out.println("\nQ8: Under what conditions is an object's finalize() method invoked by the garbage collector?");
System.out.println("\nA - When it detects that the object has become unreachable.\nB - As soon as object is set as null.\nC - At fixed intervalm it checks for null value.\nD - None of the above.");
System.out.print("\nAnswer: ");
user[7]=sc.next();
p=checkAns(7);
System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tScore: "+p);
System.out.println("\nQ9:  When finally block gets executed?");
System.out.println("\nA - Always when try block get executed, no matter exception occured or not.\nB - Always when a method get executed, no matter exception occured or not.\nC - Always when a try block get executed, if exception do not occur.\nD - Only when exception occurs in try block code.");
System.out.print("\nAnswer: ");
user[8]=sc.next();
p=checkAns(8);
System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tScore: "+p);
System.out.println("\nQ10: Which of the following is not a Java features?");
System.out.println("\nA - Dynamic\nB - Architecture Neutral\nC - Use of pointers\nD - Object-oriented");
System.out.print("\nAnswer: ");
user[9]=sc.next();
p=checkAns(9);
System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tScore: "+p);
System.out.println("\n\n\n\n\nTOTAL-SCORE:"+p+"/10");
}
}
public class QUIZ {
  public static void main(String[] args) {
  System.out.println("\n\nQUIZ");
  System.out.println("\nHi!! Good Luck!!\n\n");
  QuizGame q = new QuizGame(); 
  q.questions();
  }
}
