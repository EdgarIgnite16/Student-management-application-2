package BUS;

import DTO.SinhVienDTO;
import GUI.SinhVienGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SinhVienBUS implements ActionListener, MouseListener {
    private final SinhVienGUI view;

    public SinhVienBUS(SinhVienGUI view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acctionCommand = e.getActionCommand();
        switch (acctionCommand) {
            case "Refresh" -> {
                this.view.refreshForm();
            }

            case "Search" -> {
                this.view.searchSinhVien();
            }

            case "Save" -> {
                StringBuilder sb = new StringBuilder();
                if(this.view.jTextField_IDSV.getText().equals("")) {
                    sb.append("Mã sinh viên không được để trống !");
                    this.view.jTextField_IDSV.setBackground(Color.RED);
                } else {
                    this.view.jTextField_IDSV.setBackground(Color.WHITE);
                }

                if(!this.view.jRadioButton_Male.isSelected() && !this.view.jRadioButton_Female.isSelected()) {
                    sb.append("\nPhải tích chọn vào ô giới tính");
                }

                if(sb.length() > 0) {
                    this.view.printDialogError(sb);
                }else {
                    this.view.saveInfo();
                }
            }

            case "Update" -> {
                StringBuilder sb = new StringBuilder();
                if(this.view.jTextField_IDSV.getText().equals("")) {
                    sb.append("Mã sinh viên không được để trống !");
                    this.view.jTextField_IDSV.setBackground(Color.RED);
                } else {
                    this.view.jTextField_IDSV.setBackground(Color.WHITE);
                }

                if(sb.length() > 0) {
                    this.view.printDialogError(sb);
                }else {
                    this.view.updateInfo();
                }
            }

            case "Delete" -> {
                StringBuilder sb = new StringBuilder();
                if(this.view.jTextField_IDSV.getText().equals("")) {
                    sb.append("Mã sinh viên không được để trống !");
                    this.view.jTextField_IDSV.setBackground(Color.RED);
                } else {
                    this.view.jTextField_IDSV.setBackground(Color.WHITE);
                }

                if(sb.length() > 0) {
                    this.view.printDialogError(sb);
                }else {
                    this.view.deleteInfo();
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int selectedRow = view.jTable_DataSinhVien.getSelectedRow();
        view.printInformation(selectedRow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
