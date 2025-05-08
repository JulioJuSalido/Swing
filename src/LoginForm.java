import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends Component {
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarButton;

    public LoginForm() {
        enviarButton.addActionListener(e -> validar());
    }

    private void validar() {
        // Leer todos los valore de los campos de texto
        String usuario = this.usuarioTexto.getText();
        String password = new String(this.passwordTexto.getPassword());

        if(usuario.equals("admin") && password.equals("1234")){
            //Datos correctos
            JOptionPane.showMessageDialog(this, "Datos correctos, bienvenido!", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
        } else if (usuario.equals("admin")) {
            //usuario correcto y password incorrecto
            JOptionPane.showMessageDialog(this, "Password incorrecto, corregirlo!", "Datos Incorrectos",JOptionPane.WARNING_MESSAGE);
        } else {
            //usuario incorrecto
            JOptionPane.showMessageDialog(this, "Usuario incorrecto, corregirlo!", "Datos Incorrectos",JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginForm");
        frame.setContentPane(new LoginForm().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setSize(400 , 300 ); // tamaño de la ventana
        frame.setLocationRelativeTo(null); // centrar la ventana

        frame.setVisible(true);
    }
}
