
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asif
 */
public class activity extends javax.swing.JFrame {

    /**
     * Creates new form activity
     */
    //public String uname;
    //public String pswd;
    public static String yn;
    public static String str_date1;
    public static String en_date1;
    public static int tot_income;
    public static int hr_budget_v;
    public static int eb_budget_v;
    public static int living_budget_v;
    public static int gro_budget_v;
    public static int edu_budget_v;
    public static int trans_budget_v;
    public static int health_budget_v;
    public static int entertain_budget_v;
    public static int dues_budget_v;
    public static int other_budget_v;
    public static int get_savings_v;
    
    public static int net_balance;
    public static int amt_spent;
    public static int hr_spent;
    public static int eb_spent;
    public static int dl_spent;
    public static int gr_spent;
    public static int edu_spent;
    public static int tr_spent;
    public static int hl_spent;
    public static int en_spent;
    public static int du_spent;
    public static int ot_spent;
    public activity() {
        
        initComponents();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
        LocalDateTime now = LocalDateTime.now();
        String sys_date = dtf.format(now);
        System.out.println(sys_date);  
        
        mainMenu mm = new mainMenu();
        String start_date1 ;//= mainMenu.str_date;
        String end_date1 ;//= mainMenu.en_date;
        File file = new File("./Budget.xml");
        if(file.exists())
        {
            System.out.println("File found");
            String path = "./Budget.xml";
            System.out.println();
            try{
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(path);
                Node start_date = doc.getElementsByTagName("start_date").item(0);
                NodeList a = start_date.getChildNodes();
                Node str_date = a.item(0);
                str_date1 = str_date.getTextContent();
         
                Node end_date = doc.getElementsByTagName("end_date").item(0);
                NodeList b = end_date.getChildNodes();
                Node en_date = b.item(0);
                en_date1 = en_date.getTextContent();
            }
            catch(Exception e)
            {
                System.out.println("Error in accessing date variables");
            }
            if(sys_date.compareTo(en_date1)>0)
            {   
                //delete function to be invoked
                lastfile lf = new lastfile();
                JOptionPane.showMessageDialog(null,"Block created.Create a new budget","Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
            
        
                try 
                {
                    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                    Document doc = dBuilder.parse(path);
         
                    Node total_income = doc.getElementsByTagName("total_income").item(0);
                    NodeList a = total_income.getChildNodes();
                    Node element00 = a.item(0);
                    Node element01 = a.item(1);
                    Node element02 = a.item(2);
                    total_income_tf.setText(element00.getTextContent());
                    net_balance_tf.setText(element01.getTextContent());
                    amount_spent_tf.setText(element02.getTextContent());
         
                    Node house_rent = doc.getElementsByTagName("house_rent").item(0);
                    NodeList b = house_rent.getChildNodes();
                    Node element10 = b.item(0);
                    Node element11 = b.item(1);
                    Node element12 = b.item(2);
                    hr_tf_bal.setText(element11.getTextContent());
                    hr_tf_spent.setText(element12.getTextContent());
         
                    Node e_bill = doc.getElementsByTagName("e_bill").item(0);
                    NodeList c = e_bill.getChildNodes();
                    Node element20 = c.item(0);
                    Node element21 = c.item(1);
                     Node element22 = c.item(2);
                    eb_tf_bal.setText(element21.getTextContent());
                    eb_tf_spent.setText(element22.getTextContent());
         
                    Node living_budget = doc.getElementsByTagName("living_budget").item(0);
                    NodeList d = living_budget.getChildNodes();
                    Node element30 = d.item(0);
                    Node element31 = d.item(1);
                    Node element32 = d.item(2);
                    dl_tf_bal.setText(element31.getTextContent());
                    dl_tf_spent.setText(element32.getTextContent());
         
                    Node grocery = doc.getElementsByTagName("grocery").item(0);
                    NodeList e = grocery.getChildNodes();
                    Node element40 = e.item(0);
                    Node element41 = e.item(1);
                    Node element42 = e.item(2);
                    gr_tf_bal.setText(element41.getTextContent());
                    gr_tf_spent.setText(element42.getTextContent());
         
                    Node education = doc.getElementsByTagName("education").item(0);
                    NodeList f = education.getChildNodes();
                    Node element50 = f.item(0);
                    Node element51 = f.item(1);
                    Node element52 = f.item(2);
                    ed_tf_bal.setText(element51.getTextContent());
                    ed_tf_spent.setText(element52.getTextContent());
         
                    Node transport = doc.getElementsByTagName("transport").item(0);
                    NodeList g = transport.getChildNodes();
                    Node element60 = g.item(0);
                    Node element61 = g.item(1);
                    Node element62 = g.item(2);
                    tr_tf_bal.setText(element61.getTextContent());
                    tr_tf_spent.setText(element62.getTextContent());
         
                    Node health = doc.getElementsByTagName("health").item(0);
                    NodeList h = health.getChildNodes();
                    Node element70 = h.item(0);
                    Node element71 = h.item(1);
                    Node element72 = h.item(2);
                    hl_tf_bal.setText(element71.getTextContent());
                    hl_tf_spent.setText(element72.getTextContent());
         
                    Node entertainment = doc.getElementsByTagName("entertainment").item(0);
                    NodeList i = entertainment.getChildNodes();
                    Node element80 = i.item(0);
                    Node element81 = i.item(1);
                    Node element82 = i.item(2);
                    en_tf_bal.setText(element81.getTextContent());
                    en_tf_spent.setText(element82.getTextContent());
         
                    Node dues = doc.getElementsByTagName("dues").item(0);
                    NodeList j = dues.getChildNodes();
                    Node element90 = j.item(0);
                    Node element91 = j.item(1);
                    Node element92 = j.item(2);
                    du_tf_bal.setText(element91.getTextContent());
                    du_tf_spent.setText(element92.getTextContent());
         
                    Node other = doc.getElementsByTagName("other").item(0);
                    NodeList k = other.getChildNodes();
                    Node element100 = k.item(0);
                    Node element101 = k.item(1);
                    Node element102 = k.item(2);
                    ot_tf_bal.setText(element101.getTextContent());
                    ot_tf_spent.setText(element102.getTextContent());
         
                    Node savings = doc.getElementsByTagName("savings").item(0);
                    NodeList l = savings.getChildNodes();
                    Node element200 = l.item(0);
                }
                catch(Exception e)
                {
                    System.out.println("error in accessing file while activity tab");
                }
            }
            //JOptionPane.showMessageDialog(null,"Budget Already created","Error", JOptionPane.ERROR_MESSAGE);
        
        //if(sys_date.compareTo(start_date1)>=0 && sys_date.compareTo(end_date1)<=0)
        //{
          //  System.out.println("values displayed");
            /*try
            {
                FileInputStream fin = new FileInputStream(new File("./Budget.xml"));
                XMLDecoder decoder = new XMLDecoder(fin);
                medium m3 = (medium)decoder.readObject();
                decoder.close();
                fin.close();
                System.out.println("problem related to file");
                total_income_tf.setText(Integer.toString(m3.getTot_income()));
                hr_tf_bal.setText(Integer.toString(m3.getHr_budget_v()));
                eb_tf_bal.setText(Integer.toString(m3.getEb_budget_v()));
                dl_tf_bal.setText(Integer.toString(m3.getLiving_budget_v()));
                gr_tf_bal.setText(Integer.toString(m3.getGro_budget_v()));
                ed_tf_bal.setText(Integer.toString(m3.getEdu_budget_v()));
                tr_tf_bal.setText(Integer.toString(m3.getTrans_budget_v()));
                hl_tf_bal.setText(Integer.toString(m3.getHealth_budget_v()));
                en_tf_bal.setText(Integer.toString(m3.getEntertain_budget_v()));
                du_tf_bal.setText(Integer.toString(m3.getDues_budget_v()));
                ot_tf_bal.setText(Integer.toString(m3.getOther_budget_v()));
                System.out.println("values inserted");
            }
            catch(Exception e)
            {
                System.out.println("error in accessing file");
            }*/
        }
        else
        {
            //initComponents();
            JOptionPane.showMessageDialog(null,"Budget not created","Error", JOptionPane.ERROR_MESSAGE);
        }
        //else if(sys_date.compareTo(end_date1)>=0)
       // {
         //   System.out.println("budget not created.");
        //}
        
        //set_variable_values();
        //set_tf_values();
    }
    
    /*void set_variable_values()
    {
        //mainMenu mm = new mainMenu();
        int total = Integer.parseInt(mainMenu.get_income.getText()) + Integer.parseInt(mainMenu.get_ot_income.getText());
        int rent = Integer.parseInt(mainMenu.hr_budget.getText());
        int ebill = Integer.parseInt(mainMenu.eb_budget.getText());
        int living = Integer.parseInt(mainMenu.living_budget.getText());
        int grocery = Integer.parseInt(mainMenu.gro_budget.getText());
        int education = Integer.parseInt(mainMenu.edu_budget.getText());
        int transport = Integer.parseInt(mainMenu.trans_budget.getText());
        int health = Integer.parseInt(mainMenu.health_budget.getText());
        int entertain = Integer.parseInt(mainMenu.entertain_budget.getText());
        int dues = Integer.parseInt(mainMenu.dues_budget.getText());
        int other = Integer.parseInt(mainMenu.other_budget.getText());
    }
    
    void set_tf_values()
    {
        total_income_tf.setText(mainMenu.get_income.getText()+ mainMenu.get_ot_income.getText());
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        en_tf_bal = new javax.swing.JTextField();
        add8 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        tr_tf_spent = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        add10 = new javax.swing.JLabel();
        ed_tf_bal = new javax.swing.JTextField();
        add4 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        gr_tf_bal = new javax.swing.JTextField();
        add3 = new javax.swing.JLabel();
        eb_tf_bal = new javax.swing.JTextField();
        net_balance_tf = new javax.swing.JTextField();
        hl_tf_bal = new javax.swing.JTextField();
        hl_tf_spent = new javax.swing.JTextField();
        add7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        add5 = new javax.swing.JLabel();
        dl_tf_bal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        add6 = new javax.swing.JLabel();
        gr_tf_spent = new javax.swing.JTextField();
        ed_tf_spent = new javax.swing.JTextField();
        hr_tf_bal = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        tr_tf_bal = new javax.swing.JTextField();
        amount_spent_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        amount_spent = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        add2 = new javax.swing.JLabel();
        ot_tf_spent = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        add9 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        add1 = new javax.swing.JLabel();
        du_tf_bal = new javax.swing.JTextField();
        balance_label = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        dl_tf_spent = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        eb_tf_spent = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ot_tf_bal = new javax.swing.JTextField();
        balance = new javax.swing.JLabel();
        en_tf_spent = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        spent_label = new javax.swing.JLabel();
        hr_tf_spent = new javax.swing.JTextField();
        du_tf_spent = new javax.swing.JTextField();
        eb_label = new javax.swing.JLabel();
        house_rent_label = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        total_income_tf = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setBounds(new java.awt.Rectangle(235, 100, 890, 520));
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        add8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add8.setText("Edit");
        add8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add8MouseClicked(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("ENTERTAINMENT");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Spent");

        tr_tf_spent.setText("0");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Balance");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("TRANSPORTATION");

        add10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add10.setText("Edit");
        add10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add10MouseClicked(evt);
            }
        });

        add4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add4.setText("Edit");
        add4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add4MouseClicked(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Spent");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DAILY LIVING");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Balance");

        add3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add3.setText("Edit");
        add3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add3MouseClicked(evt);
            }
        });

        net_balance_tf.setText("0");

        hl_tf_spent.setText("0");

        add7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add7.setText("Edit");
        add7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add7MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Balance");

        add5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add5.setText("Edit");
        add5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add5MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Spent");

        add6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add6.setText("Edit");
        add6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add6MouseClicked(evt);
            }
        });

        gr_tf_spent.setText("0");

        ed_tf_spent.setText("0");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Balance");

        amount_spent_tf.setText("0");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Spent");

        amount_spent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        amount_spent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amount_spent.setText("Amount Spent");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("DUES/SUBSCRIPTION");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Balance");

        add2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add2.setText("Edit");
        add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add2MouseClicked(evt);
            }
        });

        ot_tf_spent.setText("0");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("OTHERS");

        add9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add9.setText("Edit");
        add9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add9MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Balance");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("HEALTH CARE");

        add1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add1.setText("Edit");
        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add1MouseClicked(evt);
            }
        });

        balance_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        balance_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balance_label.setText("Balance");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Spent");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Spent");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Balance");

        dl_tf_spent.setText("0");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Spent");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Spent");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Spent");

        eb_tf_spent.setText("0");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("GROCERIES");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Balance");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("EDUCATION");

        jButton1.setText("BACK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        balance.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        balance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balance.setText("Net Balance");

        en_tf_spent.setText("0");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Balance");

        spent_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        spent_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spent_label.setText("Spent");

        hr_tf_spent.setText("0");

        du_tf_spent.setText("0");

        eb_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        eb_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eb_label.setText("ELECTRICITY BILL");

        house_rent_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        house_rent_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        house_rent_label.setText("HOUSE RENT");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Total Income");

        jButton2.setText("Finish");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(house_rent_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amount_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spent_label, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(amount_spent_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(net_balance_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(hr_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(balance_label, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hr_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(eb_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eb_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(eb_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(dl_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dl_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(gr_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gr_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(add4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(ed_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ed_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(add5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tr_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tr_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addComponent(add6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(hl_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hl_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(add7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(en_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(en_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(add8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(du_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(du_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(add9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ot_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ot_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(add10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(total_income_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_income_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount_spent_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(net_balance_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(house_rent_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spent_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hr_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balance_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hr_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(eb_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eb_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eb_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dl_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dl_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gr_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gr_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tr_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tr_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hl_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hl_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(en_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(en_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(du_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(du_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ot_tf_spent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ot_tf_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        //mainMenu mm = new mainMenu();
        //mm.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseClicked
        // TODO add your handling code here:
        int number1;
        int hr_bal;
        int hr_spent1;
        int amt_bal;
        int amt_spent;
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to be spent:"));
        String path = "./Budget.xml";
        System.out.println();
        try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(path);
         //house rent update
         Node house_rent = doc.getElementsByTagName("house_rent").item(0);
         NodeList b = house_rent.getChildNodes();
         Node element10 = b.item(0);
         Node element11 = b.item(1);
         Node element12 = b.item(2);
         
         hr_bal = Integer.parseInt(element11.getTextContent()) - number1;
         element11.setTextContent(Integer.toString(hr_bal));
         
         hr_spent1 = Integer.parseInt(element10.getTextContent()) - Integer.parseInt(element11.getTextContent());
         element12.setTextContent(Integer.toString(hr_spent1));
         
         hr_tf_bal.setText(element11.getTextContent());
         hr_tf_spent.setText(element12.getTextContent());
         //total value update
         Node total_income = doc.getElementsByTagName("total_income").item(0);
         NodeList a = total_income.getChildNodes();
         Node element00 = a.item(0);
         Node element01 = a.item(1);
         Node element02 = a.item(2);
         
         amt_bal = Integer.parseInt(element01.getTextContent()) - Integer.parseInt(element12.getTextContent());
         element01.setTextContent(Integer.toString(amt_bal));
         
         amt_spent = Integer.parseInt(element02.getTextContent()) + Integer.parseInt(element12.getTextContent());
         element02.setTextContent(Integer.toString(amt_spent));
         
         net_balance_tf.setText(element01.getTextContent());
         amount_spent_tf.setText(element02.getTextContent());
         
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource domSource = new DOMSource(doc);
         StreamResult streamResult = new StreamResult(new File(path));
         transformer.transform(domSource, streamResult);
            System.out.println("The XML File was ");
 
         
         
        }
        catch(Exception e)
        {
            System.out.println("error in updating house rent values!");
        }


        //Budget File
        /*try
            {
                FileInputStream fin = new FileInputStream(new File("./Budget.xml"));
                XMLDecoder decoder = new XMLDecoder(fin);
                medium m2 = (medium)decoder.readObject();
                decoder.close();
                fin.close();
                System.out.println("Read the old value : "+m2.getHr_budget_v());
                new_hr = m2.getHr_budget_v() - number1;
                System.out.println("Value to be inserted : "+new_hr);
                
                str_date = m2.getStr_date();
                en_date = m2.getEn_date();
                tot_income = Integer.parseInt(total_income_tf.getText());
                hr_budget_v = new_hr;
                eb_budget_v = Integer.parseInt(eb_tf_bal.getText());
                living_budget_v = Integer.parseInt(dl_tf_bal.getText());
                gro_budget_v = Integer.parseInt(gr_tf_bal.getText());
                edu_budget_v = Integer.parseInt(ed_tf_bal.getText());
                trans_budget_v = Integer.parseInt(tr_tf_bal.getText());
                health_budget_v = Integer.parseInt(hl_tf_bal.getText());
                entertain_budget_v = Integer.parseInt(en_tf_bal.getText());
                dues_budget_v = Integer.parseInt(du_tf_bal.getText());
                other_budget_v = Integer.parseInt(ot_tf_bal.getText());
                get_savings_v = m2.get_savings_v;
                medium m1 = new medium(str_date,en_date,tot_income,hr_budget_v,eb_budget_v,living_budget_v,gro_budget_v,edu_budget_v,trans_budget_v,health_budget_v,entertain_budget_v,dues_budget_v,other_budget_v,get_savings_v);
                try
                {
                FileOutputStream fout = new FileOutputStream(new File("./Budget.xml"));
                XMLEncoder encoder = new XMLEncoder(fout);
                encoder.writeObject(m1);
                encoder.close();
                fout.close();
                }
                catch(Exception e)
                {
                   System.out.println("Some error");
                }
                activity ac = new activity();
                //edit_budget ed = new edit_budget(m2);
                //ed.edit_hr(new_hr);
                //m2.setHr_budget_v(new_hr);
                System.out.println("Value has been inserted in file: "+m2.getHr_budget_v());
                hr_tf_bal.setText(Integer.toString(m2.getHr_budget_v()));
                System.out.println("Inserted new value in house rent balance");
            }
            catch(Exception e)
            {
                System.out.println("error in accessing file");
            }
        //Spent_Amount File
        try
            {
                FileInputStream fin = new FileInputStream(new File("./Spent_Amount.xml"));
                XMLDecoder decoder = new XMLDecoder(fin);
                spent_medium sm2 = (spent_medium)decoder.readObject();
                decoder.close();
                fin.close();
                if(sm2.getHr_tf_spent()==-5)
                {
                    int new_hr_spent = number1;
                    sm2.setHr_tf_spent(new_hr_spent);
                }
                else
                {
                    System.out.println("Read the old value");
                    int new_hr_spent = sm2.getHr_tf_spent() + number1;
                    sm2.setHr_tf_spent(new_hr_spent);
                    hr_tf_spent.setText(Integer.toString(sm2.getHr_tf_spent()));
                    System.out.println("Inserted new value in house rent");
                }
            }
            catch(Exception e)
            {
                System.out.println("error in accessing file");
            }*/
        
    }//GEN-LAST:event_add1MouseClicked

    private void add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add2MouseClicked
        // TODO add your handling code here:
        int number2;
        int eb_bal;
        int eb_spent1;
        int amt_bal;
        int amt_spent;
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to be spent:"));
        String path = "./Budget.xml";
        System.out.println();
        try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(path);
         
         Node e_bill = doc.getElementsByTagName("e_bill").item(0);
         NodeList c = e_bill.getChildNodes();
         Node element20 = c.item(0);
         Node element21 = c.item(1);
         Node element22 = c.item(2);
         
         
         eb_bal = Integer.parseInt(element21.getTextContent()) - number2;
         element21.setTextContent(Integer.toString(eb_bal));
         
         eb_spent1 = Integer.parseInt(element20.getTextContent()) - Integer.parseInt(element21.getTextContent());
         element22.setTextContent(Integer.toString(eb_spent1));
         
         eb_tf_bal.setText(element21.getTextContent());
         eb_tf_spent.setText(element22.getTextContent());
         
         //total value update
         Node total_income = doc.getElementsByTagName("total_income").item(0);
         NodeList a = total_income.getChildNodes();
         Node element00 = a.item(0);
         Node element01 = a.item(1);
         Node element02 = a.item(2);
         
         amt_bal = Integer.parseInt(element01.getTextContent()) - Integer.parseInt(element22.getTextContent());
         element01.setTextContent(Integer.toString(amt_bal));
         
         amt_spent = Integer.parseInt(element02.getTextContent()) + Integer.parseInt(element22.getTextContent());
         element02.setTextContent(Integer.toString(amt_spent));
         
         net_balance_tf.setText(element01.getTextContent());
         amount_spent_tf.setText(element02.getTextContent());
         
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource domSource = new DOMSource(doc);
         StreamResult streamResult = new StreamResult(new File(path));
         transformer.transform(domSource, streamResult);
            System.out.println("The XML File was "); 
        }
        catch(Exception e)
        {
            System.out.println("error in updating e-bill values!");
        }
    }//GEN-LAST:event_add2MouseClicked

    private void add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add3MouseClicked
        // TODO add your handling code here:
        int number3;
        int dl_bal;
        int dl_spent1;
        int amt_bal;
        int amt_spent;
        number3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to be spent:"));
        String path = "./Budget.xml";
        System.out.println();
        try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(path);
         
         Node living_budget = doc.getElementsByTagName("living_budget").item(0);
         NodeList d = living_budget.getChildNodes();
         Node element30 = d.item(0);
         Node element31 = d.item(1);
         Node element32 = d.item(2);
         
         
         dl_bal = Integer.parseInt(element31.getTextContent()) - number3;
         element31.setTextContent(Integer.toString(dl_bal));
         
         dl_spent1 = Integer.parseInt(element30.getTextContent()) - Integer.parseInt(element31.getTextContent());
         element32.setTextContent(Integer.toString(dl_spent1));
         
         dl_tf_bal.setText(element31.getTextContent());
         dl_tf_spent.setText(element32.getTextContent());
         
         //total value update
         Node total_income = doc.getElementsByTagName("total_income").item(0);
         NodeList a = total_income.getChildNodes();
         Node element00 = a.item(0);
         Node element01 = a.item(1);
         Node element02 = a.item(2);
         
         amt_bal = Integer.parseInt(element01.getTextContent()) - Integer.parseInt(element32.getTextContent());
         element01.setTextContent(Integer.toString(amt_bal));
         
         amt_spent = Integer.parseInt(element02.getTextContent()) + Integer.parseInt(element32.getTextContent());
         element02.setTextContent(Integer.toString(amt_spent));
         
         net_balance_tf.setText(element01.getTextContent());
         amount_spent_tf.setText(element02.getTextContent());
         
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource domSource = new DOMSource(doc);
         StreamResult streamResult = new StreamResult(new File(path));
         transformer.transform(domSource, streamResult);
            System.out.println("The XML File was "); 
        }
        catch(Exception e)
        {
            System.out.println("error in updating living budget values!");
        }
    }//GEN-LAST:event_add3MouseClicked

    private void add4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add4MouseClicked
        // TODO add your handling code here:
        int number4;
        int gro_bal;
        int gro_spent1;
        int amt_bal;
        int amt_spent;
        number4 = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to be spent:"));
        String path = "./Budget.xml";
        System.out.println();
        try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(path);
         
         Node grocery = doc.getElementsByTagName("grocery").item(0);
         NodeList e = grocery.getChildNodes();
         Node element40 = e.item(0);
         Node element41 = e.item(1);
         Node element42 = e.item(2);
         
         
         gro_bal = Integer.parseInt(element41.getTextContent()) - number4;
         element41.setTextContent(Integer.toString(gro_bal));
         
         gro_spent1 = Integer.parseInt(element40.getTextContent()) - Integer.parseInt(element41.getTextContent());
         element42.setTextContent(Integer.toString(gro_spent1));
         
         gr_tf_bal.setText(element41.getTextContent());
         gr_tf_spent.setText(element42.getTextContent());
         
         //total value update
         Node total_income = doc.getElementsByTagName("total_income").item(0);
         NodeList a = total_income.getChildNodes();
         Node element00 = a.item(0);
         Node element01 = a.item(1);
         Node element02 = a.item(2);
         
         amt_bal = Integer.parseInt(element01.getTextContent()) - Integer.parseInt(element42.getTextContent());
         element01.setTextContent(Integer.toString(amt_bal));
         
         amt_spent = Integer.parseInt(element02.getTextContent()) + Integer.parseInt(element42.getTextContent());
         element02.setTextContent(Integer.toString(amt_spent));
         
         net_balance_tf.setText(element01.getTextContent());
         amount_spent_tf.setText(element02.getTextContent());
         
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource domSource = new DOMSource(doc);
         StreamResult streamResult = new StreamResult(new File(path));
         transformer.transform(domSource, streamResult);
            System.out.println("The XML File was "); 
        }
        catch(Exception e)
        {
            System.out.println("error in updating grocery values!");
        }
    }//GEN-LAST:event_add4MouseClicked

    private void add5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add5MouseClicked
        // TODO add your handling code here:
        int number5;
        int ed_bal;
        int ed_spent1;
        int amt_bal;
        int amt_spent;
        number5 = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to be spent:"));
        String path = "./Budget.xml";
        System.out.println();
        try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(path);
         
         Node education = doc.getElementsByTagName("education").item(0);
         NodeList f = education.getChildNodes();
         Node element50 = f.item(0);
         Node element51 = f.item(1);
         Node element52 = f.item(2);
         
         
         ed_bal = Integer.parseInt(element51.getTextContent()) - number5;
         element51.setTextContent(Integer.toString(ed_bal));
         
         ed_spent1 = Integer.parseInt(element50.getTextContent()) - Integer.parseInt(element51.getTextContent());
         element52.setTextContent(Integer.toString(ed_spent1));
         
         ed_tf_bal.setText(element51.getTextContent());
         ed_tf_spent.setText(element52.getTextContent());
         
         //total value update
         Node total_income = doc.getElementsByTagName("total_income").item(0);
         NodeList a = total_income.getChildNodes();
         Node element00 = a.item(0);
         Node element01 = a.item(1);
         Node element02 = a.item(2);
         
         amt_bal = Integer.parseInt(element01.getTextContent()) - Integer.parseInt(element52.getTextContent());
         element01.setTextContent(Integer.toString(amt_bal));
         
         amt_spent = Integer.parseInt(element02.getTextContent()) + Integer.parseInt(element52.getTextContent());
         element02.setTextContent(Integer.toString(amt_spent));
         
         net_balance_tf.setText(element01.getTextContent());
         amount_spent_tf.setText(element02.getTextContent());
         
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource domSource = new DOMSource(doc);
         StreamResult streamResult = new StreamResult(new File(path));
         transformer.transform(domSource, streamResult);
            System.out.println("The XML File was "); 
        }
        catch(Exception e)
        {
            System.out.println("error in updating education values!");
        }
    }//GEN-LAST:event_add5MouseClicked

    private void add6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add6MouseClicked
        // TODO add your handling code here:
        int number6;
        int tr_bal;
        int tr_spent1;
        int amt_bal;
        int amt_spent;
        number6 = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to be spent:"));
        String path = "./Budget.xml";
        System.out.println();
        try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(path);
         
         Node transport = doc.getElementsByTagName("transport").item(0);
         NodeList g = transport.getChildNodes();
         Node element60 = g.item(0);
         Node element61 = g.item(1);
         Node element62 = g.item(2);
         
         
         tr_bal = Integer.parseInt(element61.getTextContent()) - number6;
         element61.setTextContent(Integer.toString(tr_bal));
         
         tr_spent1 = Integer.parseInt(element60.getTextContent()) - Integer.parseInt(element61.getTextContent());
         element62.setTextContent(Integer.toString(tr_spent1));
         
         tr_tf_bal.setText(element61.getTextContent());
         tr_tf_spent.setText(element62.getTextContent());
         
         //total value update
         Node total_income = doc.getElementsByTagName("total_income").item(0);
         NodeList a = total_income.getChildNodes();
         Node element00 = a.item(0);
         Node element01 = a.item(1);
         Node element02 = a.item(2);
         
         amt_bal = Integer.parseInt(element01.getTextContent()) - Integer.parseInt(element62.getTextContent());
         element01.setTextContent(Integer.toString(amt_bal));
         
         amt_spent = Integer.parseInt(element02.getTextContent()) + Integer.parseInt(element62.getTextContent());
         element02.setTextContent(Integer.toString(amt_spent));
         
         net_balance_tf.setText(element01.getTextContent());
         amount_spent_tf.setText(element02.getTextContent());
         
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource domSource = new DOMSource(doc);
         StreamResult streamResult = new StreamResult(new File(path));
         transformer.transform(domSource, streamResult);
            System.out.println("The XML File was "); 
        }
        catch(Exception e)
        {
            System.out.println("error in updating transport values!");
        }
    }//GEN-LAST:event_add6MouseClicked

    private void add7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add7MouseClicked
        // TODO add your handling code here:
        int number7;
        int hl_bal;
        int hl_spent1;
        int amt_bal;
        int amt_spent;
        number7 = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to be spent:"));
        String path = "./Budget.xml";
        System.out.println();
        try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(path);
         
         Node health = doc.getElementsByTagName("health").item(0);
         NodeList h = health.getChildNodes();
         Node element70 = h.item(0);
         Node element71 = h.item(1);
         Node element72 = h.item(2);
         
         
         hl_bal = Integer.parseInt(element71.getTextContent()) - number7;
         element71.setTextContent(Integer.toString(hl_bal));
         
         hl_spent1 = Integer.parseInt(element70.getTextContent()) - Integer.parseInt(element71.getTextContent());
         element72.setTextContent(Integer.toString(hl_spent1));
         
         hl_tf_bal.setText(element71.getTextContent());
         hl_tf_spent.setText(element72.getTextContent());
         
         //total value update
         Node total_income = doc.getElementsByTagName("total_income").item(0);
         NodeList a = total_income.getChildNodes();
         Node element00 = a.item(0);
         Node element01 = a.item(1);
         Node element02 = a.item(2);
         
         amt_bal = Integer.parseInt(element01.getTextContent()) - Integer.parseInt(element72.getTextContent());
         element01.setTextContent(Integer.toString(amt_bal));
         
         amt_spent = Integer.parseInt(element02.getTextContent()) + Integer.parseInt(element72.getTextContent());
         element02.setTextContent(Integer.toString(amt_spent));
         
         net_balance_tf.setText(element01.getTextContent());
         amount_spent_tf.setText(element02.getTextContent());
         
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource domSource = new DOMSource(doc);
         StreamResult streamResult = new StreamResult(new File(path));
         transformer.transform(domSource, streamResult);
            System.out.println("The XML File was "); 
        }
        catch(Exception e)
        {
            System.out.println("error in updating health values!");
        }
    }//GEN-LAST:event_add7MouseClicked

    private void add8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add8MouseClicked
        // TODO add your handling code here:
        int number8;
        int en_bal;
        int en_spent1;
        int amt_bal;
        int amt_spent;
        number8 = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to be spent:"));
        String path = "./Budget.xml";
        System.out.println();
        try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(path);
         
         Node entertainment = doc.getElementsByTagName("entertainment").item(0);
         NodeList i = entertainment.getChildNodes();
         Node element80 = i.item(0);
         Node element81 = i.item(1);
         Node element82 = i.item(2);
         
         
         en_bal = Integer.parseInt(element81.getTextContent()) - number8;
         element81.setTextContent(Integer.toString(en_bal));
         
         en_spent1 = Integer.parseInt(element80.getTextContent()) - Integer.parseInt(element81.getTextContent());
         element82.setTextContent(Integer.toString(en_spent1));
         
         en_tf_bal.setText(element81.getTextContent());
         en_tf_spent.setText(element82.getTextContent());
         
         //total value update
         Node total_income = doc.getElementsByTagName("total_income").item(0);
         NodeList a = total_income.getChildNodes();
         Node element00 = a.item(0);
         Node element01 = a.item(1);
         Node element02 = a.item(2);
         
         amt_bal = Integer.parseInt(element01.getTextContent()) - Integer.parseInt(element82.getTextContent());
         element01.setTextContent(Integer.toString(amt_bal));
         
         amt_spent = Integer.parseInt(element02.getTextContent()) + Integer.parseInt(element82.getTextContent());
         element02.setTextContent(Integer.toString(amt_spent));
         
         net_balance_tf.setText(element01.getTextContent());
         amount_spent_tf.setText(element02.getTextContent());
         
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource domSource = new DOMSource(doc);
         StreamResult streamResult = new StreamResult(new File(path));
         transformer.transform(domSource, streamResult);
            System.out.println("The XML File was "); 
        }
        catch(Exception e)
        {
            System.out.println("error in updating entertainment values!");
        }
    }//GEN-LAST:event_add8MouseClicked

    private void add9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add9MouseClicked
        // TODO add your handling code here:
        int number9;
        int du_bal;
        int du_spent1;
        int amt_bal;
        int amt_spent;
        number9 = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to be spent:"));
        String path = "./Budget.xml";
        System.out.println();
        try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(path);
         
         Node dues = doc.getElementsByTagName("dues").item(0);
         NodeList j = dues.getChildNodes();
         Node element90 = j.item(0);
         Node element91 = j.item(1);
         Node element92 = j.item(2);
         
         
         du_bal = Integer.parseInt(element91.getTextContent()) - number9;
         element91.setTextContent(Integer.toString(du_bal));
         
         du_spent1 = Integer.parseInt(element90.getTextContent()) - Integer.parseInt(element91.getTextContent());
         element92.setTextContent(Integer.toString(du_spent1));
         
         du_tf_bal.setText(element91.getTextContent());
         du_tf_spent.setText(element92.getTextContent());
         
         //total value update
         Node total_income = doc.getElementsByTagName("total_income").item(0);
         NodeList a = total_income.getChildNodes();
         Node element00 = a.item(0);
         Node element01 = a.item(1);
         Node element02 = a.item(2);
         
         amt_bal = Integer.parseInt(element01.getTextContent()) - Integer.parseInt(element92.getTextContent());
         element01.setTextContent(Integer.toString(amt_bal));
         
         amt_spent = Integer.parseInt(element02.getTextContent()) + Integer.parseInt(element92.getTextContent());
         element02.setTextContent(Integer.toString(amt_spent));
         
         net_balance_tf.setText(element01.getTextContent());
         amount_spent_tf.setText(element02.getTextContent());
         
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource domSource = new DOMSource(doc);
         StreamResult streamResult = new StreamResult(new File(path));
         transformer.transform(domSource, streamResult);
            System.out.println("The XML File was "); 
        }
        catch(Exception e)
        {
            System.out.println("error in updating dues values!");
        }
    }//GEN-LAST:event_add9MouseClicked

    private void add10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add10MouseClicked
        // TODO add your handling code here:
        int number10;
        int ot_bal;
        int ot_spent1;
        int amt_bal;
        int amt_spent;
        number10 = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to be spent:"));
        String path = "./Budget.xml";
        System.out.println();
        try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(path);
         
         Node other = doc.getElementsByTagName("other").item(0);
         NodeList k = other.getChildNodes();
         Node element100 = k.item(0);
         Node element101 = k.item(1);
         Node element102 = k.item(2);
         
         
         ot_bal = Integer.parseInt(element101.getTextContent()) - number10;
         element101.setTextContent(Integer.toString(ot_bal));
         
         ot_spent1 = Integer.parseInt(element100.getTextContent()) - Integer.parseInt(element101.getTextContent());
         element102.setTextContent(Integer.toString(ot_spent1));
         
         ot_tf_bal.setText(element101.getTextContent());
         ot_tf_spent.setText(element102.getTextContent());
         
         //total value update
         Node total_income = doc.getElementsByTagName("total_income").item(0);
         NodeList a = total_income.getChildNodes();
         Node element00 = a.item(0);
         Node element01 = a.item(1);
         Node element02 = a.item(2);
         
         amt_bal = Integer.parseInt(element01.getTextContent()) - Integer.parseInt(element102.getTextContent());
         element01.setTextContent(Integer.toString(amt_bal));
         
         amt_spent = Integer.parseInt(element02.getTextContent()) + Integer.parseInt(element102.getTextContent());
         element02.setTextContent(Integer.toString(amt_spent));
         
         net_balance_tf.setText(element01.getTextContent());
         amount_spent_tf.setText(element02.getTextContent());
         
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource domSource = new DOMSource(doc);
         StreamResult streamResult = new StreamResult(new File(path));
         transformer.transform(domSource, streamResult);
            System.out.println("The XML File was "); 
        }
        catch(Exception e)
        {
            System.out.println("error in updating other values!");
        }
    }//GEN-LAST:event_add10MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        yn = JOptionPane.showInputDialog("Initialize the block (Y/N):");
        lastfile lf = new lastfile();
        String path = "./Budget.xml";
        File f = new File(path);
        if(f.delete())
        {
            JOptionPane.showMessageDialog(null,"Budget File has been deleted!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Error in deleting budget file!!");
        }
        this.dispose();
        //JOptionPane.showMessageDialog(null,"Block created.Create a new budget","Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new activity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add1;
    private javax.swing.JLabel add10;
    private javax.swing.JLabel add2;
    private javax.swing.JLabel add3;
    private javax.swing.JLabel add4;
    private javax.swing.JLabel add5;
    private javax.swing.JLabel add6;
    private javax.swing.JLabel add7;
    private javax.swing.JLabel add8;
    private javax.swing.JLabel add9;
    private javax.swing.JLabel amount_spent;
    public static javax.swing.JTextField amount_spent_tf;
    private javax.swing.JLabel balance;
    private javax.swing.JLabel balance_label;
    private javax.swing.JTextField dl_tf_bal;
    public static javax.swing.JTextField dl_tf_spent;
    private javax.swing.JTextField du_tf_bal;
    public static javax.swing.JTextField du_tf_spent;
    private javax.swing.JLabel eb_label;
    private javax.swing.JTextField eb_tf_bal;
    public static javax.swing.JTextField eb_tf_spent;
    private javax.swing.JTextField ed_tf_bal;
    public static javax.swing.JTextField ed_tf_spent;
    private javax.swing.JTextField en_tf_bal;
    public static javax.swing.JTextField en_tf_spent;
    private javax.swing.JTextField gr_tf_bal;
    public static javax.swing.JTextField gr_tf_spent;
    private javax.swing.JTextField hl_tf_bal;
    public static javax.swing.JTextField hl_tf_spent;
    private javax.swing.JLabel house_rent_label;
    private javax.swing.JTextField hr_tf_bal;
    public static javax.swing.JTextField hr_tf_spent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField net_balance_tf;
    private javax.swing.JTextField ot_tf_bal;
    public static javax.swing.JTextField ot_tf_spent;
    private javax.swing.JLabel spent_label;
    private javax.swing.JTextField total_income_tf;
    private javax.swing.JTextField tr_tf_bal;
    public static javax.swing.JTextField tr_tf_spent;
    // End of variables declaration//GEN-END:variables
}
