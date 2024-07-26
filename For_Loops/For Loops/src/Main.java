import java.io.*;
class Jalal_Sir {
    public static void main(String[] args)
    {    // variable declaration
        int n1 = 5, n2 = 10, max;
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;
        // Print the largest number
        System.out.println("Maximum is = " + max);
    //for loop
    for(int i = 0 ; i<20;  i +=4){
       
         System.out.println(i + " Is an Even number");
        
        
    }
    System.out.print("Increament of 5 is ");
    for(int i = 0 ; i<=20;  i +=5){
    System.out.print(i + " ");} 
    
    System.out.println("");
    //decreament 
    int count =0;
    for(int i = 999 ; i>500;  i-=3){
        
    count++;
    
    }
    System.out.println("Count: "+ count);
    
    System.out.print("Skipping 5, we get ");
    for(int i = 1 ; i<=7;  i +=1){
        if(i==5){
            continue;
        }
    System.out.print(i + " ");}
        System.out.print("Skipping Relative of 3 & 5: ");
        for(int i = 0 ; i<=100;  i +=1){
            if(i%3==0 || i%5==0){
                continue;
            }
            System.out.print(i + " ");

        }}}
