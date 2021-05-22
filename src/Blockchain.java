/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Rahul
 */
public class Blockchain implements Serializable{
    
    
    private List<block>chain;
    /*public String id;
    public String name;
    public String sd;
    public String ed;
    public String ta;
    public String sp;
    public String sa;*/
    
    public Blockchain()
    {
        chain=new ArrayList<block>();
        chain.add(generateGenesis());
    }

    private block generateGenesis(){
        block genesis=new block("0x222","0","null","null","null","null","null","null");
        genesis.setPreviousHash(null);

        genesis.computeHash();
        
        return genesis;
    }
    public void addBlock(block blk) 
    {
        block newblock=blk;
        newblock.setPreviousHash(chain.get(chain.size()-1).getHash());
        newblock.computeHash();
        this.chain.add(newblock);
    }
    public void displayChain()
    {
        for(int i=0;i<chain.size();i++)
        {
            System.out.println("Block :"+i);
            System.out.println("Version :"+chain.get(i).getVersion());
           System.out.println("ID :"+chain.get(i).getId());
           System.out.println("Name :"+chain.get(i).getName());
           System.out.println("Start Date :"+chain.get(i).getStart_date());
           System.out.println("End Date :"+chain.get(i).getEnd_date());
           System.out.println("Total amount :"+chain.get(i).getTotal_amt());
           System.out.println("Amount spent :"+chain.get(i).getAmount_spent());
           System.out.println("Amount saved :"+chain.get(i).getAmount_saved());
             
            System.out.println();
            //String data[] = {chain.get(i).getId(),chain.get(i).getName(),chain.get(i).getStart_date(),chain.get(i).getEnd_date(),chain.get(i).getTotal_amt(),chain.get(i).getAmount_spent(),chain.get(i).getAmount_saved()};
            //previewLog p = new previewLog();
            //previewLog.jTextArea1.setText("hadfjdsjf");
            /*id = chain.get(i).getVersion();
            name = chain.get(i).getName();
            sd = chain.get(i).getStart_date();
            ed = chain.get(i).getEnd_date();
            ta = chain.get(i).getTotal_amt();
            sp = chain.get(i).getAmount_spent();
            sa = chain.get(i).getAmount_saved();*/
            //previewLog pl = new previewLog(chain.get(i).getId(),chain.get(i).getName(),chain.get(i).getStart_date(),chain.get(i).getEnd_date(),chain.get(i).getTotal_amt(),chain.get(i).getAmount_spent(),chain.get(i).getAmount_saved());
        }
    }
    
    public void isValid()
    {  int a=1;
    	for(int i=chain.size()-1;i>0;i--)
    	{
    		if(!chain.get(i).getHash().equals(chain.get(i).computeHash()))
    		  {  a--;   
    			System.out.println("Chain not valid");
    			break;
    		
    		}
    		if(!chain.get(i).getPreviousHash().equals(chain.get(i-1).computeHash()))
    		{   a--;
    			System.out.println("Chain not valid");
    			break;
    		}
    		
    	}
        if(a==1)
            System.out.println("Chain is valid");
    	
    }
public block getLatestBlock()
{
    return this.chain.get(chain.size()-1);
}
public String getUser(String id)
{
    String s = "";
    for(int i=0;i<chain.size();i++)
    {
        if(chain.get(i).getId().equals(id))
        {   
             System.out.println("Block :"+i);
            System.out.println("Version :"+chain.get(i).getVersion());
           System.out.println("ID :"+chain.get(i).getId());
           System.out.println("Name :"+chain.get(i).getName());
           System.out.println("Start Date :"+chain.get(i).getStart_date());
           System.out.println("End Date :"+chain.get(i).getEnd_date());
           System.out.println("Total amount :"+chain.get(i).getTotal_amt());
           System.out.println("Amount spent :"+chain.get(i).getAmount_spent());
           System.out.println("Amount saved :"+chain.get(i).getAmount_saved());
           s=s+"\n"+"ID :"+i+"\n"+
                   "NAME :"+chain.get(i).getName()+"\n"+
                   "START DATE :"+chain.get(i).getStart_date()+"\n"+
                        "END DATE :"+chain.get(i).getEnd_date()+"\n"+
                        "TOTAL AMOUNT :"+chain.get(i).getTotal_amt()+"\n"+
                                "AMOUNT SPENT :"+chain.get(i).getAmount_spent()+"\n"+
                        "AMOUNT SAVED :"+chain.get(i).getAmount_saved()+"\n";
           
            
            
            
            //return s;
        }
    }
    
    return s;
    
}

   /* public String getData(String name)
    {
        String s="";
        //System.out.println("adfaf");
        System.out.println("o");
        for(int i=0;i<chain.size();i++)
        {
            if(chain.get(i).getName().equals(name))
            {
                s=s+"Start Date :"+chain.get(i).getStart_date()+"\n"+
                        "End Date :"+chain.get(i).getEnd_date()+"\n"+
                        "Total amount :"+chain.get(i).getTotal_amt()+"\n"+
                                "Amount spent :"+chain.get(i).getAmount_spent()+"\n"+
                        "Amount saved :"+chain.get(i).getAmount_saved()+"\n";
               
            }
        }
        return s;
    }

 
}*/ 
}

