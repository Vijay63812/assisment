//swapping for three numbers without fourth variable//
public class Swap{
public static void main(String args[]){

int a=4;
int b=5;
int c=6;
System.out.println("BRFORE SWAPPING FOR THREE NUMBERS");
System.out.println("a ="+a);
System.out.println("b ="+b);
System.out.println("c ="+c);
a=a+b+c;     //a=4+5+6=15
b=a-(b+c);   //b=15-(5+6)=4
c=a-(b+c);   //c=15-(4+6)=5
a=a-(b+c);  //a=15-(4+5)=6
System.out.println("AFTER SWAPPING FOR THREE NUMBERS");			
System.out.println("a ="+a);
System.out.println("b ="+b);
System.out.println("c ="+c);
}
}

