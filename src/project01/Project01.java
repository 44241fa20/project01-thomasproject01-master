/**

 * Class: 44-241 Computer Programming II

 * Author: Matt Thomas

 * Description: 

  * Due: 10/15/2020

  * I pledge that I have completed the programming assignment independently.

  * I have not copied the code from a student or any source.

  * I have not given my code to any other student and will not share this code with anyone under any circumstances.

 */
package project01;

import java.io.*;
import java.util.*;
import static java.lang.Math.sqrt;
import javax.swing.*;

public class Project01 {
   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception
    {
        String stocks = "Date,Ticker,Open,High,Low,Close,Volume";
        File sp500 = new File("C:\\Users\\zoolo\\Desktop\\project01-thomasmooreproject01-master\\sp500hstFa20.txt");
        Scanner fileInput = new Scanner(sp500);
        PrintWriter fileWriter = new PrintWriter("SP500output.txt");
        int transactions = 0;
        
        
        while(fileInput.hasNext())
        {
            stocks = fileInput.nextLine();
            String[] data = stocks.split(",");
            int[] data1 = new int[data.length];
            
            
            
            String date = data[0];
            String ticker = data[1];
            String open = data[2];
            String high = data[3];
            String low = data[4];
            String close = data[5];
            String volume = data[6];
            
            
            //System.out.println(close);
            
            
            
            
            //writing to the file and adding 1 to count to get how many strings there are
            transactions++;
            printMintoScreen(data1);
            printMaxToScreen(data1);
            printMinToFile(num, fileWriter, data1);
            printMaxToFile(num, fileWriter, data1);
            
        }
        
        System.out.println("Number of stocks: " + transactions);
       
        
    }
    public static void printMintoScreen(int[] data1)
     {
        float minClose = data1[5];
        
            for (int x=1; x<data1.length;x++)
            {
               if (data1[x] < minClose){
                   minClose = data1[x];
               }
            }
            System.out.println(minClose);
     }
    
    public static void printMaxToScreen(int[] data1)
     {
         float maxClose = data1[5];
         
         for (int x = 0; x < data1.length;x++)
            {
               if (data1[x] > maxClose){
                   maxClose = data1[x];
               }
            }
         System.out.println(maxClose);
     }
    public static void findandPrintAverage(long count, long total)
     {
         
     }
    public static void printMinToFile(float[] minClose, PrintWriter fileWriter, int[] data1)
     {
            for (int x = 0; x<data1.length;x++)
            {
               float num = (float)data1[x];
               if (num < minClose[x]){ 
                   
                   minClose[x] = num;
                   
               }fileWriter.println("Minimum Closing Stock: " + num);
            }
     }
    public static void printMaxToFile(float[] maxClose, PrintWriter fileWriter, int[] data1)
     {
         for (int x = 0; x<data1.length;x++)
            {
               float num = (float)data1[x];
               if (num < maxClose[x]){ 
                   
                   maxClose[x] = num;
                   
               }fileWriter.println("Maximum Closing Stock: " + num);
            }
     }
    public static void findandPrintAverageToFile(long count, long total, PrintWriter file)
     {
         
     }
}
