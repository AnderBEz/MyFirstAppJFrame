package front;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
//import java.awt.event.*;
//import back.*;;
import java.awt.event.ActionListener;

public class principal extends JFrame {
 //   private Lista lista;
    private JTextField tnom;
    private JTextField tedad;
    private JTextField tid;
    private JButton crear;
 //   private JTextArea area;

    public principal(){
        setTitle("primerTrabajo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Creacion de los JLabel que muestren el nombre
        JLabel nombre = new JLabel("Nombre:");
        JLabel edad = new JLabel("Edad:");
        JLabel id = new JLabel("ID:");

        //creacion de los apartados para ingresar texto
        tnom = new JTextField(20);
        tedad = new JTextField(2);
        tid = new JTextField(20);

         JButton crear = new JButton("Crear");
         crear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent crear){
                JOptionPane.showMessageDialog(null,"Creada con exito");
            }
         });

        //creacion de un Jpanel para organizar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        //Mostrar los datos en el panel

        panel.add(nombre);
        panel.add(tnom);
        panel.add(edad);
        panel.add(tedad);
        panel.add(id);
        panel.add(tid);
        panel.add(crear);


        add(panel);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new principal(); 
             }
        }
        
    );
    }
}


//JOptionPane.showMessageDialog(this, "La lista ya fue creada")
//consideracion agregar botones deshabilitados atributo enabled para todos los lobotones excepto para crear y cerrar
//el comando es nombreobj.setEnable(true o false);
