/*
 * Created by JFormDesigner on Fri Apr 16 12:31:37 CST 2021
 */

package com.melo.notes;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author 1
 */
public class ok extends JFrame {
    public ok() {
        initComponents();
        setVisible(true);
        JOptionPane.showMessageDialog(null,"好的");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("com.melo.notes.view.note");

        //======== this ========
        setTitle(bundle.getString("ok.this.title"));
        Container contentPane = getContentPane();

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGap(0, 398, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGap(0, 268, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
