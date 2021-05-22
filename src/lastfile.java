import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class lastfile 
{
    public String id;
    public String user;
    public String date1;
    public String date2;
    public String tot;
    public String spent;
    public String save;
    public lastfile()
    {
        getusr_pswd();
        String path = "./Budget.xml";
        System.out.println();
        try 
        {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(path);
         
            Node start = doc.getElementsByTagName("start_date").item(0);
            NodeList d1 = start.getChildNodes();
            Node element00 = d1.item(0);
            date1 = element00.getTextContent();
            id = date1.substring(5,7);
            
            Node end = doc.getElementsByTagName("end_date").item(0);
            NodeList d2 = end.getChildNodes();
            Node element10 = d2.item(0);
            date2 = element10.getTextContent();
         
            Node total_income = doc.getElementsByTagName("total_income").item(0);
            NodeList a = total_income.getChildNodes();
            Node element20 = a.item(0);
            tot = element20.getTextContent();
            Node element21 = a.item(1);
            save = element21.getTextContent();
            Node element22 = a.item(2);
            spent = element22.getTextContent();
        }
        catch(Exception e)
        {
            System.out.println("Error while framing budget to block");
        }
        
        TestBlockChain tb = new TestBlockChain("0x205",id,user,date1,date2,tot,spent,save);
    }
    
    void getusr_pswd()
    {
        homepage hm = new homepage();
        this.user = homepage.user;
        System.out.println("usr :"+user);        
    }
}
