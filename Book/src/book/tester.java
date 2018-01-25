
package book;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 * This program is designed to store Books on a array where Novel, UsedNovel, 
 * Books and TextBooks can be stored by providing a text file which will be read
 * then operations can be performed such as: 
 * 1-See the equality of two books
 * 2-Change the markup of a book
 * 3-Change the Discount
 * 4-Output the cost
 * 5-Output the whole information of the book
 * @author Carlos
 */
public class tester {

public static void main (String[] args)throws Exception{
    String inf = JOptionPane.showInputDialog("Input file?");
   // Input file is src/<name of the file>
    FileReader inFile = new FileReader(inf);
    Scanner in = new Scanner(inFile);
    ArrayList<Book> BookList = new ArrayList<Book>(in.nextInt());
    
    String outf = JOptionPane.showInputDialog("Output file?");
    PrintWriter outFile = new PrintWriter(outf);
  
    /**
     * The loops will read through every line of the file provided and perform
     * the operations required, and spit it into the output file
    */
    
    while (in.hasNextLine())
    { String line = in.nextLine();
      outFile.println(line+"\n");
      
    while (in.hasNext()){
        String m = in.next();
        if(m.startsWith("/")){
        in.nextLine();
        
        }
       
        switch(m){
            
            case "Book":
                BookList.add(new Book(in.next(),in.nextDouble()));
                
                break;
            
            case "Novel":
                BookList.add(new Novel(in.next(),in.nextDouble(),in.next(),
                       in.nextDouble()));
                
                break;
            
            case "UsedNovel":
                BookList.add(new UsedNovel(in.next(),in.nextDouble(),in.next(),
                        in.nextDouble(), in.nextInt()));
                
                break;
            
            case "TextBook":
                BookList.add(new TextBook(in.next(),in.nextDouble(),in.next(),
                        in.nextDouble()));
                
                break;
                
            case "E":
                int temp = in.nextInt()-1;
                int temp0 = in.nextInt()-1;
                outFile.println("The Book: " + BookList.get(temp).getTitle() + 
                        " is equal to the Book: " + BookList.get(temp0).getTitle() + "?  ");
                outFile.println(BookList.get(temp).equals(BookList.get(temp0)) + "\n");
                
                
                
                
                break;
            
            case "M":
                int temp1 = in.nextInt()-1;
                BookList.get(temp1).setMarkup(in.nextDouble());
                BookList.get(temp1).applyMarkup();
                outFile.println("You've changed the Markup of " + BookList.get(temp1).getTitle() + " to "
                + BookList.get(temp1).getMarkup() + "%");
                
                  //FIX THE MARKUP IS NOT BEING APPLIED
                break;
               
            case "D":
               int temp2 = in.nextInt()-1;
               BookList.get(temp2).setDiscount(in.nextDouble());
                BookList.get(temp2).applyDiscount();
               outFile.println("You've changed the Discount of " + BookList.get(temp2).getTitle() + " to " + BookList.get(temp2).getDiscount() + "%");
               
                 //FIX THE DISCOUNT IS NOT BEING APPLIED
               break;
            
            case "C":
                 int temp3 = in.nextInt()-1;
                 outFile.println("the price of " + BookList.get(temp3).getTitle() + " is " + BookList.get(temp3).getPrice() + " $");
                 
               
                 break;
            
            case "O":
                int temp4 = in.nextInt()-1;
                 outFile.println(BookList.get(temp4).toString());
                 outFile.println("<><><><><><><><><><><><><><><><><><><><><>"
                         + "<><><><><><><><><><><><><><><><><><><><><><><><>");
                 
                 break;
           
                    
        }}
      

  



  
    }
    outFile.close();
    in.close();
      
   
 
 
 
}}
