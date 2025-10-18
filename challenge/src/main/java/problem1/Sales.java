package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        int SALESPEOPLE;
        int sum;
        int max_sale;
        int min_sale;
        int ind_max;
        int ind_min;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of sales people: ");
        SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];

        System.out.println("--------------------");

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        max_sale = sales[0];
        min_sale = sales[0];
        ind_max = 0;
        ind_min = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if (sales[i] > max_sale){
                max_sale = sales[i];
                ind_max = i;
            }
            if (sales[i] < min_sale){
                min_sale = sales[i];
                ind_min = i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales: " + sum/sales.length);
        System.out.println("\nSalesperson " + (ind_max+1) + " had the highest sale with " + max_sale + "$");
        System.out.println("\nSalesperson " + (ind_min+1) + " had the lowest sale with " + min_sale + "$");

        System.out.println("\nEnter a value to compare it to the sales: ");
        int exceed = scan.nextInt();

        System.out.println("\nSalesperson Sales that exceeded " + exceed);
        System.out.println("--------------------");

        int numofSalesperon = 0;
        for(int i=0; i<sales.length; i++){
            if (sales[i] > exceed){
                System.out.println(" " + (i+1) + " " + sales[i]);
                numofSalesperon++;
            }
        }
         if(numofSalesperon == 0){
             System.out.println("None of the sales has exceeded " + exceed);
         }

        System.out.println("\nTotal number of salespeople whose sales exceeded the value entered. : " + numofSalesperon);

    }
}