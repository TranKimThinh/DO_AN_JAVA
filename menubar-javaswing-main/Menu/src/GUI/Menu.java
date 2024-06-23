package GUI;

import com.mysql.cj.xdevapi.Statement;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JToggleButton;

/**
 *
 * @author User
 */
public class Menu extends javax.swing.JFrame {
    private List<MovieSchedule> existingSchedules = new ArrayList<>();
    // Đây là một danh sách (List) chứa các đối tượng MovieSchedule,
    // mỗi đối tượng đại diện cho một lịch chiếu phim đã có trong hệ thống.
    String Phim="";
    String Xuat="";
    Integer SoLuong=0;
    String Ghe="";
    String name="";
    String NTable="";
    //Đây là các biến để lưu trữ thông tin về phim, xuất chiếu, số lượng vé, ghế đặt, tên và bảng đặt vé.
    
    Byte KQKiemTra=0;
    Byte DaDN=0;
    Byte Xong=0;
    Integer VeDaDat=0;
    Byte MDMenu=0;
    
    private MovieSchedule newSchedule;   
    //Đây là một biến đối tượng MovieSchedule mới, có thể được sử dụng để tạo lịch chiếu phim mới.
            
    int x = 210;    //chieu rong
    int y = 620;    //chieu cao
    
    
    public Menu() {
        initComponents();
        
        cardDangNhapXong.setVisible(false);
        cardTrangChu.setVisible(true);
        cardTaiKhoan.setVisible(false);
        cardDatVe.setVisible(false);
        cardThongKe.setVisible(false);
        jplSlideMenu.setSize(210,620);
    }  
        
    
    public void openMenu() {
        MDMenu=1;
        jplSlideMenu.setSize(x, y);
        if (x == 0) {
            new Thread(new Runnable() {   
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= 210; i++) {
                            jplSlideMenu.setSize(i, y);
                            Thread.sleep(1);
        // Vòng lặp for được sử dụng để thay đổi kích thước của menu dần dần.
                        }
                    } catch (Exception e) {
                    }
    // ở đây tạm dừng thực thi của luồng trong 1 miligiây (0.001 giây), đủ nhỏ để tạo ra hiệu ứng mở menu mịn màng.                  
                }
            }).start();
            x = 210;
        }
    }
    
    public void closeMenu() { // đóng menu
        MDMenu=0;
        jplSlideMenu.setSize(x, y);
        if (x == 210) {
            new Thread(new Runnable() {  
                @Override
                public void run() {
                    try {
                        for (int i = 210; i >= 0; i--) {  
        // 210 là chiều rộng menu, nếu đóng thì lệnh for cho 210 giảm dần về 0 
                            jplSlideMenu.setSize(i, y);
                            Thread.sleep(2);  ///////////////////////////////////
                        }
                    } catch (Exception e) {
                    }
                }
                //ở đây tạm dừng thực thi của luồng trong 2 miligiây (0.002 giây), có thể là để 
                // tạo ra hiệu ứng đóng menu một cách mịn màng, với một khoảng thời gian ngắn hơn so với việc mở menu.
            }).start();
            x = 0;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jplSlideMenu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCloseMenu = new javax.swing.JLabel();
        BThongKe = new javax.swing.JLabel();
        lblTrangChu = new javax.swing.JLabel();
        lblTaiKhoan = new javax.swing.JLabel();
        BDatVe = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jpllMenuBar = new javax.swing.JPanel();
        lblOpenMenu = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jplMain = new javax.swing.JPanel();
        cardTrangChu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        anhPhim = new javax.swing.JLabel();
        cardTaiKhoan = new javax.swing.JPanel();
        NTaiKhoan = new javax.swing.JTextField();
        NMatKhau = new javax.swing.JPasswordField();
        BDangNhap = new javax.swing.JButton();
        TTaiKhoan = new javax.swing.JLabel();
        TMatKhau = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        NTenTk = new javax.swing.JTextField();
        NTaiKhoan1 = new javax.swing.JTextField();
        NMatKhau1 = new javax.swing.JPasswordField();
        NMatKhau2 = new javax.swing.JPasswordField();
        BDangKy = new javax.swing.JButton();
        TTaiKhoan1 = new javax.swing.JLabel();
        TMatKhau1 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        TTaiKhoan2 = new javax.swing.JLabel();
        TMatKhau2 = new javax.swing.JLabel();
        nen = new javax.swing.JLabel();
        cardDatVe = new javax.swing.JPanel();
        NTen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NSoLuong = new javax.swing.JTextField();
        NGhe = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BDat = new javax.swing.JButton();
        NPhim1 = new javax.swing.JButton();
        NPhim2 = new javax.swing.JButton();
        NPhim3 = new javax.swing.JButton();
        NPhim4 = new javax.swing.JButton();
        NXuat1 = new javax.swing.JButton();
        NXuat2 = new javax.swing.JButton();
        NXuat3 = new javax.swing.JButton();
        NXuat4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        NA1 = new javax.swing.JToggleButton();
        NA2 = new javax.swing.JToggleButton();
        NA3 = new javax.swing.JToggleButton();
        NA4 = new javax.swing.JToggleButton();
        NA5 = new javax.swing.JToggleButton();
        NA6 = new javax.swing.JToggleButton();
        NA7 = new javax.swing.JToggleButton();
        NA8 = new javax.swing.JToggleButton();
        NB1 = new javax.swing.JToggleButton();
        NB2 = new javax.swing.JToggleButton();
        NB3 = new javax.swing.JToggleButton();
        NB4 = new javax.swing.JToggleButton();
        NB5 = new javax.swing.JToggleButton();
        NB6 = new javax.swing.JToggleButton();
        NB7 = new javax.swing.JToggleButton();
        NB8 = new javax.swing.JToggleButton();
        NC1 = new javax.swing.JToggleButton();
        NC2 = new javax.swing.JToggleButton();
        NC3 = new javax.swing.JToggleButton();
        NC4 = new javax.swing.JToggleButton();
        NC5 = new javax.swing.JToggleButton();
        NC6 = new javax.swing.JToggleButton();
        NC7 = new javax.swing.JToggleButton();
        NC8 = new javax.swing.JToggleButton();
        BXong = new javax.swing.JButton();
        BTru = new javax.swing.JToggleButton();
        BThem = new javax.swing.JToggleButton();
        jLabel30 = new javax.swing.JLabel();
        cardThongKe = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        cardDangNhapXong = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TenDangNhap = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        BDangXuat = new javax.swing.JButton();
        nenDaDangNhap = new javax.swing.JLabel();
        text_Trangchu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rạp Chiếu Phim ");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplSlideMenu.setBackground(new java.awt.Color(165, 21, 21));
        jplSlideMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jplSlideMenu.setPreferredSize(new java.awt.Dimension(190, 590));
        jplSlideMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(163, 21, 21));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Black Ops One", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("T  K  T");

        lblCloseMenu.setFont(new java.awt.Font("Black Ops One", 0, 18)); // NOI18N
        lblCloseMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblCloseMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCloseMenu.setText("X");
        lblCloseMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(lblCloseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCloseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jplSlideMenu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 150));

        BThongKe.setFont(new java.awt.Font("Fira Sans Medium", 0, 14)); // NOI18N
        BThongKe.setForeground(new java.awt.Color(255, 255, 255));
        BThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BThongKe.setText("Thống Kê");
        BThongKe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(96, 0, 0)));
        BThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BThongKeMouseClicked(evt);
            }
        });
        jplSlideMenu.add(BThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 40));

        lblTrangChu.setBackground(new java.awt.Color(255, 255, 255));
        lblTrangChu.setFont(new java.awt.Font("Fira Sans Medium", 0, 14)); // NOI18N
        lblTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrangChu.setText("Trang Chủ");
        lblTrangChu.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 1, new java.awt.Color(96, 0, 0)));
        lblTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTrangChuMouseClicked(evt);
            }
        });
        jplSlideMenu.add(lblTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 40));

        lblTaiKhoan.setFont(new java.awt.Font("Fira Sans Medium", 0, 14)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lblTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaiKhoan.setText("Tài Khoản");
        lblTaiKhoan.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(96, 0, 0)));
        lblTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTaiKhoanMouseClicked(evt);
            }
        });
        jplSlideMenu.add(lblTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 210, 40));

        BDatVe.setFont(new java.awt.Font("Fira Sans Medium", 0, 14)); // NOI18N
        BDatVe.setForeground(new java.awt.Color(255, 255, 255));
        BDatVe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BDatVe.setText("Đặt Vé");
        BDatVe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(96, 0, 0)));
        BDatVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BDatVeMouseClicked(evt);
            }
        });
        jplSlideMenu.add(BDatVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, 40));

        jLabel9.setFont(new java.awt.Font("Fira Sans Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Thoát");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jplSlideMenu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 210, 50));

        jLabel10.setFont(new java.awt.Font("Fira Sans Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Giới Thiệu");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jplSlideMenu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 210, 50));

        jLabel11.setFont(new java.awt.Font("Fira Sans Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Trợ Giúp");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jplSlideMenu.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 210, 50));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_trangchu/cinema2.jpg"))); // NOI18N
        jplSlideMenu.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 210, 160));

        jPanel1.add(jplSlideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 0, 620));

        jpllMenuBar.setBackground(new java.awt.Color(204, 51, 0));
        jpllMenuBar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(119, 24, 33)));

        lblOpenMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N
        lblOpenMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpenMenuMouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(179, 29, 29));
        jLabel12.setFont(new java.awt.Font("Black Ops One", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TRANG CHỦ");

        javax.swing.GroupLayout jpllMenuBarLayout = new javax.swing.GroupLayout(jpllMenuBar);
        jpllMenuBar.setLayout(jpllMenuBarLayout);
        jpllMenuBarLayout.setHorizontalGroup(
            jpllMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpllMenuBarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblOpenMenu)
                .addGap(347, 347, 347)
                .addComponent(jLabel12)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jpllMenuBarLayout.setVerticalGroup(
            jpllMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpllMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpllMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOpenMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jpllMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 60));

        jplMain.setBackground(new java.awt.Color(255, 255, 255));
        jplMain.setLayout(new java.awt.CardLayout());

        cardTrangChu.setBackground(new java.awt.Color(255, 255, 255));

        anhPhim.setBackground(new java.awt.Color(153, 0, 0));
        anhPhim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_trangchu/poster phim.png"))); // NOI18N
        anhPhim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anhPhimMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cardTrangChuLayout = new javax.swing.GroupLayout(cardTrangChu);
        cardTrangChu.setLayout(cardTrangChuLayout);
        cardTrangChuLayout.setHorizontalGroup(
            cardTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTrangChuLayout.createSequentialGroup()
                .addGap(1053, 1053, 1053)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(anhPhim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cardTrangChuLayout.setVerticalGroup(
            cardTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTrangChuLayout.createSequentialGroup()
                .addComponent(anhPhim)
                .addGap(1758, 1758, 1758)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jplMain.add(cardTrangChu, "card2");

        cardTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        cardTaiKhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NTaiKhoan.setBackground(new java.awt.Color(255, 133, 133));
        NTaiKhoan.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NTaiKhoan.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(97, 0, 0)));
        NTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NTaiKhoanMouseClicked(evt);
            }
        });
        cardTaiKhoan.add(NTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 264, -1));

        NMatKhau.setBackground(new java.awt.Color(255, 135, 135));
        NMatKhau.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(97, 0, 0)));
        NMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NMatKhauMouseClicked(evt);
            }
        });
        cardTaiKhoan.add(NMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 264, -1));

        BDangNhap.setBackground(new java.awt.Color(133, 8, 8));
        BDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/DangNhap.png"))); // NOI18N
        BDangNhap.setBorder(null);
        BDangNhap.setBorderPainted(false);
        BDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDangNhapActionPerformed(evt);
            }
        });
        cardTaiKhoan.add(BDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 200, -1));

        TTaiKhoan.setFont(new java.awt.Font("Fira Sans Medium", 1, 18)); // NOI18N
        TTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        TTaiKhoan.setText("Tài Khoản");
        cardTaiKhoan.add(TTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        TMatKhau.setFont(new java.awt.Font("Fira Sans Medium", 1, 18)); // NOI18N
        TMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        TMatKhau.setText("Mật Khẩu");
        cardTaiKhoan.add(TMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel16.setFont(new java.awt.Font("Black Ops One", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Đăng nhập Tài Khoản");
        cardTaiKhoan.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 30));

        NTenTk.setBackground(new java.awt.Color(255, 135, 135));
        NTenTk.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NTenTk.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(97, 0, 0)));
        cardTaiKhoan.add(NTenTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 264, -1));

        NTaiKhoan1.setBackground(new java.awt.Color(255, 135, 135));
        NTaiKhoan1.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NTaiKhoan1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(97, 0, 0)));
        cardTaiKhoan.add(NTaiKhoan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 264, -1));

        NMatKhau1.setBackground(new java.awt.Color(255, 135, 135));
        NMatKhau1.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NMatKhau1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(97, 0, 0)));
        NMatKhau1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NMatKhau1ActionPerformed(evt);
            }
        });
        cardTaiKhoan.add(NMatKhau1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 264, -1));

        NMatKhau2.setBackground(new java.awt.Color(255, 135, 135));
        NMatKhau2.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NMatKhau2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(97, 0, 0)));
        cardTaiKhoan.add(NMatKhau2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 264, -1));

        BDangKy.setBackground(new java.awt.Color(133, 8, 8));
        BDangKy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/DangKy.png"))); // NOI18N
        BDangKy.setBorder(null);
        BDangKy.setBorderPainted(false);
        BDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDangKyActionPerformed(evt);
            }
        });
        cardTaiKhoan.add(BDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 200, -1));

        TTaiKhoan1.setFont(new java.awt.Font("Fira Sans Medium", 1, 18)); // NOI18N
        TTaiKhoan1.setForeground(new java.awt.Color(255, 255, 255));
        TTaiKhoan1.setText("Tài Khoản");
        cardTaiKhoan.add(TTaiKhoan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, 20));

        TMatKhau1.setFont(new java.awt.Font("Fira Sans Medium", 1, 18)); // NOI18N
        TMatKhau1.setForeground(new java.awt.Color(255, 255, 255));
        TMatKhau1.setText("Nhập Lại Mật Khẩu");
        cardTaiKhoan.add(TMatKhau1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        jLabel32.setFont(new java.awt.Font("Black Ops One", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Đăng ký Tài Khoản");
        cardTaiKhoan.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, 30));

        TTaiKhoan2.setFont(new java.awt.Font("Fira Sans Medium", 1, 18)); // NOI18N
        TTaiKhoan2.setForeground(new java.awt.Color(255, 255, 255));
        TTaiKhoan2.setText("Tên");
        cardTaiKhoan.add(TTaiKhoan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        TMatKhau2.setFont(new java.awt.Font("Fira Sans Medium", 1, 18)); // NOI18N
        TMatKhau2.setForeground(new java.awt.Color(255, 255, 255));
        TMatKhau2.setText("Mật Khẩu");
        cardTaiKhoan.add(TMatKhau2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        nen.setBackground(new java.awt.Color(171, 10, 10));
        nen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_trangchu/NenTK.jpg"))); // NOI18N
        cardTaiKhoan.add(nen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 560));

        jplMain.add(cardTaiKhoan, "card3");

        cardDatVe.setBackground(new java.awt.Color(165, 21, 21));
        cardDatVe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NTen.setBackground(new java.awt.Color(255, 139, 139));
        NTen.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NTen.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(90, 0, 0)));
        NTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NTenActionPerformed(evt);
            }
        });
        cardDatVe.add(NTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 508, -1));

        jLabel1.setFont(new java.awt.Font("Fira Sans Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tên");
        cardDatVe.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Fira Sans Medium", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Chọn Phim");
        cardDatVe.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Fira Sans Medium", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Xuất Chiếu");
        cardDatVe.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Fira Sans Medium", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Số Lượng");
        cardDatVe.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        NSoLuong.setBackground(new java.awt.Color(255, 140, 140));
        NSoLuong.setFont(new java.awt.Font("Black Ops One", 0, 18)); // NOI18N
        NSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NSoLuong.setText("0");
        NSoLuong.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(90, 0, 0)));
        NSoLuong.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NSoLuong.setEditable(false);
        NSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NSoLuongActionPerformed(evt);
            }
        });
        cardDatVe.add(NSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 120, 30));

        NGhe.setBackground(new java.awt.Color(255, 140, 140));
        NGhe.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NGhe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(90, 0, 0)));
        NGhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NGheActionPerformed(evt);
            }
        });
        NGhe.setEditable(false);
        cardDatVe.add(NGhe, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 510, -1));

        jLabel8.setFont(new java.awt.Font("Fira Sans Medium", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Chọn Ghế");
        cardDatVe.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        BDat.setBackground(new java.awt.Color(175, 21, 21));
        BDat.setFont(new java.awt.Font("Black Ops One", 0, 24)); // NOI18N
        BDat.setForeground(new java.awt.Color(255, 255, 255));
        BDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/DatVe.png"))); // NOI18N
        BDat.setBorderPainted(false);
        BDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDatActionPerformed(evt);
            }
        });
        cardDatVe.add(BDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 200, 60));

        NPhim1.setBackground(new java.awt.Color(93, 9, 9));
        NPhim1.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NPhim1.setForeground(new java.awt.Color(255, 255, 255));
        NPhim1.setText("The Hobbit");
        NPhim1.setBorderPainted(false);
        NPhim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NPhim1ActionPerformed(evt);
            }
        });
        cardDatVe.add(NPhim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 113, -1));

        NPhim2.setBackground(new java.awt.Color(93, 9, 9));
        NPhim2.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NPhim2.setForeground(new java.awt.Color(255, 255, 255));
        NPhim2.setText("The JungleBook");
        NPhim2.setBorderPainted(false);
        NPhim2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NPhim2ActionPerformed(evt);
            }
        });
        cardDatVe.add(NPhim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 121, -1));

        NPhim3.setBackground(new java.awt.Color(93, 9, 9));
        NPhim3.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NPhim3.setForeground(new java.awt.Color(255, 255, 255));
        NPhim3.setText("Avatar");
        NPhim3.setBorderPainted(false);
        NPhim3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NPhim3ActionPerformed(evt);
            }
        });
        cardDatVe.add(NPhim3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 119, -1));

        NPhim4.setBackground(new java.awt.Color(93, 9, 9));
        NPhim4.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NPhim4.setForeground(new java.awt.Color(255, 255, 255));
        NPhim4.setText("Shut In");
        NPhim4.setBorderPainted(false);
        NPhim4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NPhim4ActionPerformed(evt);
            }
        });
        cardDatVe.add(NPhim4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 101, -1));

        NXuat1.setBackground(new java.awt.Color(93, 9, 9));
        NXuat1.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NXuat1.setForeground(new java.awt.Color(255, 255, 255));
        NXuat1.setText("1");
        NXuat1.setBorderPainted(false);
        NXuat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NXuat1ActionPerformed(evt);
            }
        });
        cardDatVe.add(NXuat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 113, -1));

        NXuat2.setBackground(new java.awt.Color(93, 9, 9));
        NXuat2.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NXuat2.setForeground(new java.awt.Color(255, 255, 255));
        NXuat2.setText("2");
        NXuat2.setBorderPainted(false);
        NXuat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NXuat2ActionPerformed(evt);
            }
        });
        cardDatVe.add(NXuat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 121, -1));

        NXuat3.setBackground(new java.awt.Color(93, 9, 9));
        NXuat3.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NXuat3.setForeground(new java.awt.Color(255, 255, 255));
        NXuat3.setText("3");
        NXuat3.setBorderPainted(false);
        NXuat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NXuat3ActionPerformed(evt);
            }
        });
        cardDatVe.add(NXuat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 119, -1));

        NXuat4.setBackground(new java.awt.Color(93, 9, 9));
        NXuat4.setFont(new java.awt.Font("Fira Sans Medium", 1, 12)); // NOI18N
        NXuat4.setForeground(new java.awt.Color(255, 255, 255));
        NXuat4.setText("4");
        NXuat4.setBorderPainted(false);
        NXuat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NXuat4ActionPerformed(evt);
            }
        });
        cardDatVe.add(NXuat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 101, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/xuatphim.png"))); // NOI18N
        cardDatVe.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 440, 160));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5sao.png"))); // NOI18N
        cardDatVe.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, 160));

        jLabel15.setFont(new java.awt.Font("Fira Sans Medium", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Rạp phim 5 sao top 1 Viet Nam");
        cardDatVe.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 300, -1));

        NA1.setBackground(new java.awt.Color(255, 153, 153));
        NA1.setForeground(new java.awt.Color(255, 255, 255));
        NA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/A1.png"))); // NOI18N
        NA1.setBorderPainted(false);
        NA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NA1ActionPerformed(evt);
            }
        });
        cardDatVe.add(NA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 50, 50));

        NA2.setBackground(new java.awt.Color(255, 153, 153));
        NA2.setForeground(new java.awt.Color(255, 255, 255));
        NA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/A2.png"))); // NOI18N
        NA2.setBorderPainted(false);
        NA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NA2ActionPerformed(evt);
            }
        });
        cardDatVe.add(NA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 50, 50));

        NA3.setBackground(new java.awt.Color(255, 153, 153));
        NA3.setForeground(new java.awt.Color(255, 255, 255));
        NA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/A3.png"))); // NOI18N
        NA3.setBorderPainted(false);
        NA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NA3ActionPerformed(evt);
            }
        });
        cardDatVe.add(NA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 50, 50));

        NA4.setBackground(new java.awt.Color(255, 153, 153));
        NA4.setForeground(new java.awt.Color(255, 255, 255));
        NA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/A4.png"))); // NOI18N
        NA4.setBorderPainted(false);
        NA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NA4ActionPerformed(evt);
            }
        });
        cardDatVe.add(NA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 50, 50));

        NA5.setBackground(new java.awt.Color(255, 153, 153));
        NA5.setForeground(new java.awt.Color(255, 255, 255));
        NA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/A5.png"))); // NOI18N
        NA5.setBorderPainted(false);
        NA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NA5ActionPerformed(evt);
            }
        });
        cardDatVe.add(NA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 50, 50));

        NA6.setBackground(new java.awt.Color(255, 153, 153));
        NA6.setForeground(new java.awt.Color(255, 255, 255));
        NA6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/A6.png"))); // NOI18N
        NA6.setBorderPainted(false);
        NA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NA6ActionPerformed(evt);
            }
        });
        cardDatVe.add(NA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 50, 50));

        NA7.setBackground(new java.awt.Color(255, 153, 153));
        NA7.setForeground(new java.awt.Color(255, 255, 255));
        NA7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/A7.png"))); // NOI18N
        NA7.setBorderPainted(false);
        NA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NA7ActionPerformed(evt);
            }
        });
        cardDatVe.add(NA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 50, 50));

        NA8.setBackground(new java.awt.Color(255, 153, 153));
        NA8.setForeground(new java.awt.Color(255, 255, 255));
        NA8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/A8.png"))); // NOI18N
        NA8.setBorderPainted(false);
        NA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NA8ActionPerformed(evt);
            }
        });
        cardDatVe.add(NA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 50, 50));

        NB1.setBackground(new java.awt.Color(255, 153, 153));
        NB1.setForeground(new java.awt.Color(255, 255, 255));
        NB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/B1.png"))); // NOI18N
        NB1.setBorderPainted(false);
        NB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NB1ActionPerformed(evt);
            }
        });
        cardDatVe.add(NB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 50, 50));

        NB2.setBackground(new java.awt.Color(255, 153, 153));
        NB2.setForeground(new java.awt.Color(255, 255, 255));
        NB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/B2.png"))); // NOI18N
        NB2.setBorderPainted(false);
        NB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NB2ActionPerformed(evt);
            }
        });
        cardDatVe.add(NB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 50, 50));

        NB3.setBackground(new java.awt.Color(255, 153, 153));
        NB3.setForeground(new java.awt.Color(255, 255, 255));
        NB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/B3.png"))); // NOI18N
        NB3.setBorderPainted(false);
        NB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NB3ActionPerformed(evt);
            }
        });
        cardDatVe.add(NB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 50, 50));

        NB4.setBackground(new java.awt.Color(255, 153, 153));
        NB4.setForeground(new java.awt.Color(255, 255, 255));
        NB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/B4.png"))); // NOI18N
        NB4.setBorderPainted(false);
        NB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NB4ActionPerformed(evt);
            }
        });
        cardDatVe.add(NB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 50, 50));

        NB5.setBackground(new java.awt.Color(255, 153, 153));
        NB5.setForeground(new java.awt.Color(255, 255, 255));
        NB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/B5.png"))); // NOI18N
        NB5.setBorderPainted(false);
        NB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NB5ActionPerformed(evt);
            }
        });
        cardDatVe.add(NB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 50, 50));

        NB6.setBackground(new java.awt.Color(255, 153, 153));
        NB6.setForeground(new java.awt.Color(255, 255, 255));
        NB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/B6.png"))); // NOI18N
        NB6.setBorderPainted(false);
        NB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NB6ActionPerformed(evt);
            }
        });
        cardDatVe.add(NB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 50, 50));

        NB7.setBackground(new java.awt.Color(255, 153, 153));
        NB7.setForeground(new java.awt.Color(255, 255, 255));
        NB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/B7.png"))); // NOI18N
        NB7.setBorderPainted(false);
        NB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NB7ActionPerformed(evt);
            }
        });
        cardDatVe.add(NB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 50, 50));

        NB8.setBackground(new java.awt.Color(255, 153, 153));
        NB8.setForeground(new java.awt.Color(255, 255, 255));
        NB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/B8.png"))); // NOI18N
        NB8.setBorderPainted(false);
        NB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NB8ActionPerformed(evt);
            }
        });
        cardDatVe.add(NB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 50, 50));

        NC1.setBackground(new java.awt.Color(255, 153, 153));
        NC1.setForeground(new java.awt.Color(255, 255, 255));
        NC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/C1.png"))); // NOI18N
        NC1.setBorderPainted(false);
        NC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NC1ActionPerformed(evt);
            }
        });
        cardDatVe.add(NC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 50, 50));

        NC2.setBackground(new java.awt.Color(255, 153, 153));
        NC2.setForeground(new java.awt.Color(255, 255, 255));
        NC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/C2.png"))); // NOI18N
        NC2.setBorderPainted(false);
        NC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NC2ActionPerformed(evt);
            }
        });
        cardDatVe.add(NC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 50, 50));

        NC3.setBackground(new java.awt.Color(255, 153, 153));
        NC3.setForeground(new java.awt.Color(255, 255, 255));
        NC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/C3.png"))); // NOI18N
        NC3.setBorderPainted(false);
        NC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NC3ActionPerformed(evt);
            }
        });
        cardDatVe.add(NC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 50, 50));

        NC4.setBackground(new java.awt.Color(255, 153, 153));
        NC4.setForeground(new java.awt.Color(255, 255, 255));
        NC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/C4.png"))); // NOI18N
        NC4.setBorderPainted(false);
        NC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NC4ActionPerformed(evt);
            }
        });
        cardDatVe.add(NC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 50, 50));

        NC5.setBackground(new java.awt.Color(255, 153, 153));
        NC5.setForeground(new java.awt.Color(255, 255, 255));
        NC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/C5.png"))); // NOI18N
        NC5.setBorderPainted(false);
        NC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NC5ActionPerformed(evt);
            }
        });
        cardDatVe.add(NC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 50, 50));

        NC6.setBackground(new java.awt.Color(255, 153, 153));
        NC6.setForeground(new java.awt.Color(255, 255, 255));
        NC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/C6.png"))); // NOI18N
        NC6.setBorderPainted(false);
        NC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NC6ActionPerformed(evt);
            }
        });
        cardDatVe.add(NC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, 50, 50));

        NC7.setBackground(new java.awt.Color(255, 153, 153));
        NC7.setForeground(new java.awt.Color(255, 255, 255));
        NC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/C7.png"))); // NOI18N
        NC7.setBorderPainted(false);
        NC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NC7ActionPerformed(evt);
            }
        });
        cardDatVe.add(NC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 50, 50));

        NC8.setBackground(new java.awt.Color(255, 153, 153));
        NC8.setForeground(new java.awt.Color(255, 255, 255));
        NC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/C8.png"))); // NOI18N
        NC8.setBorderPainted(false);
        NC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NC8ActionPerformed(evt);
            }
        });
        cardDatVe.add(NC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 50, 50));

        BXong.setBackground(new java.awt.Color(153, 255, 153));
        BXong.setFont(new java.awt.Font("Fira Sans Medium", 1, 14)); // NOI18N
        BXong.setForeground(new java.awt.Color(51, 51, 255));
        BXong.setText("Xong");
        BXong.setBorderPainted(false);
        BXong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BXongActionPerformed(evt);
            }
        });
        cardDatVe.add(BXong, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 100, 30));

        BTru.setBackground(new java.awt.Color(102, 3, 3));
        BTru.setFont(new java.awt.Font("Black Ops One", 1, 36)); // NOI18N
        BTru.setForeground(new java.awt.Color(255, 255, 255));
        BTru.setText("-");
        BTru.setBorderPainted(false);
        BTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTruActionPerformed(evt);
            }
        });
        cardDatVe.add(BTru, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 60, 30));

        BThem.setBackground(new java.awt.Color(102, 3, 3));
        BThem.setFont(new java.awt.Font("Black Ops One", 1, 36)); // NOI18N
        BThem.setForeground(new java.awt.Color(255, 255, 255));
        BThem.setText("+");
        BThem.setBorderPainted(false);
        BThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BThemActionPerformed(evt);
            }
        });
        cardDatVe.add(BThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 60, 30));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_trangchu/nenDatVe2.png"))); // NOI18N
        cardDatVe.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 560));

        jplMain.add(cardDatVe, "card3");

        cardThongKe.setBackground(new java.awt.Color(0, 0, 0));
        cardThongKe.setForeground(new java.awt.Color(255, 255, 255));
        cardThongKe.setPreferredSize(new java.awt.Dimension(940, 540));
        cardThongKe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setBackground(new java.awt.Color(0, 0, 0));
        Table.setFont(new java.awt.Font("Fira Sans Medium", 0, 12)); // NOI18N
        Table.setForeground(new java.awt.Color(255, 255, 255));
        Table.getTableHeader().setBackground(new java.awt.Color(0, 0, 0));
        Table.getTableHeader().setForeground(new java.awt.Color(255, 255, 255));
        Table.getTableHeader().setBorder(null);
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên", "Phim", "Xuất", "Số Lượng", "Ghế"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table.setFillsViewportHeight(true);
        Table.setFocusable(false);
        Table.setGridColor(new java.awt.Color(51, 51, 51));
        Table.setOpaque(false);
        Table.setRowHeight(25);
        Table.setSelectionBackground(new java.awt.Color(0, 204, 204));
        Table.setSelectionForeground(new java.awt.Color(0, 0, 153));
        Table.setShowGrid(true);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        cardThongKe.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, 550, 600));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Fira Sans Medium", 0, 12)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_trangchu/nenthongke1.jpg"))); // NOI18N
        cardThongKe.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 0, 1020, 600));

        jplMain.add(cardThongKe, "card4");

        cardDangNhapXong.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/account.png"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Fira Sans Medium", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Quý khách đã có thể đặt vé xem phim trong phần Menu");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        TenDangNhap.setFont(new java.awt.Font("Fira Sans Medium", 1, 36)); // NOI18N
        TenDangNhap.setForeground(new java.awt.Color(153, 255, 255));
        TenDangNhap.setText("Ten");
        jPanel3.add(TenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bapnc.png"))); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 270, 300));

        jLabel24.setFont(new java.awt.Font("Fira Sans Medium", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Cảm ơn quý khách đã sử dụng dịch vụ của chúng tôi");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 630, 50));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bap2.png"))); // NOI18N
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 210, 130));

        BDangXuat.setBackground(new java.awt.Color(114, 0, 0));
        BDangXuat.setFont(new java.awt.Font("Black Ops One", 0, 12)); // NOI18N
        BDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        BDangXuat.setText("Đăng Xuất");
        BDangXuat.setBorderPainted(false);
        BDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDangXuatActionPerformed(evt);
            }
        });
        jPanel3.add(BDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        nenDaDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_trangchu/nen.jpg"))); // NOI18N
        nenDaDangNhap.setText("c");
        jPanel3.add(nenDaDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 570));

        javax.swing.GroupLayout cardDangNhapXongLayout = new javax.swing.GroupLayout(cardDangNhapXong);
        cardDangNhapXong.setLayout(cardDangNhapXongLayout);
        cardDangNhapXongLayout.setHorizontalGroup(
            cardDangNhapXongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        cardDangNhapXongLayout.setVerticalGroup(
            cardDangNhapXongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardDangNhapXongLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jplMain.add(cardDangNhapXong, "card3");

        jPanel1.add(jplMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 940, 560));

        text_Trangchu.setBackground(new java.awt.Color(167, 21, 21));
        text_Trangchu.setFont(new java.awt.Font("Fira Sans Black", 0, 24)); // NOI18N
        text_Trangchu.setForeground(new java.awt.Color(255, 255, 255));
        text_Trangchu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_Trangchu.setText("Các phim đang chiếu");
        text_Trangchu.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 1, new java.awt.Color(133, 20, 20)));
        text_Trangchu.setOpaque(true);
        jPanel1.add(text_Trangchu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 620, 950, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    

    private void lblCloseMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMenuMouseClicked
        closeMenu();
        BDangXuat.setVisible(false);
    }//GEN-LAST:event_lblCloseMenuMouseClicked
// Khi người dùng nhấp chuột vào đây, menu sẽ được đóng bằng cách gọi phương thức closeMenu() và BDangXuat sẽ được ẩn đi.
    private void lblOpenMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpenMenuMouseClicked
        openMenu();
        updateTable();        
        BDangXuat.setVisible(true);
 // Khi người dùng nhấp chuột vào đây, menu sẽ được mở ra bằng cách gọi phương thức openMenu(), sau đó gọi 
 // updateTable() để cập nhật bảng (hoặc giao diện) và hiển thị BDangXuat.
       
    }//GEN-LAST:event_lblOpenMenuMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jplSlideMenu.setSize(0, y);
        x = 0;
    }//GEN-LAST:event_formWindowOpened
// kích thước của jplSlideMenu sẽ được đặt về 0 (menu sẽ ẩn đi ban đầu) và x được đặt về 0.
    private void lblTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuMouseClicked
        cardTrangChu.setVisible(true);
        cardTaiKhoan.setVisible(false);
        cardDatVe.setVisible(false);
        cardThongKe.setVisible(false);
        cardDangNhapXong.setVisible(false);
        MDMenu=0;
    }//GEN-LAST:event_lblTrangChuMouseClicked
    // Khi người dùng nhấp vào đây, nội dung cardTrangChu sẽ hiển thị và các nội dung khác sẽ ẩn đi.
    private void lblTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTaiKhoanMouseClicked
        if (DaDN==1){
            cardTaiKhoan.setVisible(false);
            cardDangNhapXong.setVisible(true);
            cardTrangChu.setVisible(false);
            cardDatVe.setVisible(false);
            cardThongKe.setVisible(false);
            MDMenu=0;
        }else{
            cardTrangChu.setVisible(false);
            cardTaiKhoan.setVisible(true);
            cardDatVe.setVisible(false);
            cardThongKe.setVisible(false);
            cardDangNhapXong.setVisible(false);
            MDMenu=0;
        }
       // Nếu người dùng đã đăng nhập (DaDN==1),
       // các nội dung của cardDangNhapXong sẽ được hiển thị, nếu không, nội dung của cardTaiKhoan sẽ được hiển thị. 
        
    }//GEN-LAST:event_lblTaiKhoanMouseClicked
    
    private void BThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BThongKeMouseClicked
        cardTrangChu.setVisible(false);
        cardTaiKhoan.setVisible(false);
        cardThongKe.setVisible(true);
        cardDatVe.setVisible(false);
        cardDangNhapXong.setVisible(false);
        MDMenu=0;
  // Khi người dùng nhấp vào đây, nội dung cardThongKe sẽ hiển thị và các nội dung khác sẽ ẩn đi.      
    }//GEN-LAST:event_BThongKeMouseClicked

    private void BDatVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BDatVeMouseClicked
        if (DaDN==1){
            cardTrangChu.setVisible(false);
            cardTaiKhoan.setVisible(false);
            cardThongKe.setVisible(false);
            cardDatVe.setVisible(true);
            cardDangNhapXong.setVisible(false);
            MDMenu=0;
            
        }else{
            JOptionPane.showMessageDialog(this, "Bạn cần đăng nhập trong phần Tài Khoản trước khi đặt vé", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
 // Nếu người dùng đã đăng nhập (DaDN==1), các nội dung của cardDatVe sẽ được hiển thị, nếu không, một hộp thoại cảnh báo
// sẽ xuất hiện yêu cầu người dùng đăng nhập trước khi đặt vé.       
        
    }//GEN-LAST:event_BDatVeMouseClicked

    private void BDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDangNhapActionPerformed
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
// các trường văn bản NTaiKhoan và NMatKhau sẽ được xóa đi để chuẩn bị cho lần đăng nhập tiếp theo.
    try {
        String query = "SELECT * FROM taikhoan WHERE TaiKhoan = ? AND MatKhau = ?";
        preparedStatement = conn.prepareStatement(query);
        
        // Sử dụng setString thay vì nối chuỗi trực tiếp vào câu truy vấn
        preparedStatement.setString(1, NTaiKhoan.getText());
        preparedStatement.setString(2, NMatKhau.getText());

        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            
            String TenNguoiDung = resultSet.getString("Ten");
            TenDangNhap.setText(TenNguoiDung);
            
            DaDN=1;
            cardDangNhapXong.setVisible(true);
            cardTaiKhoan.setVisible(false);
            System.out.println("Dang nhap thanh cong");
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công, bạn có thể đặt vé");
            NTaiKhoan.setText("");
            NMatKhau.setText("");
// Phương thức này thực hiện kiểm tra thông tin đăng nhập với cơ sở dữ liệu.
//Nếu thông tin đúng, DaDN được đặt thành 1, và nội dung của cardDangNhapXong sẽ hiển thị cùng với
//một hộp thoại thông báo thành công. Ngược lại, một hộp thoại cảnh báo sẽ xuất hiện thông báo lỗi.
        } else {
            System.out.println("Dang nhap that bai ");
            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        // Đảm bảo đóng ResultSet và PreparedStatement
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    }//GEN-LAST:event_BDangNhapActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        if (MDMenu==1){
            closeMenu();
        }
// Nếu menu đang mở (MDMenu==1), nó sẽ được đóng lại bằng cách gọi phương thức closeMenu()         
    }//GEN-LAST:event_TableMouseClicked

    private void NXuat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NXuat4ActionPerformed
        Xuat="4";
    }//GEN-LAST:event_NXuat4ActionPerformed

    private void NXuat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NXuat3ActionPerformed
        Xuat="3";
    }//GEN-LAST:event_NXuat3ActionPerformed

    private void NXuat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NXuat2ActionPerformed
        Xuat="2";
    }//GEN-LAST:event_NXuat2ActionPerformed

    private void NXuat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NXuat1ActionPerformed
        Xuat="1";
    }//GEN-LAST:event_NXuat1ActionPerformed
// Đây là các phương thức được gọi khi người dùng chọn một trong các tùy chọn xuất chiếu (Xuat) trong giao diện.
    private void NPhim4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPhim4ActionPerformed
        Phim="Shut In";
        NTable = "ShutIn";
    }//GEN-LAST:event_NPhim4ActionPerformed

    private void NPhim3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPhim3ActionPerformed
        Phim="Avatar";
        NTable = "Avatar";
    }//GEN-LAST:event_NPhim3ActionPerformed

    private void NPhim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPhim2ActionPerformed
        Phim="The JungleBook";
        NTable = "TheJungBook";
    }//GEN-LAST:event_NPhim2ActionPerformed

    private void NPhim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPhim1ActionPerformed
        Phim= "The Hobbit";
        NTable = "TheHobbit";
    }//GEN-LAST:event_NPhim1ActionPerformed
// Đây là các phương thức được gọi khi người dùng chọn một trong các tùy chọn phim (Phim) trong giao diện.
    private void BDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDatActionPerformed
        if (NTen.getText().equals("") || Phim.equals("") || Xuat.equals("") || NSoLuong.getText().equals("") || NGhe.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin\n");
        } else {
            
            
            
            NSoLuong.setText("0");
            VeDaDat=0;
            
            NPhim1.setEnabled(true);NPhim2.setEnabled(true);NPhim3.setEnabled(true);NPhim4.setEnabled(true);
            NXuat1.setEnabled(true);NXuat2.setEnabled(true);NXuat3.setEnabled(true);NXuat4.setEnabled(true);
            BThem.setVisible(true);
            BTru.setVisible(true);
            
            try {
                String Nname = NTen.getText();
                String SoLuongN = Integer.toString(SoLuong);
                String NNGhe = NGhe.getText();

                
                
                String sql = "INSERT INTO thongtin (Ten, Phim, Xuat, SoLuong, Ghe) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, Nname);
                    preparedStatement.setString(2, Phim);
                    preparedStatement.setString(3, Xuat);
                    preparedStatement.setString(4, SoLuongN);
                    preparedStatement.setString(5, NNGhe);

                    // Thực thi câu lệnh SQL
                    preparedStatement.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Bạn đã đặt thành công\n");
                    // Sau khi thêm dữ liệu thành công, cập nhật bảng
                    updateTable();
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("Error: " + ex.getMessage());
            }
         turnOffAllToggleButtons();
         NTen.setText("");
         NGhe.setText("");Ghe="";
         SoLuong=0;
         VeDaDat=0;
        }
    }//GEN-LAST:event_BDatActionPerformed

    private void NGheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NGheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NGheActionPerformed

    private void NSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NSoLuongActionPerformed

    private void NTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NTenActionPerformed

    }//GEN-LAST:event_NTenActionPerformed

    private void NA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NA1ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
                if (VeDaDat<SoLuong){
                    Ktra("A1", NTable, Xuat);
                    if (KQKiemTra == 1) {
                        JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n"); /////
                        // Tắt ToggleButton
                        ((JToggleButton) evt.getSource()).setSelected(false);
                    } else {
                        VeDaDat+=1;
                        Bat("A1", NTable, Xuat);
                    }
            }else{
                JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n"); /////
                ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
            
        
        
    } else {
        // Tắt ToggleButton
        Tat("A1", NTable, Xuat);
        VeDaDat-=1;
    }


    }//GEN-LAST:event_NA1ActionPerformed

    private void NA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NA2ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
         if (Xong==1){
             if (VeDaDat<SoLuong){
                
                Ktra("A2", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("A2", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
             JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
             ((JToggleButton) evt.getSource()).setSelected(false);
         }
         
        
    } else {
        // Tắt ToggleButton
        Tat("A2", NTable, Xuat);VeDaDat-=1;
    }
    }//GEN-LAST:event_NA2ActionPerformed

    private void NA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NA3ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
            // Bật ToggleButton
            if (Xong==1){
                if (VeDaDat<SoLuong){
                
                Ktra("A3", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("A3", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
             JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
             ((JToggleButton) evt.getSource()).setSelected(false);
            }
            
            
        } else {
            // Tắt ToggleButton
            Tat("A3", NTable, Xuat);VeDaDat-=1;

        }
    }//GEN-LAST:event_NA3ActionPerformed

    private void NA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NA4ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("A4", NTable, Xuat);
            if (KQKiemTra == 1) {
                JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                // Tắt ToggleButton
                ((JToggleButton) evt.getSource()).setSelected(false);
            } else {
                VeDaDat+=1;
                Bat("A4", NTable, Xuat);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }           
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("A4", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NA4ActionPerformed

    private void NA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NA5ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("A5", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("A5", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("A5", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NA5ActionPerformed

    private void NA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NA6ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("A6", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("A6", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
             JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("A6", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NA6ActionPerformed

    private void NA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NA7ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("A7", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("A7", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("A7", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NA7ActionPerformed

    private void NA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NA8ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("A8", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("A8", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
        
    } else {
        // Tắt ToggleButton
        Tat("A8", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NA8ActionPerformed

    private void NB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NB1ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("B1", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("B1", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("B1", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NB1ActionPerformed

    private void NB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NB2ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("B2", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("B2", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
         
        
    } else {
        // Tắt ToggleButton
        Tat("B2", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NB2ActionPerformed

    private void NB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NB3ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
             if (VeDaDat<SoLuong){
                
                Ktra("B3", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("B3", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
           JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
       
        
    } else {
        // Tắt ToggleButton
        Tat("B3", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NB3ActionPerformed

    private void NB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NB4ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("B4", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("B4", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("B4", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NB4ActionPerformed

    private void NB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NB5ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("B5", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("B5", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("B5", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NB5ActionPerformed

    private void NB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NB6ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
             if (VeDaDat<SoLuong){
                
                Ktra("B6", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("B6", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
       
        
    } else {
        // Tắt ToggleButton
        Tat("B6", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NB6ActionPerformed

    private void NB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NB7ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("B7", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("B7", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("B7", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NB7ActionPerformed

    private void NB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NB8ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
             if (VeDaDat<SoLuong){
                
                Ktra("B8", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("B8", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
       
        
    } else {
        // Tắt ToggleButton
        Tat("B8", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NB8ActionPerformed

    private void NC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NC1ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
             if (VeDaDat<SoLuong){
                
                Ktra("C1", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("C1", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
       
        
    } else {
        // Tắt ToggleButton
        Tat("C1", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NC1ActionPerformed

    private void NC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NC2ActionPerformed
       if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("C2", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("C2", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("C2", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NC2ActionPerformed

    private void NC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NC3ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("C3", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("C3", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("C3", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NC3ActionPerformed

    private void NC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NC4ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("C4", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("C4", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("C4", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NC4ActionPerformed

    private void NC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NC5ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("C5", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("C5", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("C5", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NC5ActionPerformed

    private void NC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NC6ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("C6", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("C6", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("C6", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NC6ActionPerformed

    private void NC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NC7ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (Xong==1){
            if (VeDaDat<SoLuong){
                
                Ktra("C7", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("C7", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng bấm nút xong để chốt số lượng vé\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
        
    } else {
        // Tắt ToggleButton
        Tat("C7", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NC7ActionPerformed

    private void NC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NC8ActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
        // Bật ToggleButton
        if (VeDaDat<SoLuong){
                
                Ktra("C8", NTable, Xuat);
                if (KQKiemTra == 1) {
                    JOptionPane.showMessageDialog(this, "Ghế đã được đặt, vui lòng chọn ghế khác\n");
                    // Tắt ToggleButton
                    ((JToggleButton) evt.getSource()).setSelected(false);
                } else {
                    VeDaDat+=1;
                    Bat("C8", NTable, Xuat);
                }
        }else{
            JOptionPane.showMessageDialog(this, "Số vé ít hơn tổng ghế được chọn\n");
            ((JToggleButton) evt.getSource()).setSelected(false);
        }
        
    } else {
        // Tắt ToggleButton
        Tat("C8", NTable, Xuat);VeDaDat-=1;
    
    }
    }//GEN-LAST:event_NC8ActionPerformed

    private void BXongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BXongActionPerformed
        Xong = 1;
        BThem.setVisible(false);
        BTru.setVisible(false);    
        NPhim1.setEnabled(false);NPhim2.setEnabled(false);NPhim3.setEnabled(false);NPhim4.setEnabled(false);
        NXuat1.setEnabled(false);NXuat2.setEnabled(false);NXuat3.setEnabled(false);NXuat4.setEnabled(false);
    }//GEN-LAST:event_BXongActionPerformed

    private void BThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BThemActionPerformed
        SoLuong+=1;
        NSoLuong.setText(Integer.toString(SoLuong));
        
    }//GEN-LAST:event_BThemActionPerformed

    private void BTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTruActionPerformed
         if (SoLuong>0){
            SoLuong-=1;
            NSoLuong.setText(Integer.toString(SoLuong));
        }
    }//GEN-LAST:event_BTruActionPerformed

    private void BDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDangKyActionPerformed
    if (NMatKhau1.getText().equals(NMatKhau2.getText())){
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            // Kiểm tra xem tài khoản và mật khẩu đã tồn tại hay chưa
            String checkQuery = "SELECT * FROM taikhoan WHERE TaiKhoan = ? AND MatKhau = ?";
            preparedStatement = conn.prepareStatement(checkQuery);
            preparedStatement.setString(1, NTaiKhoan1.getText());
            preparedStatement.setString(2, NMatKhau2.getText());
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Nếu đã tồn tại, thông báo lỗi
                System.out.println("Dang Ky That Bai");
                JOptionPane.showMessageDialog(this, "Tài Khoản hoặc Mật Khẩu đã tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                // Nếu chưa tồn tại, thêm vào CSDL
                System.out.println("Dang ky thanh cong ");
                String insertQuery = "INSERT INTO taikhoan (TaiKhoan, MatKhau, Ten, Quyen) VALUES (?, ?, ?, ?)";
                try (PreparedStatement insertStatement = conn.prepareStatement(insertQuery)) {
                    insertStatement.setString(1, NTaiKhoan1.getText());
                    insertStatement.setString(2, NMatKhau2.getText());
                    insertStatement.setString(3, NTenTk.getText());
                    insertStatement.setString(4, "0");  
                    // Thực thi câu lệnh SQL
                    insertStatement.executeUpdate();
                    NTaiKhoan1.setText("");
                    NMatKhau1.setText("");
                    NMatKhau2.setText("");
                    NTenTk.setText("");
                    JOptionPane.showMessageDialog(this, "Đăng ký thành công");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        } finally {
            // Đóng resultSet và preparedStatement
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }else{
        JOptionPane.showMessageDialog(this, "Mật Khẩu nhập lại sai", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    
                
    }//GEN-LAST:event_BDangKyActionPerformed

    private void NMatKhau1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NMatKhau1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NMatKhau1ActionPerformed

    private void BDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDangXuatActionPerformed
        cardTaiKhoan.setVisible(true);
        cardDangNhapXong.setVisible(false);
        DaDN=0;
        
    }//GEN-LAST:event_BDangXuatActionPerformed

    private void NTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NTaiKhoanMouseClicked
        if (MDMenu==1){
            closeMenu();
        }    
    }//GEN-LAST:event_NTaiKhoanMouseClicked

    private void NMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMatKhauMouseClicked
        if (MDMenu==1){
            closeMenu();
        }
    }//GEN-LAST:event_NMatKhauMouseClicked

    private void anhPhimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anhPhimMouseClicked
        if (MDMenu==1){
            closeMenu();
        }
    }//GEN-LAST:event_anhPhimMouseClicked
    private void turnOffAllToggleButtons() {
    // Duyệt qua danh sách các JToggleButton và đặt trạng thái tắt cho mỗi nút
    Component[] components = cardDatVe.getComponents(); // Thay yourPanel bằng panel chứa các JToggleButton
    for (Component component : components) {
        if (component instanceof JToggleButton) {
            JToggleButton toggleButton = (JToggleButton) component;
            toggleButton.setSelected(false);
        }
    }
}
    private void ktraTruocKhiTat() {
    boolean isToggleButtonSelected = false;

    Component[] components = cardDatVe.getComponents();
    for (Component component : components) {
        if (component instanceof JToggleButton) {
            JToggleButton toggleButton = (JToggleButton) component;
            if (toggleButton.isSelected()) {
                isToggleButtonSelected = true;
                break;
            }
        }
    }

    if (isToggleButtonSelected) {
        int choice = JOptionPane.showConfirmDialog(this,
                "Vui lòng tắt tất cả các toggleButton trước khi thoát!",
                "Cảnh báo", JOptionPane.OK_CANCEL_OPTION);

        // Kiểm tra xem người dùng đã chọn OK hay không trước khi tắt chương trình
        if (choice == JOptionPane.OK_OPTION) {
            closeConnection();
        }
    } else {
        closeConnection();
    }
}

    public void Bat(String xGhe, String NTable, String Xuat) {
    try {
        Ghe += xGhe + ","; // Biến Ghe không được khai báo trong phương thức, nên bạn cần đảm bảo nó đã được khai báo ngoài phương thức.
        NGhe.setText(Ghe);
        String sql = "UPDATE " + NTable + " SET " + xGhe + " = 1 WHERE xuat = ?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            // Đặt giá trị cho tham số trong câu SQL
            preparedStatement.setString(1, Xuat);

            // Thực thi câu lệnh SQL
            preparedStatement.executeUpdate();
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("Error: " + ex.getMessage());
    }
}
    public void Tat(String xGhe, String NTable, String Xuat) {
    try {
        Ghe = Ghe.replace(xGhe + ",", "");
        NGhe.setText(Ghe);

        String sql = "UPDATE " + NTable + " SET " + xGhe + " = 0 WHERE xuat = ?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            // Đặt giá trị cho tham số trong câu SQL
            preparedStatement.setString(1, Xuat);

            // Thực thi câu lệnh SQL
            preparedStatement.executeUpdate();
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("Error: " + ex.getMessage());
    }
}
    public void Ktra(String xGhe, String NTable, String Xuat) {
    String sql = "SELECT " + xGhe + " FROM " + NTable + " WHERE Xuat = ?";
    try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
        preparedStatement.setString(1, Xuat);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                String DatGhe = resultSet.getString(xGhe);
                if (DatGhe.equals("1")){
                    KQKiemTra=1;
                }
                else{
                    KQKiemTra=0;
                }
                    
            } else {
                System.out.println("Không tìm thấy dữ liệu.");
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("Error: " + ex.getMessage());
    }
}

            
    /**
     * @param args the command line arguments
     */
    // Biến toàn cục để lưu trữ kết nối
    private static Connection conn = null;

    // Phương thức mở kết nối
    private static void openConnection() {
        try {
            // Đăng ký Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Thiết lập kết nối đến CSDL
            String url = "jdbc:mysql://localhost:3307/QLRap";
            String user = "root";
            String password = "1234";
            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Ket Noi oke");

            // Thực hiện các thao tác với CSDL tại đây...

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Phương thức đóng kết nối
    private static void closeConnection() {
        
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Dong Ke noi.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Phương thức cập nhật bảng
private void updateTable() {
    DefaultTableModel model = (DefaultTableModel) Table.getModel();
    model.setRowCount(0); // Xóa tất cả các dòng hiện tại
    
    java.sql.Statement statement = null;
    ResultSet resultSet = null;

    try {
        statement = conn.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM ThongTin");

        while (resultSet.next()) {
            Object[] row = new Object[model.getColumnCount()];
            for (int i = 0; i < row.length; i++) {
                row[i] = resultSet.getObject(i + 1);
            }
            model.addRow(row);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        // Đảm bảo đóng ResultSet và Statement
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
 public static void main(String args[]) {
    openConnection();

    java.awt.EventQueue.invokeLater(() -> {  //////// dùng Lamda
        Menu menu = new Menu();
        menu.setVisible(true);

        menu.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Xử lý khi cửa sổ đang đóng
                menu.ktraTruocKhiTat();
            }
        });
    });

    // Gọi hàm đóng kết nối khi chương trình tắt
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {  /// Lambar và thread
        closeConnection();
    }));
}






    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BDangKy;
    private javax.swing.JButton BDangNhap;
    private javax.swing.JButton BDangXuat;
    private javax.swing.JButton BDat;
    private javax.swing.JLabel BDatVe;
    private javax.swing.JToggleButton BThem;
    private javax.swing.JLabel BThongKe;
    private javax.swing.JToggleButton BTru;
    private javax.swing.JButton BXong;
    private javax.swing.JToggleButton NA1;
    private javax.swing.JToggleButton NA2;
    private javax.swing.JToggleButton NA3;
    private javax.swing.JToggleButton NA4;
    private javax.swing.JToggleButton NA5;
    private javax.swing.JToggleButton NA6;
    private javax.swing.JToggleButton NA7;
    private javax.swing.JToggleButton NA8;
    private javax.swing.JToggleButton NB1;
    private javax.swing.JToggleButton NB2;
    private javax.swing.JToggleButton NB3;
    private javax.swing.JToggleButton NB4;
    private javax.swing.JToggleButton NB5;
    private javax.swing.JToggleButton NB6;
    private javax.swing.JToggleButton NB7;
    private javax.swing.JToggleButton NB8;
    private javax.swing.JToggleButton NC1;
    private javax.swing.JToggleButton NC2;
    private javax.swing.JToggleButton NC3;
    private javax.swing.JToggleButton NC4;
    private javax.swing.JToggleButton NC5;
    private javax.swing.JToggleButton NC6;
    private javax.swing.JToggleButton NC7;
    private javax.swing.JToggleButton NC8;
    private javax.swing.JTextField NGhe;
    private javax.swing.JPasswordField NMatKhau;
    private javax.swing.JPasswordField NMatKhau1;
    private javax.swing.JPasswordField NMatKhau2;
    private javax.swing.JButton NPhim1;
    private javax.swing.JButton NPhim2;
    private javax.swing.JButton NPhim3;
    private javax.swing.JButton NPhim4;
    private javax.swing.JTextField NSoLuong;
    private javax.swing.JTextField NTaiKhoan;
    private javax.swing.JTextField NTaiKhoan1;
    private javax.swing.JTextField NTen;
    private javax.swing.JTextField NTenTk;
    private javax.swing.JButton NXuat1;
    private javax.swing.JButton NXuat2;
    private javax.swing.JButton NXuat3;
    private javax.swing.JButton NXuat4;
    private javax.swing.JLabel TMatKhau;
    private javax.swing.JLabel TMatKhau1;
    private javax.swing.JLabel TMatKhau2;
    private javax.swing.JLabel TTaiKhoan;
    private javax.swing.JLabel TTaiKhoan1;
    private javax.swing.JLabel TTaiKhoan2;
    private javax.swing.JTable Table;
    private javax.swing.JLabel TenDangNhap;
    private javax.swing.JLabel anhPhim;
    private javax.swing.JPanel cardDangNhapXong;
    private javax.swing.JPanel cardDatVe;
    private javax.swing.JPanel cardTaiKhoan;
    private javax.swing.JPanel cardThongKe;
    private javax.swing.JPanel cardTrangChu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jplMain;
    private javax.swing.JPanel jplSlideMenu;
    private javax.swing.JPanel jpllMenuBar;
    private javax.swing.JLabel lblCloseMenu;
    private javax.swing.JLabel lblOpenMenu;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JLabel nen;
    private javax.swing.JLabel nenDaDangNhap;
    private javax.swing.JLabel text_Trangchu;
    // End of variables declaration//GEN-END:variables
}
