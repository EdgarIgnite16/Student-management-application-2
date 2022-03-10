package _Test;

import GUI.SinhVienGUI;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new SinhVienGUI();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
