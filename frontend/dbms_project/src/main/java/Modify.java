/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */import java.sql.*;
 import javax.swing.JOptionPane;
 import javax.swing.table.*;
public class Modify extends javax.swing.JFrame {

    /**
     * Creates new form Modify
     */
    public Modify() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T7 = new javax.swing.JTextField();
        T8 = new javax.swing.JTextField();
        T9 = new javax.swing.JTextField();
        T10 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        T6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 50, -1));

        T1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });
        getContentPane().add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 150, 30));

        T2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });
        getContentPane().add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 180, 30));

        T3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T3ActionPerformed(evt);
            }
        });
        getContentPane().add(T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 180, 30));

        T4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T4ActionPerformed(evt);
            }
        });
        getContentPane().add(T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 180, 30));

        T7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        T7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T7ActionPerformed(evt);
            }
        });
        getContentPane().add(T7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 180, 30));

        T8.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        T8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T8ActionPerformed(evt);
            }
        });
        getContentPane().add(T8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 180, 30));

        T9.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        T9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T9ActionPerformed(evt);
            }
        });
        getContentPane().add(T9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 180, 30));

        T10.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        T10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T10ActionPerformed(evt);
            }
        });
        getContentPane().add(T10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 180, 30));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Age");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 40, 30));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Player ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 110, 20));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 50, 50));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel6.setText("Team");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 40, 20));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setText("Matches Played");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 110, 30));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Penalty Kicks Taken");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 140, 20));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel9.setText("Successful Penalty Kicks");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, 30));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Position");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 60, 40));

        T6.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        T6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T6ActionPerformed(evt);
            }
        });
        getContentPane().add(T6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 180, 30));

        jButton1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 100, -1));

        jButton2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButton2.setText("Modify");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 100, -1));

        jButton3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButton3.setText("Back to Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 130, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\dbms_project\\src\\main\\java\\image (1).jpg")); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        jLabel12.setText("jLabel10");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T1ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2ActionPerformed

    private void T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T3ActionPerformed

    private void T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T4ActionPerformed

    private void T7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T7ActionPerformed

    private void T8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T8ActionPerformed

    private void T9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T9ActionPerformed

    private void T10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T10ActionPerformed

    private void T6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try
        {
        int N=Integer.parseInt(T1.getText());
        Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/footballmanagement","root","Shailesh@123");
        Statement S=con.createStatement();
        String query="select * from players where PID='"+N+"';";
        ResultSet RS=S.executeQuery(query);
        int T=0;
        if(RS.next())
        {T=1;
        String NA=RS.getString("PName");
        int AGE=RS.getInt("age");
        String POS=RS.getString("Position");
        String Team=RS.getString("Team");
        String Type=RS.getString("Type");
        //int Tid=RS.getInt("Tid");
        int PKT=RS.getInt("PenaltyKicksTaken");
        int SPK=RS.getInt("SuccessfulPenaltykicks");
        int MP=RS.getInt("MatchesPlayed");
        T2.setText(""+NA);
        T3.setText(""+AGE);
        T6.setText(""+POS);
        T4.setText(""+Type);
        T8.setText(""+MP);
        T7.setText(""+Team);
        T9.setText(""+PKT);
        T10.setText(""+SPK);
        }
        if(T==0)
            JOptionPane.showMessageDialog(null,"No such Result exists");
        S.close();
        con.close();
        RS.close();
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null, "Error in connectivity");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try
        {
        int N=Integer.parseInt(T1.getText());
            Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/footballmanagement","root","Shailesh@123");
        Statement S1=con.createStatement();
        String Name=T2.getText();      
        int Age=Integer.parseInt(T3.getText());
        String Type=T4.getText();
        String Pos=T6.getText();
        String Tea=T7.getText();
        int MP=Integer.parseInt(T8.getText());
        int PKT=Integer.parseInt(T9.getText());
        int SPK=Integer.parseInt(T10.getText());
        String query="update players set PName='"+Name+"', age='"+Age+"', Type='"+Type+"', Position='"+Pos+"', Team='"+Tea+"', MatchesPlayed='"+MP+"', PenaltyKicksTaken='"+PKT+"', SuccessfulPenaltykicks='"+SPK+"' where PID="+N+";";
        String query1="update "+Tea+" set PName='"+Name+"', age='"+Age+"', Type='"+Type+"', Position='"+Pos+" where PID="+N+";";
        int T=0;
        S1.executeUpdate(query);
        S1.close();
        con.close();
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null, "record updated");
        }
        try
        {
        int N=Integer.parseInt(T1.getText());
            Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/footballmanagement","root","Shailesh@123");
        Statement S1=con.createStatement();
        String Name=T2.getText();      
        int Age=Integer.parseInt(T3.getText());
        String Type=T4.getText();
        String Pos=T6.getText();
        String Tea=T7.getText();
        int MP=Integer.parseInt(T8.getText());
        int PKT=Integer.parseInt(T9.getText());
        int SPK=Integer.parseInt(T10.getText());
        String query1="update "+Tea+" set PNames='"+Name+"', Type='"+Type+"', Position='"+Pos+" where Pid='"+N+"';";
        int T=0;
        S1.executeUpdate(query1);
        JOptionPane.showMessageDialog(null, "Table Updated");
        S1.close();
        con.close();
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null, "record updated");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        menu M= new menu();
        M.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T10;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JTextField T8;
    private javax.swing.JTextField T9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
