
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


public class xmlfile 
{
    void ReadAndModify()
    {
        String path = "./Budget.xml";
        System.out.println();
        try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(path);
         
         Node total_income = doc.getElementsByTagName("total_income").item(0);
         NodeList a = total_income.getChildNodes();
         Node element00 = a.item(0);
         Node element01 = a.item(1);
         Node element02 = a.item(2);
         
         Node house_rent = doc.getElementsByTagName("house_rent").item(0);
         NodeList b = house_rent.getChildNodes();
         Node element10 = b.item(0);
         Node element11 = b.item(1);
         Node element12 = b.item(2);
         
         Node e_bill = doc.getElementsByTagName("e_bill").item(0);
         NodeList c = e_bill.getChildNodes();
         Node element20 = c.item(0);
         Node element21 = c.item(1);
         Node element22 = c.item(2);
         
         Node living_budget = doc.getElementsByTagName("living_budget").item(0);
         NodeList d = living_budget.getChildNodes();
         Node element30 = d.item(0);
         Node element31 = d.item(1);
         Node element32 = d.item(2);
         
         Node grocery = doc.getElementsByTagName("grocery").item(0);
         NodeList e = grocery.getChildNodes();
         Node element40 = e.item(0);
         Node element41 = e.item(1);
         Node element42 = e.item(2);
         
         Node education = doc.getElementsByTagName("education").item(0);
         NodeList f = education.getChildNodes();
         Node element50 = f.item(0);
         Node element51 = f.item(1);
         Node element52 = f.item(2);
         
         Node transport = doc.getElementsByTagName("transport").item(0);
         NodeList g = transport.getChildNodes();
         Node element60 = g.item(0);
         Node element61 = g.item(1);
         Node element62 = g.item(2);
         
         Node health = doc.getElementsByTagName("health").item(0);
         NodeList h = health.getChildNodes();
         Node element70 = h.item(0);
         Node element71 = h.item(1);
         Node element72 = h.item(2);
         
         Node entertainment = doc.getElementsByTagName("entertainment").item(0);
         NodeList i = entertainment.getChildNodes();
         Node element80 = i.item(0);
         Node element81 = i.item(1);
         Node element82 = i.item(2);
         
         Node dues = doc.getElementsByTagName("dues").item(0);
         NodeList j = dues.getChildNodes();
         Node element90 = j.item(0);
         Node element91 = j.item(1);
         Node element92 = j.item(2);
         
         Node other = doc.getElementsByTagName("other").item(0);
         NodeList k = other.getChildNodes();
         Node element100 = k.item(0);
         Node element101 = k.item(1);
         Node element102 = k.item(2);
         
         Node savings = doc.getElementsByTagName("savings").item(0);
         NodeList l = savings.getChildNodes();
         Node element200 = l.item(0);
        }
        catch(Exception e)
        {
            System.out.println("error in accessing file while activity tab");
        }
    }
    public static void main(String arr[])
    {
        xmlfile x = new xmlfile();
        try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.newDocument();
         
         // root element
         Element rootElement = doc.createElement("Budget");
         doc.appendChild(rootElement);

         // supercars element
         Element start_date = doc.createElement("start_date");
         rootElement.appendChild(start_date);
         Element strt_date = doc.createElement("str_date");
         strt_date.appendChild(doc.createTextNode("2020/10/18"));
         start_date.appendChild(strt_date);

         // supercars element
         Element end_date = doc.createElement("end_date");
         rootElement.appendChild(end_date);
         Element en_date = doc.createElement("en_date");
         en_date.appendChild(doc.createTextNode("2020/10/20"));
         end_date.appendChild(en_date);
         
         // supercars element
         Element total_income = doc.createElement("total_income");
         rootElement.appendChild(total_income);
         Element tot_income = doc.createElement("tot_income");
         tot_income.appendChild(doc.createTextNode("50000"));
         total_income.appendChild(tot_income);
         Element net_balance = doc.createElement("net_balance");
         net_balance.appendChild(doc.createTextNode("50000"));
         total_income.appendChild(net_balance);
         Element amount_spent = doc.createElement("amount_spent");
         amount_spent.appendChild(doc.createTextNode("0"));
         total_income.appendChild(amount_spent);
         
         // supercars element
         Element house_rent = doc.createElement("house_rent");
         rootElement.appendChild(house_rent);
         Element hr_budget = doc.createElement("hr_budget");
         hr_budget.appendChild(doc.createTextNode("7000"));
         house_rent.appendChild(hr_budget);
         Element hr_bal = doc.createElement("hr_bal");
         hr_bal.appendChild(doc.createTextNode("0"));
         house_rent.appendChild(hr_bal);
         Element hr_spent = doc.createElement("hr_spent");
         hr_spent.appendChild(doc.createTextNode("0"));
         house_rent.appendChild(hr_spent);
         
         Element e_bill = doc.createElement("e_bill");
         rootElement.appendChild(e_bill);
         Element ebill_budget = doc.createElement("ebill_budget");
         ebill_budget.appendChild(doc.createTextNode("2000"));
         e_bill.appendChild(ebill_budget);
         Element ebill_bal = doc.createElement("ebill_bal");
         ebill_bal.appendChild(doc.createTextNode("0"));
         e_bill.appendChild(ebill_bal);
         Element ebill_spent = doc.createElement("ebill_spent");
         ebill_spent.appendChild(doc.createTextNode("0"));
         e_bill.appendChild(ebill_spent);
         
         Element living_budget = doc.createElement("living_budget");
         rootElement.appendChild(living_budget);
         Element dl_budget = doc.createElement("dl_budget");
         dl_budget.appendChild(doc.createTextNode("2000"));
         living_budget.appendChild(dl_budget);
         Element dl_bal = doc.createElement("dl_bal");
         dl_bal.appendChild(doc.createTextNode("0"));
         living_budget.appendChild(dl_bal);
         Element dl_spent = doc.createElement("dl_spent");
         dl_spent.appendChild(doc.createTextNode("0"));
         living_budget.appendChild(dl_spent);
         
         Element grocery = doc.createElement("grocery");
         rootElement.appendChild(grocery);
         Element gro_budget = doc.createElement("gro_budget");
         gro_budget.appendChild(doc.createTextNode("2000"));
         grocery.appendChild(gro_budget);
         Element gro_bal = doc.createElement("gro_bal");
         gro_bal.appendChild(doc.createTextNode("0"));
         grocery.appendChild(gro_bal);
         Element gro_spent = doc.createElement("gro_spent");
         gro_spent.appendChild(doc.createTextNode("0"));
         grocery.appendChild(gro_spent);
         
         Element education = doc.createElement("education");
         rootElement.appendChild(education);
         Element edu_budget = doc.createElement("edu_budget");
         edu_budget.appendChild(doc.createTextNode("5000"));
         education.appendChild(edu_budget);
         Element edu_bal = doc.createElement("edu_bal");
         edu_bal.appendChild(doc.createTextNode("0"));
         education.appendChild(edu_bal);
         Element edu_spent = doc.createElement("edu_spent");
         edu_spent.appendChild(doc.createTextNode("0"));
         education.appendChild(edu_spent);
         
         Element transport = doc.createElement("transport");
         rootElement.appendChild(transport);
         Element tr_budget = doc.createElement("tr_budget");
         tr_budget.appendChild(doc.createTextNode("1000"));
         transport.appendChild(tr_budget);
         Element tr_bal = doc.createElement("tr_bal");
         tr_bal.appendChild(doc.createTextNode("0"));
         transport.appendChild(tr_bal);
         Element tr_spent = doc.createElement("tr_spent");
         tr_spent.appendChild(doc.createTextNode("0"));
         transport.appendChild(tr_spent);
         
         Element health = doc.createElement("health");
         rootElement.appendChild(health);
         Element hl_budget = doc.createElement("hl_budget");
         hl_budget.appendChild(doc.createTextNode("2000"));
         health.appendChild(hl_budget);
         Element hl_bal = doc.createElement("hl_bal");
         hl_bal.appendChild(doc.createTextNode("0"));
         health.appendChild(hl_bal);
         Element hl_spent = doc.createElement("hl_spent");
         hl_spent.appendChild(doc.createTextNode("0"));
         health.appendChild(hl_spent);
         
         Element entertainment = doc.createElement("entertainment");
         rootElement.appendChild(entertainment);
         Element en_budget = doc.createElement("en_budget");
         en_budget.appendChild(doc.createTextNode("2000"));
         entertainment.appendChild(en_budget);
         Element en_bal = doc.createElement("en_bal");
         en_bal.appendChild(doc.createTextNode("0"));
         entertainment.appendChild(en_bal);
         Element en_spent = doc.createElement("en_spent");
         en_spent.appendChild(doc.createTextNode("0"));
         entertainment.appendChild(en_spent);
         
         Element dues = doc.createElement("dues");
         rootElement.appendChild(dues);
         Element du_budget = doc.createElement("du_budget");
         du_budget.appendChild(doc.createTextNode("2000"));
         dues.appendChild(du_budget);
         Element du_bal = doc.createElement("du_bal");
         du_bal.appendChild(doc.createTextNode("0"));
         dues.appendChild(du_bal);
         Element du_spent = doc.createElement("du_spent");
         du_spent.appendChild(doc.createTextNode("0"));
         dues.appendChild(du_spent);
         
         Element other = doc.createElement("other");
         rootElement.appendChild(other);
         Element ot_budget = doc.createElement("ot_budget");
         ot_budget.appendChild(doc.createTextNode("2000"));
         other.appendChild(ot_budget);
         Element ot_bal = doc.createElement("ot_bal");
         ot_bal.appendChild(doc.createTextNode("0"));
         other.appendChild(ot_bal);
         Element ot_spent = doc.createElement("ot_spent");
         ot_spent.appendChild(doc.createTextNode("0"));
         other.appendChild(ot_spent);
         
         Element savings = doc.createElement("savings");
         rootElement.appendChild(savings);
         Element s_budget = doc.createElement("s_budget");
         s_budget.appendChild(doc.createTextNode("5000"));
         savings.appendChild(s_budget);
         /*Element total_income = doc.createElement("total_income");
         rootElement.appendChild(total_income);
         Element tot_income = doc.createElement("tot_income");
         tot_income.appendChild(doc.createTextNode("50000"));
         total_income.appendChild(tot_income);
         Element net_balance = doc.createElement("net_balance");
         net_balance.appendChild(doc.createTextNode("40000"));
         total_income.appendChild(net_balance);
         Element amount_spent = doc.createElement("amount_spent");
         amount_spent.appendChild(doc.createTextNode("10000"));
         total_income.appendChild(amount_spent);
         
         Element total_income = doc.createElement("total_income");
         rootElement.appendChild(total_income);
         Element tot_income = doc.createElement("tot_income");
         tot_income.appendChild(doc.createTextNode("50000"));
         total_income.appendChild(tot_income);
         Element net_balance = doc.createElement("net_balance");
         net_balance.appendChild(doc.createTextNode("40000"));
         total_income.appendChild(net_balance);
         Element amount_spent = doc.createElement("amount_spent");
         amount_spent.appendChild(doc.createTextNode("10000"));
         total_income.appendChild(amount_spent);
         
         Element total_income = doc.createElement("total_income");
         rootElement.appendChild(total_income);
         Element tot_income = doc.createElement("tot_income");
         tot_income.appendChild(doc.createTextNode("50000"));
         total_income.appendChild(tot_income);
         Element net_balance = doc.createElement("net_balance");
         net_balance.appendChild(doc.createTextNode("40000"));
         total_income.appendChild(net_balance);
         Element amount_spent = doc.createElement("amount_spent");
         amount_spent.appendChild(doc.createTextNode("10000"));
         total_income.appendChild(amount_spent);
         
        // carname element
         Element carname = doc.createElement("carname");
         Attr attrType = doc.createAttribute("type");
         attrType.setValue("formula one");
         carname.setAttributeNode(attrType);
         carname.appendChild(doc.createTextNode("Ferrari 101"));
         supercar.appendChild(carname);

         Element carname1 = doc.createElement("carname");
         Attr attrType1 = doc.createAttribute("type");
         attrType1.setValue("sports");
         carname1.setAttributeNode(attrType1);
         carname1.appendChild(doc.createTextNode("Ferrari 202"));
         supercar.appendChild(carname1);*/

         // write the content into xml file
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource source = new DOMSource(doc);
         StreamResult result = new StreamResult(new File("./Example.xml"));
         transformer.transform(source, result);
         
         // Output to console for testing
         StreamResult consoleResult = new StreamResult(System.out);
         transformer.transform(source, consoleResult);
      } catch (Exception e) {
         e.printStackTrace();
      }
        
        x.ReadAndModify();
    }
}
