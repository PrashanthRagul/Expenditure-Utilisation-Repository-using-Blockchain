import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 *
 * @author Rahul
 */
public class block implements Serializable{
    
    private String version;
    private String id;
    private String name;
    private String start_date;
    private String end_date;
    private String total_amt;
    private String amount_spent;
    private String amount_saved;
    private String hash;
    private String previousHash;
    
    public block(String version,String id,String name,String start_date,String end_date,String total_amt,String amount_spent,String amount_saved)
    {  
        this.version=version;
       this.id=id;
        this.name=name;
         this.start_date=start_date;
          this.end_date=end_date;
           this.total_amt=total_amt;
           this.amount_spent=amount_spent;
           this.amount_saved=amount_saved;
        this.hash=computeHash();
        
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getTotal_amt() {
        return total_amt;
    }

    public void setTotal_amt(String total_amt) {
        this.total_amt = total_amt;
    }

    public String getAmount_spent() {
        return amount_spent;
    }

    public void setAmount_spent(String amount_spent) {
        this.amount_spent = amount_spent;
    }

    public String getAmount_saved() {
        return amount_saved;
    }

    public void setAmount_saved(String amount_saved) {
        this.amount_saved = amount_saved;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }
    public String computeHash()
    {
        String dataToHash=""+this.version+this.start_date+this.end_date+this.previousHash+this.id+this.name+this.total_amt+this.amount_spent+this.amount_saved;
        
        MessageDigest digest;
           String encode=null;
           
           try{
               digest=MessageDigest.getInstance("SHA-256");
               byte[] hash=digest.digest(dataToHash.getBytes(StandardCharsets.UTF_8));
               encode=Base64.getEncoder().encodeToString(hash);
               
               
           }
           catch(NoSuchAlgorithmException e)
           {
               e.printStackTrace();
           }
           this.hash=encode;
        return encode;
    }
	
   
   
}
