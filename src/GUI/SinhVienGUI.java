package GUI;

import BUS.SinhVienBUS;
import DAO.SinhVienDAO;
import DTO.SinhVienDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class SinhVienGUI extends JFrame {
    // Variables declaration - do not modify
    public javax.swing.ButtonGroup btnGroup_Sex;
    public javax.swing.JButton jButton_Delete;
    public javax.swing.JButton jButton_First;
    public javax.swing.JButton jButton_Refresh;
    public javax.swing.JButton jButton_Last;
    public javax.swing.JButton jButton_Next;
    public javax.swing.JButton jButton_Previous;
    public javax.swing.JButton jButton_Save;
    public javax.swing.JButton jButton_Search;
    public javax.swing.JButton jButton_Update;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel_Address;
    public javax.swing.JLabel jLabel_Email;
    public javax.swing.JLabel jLabel_IDSV;
    public javax.swing.JLabel jLabel_Name;
    public javax.swing.JLabel jLabel_Sex;
    public javax.swing.JLabel jLabel_Title;
    public javax.swing.JPanel jPanel_FormTittle;
    public javax.swing.JPanel jPanel_InputValue;
    public javax.swing.JPanel jPanel_Table;
    public javax.swing.JRadioButton jRadioButton_Female;
    public javax.swing.JRadioButton jRadioButton_Male;
    public javax.swing.JScrollPane jScrollPane_Table;
    public javax.swing.JSeparator jSeparator;
    public javax.swing.JTable jTable_DataSinhVien;
    public javax.swing.JTextField jTextField_Address;
    public javax.swing.JTextField jTextField_Email;
    public javax.swing.JTextField jTextField_IDSV;
    public javax.swing.JTextField jTextField_Name;
    public javax.swing.JTextField jTextField_PhoneNumber;
    // End of variables declaration

    private DefaultTableModel model_table;
    private final String[] columnHeaders = new String[] {"MaSV", "HoTen",  "Email",  "SDT",  "GioiTinh", "DiaChi"};

    public SinhVienGUI() throws HeadlessException {
        this.initTable();
        this.initComponents();
        this.setVisible(true);
    }

    public void initTable() {
        model_table = new DefaultTableModel();
        model_table.setColumnIdentifiers(columnHeaders);
        try {
            ArrayList<SinhVienDTO> sinhVienDTOS = new SinhVienDAO().getData();
            sinhVienDTOS.forEach(item -> {
                model_table.addRow(new Object[] {
                        item.getID(),
                        item.getFullname(),
                        item.getEmail(),
                        item.getPhoneNumber(),
                        item.getSex(),
                        item.getAddress()
                });
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void initComponents() {
        btnGroup_Sex = new javax.swing.ButtonGroup();
        jPanel_FormTittle = new javax.swing.JPanel();
        jLabel_Title = new javax.swing.JLabel();
        jPanel_InputValue = new javax.swing.JPanel();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_IDSV = new javax.swing.JLabel();
        jLabel_Sex = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jTextField_IDSV = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jTextField_PhoneNumber = new javax.swing.JTextField();
        jTextField_Address = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jSeparator = new javax.swing.JSeparator();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jRadioButton_Female = new javax.swing.JRadioButton();
        jButton_Refresh = new javax.swing.JButton();
        jButton_Search = new javax.swing.JButton();
        jButton_Save = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_Last = new javax.swing.JButton();
        jButton_First = new javax.swing.JButton();
        jButton_Previous = new javax.swing.JButton();
        jButton_Next = new javax.swing.JButton();
        jPanel_Table = new javax.swing.JPanel();
        jScrollPane_Table = new javax.swing.JScrollPane();
        jTable_DataSinhVien = new javax.swing.JTable();
        ActionListener eventBtn = new SinhVienBUS(this);


        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.setFocusCycleRoot(false);
        this.setResizable(false);
        this.setTitle("Phần mềm quản lí sinh viên");

        jPanel_FormTittle.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel_Title.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setIcon(new javax.swing.ImageIcon("icons\\Student-3-icon.png")); // NOI18N
        jLabel_Title.setText("Phần mềm quản lí Sinh Viên");

        javax.swing.GroupLayout jPanel_FormTittleLayout = new javax.swing.GroupLayout(jPanel_FormTittle);
        jPanel_FormTittle.setLayout(jPanel_FormTittleLayout);
        jPanel_FormTittleLayout.setHorizontalGroup(
                jPanel_FormTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_FormTittleLayout.setVerticalGroup(
                jPanel_FormTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel_InputValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Name.setText("Fullname:");

        jLabel_IDSV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_IDSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_IDSV.setText("ID: ");

        jLabel_Sex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Sex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Sex.setText("Sex:");

        jLabel_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Email.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PhoneNumber:");

        jLabel_Address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Address.setText("Address:");

        btnGroup_Sex.add(jRadioButton_Male);
        jRadioButton_Male.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_Male.setText("Male");

        btnGroup_Sex.add(jRadioButton_Female);
        jRadioButton_Female.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_Female.setText("Female");

        jTextField_IDSV.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextField_Name.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextField_PhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextField_Address.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextField_Email.setFont(new java.awt.Font("Segoe UI", 0, 14));

        jButton_Refresh.setIcon(new javax.swing.ImageIcon("icons\\new-icon-16.png")); // NOI18N
        jButton_Refresh.setText("Refresh");
        jButton_Refresh.addActionListener(eventBtn);

        jButton_Search.setIcon(new javax.swing.ImageIcon("icons\\search-icon-24.png")); // NOI18N
        jButton_Search.setText("Search");
        jButton_Search.addActionListener(eventBtn);

        jButton_Save.setIcon(new javax.swing.ImageIcon("icons\\Save-icon.png")); // NOI18N
        jButton_Save.setText("Save");
        jButton_Save.addActionListener(eventBtn);

        jButton_Update.setIcon(new javax.swing.ImageIcon("icons\\Actions-document-edit-icon-16.png")); // NOI18N
        jButton_Update.setText("Update");
        jButton_Update.addActionListener(eventBtn);

        jButton_Delete.setIcon(new javax.swing.ImageIcon("icons\\Actions-edit-delete-icon-16.png")); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(eventBtn);

        jButton_Last.setIcon(new javax.swing.ImageIcon("icons\\Button-Last-icon-48.png")); // NOI18N
//        jButton_Last.addActionListener(eventBtn);

        jButton_First.setIcon(new javax.swing.ImageIcon("icons\\Button-First-icon-48.png")); // NOI18N
//        jButton_First.addActionListener(eventBtn);

        jButton_Previous.setIcon(new javax.swing.ImageIcon("icons\\Fast-backward-icon-48.png")); // NOI18N
//        jButton_Previous.addActionListener(eventBtn);

        jButton_Next.setIcon(new javax.swing.ImageIcon("icons\\Fast-forward-icon-48.png")); // NOI18N
//        jButton_Next.addActionListener(eventBtn);

        javax.swing.GroupLayout jPanel_InputValueLayout = new javax.swing.GroupLayout(jPanel_InputValue);
        jPanel_InputValue.setLayout(jPanel_InputValueLayout);
        jPanel_InputValueLayout.setHorizontalGroup(
                jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_InputValueLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator)
                                        .addGroup(jPanel_InputValueLayout.createSequentialGroup()
                                                .addGroup(jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_InputValueLayout.createSequentialGroup()
                                                                .addGroup(jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jPanel_InputValueLayout.createSequentialGroup()
                                                                                .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jLabel5)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel_InputValueLayout.createSequentialGroup()
                                                                                .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(36, 36, 36)
                                                                .addComponent(jButton_Refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel_InputValueLayout.createSequentialGroup()
                                                                .addGroup(jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel_InputValueLayout.createSequentialGroup()
                                                                                .addComponent(jLabel_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jRadioButton_Male, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jRadioButton_Female, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel_InputValueLayout.createSequentialGroup()
                                                                                .addComponent(jLabel_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel_InputValueLayout.createSequentialGroup()
                                                                                .addComponent(jLabel_IDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jTextField_IDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(39, 39, 39)
                                                                .addGroup(jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jButton_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton_Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                .addGap(0, 9, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel_InputValueLayout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jButton_First, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Previous, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Last, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_InputValueLayout.setVerticalGroup(
                jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_InputValueLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField_IDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_IDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                        .addComponent(jLabel_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel_InputValueLayout.createSequentialGroup()
                                                .addGroup(jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jRadioButton_Male, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jRadioButton_Female, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel_Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField_Address))
                                                .addGap(18, 18, 18)
                                                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel_InputValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jButton_First, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton_Next, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jButton_Previous, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jButton_Last, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MouseListener mouseEvent = new SinhVienBUS(this);
        jPanel_Table.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable_DataSinhVien.setModel(model_table);
        jTable_DataSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable_DataSinhVien.setRowHeight(25);
        jTable_DataSinhVien.addMouseListener(mouseEvent);
        jScrollPane_Table.setViewportView(jTable_DataSinhVien);

        javax.swing.GroupLayout jPanel_TableLayout = new javax.swing.GroupLayout(jPanel_Table);
        jPanel_Table.setLayout(jPanel_TableLayout);
        jPanel_TableLayout.setHorizontalGroup(
                jPanel_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane_Table)
        );
        jPanel_TableLayout.setVerticalGroup(
                jPanel_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane_Table, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel_FormTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel_InputValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel_Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel_FormTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel_InputValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel_Table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    public void showDialog(String title, String message) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public void printDialogError(StringBuilder sb) {
        JOptionPane.showMessageDialog(this, sb, "Error something", JOptionPane.ERROR_MESSAGE);
    }

    public void printDialogError(String a) {
        JOptionPane.showMessageDialog(this, a, "Error something", JOptionPane.ERROR_MESSAGE);
    }

    public void reloadData() {

    }

    // Refresh Button
    public void refreshForm() {
        this.jTextField_IDSV.setText("");
        this.jTextField_Name.setText("");
        this.jTextField_Email.setText("");
        this.jTextField_Address.setText("");
        this.jTextField_PhoneNumber.setText("");
        this.btnGroup_Sex.clearSelection();
    }

    // Save button
    public void saveInfo() {
        try {
            // lưu thông tin vào trong model
            SinhVienDTO sinhvienDTO = new SinhVienDTO();
            sinhvienDTO.setID(this.jTextField_IDSV.getText());
            sinhvienDTO.setFullname(this.jTextField_Name.getText());
            sinhvienDTO.setEmail(this.jTextField_Email.getText());
            sinhvienDTO.setAddress(this.jTextField_Address.getText());
            sinhvienDTO.setPhoneNumber(this.jTextField_PhoneNumber.getText());
            sinhvienDTO.setSex(this.jRadioButton_Male.isSelected() ? 1 : 0);

            // lưu thông tin vào trong database
            SinhVienDAO sinhVienDAO = new SinhVienDAO();
            sinhVienDAO.insert(sinhvienDTO);
            this.refreshTable();
            showDialog("Lưu thành công", "Thông tin sinh viên đã được lưu vào CSDL");
        } catch(Exception ex) {
            this.printDialogError("Đối tượng đã tồn tại trong CSDL");
            ex.printStackTrace();
        }
    }

    // search button
    public void searchSinhVien() {
        if(jTextField_IDSV.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã sinh viên cần phải được nhập để tìm kiếm !",
                    "Error Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            SinhVienDTO sinhVienDTO =  new SinhVienDAO().findSinhVienById(this.jTextField_IDSV.getText());
            if(sinhVienDTO != null) {
                this.jTextField_IDSV.setText(sinhVienDTO.getID());
                this.jTextField_Name.setText(sinhVienDTO.getFullname());
                this.jTextField_Email.setText(sinhVienDTO.getEmail());
                this.jTextField_Address.setText(sinhVienDTO.getAddress());
                this.jTextField_PhoneNumber.setText(sinhVienDTO.getPhoneNumber());
                if (sinhVienDTO.getSex() == 1) {
                    this.jRadioButton_Male.setSelected(true);
                } else {
                    this.jRadioButton_Female.setSelected(true);
                }
            } else {
                this.printDialogError("Không tìm thấy sinh viên !");
            }
        } catch (Exception ex) {
            this.printDialogError(ex.getMessage());
            ex.printStackTrace();
        }
    }

    // update button
    public void updateInfo() {
        if(JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn cập nhật thông tin của sinh viên này không ?",
                "Xác nhận thao tác", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
            try {
                // lưu thông tin vào trong model
                SinhVienDTO sinhvienDTO = new SinhVienDTO();
                sinhvienDTO.setID(this.jTextField_IDSV.getText());
                sinhvienDTO.setFullname(this.jTextField_Name.getText());
                sinhvienDTO.setEmail(this.jTextField_Email.getText());
                sinhvienDTO.setAddress(this.jTextField_Address.getText());
                sinhvienDTO.setPhoneNumber(this.jTextField_PhoneNumber.getText());
                sinhvienDTO.setSex(this.jRadioButton_Male.isSelected() ? 1 : 0);

                // lưu thông tin vào trong database
                SinhVienDAO sinhVienDAO = new SinhVienDAO();
                sinhVienDAO.update(sinhvienDTO);
                this.refreshTable();
                showDialog("Cập nhật thành công", "Thông tin sinh viên đã được cập nhật trong CSDL");
            } catch(Exception ex) {
                this.printDialogError(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    // delete button
    public void deleteInfo() {
        if(JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xoá thông tin của sinh viên này không ?",
                "Xác nhận thao tác", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
            try {
                // xoá thông tin trong database
                SinhVienDAO sinhVienDAO = new SinhVienDAO();
                sinhVienDAO.delete(this.jTextField_IDSV.getText());
                this.refreshTable();
                showDialog("Xoá thành công", "Thông tin sinh viên đã được loại bỏ trong CSDL");
            } catch(Exception ex) {
                this.printDialogError(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    private void refreshTable() {
        model_table.setRowCount(0);
        model_table.setColumnIdentifiers(columnHeaders);
        try {
            ArrayList<SinhVienDTO> sinhVienDTOS = new SinhVienDAO().getData();
            sinhVienDTOS.forEach(item -> {
                model_table.addRow(new Object[] {
                        item.getID(),
                        item.getFullname(),
                        item.getEmail(),
                        item.getPhoneNumber(),
                        item.getSex(),
                        item.getAddress()
                });
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        model_table.fireTableDataChanged(); // cập nhật các dữ liệu được cập nhật trong bảng
    }

    public void printInformation(int selectedRow) {
        try {
            SinhVienDTO item_Selected = new SinhVienDAO().getData().get(selectedRow);
            this.jTextField_IDSV.setText(item_Selected.getID());
            this.jTextField_Name.setText(item_Selected.getFullname());
            this.jTextField_Email.setText(item_Selected.getEmail());
            this.jTextField_Address.setText(item_Selected.getAddress());
            this.jTextField_PhoneNumber.setText(item_Selected.getPhoneNumber());
            if (item_Selected.getSex() == 1) {
                this.jRadioButton_Male.setSelected(true);
            } else {
                this.jRadioButton_Female.setSelected(true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
