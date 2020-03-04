import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.MatteBorder;

public class Login extends JFrame implements MouseListener {

    private Color color1 = new Color(5, 15, 16);
    private Color color2 = new Color(19, 51, 55);
    private Color color3 = new Color(89, 112, 115);
    private Color color4 = new Color(255, 255, 255);
    private String img_icon = "img/log.png";
    private String font1 = "Microsoft New Tai Lue";
    private JButton signIn;
    private JLabel user, password, info, userimg;
    private JPasswordField passwordtxt;
    private JTextField usertxt;
    private JPanel leftUser, rightUser;
    private ImageIcon usericon;

    public Login(String title) {

        this.setLayout(null);
        this.setBounds(0, 0, 800, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(color4);
        this.setIconImage(new ImageIcon(getClass().getResource(img_icon)).getImage());

        leftUser = new JPanel();
        leftUser.setBackground(color1);
        leftUser.setBounds(0, 0, 450, 500);
        leftUser.setLayout(null);
        leftUser.setVisible(true);
        this.add(leftUser);

        rightUser = new JPanel();
        rightUser.setBackground(color3);
        rightUser.setBounds(450, 0, 350, 500);
        rightUser.setLayout(null);
        rightUser.setVisible(true);
        this.add(rightUser);

        usericon = new ImageIcon("img/user2.png");
        userimg = new JLabel(usericon, SwingConstants.CENTER);
        userimg.setBounds(0, 50, 350, 200);
        rightUser.add(userimg);

        info = new JLabel("<html>\u00A1Bienvenido al sistema\u0021</html>", SwingConstants.CENTER);
        info.setBounds(0, 300, 350, 100);
        info.setFont(new Font(font1, 1, 20));
        info.setForeground(color4);
        rightUser.add(info);

        user = new JLabel("Usuario");
        user.setBounds(50, 200, 80, 30);
        user.setFont(new Font(font1, 1, 16));
        user.setForeground(color4);
        leftUser.add(user);

        usertxt = new JTextField();
        usertxt.setBounds(155, 195, 225, 30);
        usertxt.setFont(new Font(font1, 0, 18));
        usertxt.setBackground(color1);
        usertxt.setForeground(color4);
        usertxt.setBorder(new MatteBorder(0, 0, 1, 0, color4));
        leftUser.add(usertxt);

        password = new JLabel("Contrase\u00F1a");
        password.setBounds(50, 240, 90, 30);
        password.setFont(new Font(font1, 1, 16));
        password.setForeground(color4);
        leftUser.add(password);

        passwordtxt = new JPasswordField();
        passwordtxt.setBounds(155, 235, 225, 30);
        passwordtxt.setFont(new Font(font1, 0, 18));
        passwordtxt.setBackground(color1);
        passwordtxt.setForeground(color4);
        passwordtxt.setBorder(new MatteBorder(0, 0, 1, 0, color4));
        leftUser.add(passwordtxt);

        signIn = new JButton("Ingresar");
        signIn.setBounds(275, 380, 100, 30);
        signIn.setBackground(color2);
        signIn.setFont(new Font(font1, 1, 16));
        signIn.setForeground(color4);
        signIn.addMouseListener(this);
        leftUser.add(signIn);
    }

    // mouse
    @Override
    public void mouseReleased(MouseEvent evt) {

    }

    @Override
    public void mousePressed(MouseEvent evt) {
        String nameuser = usertxt.getText();
        if (evt.getSource() == this.signIn) {
            JOptionPane.showMessageDialog(null, "Bienvenido " + nameuser + ".");
            // AQUI SE HACE UNA INSTANCIA DEL OBJETO MENU
        }
    }

    @Override
    public void mouseExited(MouseEvent evt) {

    }

    @Override
    public void mouseEntered(MouseEvent evt) {

    }

    @Override
    public void mouseClicked(MouseEvent evt) {

    }

    public static void main(String args[]) {
        Login login = new Login("Ingresar");
        login.setVisible(true);
    }
}