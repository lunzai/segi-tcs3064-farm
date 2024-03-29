package farm;

import java.awt.Font;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * GUI - Form for adding crops
 * 
 * Name: Leong Hean Luen
 * Student ID: SUKD2301060
 * Course: Bachelor of Information Technology (BIT)
 * Subject: TCS3064 - OOP
 * Date: 22/08/2023
 * 
 * @author Hean Luen
 */
public class AddCrop extends javax.swing.JFrame {

    private Crop crop;
    private Farm farm;
    
    /**
     * AddCrop constructor
     */
    public AddCrop() {
        initComponents();
    }
    
    /**
     * Creates new form AddCrop
     * 
     * @param farm Farm 
     * @param crop Crop
     */
    public AddCrop(Farm farm, Crop crop) {
        this.farm = farm;
        this.crop = crop;
        initComponents();
        if (crop instanceof Apple) {
            panelTitle.setText("Add Crop: Apple");
            setTitle("Add Crop: Apple");
        } else if (crop instanceof Orange) {
            panelTitle.setText("Add Crop: Orange");
            setTitle("Add Crop: Orange");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitle = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        labelPlantingDate = new javax.swing.JLabel();
        fieldPlantingDate = new com.github.lgooddatepicker.components.DatePicker();
        buttonPanel = new javax.swing.JPanel();
        buttonSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Crop");
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        panelTitle.setText("Add Crop");
        panelTitle.setFont(panelTitle.getFont().deriveFont(panelTitle.getFont().getStyle() | java.awt.Font.BOLD, panelTitle.getFont().getSize()+3));

        formPanel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        formPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        labelName.setFont(labelName.getFont().deriveFont(labelName.getFont().getSize()+2f));
        labelName.setText("Name");
        labelName.setPreferredSize(new java.awt.Dimension(160, 17));
        formPanel.add(labelName);

        fieldName.setFont(fieldName.getFont().deriveFont(fieldName.getFont().getSize()+2f));
        fieldName.setPreferredSize(new java.awt.Dimension(300, 32));
        fieldName.setToolTipText("");
        formPanel.add(fieldName);

        labelPlantingDate.setFont(labelPlantingDate.getFont().deriveFont(labelPlantingDate.getFont().getSize()+2f));
        labelPlantingDate.setText("Planting Date");
        labelPlantingDate.setPreferredSize(new java.awt.Dimension(160, 17));
        formPanel.add(labelPlantingDate);

        fieldPlantingDate.setFont(fieldPlantingDate.getFont().deriveFont(fieldPlantingDate.getFont().getSize()+2f));
        fieldPlantingDate.setPreferredSize(new java.awt.Dimension(300, 32));
        formPanel.add(fieldPlantingDate);

        buttonSubmit.setFont(buttonSubmit.getFont().deriveFont(buttonSubmit.getFont().getSize()+2f));
        buttonSubmit.setText("Submit");
        buttonSubmit.setPreferredSize(new java.awt.Dimension(120, 32));
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });
        buttonPanel.add(buttonSubmit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        String name = fieldName.getText().trim();
        LocalDate plantingDate = fieldPlantingDate.getDate();
        
        if (name.isEmpty() || plantingDate == null) {
            showErrorDialog("Please fill in all fields.", "Validation Error");
            return;
        }
        
        crop.setName(name);
        crop.setPlantingDate(plantingDate);
        
        farm.addCrop(crop);
        showSuccessDialog("Crop Added.", "Successful");
        
        dispose();
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private void showErrorDialog(String message, String title) {
        ImageIcon errorIcon = new ImageIcon("src/images/cancel64.png");
        JLabel errorLabel = new JLabel(message);
        errorLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        JOptionPane.showMessageDialog(null, errorLabel, title, JOptionPane.ERROR_MESSAGE, errorIcon);
    }
    
    private void showSuccessDialog(String message, String title) {
        ImageIcon errorIcon = new ImageIcon("src/images/checked64.png");
        JLabel errorLabel = new JLabel(message);
        errorLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        JOptionPane.showMessageDialog(null, errorLabel, title, JOptionPane.PLAIN_MESSAGE, errorIcon);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCrop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JTextField fieldName;
    private com.github.lgooddatepicker.components.DatePicker fieldPlantingDate;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPlantingDate;
    private javax.swing.JLabel panelTitle;
    // End of variables declaration//GEN-END:variables
}
