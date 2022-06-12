import java.util.Scanner;
//question was to draw a flowchart but i did a code. I am great fml!!
public class sumofn_numbers {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
int sum=0;
System.out.print("Enter the numbers ");
while(true){
    String ch = sc.next();
    if(ch.equalsIgnoreCase("x")){
        break;
    }
    else
    sum += Integer.parseInt(ch);
}
System.out.println("SUM OF THE GIVEN NUMBERS IS : " + sum);
    }
}

