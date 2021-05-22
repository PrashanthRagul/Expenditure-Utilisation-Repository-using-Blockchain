/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.File;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

/**
 *
 * @author Asif
 */
public class mainMenu extends javax.swing.JFrame {

    /**
     * Creates new form mainMenu
     */
    public String uname;
    public String pswd;
    public static String str_date0;
    public static String en_date0;
    public static String str_date;
    public static String en_date;
    public static int income;
    public static int ot_income;
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
    
    public int net_balance_v;
    public int amount_spent_v;
    public int hr_v_spent;
    public int eb_v_spent;
    public int dl_v_spent;
    public int gr_v_spent;
    public int edu_v_spent;
    public int tr_v_spent;
    public int hl_v_spent;
    public int en_v_spent;
    public int du_v_spent;
    public int ot_v_spent;
    public mainMenu() {
        //this.uname = uname;
        //this.pswd = pswd;
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        //this.setSize(800,600);
	//	this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                //budget panel
                createBudget.setEnabled(false);
                createBudget.setVisible(false);
                budget1.setEnabled(false);
                budget1.setVisible(false);
                //date to pop up with budget panel
                date.setEnabled(false);
                date.setVisible(false);
                datelabel.setEnabled(false);
                datelabel.setVisible(false);
                //date calendar
                jDatestart.setEnabled(false);
                jDatestart.setVisible(false);
                jDateend.setEnabled(false);
                jDateend.setVisible(false);
                //after date , salary panel to pop up
                /*salary.setEnabled(false);
                salary.setVisible(false);
                income_label.setEnabled(false);
                income_label.setVisible(false);
                mon_income.setEnabled(false);
                mon_income.setVisible(false);
                other_source.setEnabled(false);
                other_source.setVisible(false);
                get_income.setEnabled(false);
                get_income.setVisible(false);
                get_ot_income.setEnabled(false);
                get_ot_income.setVisible(false);
                income_nxt.setEnabled(false);
                income_nxt.setVisible(false);*/
                income_jPanel.setEnabled(false);
                income_jPanel.setVisible(false);
                //budget framing
                budget_frame_jPanel.setEnabled(false);
                budget_frame_jPanel.setVisible(false);
                other_source_jPanel.setEnabled(false);
                other_source_jPanel.setVisible(false);
                //savings frame
                savings_jPanel.setEnabled(false);
                savings_jPanel.setVisible(false);
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        income_jPanel = new javax.swing.JPanel();
        income_label = new javax.swing.JLabel();
        mon_income = new javax.swing.JLabel();
        other_source = new javax.swing.JLabel();
        get_income = new javax.swing.JTextField();
        get_ot_income = new javax.swing.JTextField();
        income_nxt = new javax.swing.JLabel();
        savings_jPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        get_savings = new javax.swing.JTextField();
        budget_frame_label2 = new javax.swing.JLabel();
        savings = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        other_source_jPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        other_budget_title = new javax.swing.JLabel();
        entertain = new javax.swing.JLabel();
        dues = new javax.swing.JLabel();
        others = new javax.swing.JLabel();
        health = new javax.swing.JLabel();
        entertain_budget = new javax.swing.JTextField();
        dues_budget = new javax.swing.JTextField();
        other_budget = new javax.swing.JTextField();
        health_budget = new javax.swing.JTextField();
        budget_nxt1 = new javax.swing.JLabel();
        budget_frame_label1 = new javax.swing.JLabel();
        jDateend = new com.toedter.calendar.JDateChooser();
        end_date = new javax.swing.JLabel();
        start_date = new javax.swing.JLabel();
        jDatestart = new com.toedter.calendar.JDateChooser();
        datelabel = new javax.swing.JLabel();
        date_nxt = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        budget_frame_jPanel = new javax.swing.JPanel();
        house_rent = new javax.swing.JLabel();
        budget_title = new javax.swing.JLabel();
        hr_budget = new javax.swing.JTextField();
        living = new javax.swing.JLabel();
        groceries = new javax.swing.JLabel();
        electricity = new javax.swing.JLabel();
        education = new javax.swing.JLabel();
        transport = new javax.swing.JLabel();
        eb_budget = new javax.swing.JTextField();
        living_budget = new javax.swing.JTextField();
        gro_budget = new javax.swing.JTextField();
        edu_budget = new javax.swing.JTextField();
        trans_budget = new javax.swing.JTextField();
        budget_frame_label = new javax.swing.JLabel();
        createBudget = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        right_tab = new javax.swing.JLabel();
        add_acc = new javax.swing.JButton();
        activity = new javax.swing.JButton();
        logs = new javax.swing.JButton();
        budget = new javax.swing.JButton();
        budget1 = new javax.swing.JButton();
        acct = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        left_tab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(890, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        income_jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        income_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        income_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        income_label.setText("INCOME SOURCES");
        income_jPanel.add(income_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 130, 20));

        mon_income.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mon_income.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mon_income.setText("MONTHLY INCOME");
        income_jPanel.add(mon_income, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 20));

        other_source.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        other_source.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        other_source.setText("OTHER SOURCES");
        income_jPanel.add(other_source, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 140, 20));
        income_jPanel.add(get_income, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 110, 30));
        income_jPanel.add(get_ot_income, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 110, 30));

        income_nxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        income_nxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        income_nxt.setText("NEXT");
        income_nxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                income_nxtMouseClicked(evt);
            }
        });
        income_jPanel.add(income_nxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 60, 20));

        jPanel1.add(income_jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 360, 190));

        savings_jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("FINISH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        savings_jPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, 40));
        savings_jPanel.add(get_savings, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 140, -1));

        budget_frame_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        budget_frame_label2.setIcon(new javax.swing.ImageIcon("E:\\SEM 5\\srp\\photos\\white.jpg")); // NOI18N
        savings_jPanel.add(budget_frame_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, 250, 710, 90));

        savings.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        savings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savings.setText("SAVINGS PER MONTH");
        date.add(datelabel);
        savings_jPanel.add(savings, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 190, 20));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\SEM 5\\srp\\photos\\white.jpg")); // NOI18N
        savings_jPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 710, 90));

        jPanel1.add(savings_jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 710, 90));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 710, 90));

        other_source_jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\SEM 5\\srp\\photos\\white.jpg")); // NOI18N
        other_source_jPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 350, 250));

        other_budget_title.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        other_budget_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        other_budget_title.setText("OTHER BUDGET");
        date.add(datelabel);
        other_source_jPanel.add(other_budget_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 140, 20));

        entertain.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        entertain.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        entertain.setText("Entertainment");
        date.add(datelabel);
        other_source_jPanel.add(entertain, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, 20));

        dues.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dues.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dues.setText("Dues/Subscription");
        date.add(datelabel);
        other_source_jPanel.add(dues, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 130, 20));

        others.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        others.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        others.setText("Others");
        date.add(datelabel);
        other_source_jPanel.add(others, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 20));

        health.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        health.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        health.setText("Health care");
        date.add(datelabel);
        other_source_jPanel.add(health, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, 20));
        other_source_jPanel.add(entertain_budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 110, 25));
        other_source_jPanel.add(dues_budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 110, 25));
        other_source_jPanel.add(other_budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 110, 25));
        other_source_jPanel.add(health_budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 110, 25));

        budget_nxt1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        budget_nxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        budget_nxt1.setText("NEXT");
        budget_nxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                budget_nxt1MouseClicked(evt);
            }
        });
        other_source_jPanel.add(budget_nxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 50, 20));

        budget_frame_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        budget_frame_label1.setIcon(new javax.swing.ImageIcon("E:\\SEM 5\\srp\\photos\\white.jpg")); // NOI18N
        other_source_jPanel.add(budget_frame_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 250));

        jPanel1.add(other_source_jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 350, 250));
        jPanel1.add(jDateend, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 130, -1));

        end_date.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        end_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        end_date.setText("END DATE");
        jPanel1.add(end_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 100, 20));

        start_date.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        start_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        start_date.setText("START DATE");
        jPanel1.add(start_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 100, 20));
        jPanel1.add(jDatestart, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 130, -1));

        datelabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        datelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datelabel.setText("BUDGET INTERVAL");
        date.add(datelabel);
        jPanel1.add(datelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 140, 20));

        date_nxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        date_nxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date_nxt.setText("NEXT");
        date_nxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                date_nxtMouseClicked(evt);
            }
        });
        jPanel1.add(date_nxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 60, 20));

        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setIcon(new javax.swing.ImageIcon("E:\\SEM 5\\srp\\photos\\white.jpg")); // NOI18N
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 350, 190));

        budget_frame_jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        house_rent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        house_rent.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        house_rent.setText("House Rent");
        date.add(datelabel);
        budget_frame_jPanel.add(house_rent, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        budget_title.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        budget_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        budget_title.setText("FRAMING BUDGET");
        date.add(datelabel);
        budget_frame_jPanel.add(budget_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 140, 20));
        budget_frame_jPanel.add(hr_budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 110, 25));

        living.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        living.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        living.setText("Daily Living");
        date.add(datelabel);
        budget_frame_jPanel.add(living, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 20));

        groceries.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        groceries.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        groceries.setText("Groceries");
        date.add(datelabel);
        budget_frame_jPanel.add(groceries, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 20));

        electricity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        electricity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        electricity.setText("Electricity Bill");
        date.add(datelabel);
        budget_frame_jPanel.add(electricity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 20));

        education.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        education.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        education.setText("Education");
        date.add(datelabel);
        budget_frame_jPanel.add(education, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 100, 20));

        transport.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        transport.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        transport.setText("Transportation");
        date.add(datelabel);
        budget_frame_jPanel.add(transport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 20));

        eb_budget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eb_budgetActionPerformed(evt);
            }
        });
        budget_frame_jPanel.add(eb_budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 110, 25));
        budget_frame_jPanel.add(living_budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 110, 25));

        gro_budget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gro_budgetActionPerformed(evt);
            }
        });
        budget_frame_jPanel.add(gro_budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, 25));
        budget_frame_jPanel.add(edu_budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 110, 25));

        trans_budget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trans_budgetActionPerformed(evt);
            }
        });
        budget_frame_jPanel.add(trans_budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, 25));

        budget_frame_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        budget_frame_label.setIcon(new javax.swing.ImageIcon("E:\\SEM 5\\srp\\photos\\white.jpg")); // NOI18N
        budget_frame_jPanel.add(budget_frame_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 250));

        jPanel1.add(budget_frame_jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 360, 250));

        createBudget.setBackground(new java.awt.Color(255, 0, 0));
        createBudget.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createBudget.setIcon(new javax.swing.ImageIcon("E:\\Make It Personal\\1080p\\HD\\Black-Background-Collapsar-by-Freeman.jpg")); // NOI18N
        jPanel1.add(createBudget, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 710, 530));

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 80, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Problem in account managing?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 200, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\SEM 5\\srp\\photos\\cloud.jpg")); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 260, 160));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Having problems in Budgets?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\SEM 5\\srp\\photos\\cloud.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 260, 160));

        right_tab.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        right_tab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        right_tab.setIcon(new javax.swing.ImageIcon("E:\\Make It Personal\\1080p\\HD\\unnamed.jpg")); // NOI18N
        jPanel1.add(right_tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 710, 530));

        add_acc.setBackground(new java.awt.Color(0, 153, 0));
        add_acc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add_acc.setText("Add Account +");
        add_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_accActionPerformed(evt);
            }
        });
        jPanel1.add(add_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 180, 40));

        activity.setBackground(new java.awt.Color(255, 255, 51));
        activity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        activity.setText("My Activity");
        activity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activityMouseClicked(evt);
            }
        });
        jPanel1.add(activity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 180, 40));

        logs.setBackground(new java.awt.Color(0, 0, 255));
        logs.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logs.setText("Previous Logs");
        logs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logsMouseClicked(evt);
            }
        });
        jPanel1.add(logs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, 40));

        budget.setBackground(new java.awt.Color(255, 0, 0));
        budget.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        budget.setText("Create Budget");
        budget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                budgetMouseClicked(evt);
            }
        });
        jPanel1.add(budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 180, 40));

        budget1.setBackground(new java.awt.Color(255, 0, 0));
        budget1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        budget1.setText("Create Budget");
        budget1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                budget1MouseClicked(evt);
            }
        });
        jPanel1.add(budget1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 180, 40));

        acct.setBackground(new java.awt.Color(51, 51, 51));
        acct.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        acct.setText("MY ACCOUNT");
        acct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acctActionPerformed(evt);
            }
        });
        jPanel1.add(acct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 180, 40));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon("E:\\SEM 5\\srp\\photos\\logo.png")); // NOI18N
        icon.setText("jLabel2");
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 180, 200));

        left_tab.setBackground(new java.awt.Color(102, 102, 102));
        left_tab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left_tab.setIcon(new javax.swing.ImageIcon("E:\\Make It Personal\\1080p\\HD\\Black-Background-Collapsar-by-Freeman.jpg")); // NOI18N
        jPanel1.add(left_tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        homepage h = new homepage();
        h.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void budgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_budgetMouseClicked
        /*createBudget.setEnabled(true);
        createBudget.setVisible(true);
        date.setEnabled(true);
        date.setVisible(true);
        budget1.setEnabled(true);
        budget1.setVisible(true);
        datelabel.setEnabled(true);
        datelabel.setVisible(true);
        jDatestart.setEnabled(true);
        jDatestart.setVisible(true);
        jDateend.setEnabled(true);
        jDateend.setVisible(true);
        budget_frame_jPanel.setEnabled(false);
        budget_frame_jPanel.setVisible(false);
        other_source_jPanel.setEnabled(false);
        other_source_jPanel.setVisible(false);
        budget.setEnabled(false);
        budget.setVisible(false);*/
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
        LocalDateTime now = LocalDateTime.now();
        String sys_date = dtf.format(now);
        System.out.println(sys_date);
        File f = new File("./Budget.xml");
        if(f.exists())
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
                str_date0 = str_date.getTextContent();
         
                Node end_date = doc.getElementsByTagName("end_date").item(0);
                NodeList b = end_date.getChildNodes();
                Node en_date = b.item(0);
                en_date0 = en_date.getTextContent();
            }
            catch(Exception e)
            {
                System.out.println("Error in accessing date variables");
            }
            if(sys_date.compareTo(en_date0)>0)
            {   
                //first frame previous budget then continue
                //lastfile lf = new lastfile();
                //delete(budget.xml);
                JOptionPane.showMessageDialog(null,"Previous Budget not framed yet!","Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Budget Already created","Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        else
        {
            /*try
            {
            FileInputStream fin = new FileInputStream(new File("./Budget.xml"));
            XMLDecoder decoder = new XMLDecoder(fin);
            medium m2 = (medium)decoder.readObject();
            decoder.close();
            fin.close();
            
            System.out.println("File(str_date) : "+m2.getStr_date());
            System.out.println("File(en_date) : "+m2.getEn_date());
            String check1 = m2.getStr_date();
            String check2 = m2.getEn_date();
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
            LocalDateTime now = LocalDateTime.now();
            String sys_date = dtf.format(now);
            System.out.println(sys_date);
            
            if(sys_date.compareTo(check1)>=0 && sys_date.compareTo(check2)<=0 )
            {
                JOptionPane.showMessageDialog(null,"Budget Already created","Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {*/
                createBudget.setEnabled(true);
                createBudget.setVisible(true);
                date.setEnabled(true);
                date.setVisible(true);
                budget1.setEnabled(true);
                budget1.setVisible(true);
                datelabel.setEnabled(true);
                datelabel.setVisible(true);
                jDatestart.setEnabled(true);
                jDatestart.setVisible(true);
                jDateend.setEnabled(true);
                jDateend.setVisible(true);
                budget_frame_jPanel.setEnabled(false);
                budget_frame_jPanel.setVisible(false);
                other_source_jPanel.setEnabled(false);
                other_source_jPanel.setVisible(false);
                budget.setEnabled(false);
                budget.setVisible(false);
                
                System.out.println("go ahead");
            }
            //}
            //catch(Exception e)
           // {
             //   System.out.println("error in reading date from file");
            //}
        //}    
    }//GEN-LAST:event_budgetMouseClicked

    private void budget1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_budget1MouseClicked
        createBudget.setEnabled(false);
        createBudget.setVisible(false);
        date.setEnabled(false);
        date.setVisible(false);
        datelabel.setEnabled(false);
        datelabel.setVisible(false);
        
        budget1.setEnabled(false);
        budget1.setVisible(false);
        jDatestart.setEnabled(false);
        jDatestart.setVisible(false);
        jDateend.setEnabled(false);
        jDateend.setVisible(false);
        //salary details off
        /*income_label.setEnabled(false);
        income_label.setVisible(false);
        mon_income.setEnabled(false);
        mon_income.setVisible(false);
        other_source.setEnabled(false);
        other_source.setVisible(false);
        get_income.setEnabled(false);
        get_income.setVisible(false);
        get_ot_income.setEnabled(false);
        get_ot_income.setVisible(false);
        income_nxt.setEnabled(false);
        income_nxt.setVisible(false);
        salary.setEnabled(false);
        salary.setVisible(false);*/
        income_jPanel.setEnabled(false);
        income_jPanel.setVisible(false);
        
        budget_frame_jPanel.setEnabled(false);
        budget_frame_jPanel.setVisible(false);
        other_source_jPanel.setEnabled(false);
        other_source_jPanel.setVisible(false);
        
        savings_jPanel.setEnabled(false);
        savings_jPanel.setVisible(false);
        
        budget.setEnabled(true);
        budget.setVisible(true);
    }//GEN-LAST:event_budget1MouseClicked

    private void logsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logsMouseClicked
        previewLog pl = new previewLog();
        pl.setVisible(true);
    }//GEN-LAST:event_logsMouseClicked

    private void date_nxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_date_nxtMouseClicked
        //String start_date  = ((JTextField)jDatestart.getDateEditor().getUiComponent()).getText();
        //String end_date  = ((JTextField)jDateend.getDateEditor().getUiComponent()).getText();
        
        
        //Date newDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date start_date =jDatestart.getDate();
        
        Date end_date =jDateend.getDate();
        
        if(start_date==null || end_date==null)
        {
            JOptionPane.showMessageDialog(null,"Date Missing","Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            str_date = dateFormat.format(start_date);
        System.out.println(str_date);
            en_date = dateFormat.format(end_date);
        System.out.println(en_date);
            /*salary.setEnabled(true);
            salary.setVisible(true);
            income_label.setEnabled(true);
            income_label.setVisible(true);
            mon_income.setEnabled(true);
            mon_income.setVisible(true);
            other_source.setEnabled(true);
            other_source.setVisible(true);
            get_income.setEnabled(true);
            get_income.setVisible(true);
            get_ot_income.setEnabled(true);
            get_ot_income.setVisible(true);
            income_nxt.setEnabled(true);
            income_nxt.setVisible(true);*/
            income_jPanel.setEnabled(true);
            income_jPanel.setVisible(true);
        }
    }//GEN-LAST:event_date_nxtMouseClicked
    
    public String getstrDate()
    {
        return this.str_date;
    }
    public String getenDate()
    {
        return this.en_date;
    }
    
    private void income_nxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_income_nxtMouseClicked
        if(get_income.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Income Missing","Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            income = Integer.parseInt(get_income.getText());
            ot_income = Integer.parseInt(get_ot_income.getText());
            budget_frame_jPanel.setEnabled(true);
            budget_frame_jPanel.setVisible(true);
            other_source_jPanel.setEnabled(true);
            other_source_jPanel.setVisible(true);
        }
    }//GEN-LAST:event_income_nxtMouseClicked

    private void eb_budgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eb_budgetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eb_budgetActionPerformed

    private void budget_nxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_budget_nxt1MouseClicked
        savings_jPanel.setEnabled(true);
        savings_jPanel.setVisible(true);
    }//GEN-LAST:event_budget_nxt1MouseClicked

    private void trans_budgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trans_budgetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trans_budgetActionPerformed

    private void acctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acctActionPerformed
        // TODO add your handling code here:
        myAccount myacc = new myAccount();
        myacc.setVisible(true);
        myacc.Connection();
    }//GEN-LAST:event_acctActionPerformed

    private void add_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_accActionPerformed
        // TODO add your handling code here:
        //this.dispose();
        homepage hp = new homepage();
        hp.setVisible(true);
    }//GEN-LAST:event_add_accActionPerformed

    private void activityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activityMouseClicked
        // TODO add your handling code here:
        //this.dispose();
        activity ac = new activity();
        ac.setVisible(true);
    }//GEN-LAST:event_activityMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(get_savings.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Savings Missing","Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            tot_income = income + ot_income;
            hr_budget_v = Integer.parseInt(hr_budget.getText());
            eb_budget_v = Integer.parseInt(eb_budget.getText());
            living_budget_v = Integer.parseInt(living_budget.getText());
            gro_budget_v = Integer.parseInt(gro_budget.getText());
            edu_budget_v = Integer.parseInt(edu_budget.getText());
            trans_budget_v = Integer.parseInt(trans_budget.getText());
            health_budget_v = Integer.parseInt(health_budget.getText());
            entertain_budget_v = Integer.parseInt(entertain_budget.getText());
            dues_budget_v = Integer.parseInt(dues_budget.getText());
            other_budget_v = Integer.parseInt(other_budget.getText());
            get_savings_v = Integer.parseInt(get_savings.getText());
            
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
         strt_date.appendChild(doc.createTextNode(str_date));
         start_date.appendChild(strt_date);

         // supercars element
         Element end_date = doc.createElement("end_date");
         rootElement.appendChild(end_date);
         Element enn_date = doc.createElement("en_date");
         enn_date.appendChild(doc.createTextNode(en_date));
         end_date.appendChild(enn_date);
         
         // supercars element
         Element total_income = doc.createElement("total_income");
         rootElement.appendChild(total_income);
         Element to_income = doc.createElement("tot_income");
         to_income.appendChild(doc.createTextNode(Integer.toString(tot_income)));
         total_income.appendChild(to_income);
         Element net_balance = doc.createElement("net_balance");
         net_balance.appendChild(doc.createTextNode(Integer.toString(tot_income)));
         total_income.appendChild(net_balance);
         Element amount_spent = doc.createElement("amount_spent");
         amount_spent.appendChild(doc.createTextNode("0"));
         total_income.appendChild(amount_spent);
         
         // supercars element
         Element house_rent = doc.createElement("house_rent");
         rootElement.appendChild(house_rent);
         Element hr_budget = doc.createElement("hr_budget");
         hr_budget.appendChild(doc.createTextNode(Integer.toString(hr_budget_v)));
         house_rent.appendChild(hr_budget);
         Element hr_bal = doc.createElement("hr_bal");
         hr_bal.appendChild(doc.createTextNode(Integer.toString(hr_budget_v)));
         house_rent.appendChild(hr_bal);
         Element hr_spent = doc.createElement("hr_spent");
         hr_spent.appendChild(doc.createTextNode("0"));
         house_rent.appendChild(hr_spent);
         
         Element e_bill = doc.createElement("e_bill");
         rootElement.appendChild(e_bill);
         Element ebill_budget = doc.createElement("ebill_budget");
         ebill_budget.appendChild(doc.createTextNode(Integer.toString(eb_budget_v)));
         e_bill.appendChild(ebill_budget);
         Element ebill_bal = doc.createElement("ebill_bal");
         ebill_bal.appendChild(doc.createTextNode(Integer.toString(eb_budget_v)));
         e_bill.appendChild(ebill_bal);
         Element ebill_spent = doc.createElement("ebill_spent");
         ebill_spent.appendChild(doc.createTextNode("0"));
         e_bill.appendChild(ebill_spent);
         
         Element living_budget = doc.createElement("living_budget");
         rootElement.appendChild(living_budget);
         Element dl_budget = doc.createElement("dl_budget");
         dl_budget.appendChild(doc.createTextNode(Integer.toString(living_budget_v)));
         living_budget.appendChild(dl_budget);
         Element dl_bal = doc.createElement("dl_bal");
         dl_bal.appendChild(doc.createTextNode(Integer.toString(living_budget_v)));
         living_budget.appendChild(dl_bal);
         Element dl_spent = doc.createElement("dl_spent");
         dl_spent.appendChild(doc.createTextNode("0"));
         living_budget.appendChild(dl_spent);
         
         Element grocery = doc.createElement("grocery");
         rootElement.appendChild(grocery);
         Element gro_budget = doc.createElement("gro_budget");
         gro_budget.appendChild(doc.createTextNode(Integer.toString(gro_budget_v)));
         grocery.appendChild(gro_budget);
         Element gro_bal = doc.createElement("gro_bal");
         gro_bal.appendChild(doc.createTextNode(Integer.toString(gro_budget_v)));
         grocery.appendChild(gro_bal);
         Element gro_spent = doc.createElement("gro_spent");
         gro_spent.appendChild(doc.createTextNode("0"));
         grocery.appendChild(gro_spent);
         
         Element education = doc.createElement("education");
         rootElement.appendChild(education);
         Element edu_budget = doc.createElement("edu_budget");
         edu_budget.appendChild(doc.createTextNode(Integer.toString(edu_budget_v)));
         education.appendChild(edu_budget);
         Element edu_bal = doc.createElement("edu_bal");
         edu_bal.appendChild(doc.createTextNode(Integer.toString(edu_budget_v)));
         education.appendChild(edu_bal);
         Element edu_spent = doc.createElement("edu_spent");
         edu_spent.appendChild(doc.createTextNode("0"));
         education.appendChild(edu_spent);
         
         Element transport = doc.createElement("transport");
         rootElement.appendChild(transport);
         Element tr_budget = doc.createElement("tr_budget");
         tr_budget.appendChild(doc.createTextNode(Integer.toString(trans_budget_v)));
         transport.appendChild(tr_budget);
         Element tr_bal = doc.createElement("tr_bal");
         tr_bal.appendChild(doc.createTextNode(Integer.toString(trans_budget_v)));
         transport.appendChild(tr_bal);
         Element tr_spent = doc.createElement("tr_spent");
         tr_spent.appendChild(doc.createTextNode("0"));
         transport.appendChild(tr_spent);
         
         Element health = doc.createElement("health");
         rootElement.appendChild(health);
         Element hl_budget = doc.createElement("hl_budget");
         hl_budget.appendChild(doc.createTextNode(Integer.toString(health_budget_v)));
         health.appendChild(hl_budget);
         Element hl_bal = doc.createElement("hl_bal");
         hl_bal.appendChild(doc.createTextNode(Integer.toString(health_budget_v)));
         health.appendChild(hl_bal);
         Element hl_spent = doc.createElement("hl_spent");
         hl_spent.appendChild(doc.createTextNode("0"));
         health.appendChild(hl_spent);
         
         Element entertainment = doc.createElement("entertainment");
         rootElement.appendChild(entertainment);
         Element en_budget = doc.createElement("en_budget");
         en_budget.appendChild(doc.createTextNode(Integer.toString(entertain_budget_v)));
         entertainment.appendChild(en_budget);
         Element en_bal = doc.createElement("en_bal");
         en_bal.appendChild(doc.createTextNode(Integer.toString(entertain_budget_v)));
         entertainment.appendChild(en_bal);
         Element en_spent = doc.createElement("en_spent");
         en_spent.appendChild(doc.createTextNode("0"));
         entertainment.appendChild(en_spent);
         
         Element dues = doc.createElement("dues");
         rootElement.appendChild(dues);
         Element du_budget = doc.createElement("du_budget");
         du_budget.appendChild(doc.createTextNode(Integer.toString(dues_budget_v)));
         dues.appendChild(du_budget);
         Element du_bal = doc.createElement("du_bal");
         du_bal.appendChild(doc.createTextNode(Integer.toString(dues_budget_v)));
         dues.appendChild(du_bal);
         Element du_spent = doc.createElement("du_spent");
         du_spent.appendChild(doc.createTextNode("0"));
         dues.appendChild(du_spent);
         
         Element other = doc.createElement("other");
         rootElement.appendChild(other);
         Element ot_budget = doc.createElement("ot_budget");
         ot_budget.appendChild(doc.createTextNode(Integer.toString(other_budget_v)));
         other.appendChild(ot_budget);
         Element ot_bal = doc.createElement("ot_bal");
         ot_bal.appendChild(doc.createTextNode(Integer.toString(other_budget_v)));
         other.appendChild(ot_bal);
         Element ot_spent = doc.createElement("ot_spent");
         ot_spent.appendChild(doc.createTextNode("0"));
         other.appendChild(ot_spent);
         
         Element savings = doc.createElement("savings");
         rootElement.appendChild(savings);
         Element s_budget = doc.createElement("s_budget");
         s_budget.appendChild(doc.createTextNode(Integer.toString(get_savings_v)));
         savings.appendChild(s_budget);

         // write the content into xml file
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource source = new DOMSource(doc);
         StreamResult result = new StreamResult(new File("./Budget.xml"));
         transformer.transform(source, result);
         
         // Output to console for testing
         StreamResult consoleResult = new StreamResult(System.out);
         transformer.transform(source, consoleResult);
      } catch (Exception e) {
         e.printStackTrace();
      }
            JOptionPane.showMessageDialog(null,"Budget Created","Success", JOptionPane.PLAIN_MESSAGE);
            createBudget.setEnabled(false);
        createBudget.setVisible(false);
        date.setEnabled(false);
        date.setVisible(false);
        datelabel.setEnabled(false);
        datelabel.setVisible(false);
        
        budget1.setEnabled(false);
        budget1.setVisible(false);
        jDatestart.setEnabled(false);
        jDatestart.setVisible(false);
        jDateend.setEnabled(false);
        jDateend.setVisible(false);
        //salary details off
        /*income_label.setEnabled(false);
        income_label.setVisible(false);
        mon_income.setEnabled(false);
        mon_income.setVisible(false);
        other_source.setEnabled(false);
        other_source.setVisible(false);
        get_income.setEnabled(false);
        get_income.setVisible(false);
        get_ot_income.setEnabled(false);
        get_ot_income.setVisible(false);
        income_nxt.setEnabled(false);
        income_nxt.setVisible(false);
        salary.setEnabled(false);
        salary.setVisible(false);*/
        income_jPanel.setEnabled(false);
        income_jPanel.setVisible(false);
        
        budget_frame_jPanel.setEnabled(false);
        budget_frame_jPanel.setVisible(false);
        other_source_jPanel.setEnabled(false);
        other_source_jPanel.setVisible(false);
        
        savings_jPanel.setEnabled(false);
        savings_jPanel.setVisible(false);
        
        budget.setEnabled(true);
        budget.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gro_budgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gro_budgetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gro_budgetActionPerformed

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               /* try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }*/
                //new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acct;
    private javax.swing.JButton activity;
    private javax.swing.JButton add_acc;
    private javax.swing.JButton back;
    private javax.swing.JButton budget;
    private javax.swing.JButton budget1;
    private javax.swing.JPanel budget_frame_jPanel;
    private javax.swing.JLabel budget_frame_label;
    private javax.swing.JLabel budget_frame_label1;
    private javax.swing.JLabel budget_frame_label2;
    private javax.swing.JLabel budget_nxt1;
    private javax.swing.JLabel budget_title;
    private javax.swing.JLabel createBudget;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date_nxt;
    private javax.swing.JLabel datelabel;
    private javax.swing.JLabel dues;
    public static javax.swing.JTextField dues_budget;
    public static javax.swing.JTextField eb_budget;
    public static javax.swing.JTextField edu_budget;
    private javax.swing.JLabel education;
    private javax.swing.JLabel electricity;
    private javax.swing.JLabel end_date;
    private javax.swing.JLabel entertain;
    public static javax.swing.JTextField entertain_budget;
    public static javax.swing.JTextField get_income;
    public static javax.swing.JTextField get_ot_income;
    public static javax.swing.JTextField get_savings;
    public static javax.swing.JTextField gro_budget;
    private javax.swing.JLabel groceries;
    private javax.swing.JLabel health;
    public static javax.swing.JTextField health_budget;
    private javax.swing.JLabel house_rent;
    public static javax.swing.JTextField hr_budget;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel income_jPanel;
    private javax.swing.JLabel income_label;
    private javax.swing.JLabel income_nxt;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateend;
    private com.toedter.calendar.JDateChooser jDatestart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel left_tab;
    private javax.swing.JLabel living;
    public static javax.swing.JTextField living_budget;
    private javax.swing.JButton logs;
    private javax.swing.JLabel mon_income;
    public static javax.swing.JTextField other_budget;
    private javax.swing.JLabel other_budget_title;
    private javax.swing.JLabel other_source;
    private javax.swing.JPanel other_source_jPanel;
    private javax.swing.JLabel others;
    private javax.swing.JLabel right_tab;
    private javax.swing.JLabel savings;
    private javax.swing.JPanel savings_jPanel;
    private javax.swing.JLabel start_date;
    public static javax.swing.JTextField trans_budget;
    private javax.swing.JLabel transport;
    // End of variables declaration//GEN-END:variables
}
