import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class NewJFrame34 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame34
     */
    public NewJFrame34() {
        initComponents();
    }
// Global variables
    Statement stmt = null;
    ResultSet rs = null;
    String SQL = "SELECT * FROM member";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtmno = new javax.swing.JTextField();
        txtmname = new javax.swing.JTextField();
        txtmadd = new javax.swing.JTextField();
        txtmph = new javax.swing.JTextField();
        txtmdate = new javax.swing.JTextField();
        txtmfee = new javax.swing.JTextField();
        txtmstatus = new javax.swing.JTextField();
        txtmissue = new javax.swing.JTextField();
        first = new javax.swing.JButton();
        next = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        last = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        first.setText("FIRST");
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        next.setText("NEXT");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        prev.setText("PREVIOUS");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        last.setText("LAST");
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setText("MEMBER NO.");

        jLabel2.setText("NAME");

        jLabel3.setText("ADDRESS");

        jLabel4.setText("PHONE/MOBILE");

        jLabel5.setText("MEMBERSHIP DATE");

        jLabel6.setText("MEMBERSHIP FEE");

        jLabel7.setText("STATUS");

        jLabel8.setText("ISSUE STATUS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(first)
                        .addGap(18, 18, 18)
                        .addComponent(next)
                        .addGap(27, 27, 27)
                        .addComponent(prev)
                        .addGap(18, 18, 18)
                        .addComponent(last)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmissue, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmname, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmno, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmadd, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmph, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmdate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmfee, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtmadd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtmph))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtmdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtmfee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtmstatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmissue)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first)
                    .addComponent(next)
                    .addComponent(prev)
                    .addComponent(last)
                    .addComponent(exit))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
 int a,k;
   String b,c,d,f,g,h,i,j,l;
   a=Integer.parseInt(txtmno.getText());
   b=txtmname.getText();
   c=txtmadd.getText();
   d=txtmph.getText();
   f=txtmdate.getText();
   g=txtmfee.getText();
   h=txtmstatus.getText();
   i=txtmissue.getText();
   k=a-1;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","opjs");
             String s1="select * from member where Pub_Id ="+k+";";
             Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(s1);

          while (rs.next()) {
                String Mno = rs.getString("memb_no");
                String MName = rs.getString("memb_name");
                String MAdd = rs.getString("memb_add");
                String MPh1 = rs.getString("memb_phone");
                String MDate = rs.getString("mdate");
                String MEDate = rs.getString("medate");
                String MFee = rs.getString("mfee");
                String MStatus = rs.getString("mem_status");
                String MIssue = rs.getString("mem_issue");
                // Displaying the contents in respective text boxes.
                txtmno.setText(Mno);
                txtmname.setText(MName);
                txtmadd.setText(MAdd);
                txtmph.setText(MPh1);
                txtmdate.setText(MDate);
                txtmfee.setText(MFee);
                txtmstatus.setText(MStatus);
                txtmissue.setText(MIssue);
          }} catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_prevActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
 try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","opjs");
            String s1="select * from member order by Pub_Id desc limit 1;";
             Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(s1);

            while (rs.next()) {
                String Mno = rs.getString("memb_no");
                String MName = rs.getString("memb_name");
                String MAdd = rs.getString("memb_add");
                String MPh1 = rs.getString("memb_phone");
                String MDate = rs.getString("mdate");
                String MEDate = rs.getString("medate");
                String MFee = rs.getString("mfee");
                String MStatus = rs.getString("mem_status");
                String MIssue = rs.getString("mem_issue");
                // Displaying the contents in respective text boxes.
                txtmno.setText(Mno);
                txtmname.setText(MName);
                txtmadd.setText(MAdd);
                txtmph.setText(MPh1);
                txtmdate.setText(MDate);
                txtmfee.setText(MFee);
                txtmstatus.setText(MStatus);
                txtmissue.setText(MIssue);
                first.setEnabled(true);
                next.setEnabled(false);
                prev.setEnabled(true);
                last.setEnabled(false);
            } 
 } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lastActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
   int a,k;
   String b,c,d,f,g,h,i,j,l;
   a=Integer.parseInt(txtmno.getText());
   b=txtmname.getText();
   c=txtmadd.getText();
   d=txtmph.getText();
   f=txtmdate.getText();
   g=txtmfee.getText();
   h=txtmstatus.getText();
   i=txtmissue.getText();
   k=a+1;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","opjs");
             String s1="select * from member where Pub_Id ="+k+";";
             Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(s1);

          while (rs.next()) {
                String Mno = rs.getString("memb_no");
                String MName = rs.getString("memb_name");
                String MAdd = rs.getString("memb_add");
                String MPh1 = rs.getString("memb_phone");
                String MDate = rs.getString("mdate");
                String MEDate = rs.getString("medate");
                String MFee = rs.getString("mfee");
                String MStatus = rs.getString("mem_status");
                String MIssue = rs.getString("mem_issue");
                // Displaying the contents in respective text boxes.
                txtmno.setText(Mno);
                txtmname.setText(MName);
                txtmadd.setText(MAdd);
                txtmph.setText(MPh1);
                txtmdate.setText(MDate);
                txtmfee.setText(MFee);
                txtmstatus.setText(MStatus);
                txtmissue.setText(MIssue);
          }} catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_nextActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
   this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","opjs");
          String s1="select * from publisher order by Pub_Id limit 1 ;";
             Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(s1);

            while(rs.next()) {
                String Mno = rs.getString("memb_no");
                String MName = rs.getString("memb_name");
                String MAdd = rs.getString("memb_add");
                String MPh1 = rs.getString("memb_phone");
                String MDate = rs.getString("mdate");
                String MEDate = rs.getString("medate");
                String MFee = rs.getString("mfee");
                String MStatus = rs.getString("mem_status");
                String MIssue = rs.getString("mem_issue");
                // Displaying the contents in respective text boxes.
                txtmno.setText(Mno);
                txtmname.setText(MName);
                txtmadd.setText(MAdd);
                txtmph.setText(MPh1);
                txtmdate.setText(MDate);
                txtmfee.setText(MFee);
                txtmstatus.setText(MStatus);
                txtmissue.setText(MIssue);
                           } 
    } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_firstActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(NewJFrame34.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame34.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame34.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame34.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame34().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton first;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton last;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    private javax.swing.JTextField txtmadd;
    private javax.swing.JTextField txtmdate;
    private javax.swing.JTextField txtmfee;
    private javax.swing.JTextField txtmissue;
    private javax.swing.JTextField txtmname;
    private javax.swing.JTextField txtmno;
    private javax.swing.JTextField txtmph;
    private javax.swing.JTextField txtmstatus;
    // End of variables declaration//GEN-END:variables
}
