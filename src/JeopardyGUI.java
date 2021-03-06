
import java.awt.CardLayout;
import javax.swing.DefaultListModel;
import java.awt.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Kieran Bingham & Cameron Sokalski
 */

public class JeopardyGUI extends javax.swing.JFrame {
    //Define objects 
    Multiplication multi = new Multiplication();
    Addition add = new Addition();
    Subtraction sub = new Subtraction(); 
    Division div = new Division();
    Question q = new Question();
    Runnable r = new Updater();
//    Runnable outOfTime = new noTime();
    //Create array(s)
    String[] teamNames = new String[4];
    int[] score = {0,0,0,0};
    //Define vars
    int radioSelected = 0; 
    int qValue; 
    boolean doubleJeopardyToggle = false; 
    boolean popup = false; 
    //Timer vars
    boolean popupCountdown = false;
    boolean popupEndCountdown = false; 
    boolean playerErrorCount = false; 
    boolean correct; 
    int timerSet = 30; 
    int gameTimer = timerSet; 
    int errorTimer = 3;
    
    ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
    
    /**
     * Creates new form JeopardyGUI
     */
    public JeopardyGUI() {
        initComponents();
        service.scheduleAtFixedRate(r, 0, 1, TimeUnit.SECONDS);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupNameGroup = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLayeredPane = new javax.swing.JLayeredPane();
        mainPanel = new javax.swing.JPanel();
        splashScreen = new javax.swing.JPanel();
        titleImage = new javax.swing.JLabel();
        mainMenuButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        settingsPage = new javax.swing.JPanel();
        toolBarSettings = new javax.swing.JPanel();
        titleImage2 = new javax.swing.JLabel();
        addTitle = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        settingsTitle = new javax.swing.JLabel();
        doubleRadio = new javax.swing.JRadioButton();
        timerSlider = new javax.swing.JSlider();
        sliderLabel = new javax.swing.JLabel();
        timerTitle = new javax.swing.JLabel();
        playerList = new javax.swing.JList();
        removeButton = new javax.swing.JButton();
        goButton = new javax.swing.JButton();
        playersError = new javax.swing.JLabel();
        setupError = new javax.swing.JLabel();
        gamePage = new javax.swing.JPanel();
        toolBar = new javax.swing.JPanel();
        titleImage1 = new javax.swing.JLabel();
        questionOneLabel = new javax.swing.JLabel();
        questionOneLabel1 = new javax.swing.JLabel();
        questionOneLabel2 = new javax.swing.JLabel();
        questionOneLabel3 = new javax.swing.JLabel();
        multi200 = new javax.swing.JButton();
        multi400 = new javax.swing.JButton();
        multi600 = new javax.swing.JButton();
        multi800 = new javax.swing.JButton();
        multi1000 = new javax.swing.JButton();
        add600 = new javax.swing.JButton();
        add800 = new javax.swing.JButton();
        add1000 = new javax.swing.JButton();
        sub400 = new javax.swing.JButton();
        sub600 = new javax.swing.JButton();
        sub800 = new javax.swing.JButton();
        sub1000 = new javax.swing.JButton();
        div400 = new javax.swing.JButton();
        div600 = new javax.swing.JButton();
        div800 = new javax.swing.JButton();
        div1000 = new javax.swing.JButton();
        div200 = new javax.swing.JButton();
        scoreSeperator = new javax.swing.JSeparator();
        teamOnePanel = new javax.swing.JPanel();
        teamOneLabel = new javax.swing.JLabel();
        teamOneScore = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        teamTwoPanel = new javax.swing.JPanel();
        teamTwoLabel = new javax.swing.JLabel();
        teamTwoScore = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        teamThreePanel = new javax.swing.JPanel();
        teamThreeLabel = new javax.swing.JLabel();
        teamThreeScore = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        teamFourPanel = new javax.swing.JPanel();
        teamFourLabel = new javax.swing.JLabel();
        teamFourScore = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        add200 = new javax.swing.JButton();
        add400 = new javax.swing.JButton();
        sub200 = new javax.swing.JButton();
        popupFrame = new javax.swing.JInternalFrame();
        popupMain = new javax.swing.JPanel();
        popupPanel = new javax.swing.JPanel();
        popupSubmitButton = new javax.swing.JButton();
        popupTimerPanel = new javax.swing.JPanel();
        timerLabel = new javax.swing.JLabel();
        timerProgress = new javax.swing.JProgressBar();
        popupText = new javax.swing.JTextField();
        teamThreeRadio = new javax.swing.JRadioButton();
        teamFourRadio = new javax.swing.JRadioButton();
        teamOneRadio = new javax.swing.JRadioButton();
        teamTwoRadio = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionArea = new javax.swing.JTextArea();
        incorrectPanel = new javax.swing.JPanel();
        incorrectLabel = new javax.swing.JLabel();
        correctPanel = new javax.swing.JPanel();
        correctLabel = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cameron Sokalski");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JEOPARDY!  by: Kieran & Cameron");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        mainPanel.setPreferredSize(new java.awt.Dimension(700, 500));
        mainPanel.setLayout(new java.awt.CardLayout());

        splashScreen.setBackground(new java.awt.Color(0, 0, 153));
        splashScreen.setPreferredSize(new java.awt.Dimension(700, 500));

        titleImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resorces/Jeopardy!_Logo_crop.png"))); // NOI18N

        mainMenuButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mainMenuButton.setText("Play");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Credits: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kieran Bingham");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cameron Sokalski");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Baised off Jeopardy!tm");

        javax.swing.GroupLayout splashScreenLayout = new javax.swing.GroupLayout(splashScreen);
        splashScreen.setLayout(splashScreenLayout);
        splashScreenLayout.setHorizontalGroup(
            splashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splashScreenLayout.createSequentialGroup()
                .addGroup(splashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(splashScreenLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(splashScreenLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(titleImage, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(splashScreenLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(splashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splashScreenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
        splashScreenLayout.setVerticalGroup(
            splashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splashScreenLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(titleImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(splashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(64, 64, 64)
                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        mainPanel.add(splashScreen, "card1");

        settingsPage.setBackground(new java.awt.Color(0, 0, 153));

        titleImage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resorces/small_Logo_crop.png"))); // NOI18N
        titleImage2.setPreferredSize(new java.awt.Dimension(103, 50));

        javax.swing.GroupLayout toolBarSettingsLayout = new javax.swing.GroupLayout(toolBarSettings);
        toolBarSettings.setLayout(toolBarSettingsLayout);
        toolBarSettingsLayout.setHorizontalGroup(
            toolBarSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolBarSettingsLayout.createSequentialGroup()
                .addComponent(titleImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        toolBarSettingsLayout.setVerticalGroup(
            toolBarSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolBarSettingsLayout.createSequentialGroup()
                .addComponent(titleImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        addTitle.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addTitle.setForeground(new java.awt.Color(255, 255, 255));
        addTitle.setText("Add team/player: ");

        addButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        nameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameField.setMaximumSize(new java.awt.Dimension(6, 23));
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });

        settingsTitle.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        settingsTitle.setForeground(new java.awt.Color(255, 255, 255));
        settingsTitle.setText("<html><u>Settings");

        doubleRadio.setBackground(new java.awt.Color(0, 0, 153));
        doubleRadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        doubleRadio.setForeground(new java.awt.Color(255, 255, 255));
        doubleRadio.setText("<html><strikethrough>Double Jeopardy");
        doubleRadio.setToolTipText("Adds a second round with double points");
        doubleRadio.setEnabled(false);
        doubleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleRadioActionPerformed(evt);
            }
        });

        timerSlider.setBackground(new java.awt.Color(0, 0, 153));
        timerSlider.setMajorTickSpacing(5);
        timerSlider.setMaximum(120);
        timerSlider.setMinimum(10);
        timerSlider.setPaintTicks(true);
        timerSlider.setSnapToTicks(true);
        timerSlider.setValue(30);
        timerSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                timerSliderStateChanged(evt);
            }
        });

        sliderLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sliderLabel.setForeground(new java.awt.Color(255, 255, 255));
        sliderLabel.setText("30 seconds");

        timerTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timerTitle.setForeground(new java.awt.Color(255, 255, 255));
        timerTitle.setText("<html><u>Timer length: ");

        playerList.setBackground(new java.awt.Color(0, 0, 153));
        playerList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Players", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        playerList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        playerList.setForeground(new java.awt.Color(255, 255, 255));
        playerList.setModel(new DefaultListModel());
        playerList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        playerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playerListMouseClicked(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.setEnabled(false);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        goButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        goButton.setText("GO!");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        playersError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        playersError.setForeground(new java.awt.Color(255, 0, 0));

        setupError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        setupError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout settingsPageLayout = new javax.swing.GroupLayout(settingsPage);
        settingsPage.setLayout(settingsPageLayout);
        settingsPageLayout.setHorizontalGroup(
            settingsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPageLayout.createSequentialGroup()
                        .addComponent(setupError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPageLayout.createSequentialGroup()
                        .addGroup(settingsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(settingsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doubleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(settingsPageLayout.createSequentialGroup()
                                .addComponent(timerSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sliderLabel))
                            .addComponent(timerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(settingsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(settingsPageLayout.createSequentialGroup()
                                .addComponent(playersError)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeButton))
                            .addGroup(settingsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPageLayout.createSequentialGroup()
                                    .addComponent(addTitle)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(addButton))
                                .addComponent(playerList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        settingsPageLayout.setVerticalGroup(
            settingsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPageLayout.createSequentialGroup()
                .addComponent(toolBarSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(settingsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsPageLayout.createSequentialGroup()
                        .addComponent(settingsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(doubleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(settingsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timerSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderLabel)))
                    .addComponent(playerList, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTitle)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(playersError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(settingsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goButton)
                    .addComponent(setupError))
                .addContainerGap())
        );

        mainPanel.add(settingsPage, "card4");

        gamePage.setBackground(new java.awt.Color(0, 0, 153));
        gamePage.setFocusTraversalPolicyProvider(true);
        gamePage.setMaximumSize(new java.awt.Dimension(121, 50));
        gamePage.setMinimumSize(new java.awt.Dimension(121, 23));
        gamePage.setPreferredSize(new java.awt.Dimension(700, 500));

        titleImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resorces/small_Logo_crop.png"))); // NOI18N
        titleImage1.setPreferredSize(new java.awt.Dimension(103, 50));

        javax.swing.GroupLayout toolBarLayout = new javax.swing.GroupLayout(toolBar);
        toolBar.setLayout(toolBarLayout);
        toolBarLayout.setHorizontalGroup(
            toolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolBarLayout.createSequentialGroup()
                .addComponent(titleImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        toolBarLayout.setVerticalGroup(
            toolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolBarLayout.createSequentialGroup()
                .addComponent(titleImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        questionOneLabel.setFont(questionOneLabel.getFont().deriveFont(questionOneLabel.getFont().getStyle() | java.awt.Font.BOLD, questionOneLabel.getFont().getSize()+6));
        questionOneLabel.setForeground(new java.awt.Color(255, 255, 255));
        questionOneLabel.setText("Multiplication");

        questionOneLabel1.setFont(questionOneLabel1.getFont().deriveFont(questionOneLabel1.getFont().getStyle() | java.awt.Font.BOLD, questionOneLabel1.getFont().getSize()+10));
        questionOneLabel1.setForeground(new java.awt.Color(255, 255, 255));
        questionOneLabel1.setText("Addition");

        questionOneLabel2.setFont(questionOneLabel2.getFont().deriveFont(questionOneLabel2.getFont().getStyle() | java.awt.Font.BOLD, questionOneLabel2.getFont().getSize()+10));
        questionOneLabel2.setForeground(new java.awt.Color(255, 255, 255));
        questionOneLabel2.setText("Subtration");

        questionOneLabel3.setFont(questionOneLabel3.getFont().deriveFont(questionOneLabel3.getFont().getStyle() | java.awt.Font.BOLD, questionOneLabel3.getFont().getSize()+10));
        questionOneLabel3.setForeground(new java.awt.Color(255, 255, 255));
        questionOneLabel3.setText("Division");

        multi200.setText("$200");
        multi200.setMaximumSize(new java.awt.Dimension(121, 50));
        multi200.setMinimumSize(new java.awt.Dimension(121, 23));
        multi200.setPreferredSize(new java.awt.Dimension(121, 50));
        multi200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multi200ActionPerformed(evt);
            }
        });

        multi400.setText("$400");
        multi400.setMaximumSize(new java.awt.Dimension(121, 50));
        multi400.setMinimumSize(new java.awt.Dimension(121, 23));
        multi400.setPreferredSize(new java.awt.Dimension(121, 50));
        multi400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multi400ActionPerformed(evt);
            }
        });

        multi600.setText("$600");
        multi600.setMaximumSize(new java.awt.Dimension(121, 50));
        multi600.setMinimumSize(new java.awt.Dimension(121, 23));
        multi600.setPreferredSize(new java.awt.Dimension(121, 50));
        multi600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multi600ActionPerformed(evt);
            }
        });

        multi800.setText("$800");
        multi800.setMaximumSize(new java.awt.Dimension(121, 50));
        multi800.setMinimumSize(new java.awt.Dimension(121, 23));
        multi800.setPreferredSize(new java.awt.Dimension(121, 50));
        multi800.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multi800ActionPerformed(evt);
            }
        });

        multi1000.setText("$1000");
        multi1000.setMaximumSize(new java.awt.Dimension(121, 50));
        multi1000.setMinimumSize(new java.awt.Dimension(121, 23));
        multi1000.setPreferredSize(new java.awt.Dimension(121, 50));
        multi1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multi1000ActionPerformed(evt);
            }
        });

        add600.setText("$600");
        add600.setMaximumSize(new java.awt.Dimension(121, 50));
        add600.setMinimumSize(new java.awt.Dimension(121, 23));
        add600.setPreferredSize(new java.awt.Dimension(121, 50));
        add600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add600ActionPerformed(evt);
            }
        });

        add800.setText("$800");
        add800.setMaximumSize(new java.awt.Dimension(121, 50));
        add800.setMinimumSize(new java.awt.Dimension(121, 23));
        add800.setPreferredSize(new java.awt.Dimension(121, 50));
        add800.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add800ActionPerformed(evt);
            }
        });

        add1000.setText("$1000");
        add1000.setMaximumSize(new java.awt.Dimension(121, 50));
        add1000.setMinimumSize(new java.awt.Dimension(121, 23));
        add1000.setPreferredSize(new java.awt.Dimension(121, 50));
        add1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1000ActionPerformed(evt);
            }
        });

        sub400.setText("$400");
        sub400.setMaximumSize(new java.awt.Dimension(121, 50));
        sub400.setMinimumSize(new java.awt.Dimension(121, 23));
        sub400.setPreferredSize(new java.awt.Dimension(121, 50));
        sub400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub400ActionPerformed(evt);
            }
        });

        sub600.setText("$600");
        sub600.setMaximumSize(new java.awt.Dimension(121, 50));
        sub600.setMinimumSize(new java.awt.Dimension(121, 23));
        sub600.setPreferredSize(new java.awt.Dimension(121, 50));
        sub600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub600ActionPerformed(evt);
            }
        });

        sub800.setText("$800");
        sub800.setMaximumSize(new java.awt.Dimension(121, 50));
        sub800.setMinimumSize(new java.awt.Dimension(121, 23));
        sub800.setPreferredSize(new java.awt.Dimension(121, 50));
        sub800.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub800ActionPerformed(evt);
            }
        });

        sub1000.setText("$1000");
        sub1000.setMaximumSize(new java.awt.Dimension(121, 50));
        sub1000.setMinimumSize(new java.awt.Dimension(121, 23));
        sub1000.setPreferredSize(new java.awt.Dimension(121, 50));
        sub1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub1000ActionPerformed(evt);
            }
        });

        div400.setText("$400");
        div400.setMaximumSize(new java.awt.Dimension(121, 50));
        div400.setMinimumSize(new java.awt.Dimension(121, 23));
        div400.setPreferredSize(new java.awt.Dimension(121, 50));
        div400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div400ActionPerformed(evt);
            }
        });

        div600.setText("$600");
        div600.setMaximumSize(new java.awt.Dimension(121, 50));
        div600.setMinimumSize(new java.awt.Dimension(121, 23));
        div600.setPreferredSize(new java.awt.Dimension(121, 50));
        div600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div600ActionPerformed(evt);
            }
        });

        div800.setText("$800");
        div800.setMaximumSize(new java.awt.Dimension(121, 50));
        div800.setMinimumSize(new java.awt.Dimension(121, 23));
        div800.setPreferredSize(new java.awt.Dimension(121, 50));
        div800.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div800ActionPerformed(evt);
            }
        });

        div1000.setText("$1000");
        div1000.setMaximumSize(new java.awt.Dimension(121, 50));
        div1000.setMinimumSize(new java.awt.Dimension(121, 23));
        div1000.setPreferredSize(new java.awt.Dimension(121, 50));
        div1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div1000ActionPerformed(evt);
            }
        });

        div200.setText("$200");
        div200.setMaximumSize(new java.awt.Dimension(121, 50));
        div200.setMinimumSize(new java.awt.Dimension(121, 23));
        div200.setPreferredSize(new java.awt.Dimension(121, 50));
        div200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div200ActionPerformed(evt);
            }
        });

        teamOnePanel.setBackground(new java.awt.Color(0, 0, 153));
        teamOnePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        teamOnePanel.setForeground(new java.awt.Color(0, 0, 153));
        teamOnePanel.setMaximumSize(new java.awt.Dimension(143, 72));
        teamOnePanel.setMinimumSize(new java.awt.Dimension(143, 72));

        teamOneLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teamOneLabel.setForeground(new java.awt.Color(255, 255, 255));
        teamOneLabel.setText("Name of team 1");

        teamOneScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        teamOneScore.setForeground(new java.awt.Color(255, 255, 255));
        teamOneScore.setText("$10000");

        javax.swing.GroupLayout teamOnePanelLayout = new javax.swing.GroupLayout(teamOnePanel);
        teamOnePanel.setLayout(teamOnePanelLayout);
        teamOnePanelLayout.setHorizontalGroup(
            teamOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teamOnePanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(teamOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addComponent(teamOneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teamOneScore, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(21, 21, 21))
        );
        teamOnePanelLayout.setVerticalGroup(
            teamOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamOnePanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(teamOneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamOneScore)
                .addGap(12, 12, 12))
        );

        teamTwoPanel.setBackground(new java.awt.Color(0, 0, 153));
        teamTwoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        teamTwoPanel.setForeground(new java.awt.Color(0, 0, 153));
        teamTwoPanel.setMaximumSize(new java.awt.Dimension(143, 14));
        teamTwoPanel.setMinimumSize(new java.awt.Dimension(143, 14));

        teamTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teamTwoLabel.setForeground(new java.awt.Color(255, 255, 255));
        teamTwoLabel.setText("Name of team 2");

        teamTwoScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        teamTwoScore.setForeground(new java.awt.Color(255, 255, 255));
        teamTwoScore.setText("$10000");

        javax.swing.GroupLayout teamTwoPanelLayout = new javax.swing.GroupLayout(teamTwoPanel);
        teamTwoPanel.setLayout(teamTwoPanelLayout);
        teamTwoPanelLayout.setHorizontalGroup(
            teamTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamTwoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(teamTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(teamTwoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teamTwoScore)
                    .addComponent(jSeparator2))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        teamTwoPanelLayout.setVerticalGroup(
            teamTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamTwoPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(teamTwoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamTwoScore)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        teamThreePanel.setBackground(new java.awt.Color(0, 0, 153));
        teamThreePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        teamThreePanel.setForeground(new java.awt.Color(0, 0, 153));
        teamThreePanel.setMaximumSize(new java.awt.Dimension(143, 14));
        teamThreePanel.setMinimumSize(new java.awt.Dimension(143, 14));

        teamThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teamThreeLabel.setForeground(new java.awt.Color(255, 255, 255));
        teamThreeLabel.setText("Name of team 3");

        teamThreeScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        teamThreeScore.setForeground(new java.awt.Color(255, 255, 255));
        teamThreeScore.setText("$10000");

        javax.swing.GroupLayout teamThreePanelLayout = new javax.swing.GroupLayout(teamThreePanel);
        teamThreePanel.setLayout(teamThreePanelLayout);
        teamThreePanelLayout.setHorizontalGroup(
            teamThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamThreePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(teamThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teamThreeScore)
                    .addGroup(teamThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(teamThreeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3)))
                .addGap(21, 21, 21))
        );
        teamThreePanelLayout.setVerticalGroup(
            teamThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamThreePanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(teamThreeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamThreeScore)
                .addContainerGap())
        );

        teamFourPanel.setBackground(new java.awt.Color(0, 0, 153));
        teamFourPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        teamFourPanel.setForeground(new java.awt.Color(0, 0, 153));
        teamFourPanel.setMaximumSize(new java.awt.Dimension(143, 14));
        teamFourPanel.setMinimumSize(new java.awt.Dimension(143, 14));

        teamFourLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teamFourLabel.setForeground(new java.awt.Color(255, 255, 255));
        teamFourLabel.setText("Name of team 4");

        teamFourScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        teamFourScore.setForeground(new java.awt.Color(255, 255, 255));
        teamFourScore.setText("$10000");

        javax.swing.GroupLayout teamFourPanelLayout = new javax.swing.GroupLayout(teamFourPanel);
        teamFourPanel.setLayout(teamFourPanelLayout);
        teamFourPanelLayout.setHorizontalGroup(
            teamFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamFourPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(teamFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator4)
                    .addComponent(teamFourScore)
                    .addComponent(teamFourLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        teamFourPanelLayout.setVerticalGroup(
            teamFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamFourPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(teamFourLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(teamFourScore))
        );

        add200.setText("$200");
        add200.setMaximumSize(new java.awt.Dimension(121, 50));
        add200.setMinimumSize(new java.awt.Dimension(121, 23));
        add200.setPreferredSize(new java.awt.Dimension(121, 50));
        add200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add200ActionPerformed(evt);
            }
        });

        add400.setText("$400");
        add400.setMaximumSize(new java.awt.Dimension(121, 50));
        add400.setMinimumSize(new java.awt.Dimension(121, 23));
        add400.setPreferredSize(new java.awt.Dimension(121, 50));
        add400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add400ActionPerformed(evt);
            }
        });

        sub200.setText("$200");
        sub200.setMaximumSize(new java.awt.Dimension(121, 50));
        sub200.setMinimumSize(new java.awt.Dimension(121, 23));
        sub200.setPreferredSize(new java.awt.Dimension(121, 50));
        sub200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub200ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gamePageLayout = new javax.swing.GroupLayout(gamePage);
        gamePage.setLayout(gamePageLayout);
        gamePageLayout.setHorizontalGroup(
            gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(gamePageLayout.createSequentialGroup()
                .addComponent(scoreSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(gamePageLayout.createSequentialGroup()
                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePageLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionOneLabel)
                            .addComponent(multi200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multi400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multi600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multi1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multi800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePageLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(add600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(gamePageLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(questionOneLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePageLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(add400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionOneLabel2)
                            .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(sub400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sub600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sub800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sub1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sub200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(div200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(div400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(div600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(div800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(div1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePageLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(questionOneLabel3))))
                    .addGroup(gamePageLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(teamOnePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(teamTwoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(teamThreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(teamFourPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gamePageLayout.setVerticalGroup(
            gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePageLayout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePageLayout.createSequentialGroup()
                        .addComponent(questionOneLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(add200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(add800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePageLayout.createSequentialGroup()
                        .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePageLayout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sub800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(div800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(gamePageLayout.createSequentialGroup()
                                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(questionOneLabel2)
                                    .addComponent(questionOneLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(div200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sub400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(div400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sub600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(div600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sub1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(div1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(gamePageLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(questionOneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(multi200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(multi400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(multi600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(multi800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(multi1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scoreSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gamePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teamOnePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamTwoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teamThreePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teamFourPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainPanel.add(gamePage, "card2");

        popupFrame.setBackground(new java.awt.Color(0, 0, 153));
        popupFrame.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        popupFrame.setVisible(true);

        popupMain.setLayout(new java.awt.CardLayout());

        popupPanel.setBackground(new java.awt.Color(0, 0, 153));

        popupSubmitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        popupSubmitButton.setText("Submit");
        popupSubmitButton.setEnabled(false);
        popupSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupSubmitButtonActionPerformed(evt);
            }
        });

        popupTimerPanel.setBackground(new java.awt.Color(0, 0, 153));
        popupTimerPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        timerLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(255, 255, 255));
        timerLabel.setText("0:00");
        timerLabel.setEnabled(false);

        timerProgress.setEnabled(false);

        javax.swing.GroupLayout popupTimerPanelLayout = new javax.swing.GroupLayout(popupTimerPanel);
        popupTimerPanel.setLayout(popupTimerPanelLayout);
        popupTimerPanelLayout.setHorizontalGroup(
            popupTimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupTimerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(popupTimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timerLabel)
                    .addComponent(timerProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        popupTimerPanelLayout.setVerticalGroup(
            popupTimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupTimerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timerProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        popupText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        popupText.setEnabled(false);
        popupText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupTextActionPerformed(evt);
            }
        });

        teamThreeRadio.setBackground(new java.awt.Color(0, 0, 153));
        popupNameGroup.add(teamThreeRadio);
        teamThreeRadio.setForeground(new java.awt.Color(255, 255, 255));
        teamThreeRadio.setText("teamThreeRadio");
        teamThreeRadio.setActionCommand("");
        teamThreeRadio.setEnabled(false);
        teamThreeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamThreeRadioActionPerformed(evt);
            }
        });

        teamFourRadio.setBackground(new java.awt.Color(0, 0, 153));
        popupNameGroup.add(teamFourRadio);
        teamFourRadio.setForeground(new java.awt.Color(255, 255, 255));
        teamFourRadio.setText("teamFourRadio");
        teamFourRadio.setActionCommand("");
        teamFourRadio.setEnabled(false);
        teamFourRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamFourRadioActionPerformed(evt);
            }
        });

        teamOneRadio.setBackground(new java.awt.Color(0, 0, 153));
        popupNameGroup.add(teamOneRadio);
        teamOneRadio.setForeground(new java.awt.Color(255, 255, 255));
        teamOneRadio.setText("teamOneRadio");
        teamOneRadio.setActionCommand("");
        teamOneRadio.setEnabled(false);
        teamOneRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamOneRadioActionPerformed(evt);
            }
        });

        teamTwoRadio.setBackground(new java.awt.Color(0, 0, 153));
        popupNameGroup.add(teamTwoRadio);
        teamTwoRadio.setForeground(new java.awt.Color(255, 255, 255));
        teamTwoRadio.setText("teamTwoRadio");
        teamTwoRadio.setActionCommand("");
        teamTwoRadio.setEnabled(false);
        teamTwoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamTwoRadioActionPerformed(evt);
            }
        });

        questionArea.setEditable(false);
        questionArea.setBackground(new java.awt.Color(0, 0, 153));
        questionArea.setColumns(20);
        questionArea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        questionArea.setForeground(new java.awt.Color(255, 255, 255));
        questionArea.setLineWrap(true);
        questionArea.setRows(4);
        questionArea.setText("Question goes here");
        questionArea.setWrapStyleWord(true);
        questionArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        questionArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        questionArea.setEnabled(false);
        questionArea.setMaximumSize(new java.awt.Dimension(175, 22));
        questionArea.setMinimumSize(new java.awt.Dimension(175, 22));
        jScrollPane1.setViewportView(questionArea);

        javax.swing.GroupLayout popupPanelLayout = new javax.swing.GroupLayout(popupPanel);
        popupPanel.setLayout(popupPanelLayout);
        popupPanelLayout.setHorizontalGroup(
            popupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(popupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popupPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(popupTimerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(popupPanelLayout.createSequentialGroup()
                        .addGroup(popupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(popupPanelLayout.createSequentialGroup()
                                .addGroup(popupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamThreeRadio)
                                    .addComponent(teamOneRadio))
                                .addGap(18, 18, 18)
                                .addGroup(popupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamTwoRadio)
                                    .addComponent(teamFourRadio)))
                            .addGroup(popupPanelLayout.createSequentialGroup()
                                .addComponent(popupText, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(popupSubmitButton)))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        popupPanelLayout.setVerticalGroup(
            popupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(popupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(popupTimerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(11, 11, 11)
                .addGroup(popupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamThreeRadio)
                    .addComponent(teamFourRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(popupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamOneRadio)
                    .addComponent(teamTwoRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(popupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(popupSubmitButton)
                    .addComponent(popupText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        popupMain.add(popupPanel, "mainCard");

        incorrectPanel.setBackground(new java.awt.Color(0, 0, 153));

        incorrectLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        incorrectLabel.setForeground(new java.awt.Color(255, 255, 255));
        incorrectLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resorces/answer-red-x.png"))); // NOI18N
        incorrectLabel.setText("Out of Time");
        incorrectLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout incorrectPanelLayout = new javax.swing.GroupLayout(incorrectPanel);
        incorrectPanel.setLayout(incorrectPanelLayout);
        incorrectPanelLayout.setHorizontalGroup(
            incorrectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incorrectPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(incorrectLabel)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        incorrectPanelLayout.setVerticalGroup(
            incorrectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incorrectPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(incorrectLabel)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        popupMain.add(incorrectPanel, "incorrect");

        correctPanel.setBackground(new java.awt.Color(0, 0, 153));

        correctLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        correctLabel.setForeground(new java.awt.Color(255, 255, 255));
        correctLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resorces/green-check-mark.png"))); // NOI18N
        correctLabel.setText("Correct!");
        correctLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout correctPanelLayout = new javax.swing.GroupLayout(correctPanel);
        correctPanel.setLayout(correctPanelLayout);
        correctPanelLayout.setHorizontalGroup(
            correctPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correctPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(correctLabel)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        correctPanelLayout.setVerticalGroup(
            correctPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correctPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(correctLabel)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        popupMain.add(correctPanel, "correct");

        javax.swing.GroupLayout popupFrameLayout = new javax.swing.GroupLayout(popupFrame.getContentPane());
        popupFrame.getContentPane().setLayout(popupFrameLayout);
        popupFrameLayout.setHorizontalGroup(
            popupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(popupMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        popupFrameLayout.setVerticalGroup(
            popupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(popupMain, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jLayeredPaneLayout = new javax.swing.GroupLayout(jLayeredPane);
        jLayeredPane.setLayout(jLayeredPaneLayout);
        jLayeredPaneLayout.setHorizontalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(popupFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPaneLayout.setVerticalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(popupFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane.setLayer(mainPanel, javax.swing.JLayeredPane.PALETTE_LAYER);

        mainPanel.getAccessibleContext().setAccessibleName("main");
        jLayeredPane.setLayer(popupFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        popupFrame.getAccessibleContext().setAccessibleName("popup");
        popupFrame.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.next(mainPanel);
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void multi200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multi200ActionPerformed
        multi.question(); 
        qValue = 200; 
        q.syncQuestion(multi.question, multi.answer);
        jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
        popupStart();
        multi200.setEnabled(false);
    }//GEN-LAST:event_multi200ActionPerformed

    private void multi400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multi400ActionPerformed
        multi.question(); 
        qValue = 400; 
        q.syncQuestion(multi.question, multi.answer);
        jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
        popupStart();
        multi400.setEnabled(false);
    }//GEN-LAST:event_multi400ActionPerformed

    private void timerSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_timerSliderStateChanged
        sliderLabel.setText(String.valueOf(timerSlider.getValue()) + " seconds");
        timerSet = timerSlider.getValue();
    }//GEN-LAST:event_timerSliderStateChanged

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        DefaultListModel model = (DefaultListModel) playerList.getModel();
        if (model.getSize() >= 4){
            playersError.setText("Max 4 players");
        } else {
            if (!"".equals(nameField.getText())) {
                if (nameField.getText().length() > 15){
                    playersError.setText("Max 15 characters");
                    playerErrorCount = true;
                } else {
                    if (!"".equals(nameField.getText().replaceAll("[ \\t]+", ""))) {
                        model.addElement(nameField.getText().replaceAll("[ \\t]+", ""));
                    } else {
                        playersError.setText("Must not be blank");
                        playerErrorCount = true;
                    }
                    nameField.setText("");
                    if (model.getSize() >= 4){
                        addButton.setEnabled(false);
                    }
                }
            } else {
                playersError.setText("You can't add a blank name");
                playerErrorCount = true;
            }
        }
        //System.out.println(timer.coundtdownFrom(5));
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        playersError.setText("");
        addButton.setEnabled(true);
        DefaultListModel model = (DefaultListModel) playerList.getModel();
        int index = playerList.getSelectedIndex();
        model.remove(index);
        int size = model.getSize();
        if (size == 0) { //Nobody's left, disable
            removeButton.setEnabled(false);
        } else { //Select an index.
            if (index == model.getSize()) {
                //removed item in last position
                index--;
            }
            playerList.setSelectedIndex(index);
            playerList.ensureIndexIsVisible(index);
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void playerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerListMouseClicked
        playersError.setText("");
        if (playerList.getSelectedIndex() == -1) {
            removeButton.setEnabled(false);
        } else {
            removeButton.setEnabled(true);
        }
    }//GEN-LAST:event_playerListMouseClicked

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        playersError.setText("");
        gameSetup(); 
    }//GEN-LAST:event_goButtonActionPerformed

    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped

    }//GEN-LAST:event_nameFieldKeyTyped

    private void nameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyPressed

    }//GEN-LAST:event_nameFieldKeyPressed

    private void doubleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleRadioActionPerformed
        doubleJeopardyToggle ^= true;
    }//GEN-LAST:event_doubleRadioActionPerformed

    private void popupTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popupTextActionPerformed

    private void teamThreeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamThreeRadioActionPerformed
        popupText.setText(""); 
        popupText.setEnabled(true);
        popupSubmitButton.setEnabled(true); 
        radioSelected = 3; 
    }//GEN-LAST:event_teamThreeRadioActionPerformed

    private void popupSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupSubmitButtonActionPerformed
       if (q.checkAnswer(popupText) == true){
            score[radioSelected-1] = score[radioSelected - 1] + qValue;
            updateScore(); 
            CardLayout cl = (CardLayout) (popupMain.getLayout());
            cl.show(popupMain, "correct");
            popupEndCountdown = true; 
            correct = true; 
        } else {
            CardLayout cl = (CardLayout) (popupMain.getLayout());
            cl.show(popupMain, "incorrect");
            incorrectLabel.setText("Wrong!");
            popupEndCountdown = true; 
            correct = false; 
        }
    }//GEN-LAST:event_popupSubmitButtonActionPerformed

    private void teamOneRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamOneRadioActionPerformed
        popupText.setText(""); 
        popupText.setEnabled(true);
        popupSubmitButton.setEnabled(true); 
        radioSelected = 1; 
    }//GEN-LAST:event_teamOneRadioActionPerformed

    private void teamTwoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamTwoRadioActionPerformed
        popupText.setText(""); 
        popupText.setEnabled(true);
        popupSubmitButton.setEnabled(true);
        radioSelected = 2; 
    }//GEN-LAST:event_teamTwoRadioActionPerformed

    private void teamFourRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamFourRadioActionPerformed
        popupText.setText(""); 
        popupText.setEnabled(true);
        popupSubmitButton.setEnabled(true); 
        radioSelected = 4; 
    }//GEN-LAST:event_teamFourRadioActionPerformed

    private void add200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add200ActionPerformed
        if (popup == false) {
            add.question();
            qValue = 200;
            q.syncQuestion(add.question, add.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            add200.setEnabled(false);
        }
    }//GEN-LAST:event_add200ActionPerformed

    private void add400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add400ActionPerformed
        if (popup == false) {
            add.question();
            qValue = 400;
            q.syncQuestion(add.question, add.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            add400.setEnabled(false);
        }
    }//GEN-LAST:event_add400ActionPerformed

    private void sub200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub200ActionPerformed
        if (popup == false) {
            sub.question();
            qValue = 200;
            q.syncQuestion(sub.question, sub.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            sub200.setEnabled(false);
        }
    }//GEN-LAST:event_sub200ActionPerformed

    private void multi600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multi600ActionPerformed
        if (popup == false) {
            qValue = 600;
            multi.question();
            q.syncQuestion(multi.question, multi.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            multi600.setEnabled(false);
        }
    }//GEN-LAST:event_multi600ActionPerformed

    private void multi800ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multi800ActionPerformed
        if (popup == false) {
            qValue = 800;
            multi.question();
            q.syncQuestion(multi.question, multi.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            multi800.setEnabled(false);
        }
    }//GEN-LAST:event_multi800ActionPerformed

    private void multi1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multi1000ActionPerformed
        if (popup == false) {
            qValue = 1000;
            multi.question();
            q.syncQuestion(multi.question, multi.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            multi1000.setEnabled(false);
        }
    }//GEN-LAST:event_multi1000ActionPerformed

    private void add600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add600ActionPerformed
        if (popup == false) {
            qValue = 600;
            add.question();
            q.syncQuestion(add.question, add.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            add600.setEnabled(false);
        }
    }//GEN-LAST:event_add600ActionPerformed

    private void add800ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add800ActionPerformed
        if (popup == false) {
            qValue = 800;
            add.question();
            q.syncQuestion(add.question, add.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            add800.setEnabled(false);
        }
    }//GEN-LAST:event_add800ActionPerformed

    private void add1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1000ActionPerformed
        if (popup == false) {
            qValue = 1000;
            add.question();
            q.syncQuestion(add.question, add.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            add1000.setEnabled(false);
        }
    }//GEN-LAST:event_add1000ActionPerformed

    private void sub400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub400ActionPerformed
        if (popup == false) {
            qValue = 400;
            sub.question();
            q.syncQuestion(sub.question, sub.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            sub400.setEnabled(false);
        }
    }//GEN-LAST:event_sub400ActionPerformed

    private void sub600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub600ActionPerformed
        if (popup == false) {
            qValue = 600;
            sub.question();
            q.syncQuestion(sub.question, sub.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            sub600.setEnabled(false);
        }
    }//GEN-LAST:event_sub600ActionPerformed

    private void sub800ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub800ActionPerformed
        if (popup == false) {
            qValue = 800;
            sub.question();
            q.syncQuestion(sub.question, sub.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            sub800.setEnabled(false);
        }
    }//GEN-LAST:event_sub800ActionPerformed

    private void sub1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub1000ActionPerformed
        if (popup == false) {
            qValue = 1000;
            sub.question();
            q.syncQuestion(sub.question, sub.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            sub1000.setEnabled(false);
        }
    }//GEN-LAST:event_sub1000ActionPerformed

    private void div200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div200ActionPerformed
        if (popup == false) {
            qValue = 200;
            div.question();
            q.syncQuestion(div.question, div.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            div200.setEnabled(false);
        }
    }//GEN-LAST:event_div200ActionPerformed

    private void div400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div400ActionPerformed
        if (popup == false) {
            qValue = 400;
            div.question();
            q.syncQuestion(div.question, div.answer);
            jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
            popupStart();
            div400.setEnabled(false);
        }
    }//GEN-LAST:event_div400ActionPerformed

    private void div600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div600ActionPerformed
        if (popup == false){  
            qValue = 600; 
        }
        div.question();
        q.syncQuestion(div.question, div.answer);
        jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
        popupStart();
        div600.setEnabled(false);
    }//GEN-LAST:event_div600ActionPerformed

    private void div800ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div800ActionPerformed
        if (popup == false){  
            qValue = 800; 
        }
        div.question();
        q.syncQuestion(div.question, div.answer);
        jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
        popupStart();
        div800.setEnabled(false);
    }//GEN-LAST:event_div800ActionPerformed

    private void div1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div1000ActionPerformed
        if (popup == false) {
            qValue = 1000;
        }
        div.question();
        q.syncQuestion(div.question, div.answer);
        jLayeredPane.setLayer(popupFrame, jLayeredPane.POPUP_LAYER);
        popupStart();
        div1000.setEnabled(false);
    }//GEN-LAST:event_div1000ActionPerformed
      
    private void gameSetup(){ 
        DefaultListModel model = (DefaultListModel) playerList.getModel();
        if (model.getSize() < 2){
            setupError.setText("Min 2 players");
            return; 
        }
        teamNames = new String[4]; 
        model.copyInto(teamNames);
        for (int i = 0;i<teamNames.length;i++){
            switch (i+1){ 
                case 1:
                    teamOneLabel.setText(teamNames[i]); 
                    teamOneScore.setText("$0"); 
                    break;
                case 2: 
                    teamTwoLabel.setText(teamNames[i]); 
                    teamTwoScore.setText("$0"); 
                    break;
                case 3:
                    if (teamNames[i] == null){
                        teamThreePanel.setVisible(false);
                    } else {
                        teamThreeLabel.setText(teamNames[i]);
                        teamThreeScore.setText("$0");
                    }
                    break;
                case 4: 
                    if (teamNames[i] == null){
                        teamFourPanel.setVisible(false);
                    } else {
                        teamFourLabel.setText(teamNames[i]); 
                        teamFourScore.setText("$0"); 
                    }
                    break;
                default:
                    setupError.setText("Team creation error");
                    return; 
            }
        }
        
        // <editor-fold defaultstate="collapsed" desc="Reset buttons to enabled"> 
        multi200.setEnabled(true);
        multi400.setEnabled(true);
        multi600.setEnabled(true);
        multi800.setEnabled(true);
        multi1000.setEnabled(true);
        
        add200.setEnabled(true);
        add400.setEnabled(true);
        add600.setEnabled(true);
        add800.setEnabled(true);
        add1000.setEnabled(true);
        
        sub200.setEnabled(true);
        sub400.setEnabled(true);
        sub600.setEnabled(true);
        sub800.setEnabled(true);
        sub1000.setEnabled(true);
        
        div200.setEnabled(true);
        div400.setEnabled(true);
        div600.setEnabled(true);
        div800.setEnabled(true);
        div1000.setEnabled(true);
        // </editor-fold>
        
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.next(mainPanel);
    }
    
    void popupStart(){
        popup = true;
        CardLayout cl = (CardLayout) (popupMain.getLayout());
        cl.show(popupMain, "mainCard");
        enableComponents(popupFrame, true); 
        teamBuzzer(); 
        gameTimer = timerSet; 
        popupNameGroup.clearSelection(); 
        radioSelected = 0; 
        questionArea.setText(q.question);
        timerLabel.setText(String.valueOf(gameTimer)); 
        timerProgress.setMaximum(gameTimer);
        popupCountdown = true; 
        correct = false; 
        
        //Start timer
        
        for (int i = 0;i<teamNames.length;i++){
            switch (i+1){ 
                case 1:
                    teamOneRadio.setText(teamNames[i]); 
                    break;
                case 2: 
                    teamTwoRadio.setText(teamNames[i]); 
                    break;
                case 3:
                    if (teamNames[i] == null){
                        teamThreeRadio.setVisible(false);
                    } else {
                        teamThreeRadio.setText(teamNames[i]); 
                    }
                    break;
                case 4: 
                    if (teamNames[i] == null){
                        teamFourRadio.setVisible(false);
                    } else {
                        teamFourRadio.setText(teamNames[i]); 
                    }
                    break;
                default:
                    setupError.setText("Radio assignment error");
                    return; 
            }
        }
    }
    
    private class Updater implements Runnable {
        @Override
        public void run() {
            if (popupCountdown == true) {
                if (gameTimer >= 1) {
                    timerLabel.setText(String.valueOf(gameTimer));
                    timerProgress.setValue(gameTimer);
                    gameTimer--;
                } else if (gameTimer == 0) {
                    //outOfTime.run();
                    CardLayout cl = (CardLayout) (popupMain.getLayout());
                    cl.show(popupMain, "incorrect");
                    incorrectLabel.setText("Time's Up!");
                    if (errorTimer > 0){
                        errorTimer--;
                    } else {
                        popupCountdown = false;
                        errorTimer = 3;
                        jLayeredPane.setLayer(popupFrame, jLayeredPane.DEFAULT_LAYER);
                        enableComponents(popupFrame, false);
                        popup = false; 
                    }
                }
            }
            if (popupEndCountdown == true){
                if (correct == true){
                    if (errorTimer > 0){
                        errorTimer--;
                    } else {
                        errorTimer = 3;
                        jLayeredPane.setLayer(popupFrame, jLayeredPane.DEFAULT_LAYER);
                        enableComponents(popupFrame, false);
                        popup = false; 
                        popupEndCountdown = false; 
                    }
                } else {
                    if (errorTimer > 0){
                        errorTimer--;
                    } else {
                        CardLayout cl = (CardLayout) (popupMain.getLayout());
                        cl.show(popupMain, "mainCard");
                        errorTimer = 3;
                        
                        switch (radioSelected) {
                            case 1:
                                teamOneRadio.setEnabled(false);
                                break;
                            case 2:
                                teamTwoRadio.setEnabled(false);
                                break;
                            case 3:
                                teamThreeRadio.setEnabled(false);
                                break;
                            case 4:
                                teamFourRadio.setEnabled(false);
                                break;
                        }
                        popupNameGroup.clearSelection();
                        radioSelected = 0;
                        gameTimer = 10; 
                        teamBuzzer();
                        popupEndCountdown = false; 
                    }
                }
            }
            if (playerErrorCount == true){if (errorTimer > 0){
                        errorTimer--;
                    } else {
                        errorTimer = 3;
                        playersError.setText("");
                        playerErrorCount = false;
                    }
            }
        }
    }
    
    public void enableComponents(Container container, boolean enable) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            component.setEnabled(enable);
            if (component instanceof Container) {
                enableComponents((Container)component, enable);
            }
        }
    }
    
    void teamBuzzer(){
        popupText.setText("Hit buzzer (select team)");
        popupText.setEnabled(false);
        popupSubmitButton.setEnabled(false); 
    }
    
    void updateScore(){
        for (int i = 0;i<4;i++){
            switch (i + 1){ 
                case 1: 
                    teamOneScore.setText("$"+score[i]); 
                    break;
                case 2: 
                    teamTwoScore.setText("$"+score[i]); 
                    break;
                case 3:
                    teamThreeScore.setText("$"+score[i]);
                    break;
                case 4: 
                    teamFourScore.setText("$" +score[i]);
                    break;
                default:
                    setupError.setText("Score Update Error");
                    return; 
            }
        }
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JeopardyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JeopardyGUI().setVisible(true);
            }
        }); 
    }

    // <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add1000;
    private javax.swing.JButton add200;
    private javax.swing.JButton add400;
    private javax.swing.JButton add600;
    private javax.swing.JButton add800;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addTitle;
    private javax.swing.JLabel correctLabel;
    private javax.swing.JPanel correctPanel;
    private javax.swing.JButton div1000;
    private javax.swing.JButton div200;
    private javax.swing.JButton div400;
    private javax.swing.JButton div600;
    private javax.swing.JButton div800;
    private javax.swing.JRadioButton doubleRadio;
    private javax.swing.JPanel gamePage;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel incorrectLabel;
    private javax.swing.JPanel incorrectPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton multi1000;
    private javax.swing.JButton multi200;
    private javax.swing.JButton multi400;
    private javax.swing.JButton multi600;
    private javax.swing.JButton multi800;
    private javax.swing.JTextField nameField;
    private javax.swing.JList playerList;
    private javax.swing.JLabel playersError;
    private javax.swing.JInternalFrame popupFrame;
    private javax.swing.JPanel popupMain;
    private javax.swing.ButtonGroup popupNameGroup;
    private javax.swing.JPanel popupPanel;
    private javax.swing.JButton popupSubmitButton;
    private javax.swing.JTextField popupText;
    private javax.swing.JPanel popupTimerPanel;
    private javax.swing.JTextArea questionArea;
    private javax.swing.JLabel questionOneLabel;
    private javax.swing.JLabel questionOneLabel1;
    private javax.swing.JLabel questionOneLabel2;
    private javax.swing.JLabel questionOneLabel3;
    private javax.swing.JButton removeButton;
    private javax.swing.JSeparator scoreSeperator;
    private javax.swing.JPanel settingsPage;
    private javax.swing.JLabel settingsTitle;
    private javax.swing.JLabel setupError;
    private javax.swing.JLabel sliderLabel;
    private javax.swing.JPanel splashScreen;
    private javax.swing.JButton sub1000;
    private javax.swing.JButton sub200;
    private javax.swing.JButton sub400;
    private javax.swing.JButton sub600;
    private javax.swing.JButton sub800;
    private javax.swing.JLabel teamFourLabel;
    private javax.swing.JPanel teamFourPanel;
    private javax.swing.JRadioButton teamFourRadio;
    private javax.swing.JLabel teamFourScore;
    private javax.swing.JLabel teamOneLabel;
    private javax.swing.JPanel teamOnePanel;
    private javax.swing.JRadioButton teamOneRadio;
    private javax.swing.JLabel teamOneScore;
    private javax.swing.JLabel teamThreeLabel;
    private javax.swing.JPanel teamThreePanel;
    private javax.swing.JRadioButton teamThreeRadio;
    private javax.swing.JLabel teamThreeScore;
    private javax.swing.JLabel teamTwoLabel;
    private javax.swing.JPanel teamTwoPanel;
    private javax.swing.JRadioButton teamTwoRadio;
    private javax.swing.JLabel teamTwoScore;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JProgressBar timerProgress;
    private javax.swing.JSlider timerSlider;
    private javax.swing.JLabel timerTitle;
    private javax.swing.JLabel titleImage;
    private javax.swing.JLabel titleImage1;
    private javax.swing.JLabel titleImage2;
    private javax.swing.JPanel toolBar;
    private javax.swing.JPanel toolBarSettings;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
