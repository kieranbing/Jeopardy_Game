
import java.awt.CardLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kieran Bingham & Cameron Sokalski
 */

//Test
public class JeopardyGUI extends javax.swing.JFrame {

    /**
     * Creates new form JeopardyGUI
     */
    public JeopardyGUI() {
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

        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        splashScreen = new javax.swing.JPanel();
        titleImage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        gamePage = new javax.swing.JPanel();
        questionOneLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titleImage1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        questionOneLabel1 = new javax.swing.JLabel();
        questionOneLabel2 = new javax.swing.JLabel();
        questionOneLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();

        jButton19.setText("$200");
        jButton19.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton19.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton19.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton20.setText("$400");
        jButton20.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton20.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton20.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton21.setText("$600");
        jButton21.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton21.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton21.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton22.setText("$800");
        jButton22.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton22.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton22.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton23.setText("$1000");
        jButton23.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton23.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton23.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton24.setText("$200");
        jButton24.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton24.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton24.setPreferredSize(new java.awt.Dimension(121, 50));

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JEOPARDY!  by: Kieran & Cameron");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        mainPanel.setPreferredSize(new java.awt.Dimension(700, 500));
        mainPanel.setLayout(new java.awt.CardLayout());

        splashScreen.setBackground(new java.awt.Color(0, 0, 102));
        splashScreen.setPreferredSize(new java.awt.Dimension(700, 500));

        titleImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resorces/Jeopardy!_Logo_crop.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Play");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splashScreenLayout = new javax.swing.GroupLayout(splashScreen);
        splashScreen.setLayout(splashScreenLayout);
        splashScreenLayout.setHorizontalGroup(
            splashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splashScreenLayout.createSequentialGroup()
                .addGroup(splashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(splashScreenLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(splashScreenLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(titleImage, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        splashScreenLayout.setVerticalGroup(
            splashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splashScreenLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(titleImage)
                .addGap(111, 111, 111)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 162, Short.MAX_VALUE))
        );

        mainPanel.add(splashScreen, "card1");

        gamePage.setBackground(new java.awt.Color(0, 0, 102));
        gamePage.setFocusTraversalPolicyProvider(true);
        gamePage.setMaximumSize(new java.awt.Dimension(121, 50));
        gamePage.setMinimumSize(new java.awt.Dimension(121, 23));
        gamePage.setPreferredSize(new java.awt.Dimension(700, 500));

        questionOneLabel.setFont(questionOneLabel.getFont().deriveFont(questionOneLabel.getFont().getStyle() | java.awt.Font.BOLD, questionOneLabel.getFont().getSize()+6));
        questionOneLabel.setForeground(new java.awt.Color(255, 255, 255));
        questionOneLabel.setText("Multyplication");

        titleImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resorces/small_Logo_crop.png"))); // NOI18N
        titleImage1.setPreferredSize(new java.awt.Dimension(103, 50));

        jButton2.setFont(jButton2.getFont().deriveFont(jButton2.getFont().getStyle() | java.awt.Font.BOLD, jButton2.getFont().getSize()+3));
        jButton2.setText("Main Menu");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Credits");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titleImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton2)
                .addComponent(jButton8))
        );

        questionOneLabel1.setFont(questionOneLabel1.getFont().deriveFont(questionOneLabel1.getFont().getStyle() | java.awt.Font.BOLD, questionOneLabel1.getFont().getSize()+10));
        questionOneLabel1.setForeground(new java.awt.Color(255, 255, 255));
        questionOneLabel1.setText("Addition");

        questionOneLabel2.setFont(questionOneLabel2.getFont().deriveFont(questionOneLabel2.getFont().getStyle() | java.awt.Font.BOLD, questionOneLabel2.getFont().getSize()+10));
        questionOneLabel2.setForeground(new java.awt.Color(255, 255, 255));
        questionOneLabel2.setText("Subtration");

        questionOneLabel3.setFont(questionOneLabel3.getFont().deriveFont(questionOneLabel3.getFont().getStyle() | java.awt.Font.BOLD, questionOneLabel3.getFont().getSize()+10));
        questionOneLabel3.setForeground(new java.awt.Color(255, 255, 255));
        questionOneLabel3.setText("Division");

        jButton3.setText("$200");
        jButton3.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton3.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton4.setText("$400");
        jButton4.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton4.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton5.setText("$600");
        jButton5.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton5.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton6.setText("$800");
        jButton6.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton6.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton7.setText("$1000");
        jButton7.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton7.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton7.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton9.setText("$200");
        jButton9.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton9.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton9.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton10.setText("$400");
        jButton10.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton10.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton10.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton11.setText("$600");
        jButton11.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton11.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton11.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton12.setText("$800");
        jButton12.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton12.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton12.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton13.setText("$1000");
        jButton13.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton13.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton13.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton14.setText("$200");
        jButton14.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton14.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton14.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton15.setText("$400");
        jButton15.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton15.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton15.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton16.setText("$600");
        jButton16.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton16.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton16.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton17.setText("$800");
        jButton17.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton17.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton17.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton18.setText("$1000");
        jButton18.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton18.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton18.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton25.setText("$400");
        jButton25.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton25.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton25.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton26.setText("$600");
        jButton26.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton26.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton26.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton27.setText("$800");
        jButton27.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton27.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton27.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton28.setText("$1000");
        jButton28.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton28.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton28.setPreferredSize(new java.awt.Dimension(121, 50));

        jButton29.setText("$200");
        jButton29.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton29.setMinimumSize(new java.awt.Dimension(121, 23));
        jButton29.setPreferredSize(new java.awt.Dimension(121, 50));

        javax.swing.GroupLayout gamePageLayout = new javax.swing.GroupLayout(gamePage);
        gamePage.setLayout(gamePageLayout);
        gamePageLayout.setHorizontalGroup(
            gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePageLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questionOneLabel)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePageLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePageLayout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(gamePageLayout.createSequentialGroup()
                                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))))
                    .addGroup(gamePageLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(questionOneLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questionOneLabel2)
                    .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gamePageLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(questionOneLabel3)))
                .addGap(113, 113, 113))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gamePageLayout.setVerticalGroup(
            gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePageLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePageLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(questionOneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePageLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePageLayout.createSequentialGroup()
                                .addComponent(questionOneLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gamePageLayout.createSequentialGroup()
                                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePageLayout.createSequentialGroup()
                                        .addGap(247, 247, 247)
                                        .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(gamePageLayout.createSequentialGroup()
                                        .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(questionOneLabel2)
                                            .addComponent(questionOneLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        mainPanel.add(gamePage, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.next(mainPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.previous(mainPanel);
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
            java.util.logging.Logger.getLogger(JeopardyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JeopardyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JeopardyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JeopardyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JeopardyGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gamePage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel questionOneLabel;
    private javax.swing.JLabel questionOneLabel1;
    private javax.swing.JLabel questionOneLabel2;
    private javax.swing.JLabel questionOneLabel3;
    private javax.swing.JPanel splashScreen;
    private javax.swing.JLabel titleImage;
    private javax.swing.JLabel titleImage1;
    // End of variables declaration//GEN-END:variables
}
