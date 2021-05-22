import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestBlockChain {
    public static String ss;
    String version,id,user,date1,date2,tot,spent,save;
    public static void printdata(Blockchain bk)
    {
       bk.displayChain();
    }
    public TestBlockChain()
    {
        
    }
 
    public TestBlockChain(String version,String id,String user,String date1,String date2,String tot,String spent,String save)
    {
        this.version = version;
        this.id = id;
        this.user = user;
        this.date1 = date1;
        this.date2 = date2;
        this.tot = tot;
        this.spent = spent;
        this.save = save;
                
        Blockchain ch=new Blockchain();
	
               //Scanner sc= new Scanner(System.in); 
                   System.out.print("Initialize  block (Y/N)");
                    //String test= sc.nextLine();
                    activity a = new activity();
                    String test = activity.yn;
                if("Y".equals(test)){
                //ch.addBlock(new block("0x207","1","Ragul","02/02/2020","02/07/2020","40000","20000","20000"));
                //ch.addBlock(new block("0x208","2","Rizu","03/03/2020","03/08/2020","50000","30000","20000"));
                //ch.addBlock(new block("0x209","3","Raj","02/04/2020","02/09/2020","45000","20000","15000"));
	        ch.addBlock(new block(version,id,user,date1,date2,tot,spent,save));
                    
	            
	           ch.displayChain();
                 //   ch.getLatestBlock().setAmount_spent("10000");
                   
                    System.out.println(ch.getUser("11"));
                    
                    
	            ch.isValid();
                    
                      
                /*Scanner sc= new Scanner(System.in); 
                System.out.println("GET USER:");
                String str=sc.nextLine();
                ss=ch.getData(str);
                System.out.println(ss);*/
                   // Blockchain chain=new Blockchain();
            String filename="blockfile.txt";        
                    try { 
  
            
            FileOutputStream file = new FileOutputStream(filename,false); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
  
            
            out.writeObject(ch); 
  
            out.close(); 
            file.close();
            JOptionPane.showMessageDialog(null, "Block Created. ");
            
        } 
  
        catch (IOException ex) { 
            System.out.println("IOException is caught"); 
        } 
  
                }
                
                else{
        ch = null; 
  
         
        try { 
  
           
            FileInputStream file = new FileInputStream("blockfile.txt"); 
            ObjectInputStream in = new ObjectInputStream(file); 
  
          
            ch = (Blockchain)in.readObject(); 
            ch.addBlock(new block(version,id,user,date1,date2,tot,spent,save));
            //ch.addBlock(new block("0x206","8","Madhu","01/01/2020","01/06/2020","50000","20000","30000"));
             //ch.addBlock(new block("0x206","6","Ram","01/01/2020","01/06/2020","50000","20000","30000"));
            //ch.addBlock(new block("0x209","7","Rammu","02/04/2000","02/09/2020","45000","20000","15000"));
            
            
            
            in.close(); 
            file.close(); 
            System.out.println("Data after Deserialization."); 
            
            
            printdata(ch); 
            /*Scanner sc= new Scanner(System.in); 
                System.out.println("GET USER:");
                String str=sc.nextLine();
                ss=ch.getData(str);
                System.out.println(ss);*/
    
  
            
            FileOutputStream file1; 
            file1 = new FileOutputStream("blockfile.txt",false);
            ObjectOutputStream out = new ObjectOutputStream(file1); 
  
            
            out.writeObject(ch); 
  
            out.close(); 
            file.close();
             JOptionPane.showMessageDialog(null, "Block Created. ");
            
} 
  
        catch (IOException ex) { 
            System.out.println(ex); 
        } 
  
        catch (ClassNotFoundException ex) { 
            System.out.println("ClassNotFoundException"); 
        }                                  
    
                }
}
   
}
            
