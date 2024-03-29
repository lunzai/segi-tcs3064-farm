package farm;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * GUI - The main class for this farm management project
 * 
 * Name: Leong Hean Luen
 * Student ID: SUKD2301060
 * Course: Bachelor of Information Technology (BIT)
 * Subject: TCS3064 - OOP
 * Date: 22/08/2023
 * 
 * @author Hean Luen
 */
public class FarmManagementSystem extends javax.swing.JFrame {

    private Farm farm;
    private JFrame viewCropsPanel;
    private JFrame addCropPanel;
    /**
     * Creates new form FarmManagementSystem
     */
    public FarmManagementSystem() {
        initComponents();
        farm = new Farm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonViewCrops = new javax.swing.JButton();
        buttonAddApple = new javax.swing.JButton();
        buttonAddOrange = new javax.swing.JButton();
        buttonQuit = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuFms = new javax.swing.JMenu();
        menuItemQuit = new javax.swing.JMenuItem();
        menuCrops = new javax.swing.JMenu();
        menuItemViewCrops = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemAddOrange = new javax.swing.JMenuItem();
        menuItemAddApple = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farm Managment System");
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setMinimumSize(new java.awt.Dimension(300, 360));
        setPreferredSize(new java.awt.Dimension(300, 360));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 360));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(4, 1));

        buttonViewCrops.setFont(buttonViewCrops.getFont().deriveFont(buttonViewCrops.getFont().getStyle() | java.awt.Font.BOLD, buttonViewCrops.getFont().getSize()+9));
        buttonViewCrops.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboard32.png"))); // NOI18N
        buttonViewCrops.setText("View Crops");
        buttonViewCrops.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonViewCrops.setIconTextGap(16);
        buttonViewCrops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewCropsActionPerformed(evt);
            }
        });
        getContentPane().add(buttonViewCrops);

        buttonAddApple.setFont(buttonAddApple.getFont().deriveFont(buttonAddApple.getFont().getStyle() | java.awt.Font.BOLD, buttonAddApple.getFont().getSize()+9));
        buttonAddApple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/apple32.png"))); // NOI18N
        buttonAddApple.setText("Add Apple");
        buttonAddApple.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonAddApple.setIconTextGap(16);
        buttonAddApple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddAppleActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAddApple);

        buttonAddOrange.setFont(buttonAddOrange.getFont().deriveFont(buttonAddOrange.getFont().getStyle() | java.awt.Font.BOLD, buttonAddOrange.getFont().getSize()+9));
        buttonAddOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/orange32.png"))); // NOI18N
        buttonAddOrange.setText("Add Orange");
        buttonAddOrange.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonAddOrange.setIconTextGap(16);
        buttonAddOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddOrangeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAddOrange);

        buttonQuit.setFont(buttonQuit.getFont().deriveFont(buttonQuit.getFont().getStyle() | java.awt.Font.BOLD, buttonQuit.getFont().getSize()+9));
        buttonQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close32.png"))); // NOI18N
        buttonQuit.setText("Quit");
        buttonQuit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonQuit.setIconTextGap(16);
        buttonQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonQuitActionPerformed(evt);
            }
        });
        getContentPane().add(buttonQuit);

        menuBar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        menuFms.setText("FMS");
        menuFms.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        menuItemQuit.setFont(menuItemQuit.getFont().deriveFont(menuItemQuit.getFont().getSize()+2f));
        menuItemQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close24.png"))); // NOI18N
        menuItemQuit.setText("Quit");
        menuItemQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemQuitActionPerformed(evt);
            }
        });
        menuFms.add(menuItemQuit);

        menuBar.add(menuFms);

        menuCrops.setText("Crops");
        menuCrops.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        menuItemViewCrops.setFont(menuItemViewCrops.getFont().deriveFont(menuItemViewCrops.getFont().getSize()+2f));
        menuItemViewCrops.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboard24.png"))); // NOI18N
        menuItemViewCrops.setText("View Crops");
        menuItemViewCrops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemViewCropsActionPerformed(evt);
            }
        });
        menuCrops.add(menuItemViewCrops);
        menuCrops.add(jSeparator1);

        menuItemAddOrange.setFont(menuItemAddOrange.getFont().deriveFont(menuItemAddOrange.getFont().getSize()+2f));
        menuItemAddOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/orange24.png"))); // NOI18N
        menuItemAddOrange.setText("Add Orange");
        menuItemAddOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddOrangeActionPerformed(evt);
            }
        });
        menuCrops.add(menuItemAddOrange);

        menuItemAddApple.setFont(menuItemAddApple.getFont().deriveFont(menuItemAddApple.getFont().getSize()+2f));
        menuItemAddApple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/apple24.png"))); // NOI18N
        menuItemAddApple.setText("Add Apple");
        menuItemAddApple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddAppleActionPerformed(evt);
            }
        });
        menuCrops.add(menuItemAddApple);

        menuBar.add(menuCrops);

        setJMenuBar(menuBar);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemQuitActionPerformed

    private void menuItemAddAppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddAppleActionPerformed
        handleAddCrop("Apple");
    }//GEN-LAST:event_menuItemAddAppleActionPerformed

    private void buttonViewCropsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewCropsActionPerformed
        handleViewCrops();
    }//GEN-LAST:event_buttonViewCropsActionPerformed

    private void buttonQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonQuitActionPerformed

    private void menuItemAddOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddOrangeActionPerformed
        handleAddCrop("Orange");
    }//GEN-LAST:event_menuItemAddOrangeActionPerformed

    private void menuItemViewCropsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemViewCropsActionPerformed
        handleViewCrops();
    }//GEN-LAST:event_menuItemViewCropsActionPerformed

    private void buttonAddAppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddAppleActionPerformed
        handleAddCrop("Apple");
    }//GEN-LAST:event_buttonAddAppleActionPerformed

    private void buttonAddOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddOrangeActionPerformed
        handleAddCrop("Orange");
    }//GEN-LAST:event_buttonAddOrangeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Crop crop;
        crop = new Apple("Red Apple", LocalDate.now().minusDays( 20));
        crop.setHarvestedStage();
        crop.harvest();
        crop.setYield(100.0);
        crop.applyWatering();
        crop.applyPestControl();
        crop.applyPestControl();
        farm.addCrop(crop);
        
        crop = new Apple("Fuji Apple", LocalDate.now().minusDays( 10));
        crop.setMaturedStage();
        crop.applyWatering();
        crop.applyWatering();
        crop.applyPestControl();
        farm.addCrop(crop);
        
        crop = new Orange("Tangerine", LocalDate.now().minusDays( 15));
        crop.setHarvestedStage();
        crop.harvest();
        crop.setYield(120.0);
        crop.applyWatering();
        crop.applyWatering();
        crop.applyPestControl();
        crop.applyPestControl();
        crop.applyPestControl();
        farm.addCrop(crop);
        
        crop = new Orange("Navel Orange", LocalDate.now().minusDays( 11));
        farm.addCrop(crop);
        
        crop = new Orange("Clementine", LocalDate.now().minusDays( 10));
        farm.addCrop(crop);
        
        crop = new Orange("Seville Orange", LocalDate.now().minusDays( 5));
        farm.addCrop(crop);
        
        updateCropCount();
    }//GEN-LAST:event_formWindowOpened

    private void handleViewCrops() {
        if (farm.getCrops().isEmpty()) {
            showErrorDialog("Farm is currently empty, please add crops.", "Unable to view crops");
            return;
        }
        if (viewCropsPanel != null) {
            viewCropsPanel.dispose();
        }
        viewCropsPanel = new ViewCrops(farm, this);
        viewCropsPanel.setVisible(true);
    }
    
    public void updateCropCount() {
        buttonViewCrops.setText("View Crops (" + farm.getCrops().size() + ")");
    }
    
    private void handleAddCrop(String type) {
        Crop crop;
        switch (type) {
            case "Apple" -> crop = new Apple();
            case "Orange" -> crop = new Orange();
            default -> throw new IllegalArgumentException("Invalid crop type");
        }
        
        if (addCropPanel != null) {
            addCropPanel.dispose();
        }        
        addCropPanel = new AddCrop(farm, crop);
        addCropPanel.setVisible(true);
        addCropPanel.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                updateCropCount();
            }
        });
    }
    
    private void showErrorDialog(String message, String title) {
        ImageIcon errorIcon = new ImageIcon("src/images/cancel64.png");
        JLabel errorLabel = new JLabel(message);
        errorLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        JOptionPane.showMessageDialog(null, errorLabel, title, JOptionPane.ERROR_MESSAGE, errorIcon);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FarmManagementSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddApple;
    private javax.swing.JButton buttonAddOrange;
    private javax.swing.JButton buttonQuit;
    private javax.swing.JButton buttonViewCrops;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCrops;
    private javax.swing.JMenu menuFms;
    private javax.swing.JMenuItem menuItemAddApple;
    private javax.swing.JMenuItem menuItemAddOrange;
    private javax.swing.JMenuItem menuItemQuit;
    private javax.swing.JMenuItem menuItemViewCrops;
    // End of variables declaration//GEN-END:variables
}
