package Temp_notForHomeWork_;

import P2.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class OldClientTCP extends javax.swing.JFrame {

    public OldClientTCP() {
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
        Username = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Input = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Status = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LIP = new javax.swing.JTextField();
        LPort = new javax.swing.JTextField();
        RIP = new javax.swing.JTextField();
        RPort = new javax.swing.JTextField();
        Send = new javax.swing.JButton();
        Available = new javax.swing.JComboBox<>();
        Test = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        SendAll = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SIP = new javax.swing.JTextField();
        SPort = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        OnlineUsers = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client");
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("username");

        Output.setColumns(20);
        Output.setRows(5);
        jScrollPane1.setViewportView(Output);

        Input.setColumns(20);
        Input.setRows(5);
        jScrollPane2.setViewportView(Input);

        jLabel2.setText("Status");

        jLabel5.setText("Available Interface");

        jLabel6.setText("Local IP:");

        jLabel7.setText("Local Port:");

        jLabel8.setText("Remote IP:");

        jLabel9.setText("Remote Port:");

        LIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIPActionPerformed(evt);
            }
        });

        LPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LPortActionPerformed(evt);
            }
        });

        Send.setText("Send");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });

        Available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailableActionPerformed(evt);
            }
        });

        Test.setText("Test Server");
        Test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestActionPerformed(evt);
            }
        });

        Login.setText("login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Logout.setText("logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        SendAll.setText("Send All");
        SendAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendAllActionPerformed(evt);
            }
        });

        jLabel3.setText("TCP Server IP:");

        jLabel4.setText("TCP Server Port:");

        SPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPortActionPerformed(evt);
            }
        });

        jLabel10.setText("Online Users");

        OnlineUsers.setColumns(20);
        OnlineUsers.setRows(5);
        jScrollPane3.setViewportView(OnlineUsers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Login)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Logout))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Test, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Send, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(RPort, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(RIP, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LPort, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LIP, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(SendAll, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Available, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SIP, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(SPort))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(83, 83, 83))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login)
                    .addComponent(Logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(SPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Available, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(LIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(RPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Send, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Test, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SendAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        localIP = LIP.getText();
        localPort = LPort.getText();
        remoteIP = RIP.getText();
        remotePort = RPort.getText();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Output.append(dtf.format(now) + "  Me :  " + Input.getText() + "\n");
        username = Username.getText();
        if (username.equals("") || username == null) {
            username = "client";
        } else {
            username = username.replaceAll("\\s", "");
        }
        temp = dtf.format(now) + "  " + username + " :  " + Input.getText() + "\n";
        sendData = temp.getBytes();

        try {
            ipaddress = InetAddress.getByName(remoteIP);
        } catch (UnknownHostException ex) {
            Logger.getLogger(OldClientTCP.class.getName()).log(Level.SEVERE, null, ex);
        }
        send = new DatagramPacket(sendData, sendData.length, ipaddress, Integer.parseInt(remotePort));
        try {
            mySocket.send(send);
        } catch (IOException ex) {
            Logger.getLogger(OldClientTCP.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_SendActionPerformed

    private void LIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LIPActionPerformed

    private void LPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LPortActionPerformed

    }//GEN-LAST:event_LPortActionPerformed

    private void TestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestActionPerformed
        ti = localPort;
        tp = localIP;
        localPort = LPort.getText();
        localPort = localPort.replaceAll("\\s", "");
        localIP = LIP.getText();
        localIP = localIP.replaceAll("\\s", "");
        if (!localPort.equals(tp)) {
            try {
                mySocket = new DatagramSocket(Integer.parseInt(localPort));

            } catch (SocketException ex) {
                Logger.getLogger(OldClientTCP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        recieve = new DatagramPacket(recieveData, recieveData.length);
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        mySocket.receive(recieve);
                    } catch (IOException ex) {
                        Logger.getLogger(OldClientTCP.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    data = new String(recieve.getData(), recieve.getOffset(), recieve.getLength());
                    Output.append(data);
                    ripaddress = recieve.getAddress();
                    rport = recieve.getPort();
                    Status.setText(" Received From IP = " + ripaddress + " , Port = " + rport);
                }
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        myThread.start();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Output.append(dtf.format(now) + "  Me :  " + Input.getText() + "\n");
    }//GEN-LAST:event_TestActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Enumeration<NetworkInterface> interfaces = null;
        try {
            interfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException ex) {
            Logger.getLogger(OldClientTCP.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (interfaces.hasMoreElements()) {
            NetworkInterface networkInterface = interfaces.nextElement();

            Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();

            while (inetAddresses.hasMoreElements()) {
                Available.addItem(networkInterface.getDisplayName() + inetAddresses.nextElement().toString());
            }

        }

    }//GEN-LAST:event_formWindowOpened

    private void AvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AvailableActionPerformed

    private void SPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPortActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        try {
            activeUsers = new Vector<String>(10);
            tlport = tlocalPort;
            username = Username.getText();
            tlocalPort = LPort.getText();
            tlocalIP = LIP.getText();
            serverip = SIP.getText();
            serverport = SPort.getText();
            tdata = username + "," + tlocalIP + "," + tlocalPort;
            tdata.replaceAll("\\s", "");
            clientSocket = new Socket(serverip, Integer.parseInt(serverport));
            writer = new PrintWriter(clientSocket.getOutputStream(), true);
            scanner = new Scanner(clientSocket.getInputStream());
            tflag = true;
            OnlineUsers.setText(" ");
            if (tlport.equals(tlocalPort)) {
                tdata = "";
            }
            tcpThread = new Thread(new Runnable() {
                @Override
                public void run() {

                    try {
                        OnlineUsers.setText(" ");
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(OldClientTCP.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    while (true) {
                        tldatatemp = tldata;
                        writer.println(tdata);
                        tldata = scanner.nextLine();
                        tldata = tldata.replaceAll("\\s", "");
                        if (!tldata.equals(tldatatemp)) {
                            OnlineUsers.append(tldata + "\n");
                            activeUsers.add(tldata);
                        }

                    }
//                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

            });
            tcpThread.start();
        } catch (IOException ex) {
            Logger.getLogger(OldClientTCP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        try {
            tflag = false;
            String deleteData = "delete," + tlocalIP + "," + tlocalPort ;
            writer.println(deleteData);
            try {
                Thread.sleep(2000);
                tcpThread.interrupt();
            } catch (InterruptedException ex) {
                Logger.getLogger(OldClientTCP.class.getName()).log(Level.SEVERE, null, ex);
            }

            clientSocket.close();
            OnlineUsers.setText("");

        } catch (IOException ex) {
            Logger.getLogger(OldClientTCP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LogoutActionPerformed

    private void SendAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendAllActionPerformed
        localIP = LIP.getText();
        localPort = LPort.getText();

        for (int i = 0; i < activeUsers.size(); i++) {
            if (activeUsers.get(i).split(",")[2].equals(localIP)) {

            } else {
                tcprip = activeUsers.get(i).split(",")[1];
                tcprport = activeUsers.get(i).split(",")[2];
                tcpusername = Username.getText();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();

                temp = dtf.format(now) + "  " + tcpusername + " :  " + Input.getText() + "\n";
                sendData = temp.getBytes();

                try {
                    ipaddress = InetAddress.getByName(tcprip);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(OldClientTCP.class.getName()).log(Level.SEVERE, null, ex);
                }
                send = new DatagramPacket(sendData, sendData.length, ipaddress, Integer.parseInt(tcprport));
                try {
                    mySocket.send(send);
                } catch (IOException ex) {
                    Logger.getLogger(OldClientTCP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_SendAllActionPerformed

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
            java.util.logging.Logger.getLogger(OldClientTCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OldClientTCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OldClientTCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OldClientTCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OldClientTCP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Available;
    private javax.swing.JTextArea Input;
    private javax.swing.JTextField LIP;
    private javax.swing.JTextField LPort;
    private javax.swing.JButton Login;
    private javax.swing.JButton Logout;
    private javax.swing.JTextArea OnlineUsers;
    private javax.swing.JTextArea Output;
    private javax.swing.JTextField RIP;
    private javax.swing.JTextField RPort;
    private javax.swing.JTextField SIP;
    private javax.swing.JTextField SPort;
    private javax.swing.JButton Send;
    private javax.swing.JButton SendAll;
    private javax.swing.JTextField Status;
    private javax.swing.JButton Test;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
    String localIP = " ", localPort = " ", remoteIP, remotePort, temp, username, data, tp = " ", ti = " ", tlocalIP = " ", tlocalPort = " ", tdata, tldata = " ", serverip, serverport, tldatatemp;
    int rport;
    boolean tflag = true;
    String[] mData, sData;
    String eData, tlport;
    InetAddress ipAddress;
    DatagramSocket mySocket;
    InetAddress ipaddress, ripaddress;
    DatagramPacket send, recieve;
    byte[] sendData = new byte[1024];
    byte[] recieveData = new byte[1024];

    String tcprip, tcprport, tcpusername;
    Vector<String> activeUsers;
    PrintWriter writer;
    Socket clientSocket;
    Scanner scanner;
    Thread tcpThread ;
}
