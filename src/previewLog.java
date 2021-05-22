
//import static TestBlockChain.printdata;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;

public class previewLog extends javax.swing.JFrame 
{
    public String id,name,sd,ed,ta,sp,sa;
    public previewLog() 
    {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public previewLog(String id,String name,String sd,String ed,String ta,String sp,String sa)
    {
        this.id = id;
        this.name = name;
        this.sd = sd;
        this.ed = ed;
        this.ta = ta;
        this.sp = sp;
        this.sa = sa;
        /*String tbdata[] = {id,name,sd,ed,ta,sp,sa};
        DefaultTableModel tb = (DefaultTableModel)jTable1.getModel();
        tb.addRow(tbdata);*/
        jTextArea1.append(id);
        jTextArea1.append(name);
        jTextArea1.append(sd);
        jTextArea1.append(ed);
        jTextArea1.append(ta);
        jTextArea1.append(sp);
        jTextArea1.append(sa);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 180, 700, 350));

        jButton1.setText("DISPLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        back.setBackground(new java.awt.Color(0, 0, 255));
        back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Make It Personal\\1080p\\HD\\Black-Background-Collapsar-by-Freeman.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 710, 530));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\SEM 5\\srp\\photos\\background1.PNG")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String mn = JOptionPane.showInputDialog("Enter the month to view its budget :");
        Blockchain ch = new Blockchain();
        
        ch = null; 
            try 
            { 
                FileInputStream file = new FileInputStream("blockfile.txt"); 
                ObjectInputStream in = new ObjectInputStream(file);    
                ch = (Blockchain)in.readObject(); 
            //ch.addBlock(new block("0x206","5","Madhu","01/01/2020","01/06/2020","50000","20000","30000"));
                //ch.addBlock(new block("0x206","6","Ram","01/01/2020","01/06/2020","50000","20000","30000"));
                ch.displayChain();  
                /*Scanner sc= new Scanner(System.in); 
                System.out.println("GET USER:");
                String str=sc.nextLine();
                String s=ch.getData(str);
                System.out.println(s);*/
                //System.out.println(ch.getUser("8"));
                jTextArea1.setText(ch.getUser(mn));

                //System.out.println("yes");
                //String s=ch.getData("rizu1023");//can i run bro?//yess
                //System.out.println(s);
                in.close(); 
                file.close(); 
                System.out.println("Data after Deserialization."); 
                //printdata(ch); 
                //TestBlockChain t = new TestBlockChain();
                //jTextArea1.setText(TestBlockChain.ss);
                
                
                
               /* jTextArea1.append("ID : "+ch.getLatestBlock().getId()+"\n");
                System.out.println();
                jTextArea1.append("NAME : "+ch.getLatestBlock().getName()+"\n");
                System.out.println();
                jTextArea1.append("START DATE : "+ch.getLatestBlock().getStart_date()+"\n");
                System.out.println();
                jTextArea1.append("END DATE : "+ch.getLatestBlock().getEnd_date()+"\n");
                System.out.println();
                jTextArea1.append("TOTAL AMOUNT : "+ch.getLatestBlock().getTotal_amt()+"\n");
                System.out.println();
                jTextArea1.append("AMOUNT SPENT : "+ch.getLatestBlock().getAmount_spent()+"\n");
                System.out.println();
                jTextArea1.append("AMOUNT SAVED : "+ch.getLatestBlock().getAmount_saved()+"\n");*/
                
                
            } 
            catch (IOException ex) 
            { 
                System.out.println(ex); 
            } 
  
            catch (ClassNotFoundException ex) 
            { 
                System.out.println("ClassNotFoundException"); 
            }                                  
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(previewLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(previewLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(previewLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(previewLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new previewLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
