
package autonoma.SimuladorAuto.views;

import autonoma.SimuladorAuto.exception.AccidenteException;
import autonoma.SimuladorAuto.exception.FrenadoBruscoException;
import autonoma.SimuladorAuto.exception.VehiculoApagadoException;
import autonoma.SimuladorAuto.exception.VehiculoEncendidoException;
import autonoma.SimuladorAuto.exception.VelocidadExcedidaException;
import autonoma.SimuladorAuto.models.ConfiguracionDelVehiculo;
import autonoma.SimuladorAuto.models.Simulador;
import autonoma.SimuladorAuto.models.Vehiculo;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * @author Gilary
 * @since 20250328
 * @version 1.0
 */
public class Principal extends javax.swing.JFrame {
    private Simulador simulador;

    /**
     * Creates new form Principal
     * @param simulador
     */
    public Principal(Simulador simulador) {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
        Vehiculo vehiculo = ConfiguracionDelVehiculo.cargarVehiculo("src/autonoma/SimuladorAuto/txt/Configuracion.txt");
        this.simulador = new Simulador(vehiculo);
        } catch (IOException | IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(this, "Error al cargar la configuración del vehículo: " + ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Freno = new javax.swing.JLabel();
        Acelerador = new javax.swing.JLabel();
        FrenoBrusco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Apagar = new javax.swing.JLabel();
        Encender = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Estado = new javax.swing.JLabel();
        Velocidad = new javax.swing.JLabel();
        Cilindraje = new javax.swing.JLabel();
        Cilindraje1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(191, 198, 197));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/SimuladorAuto/images/Carro.jpg"))); // NOI18N

        Freno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/SimuladorAuto/images/Freno.png"))); // NOI18N
        Freno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FrenoMouseClicked(evt);
            }
        });

        Acelerador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/SimuladorAuto/images/Acelerador.png"))); // NOI18N
        Acelerador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceleradorMouseClicked(evt);
            }
        });

        FrenoBrusco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/SimuladorAuto/images/f.png"))); // NOI18N
        FrenoBrusco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FrenoBruscoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Acelerador");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setText("Freno");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setText("Freno De Mano");

        Apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/SimuladorAuto/images/BotonApagr.png"))); // NOI18N
        Apagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApagarMouseClicked(evt);
            }
        });

        Encender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/SimuladorAuto/images/BotonEncender.png"))); // NOI18N
        Encender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EncenderMouseClicked(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(225, 227, 229));
        btnCerrar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(225, 227, 229));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("Velocidad Actual:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setText("Limite de Llantas:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setText("Velocidad Maxima del Motor:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("Estado Vehiculo: ");

        Estado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Estado.setText("Estado");

        Velocidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Velocidad.setText("Velocidad");

        Cilindraje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cilindraje.setText("Llantas");

        Cilindraje1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cilindraje1.setText("Cilindraje");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cilindraje)
                    .addComponent(Velocidad)
                    .addComponent(Cilindraje1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Estado))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Velocidad))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Cilindraje))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Cilindraje1))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Apagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Encender)
                                .addGap(42, 42, 42))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FrenoBrusco)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar)
                        .addGap(145, 145, 145))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(Freno)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Acelerador, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Encender)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Apagar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Freno))
                            .addComponent(FrenoBrusco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Acelerador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
     dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void EncenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncenderMouseClicked
    try {
       simulador.encenderVehiculo();
       Estado.setText("Encendido");
       Estado.setForeground(Color.GREEN);
       Velocidad.setText(String.valueOf(simulador.getVelocidadVehiculo()) + " km/h");
       Cilindraje.setText(String.valueOf(simulador.getVehiculo().getLlantas().getLimitePatinaje()) + " km/h");
       Cilindraje1.setText(String.valueOf(simulador.getVehiculo().getMotor().getVelocidadMaxima()) + " km/h");

       // ABRIR EL JDialog CarroEncendido
       CarroEncendido dialogo = new CarroEncendido(this, true);
       dialogo.setVisible(true);

    JOptionPane.showMessageDialog(this, "Vehículo encendido.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }catch (VehiculoEncendidoException e) {
     JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_EncenderMouseClicked

    private void ApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarMouseClicked
    try {
         simulador.apagarVehiculo();

        Estado.setText("Apagado");
        Estado.setForeground(Color.RED);
        Velocidad.setText("0 km/h");

    } catch (AccidenteException ex) {
        JOptionPane.showMessageDialog(this,
            ex.getMessage(),
            "¡Accidente!",
            JOptionPane.ERROR_MESSAGE);
    } catch (VehiculoApagadoException ex) {
        JOptionPane.showMessageDialog(this,
            ex.getMessage(),
            "Error: Vehículo apagado",
            JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_ApagarMouseClicked

    private void AceleradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceleradorMouseClicked
    try {
    if (this.simulador.getVehiculo().isEncendido()) {
        // Solicitar la velocidad al usuario
        String input = JOptionPane.showInputDialog(this, "Por favor, ingrese la velocidad del vehículo:", "Entrada de Velocidad", JOptionPane.QUESTION_MESSAGE);

        // Convertir el valor ingresado a un número entero
        int velocidad = Integer.parseInt(input);

        // Verificar si la velocidad supera el límite del motor
        int velocidadMaxima = (int) simulador.getVehiculo().getMotor().getVelocidadMaxima();
        if (velocidad > velocidadMaxima) {
            throw new AccidenteException("¡Se sobrepasó la velocidad máxima del motor! El vehículo se ha accidentado.");
        }

        // Acelerar el vehículo
        simulador.acelerarVehiculo(velocidad);

        // Actualizar la interfaz
        Velocidad.setText(simulador.getVelocidadVehiculo() + " km/h");
        Estado.setText("Encendido");
        Estado.setForeground(Color.GREEN);
        Cilindraje.setText(simulador.getVehiculo().getLlantas().getLimitePatinaje() + " km/h");
        Cilindraje1.setText(velocidadMaxima + " km/h");

        JOptionPane.showMessageDialog(this, "Vehículo acelerado. Velocidad actual: " + simulador.getVelocidadVehiculo() + " Km/h.", "Velocidad actual", JOptionPane.INFORMATION_MESSAGE);

    } else {
        int velocidadActual = (int) simulador.getVelocidadVehiculo();

        // Verificar si el vehículo fue apagado a una velocidad peligrosa
        if (velocidadActual >= 60) {
            throw new AccidenteException("¡Se apagó el vehículo a alta velocidad! El conductor ha tenido un accidente.");
        }

        simulador.acelerarVehiculo(0); 
    }

    } catch (VelocidadExcedidaException e) {
    JOptionPane.showMessageDialog(this, e.getMessage(),
        "Advertencia: Velocidad excedida", JOptionPane.WARNING_MESSAGE);

    } catch (VehiculoApagadoException ex) {
    JOptionPane.showMessageDialog(this, ex.getMessage(),
        "Error: Vehículo apagado", JOptionPane.ERROR_MESSAGE);

    } catch (AccidenteException ae) {
    JOptionPane.showMessageDialog(this, ae.getMessage(),
        "¡Accidente!", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_AceleradorMouseClicked

    private void FrenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrenoMouseClicked
        
        try {
            if (this.simulador.getVehiculo().isEncendido()!=false){
                // Solicitar la velocidad al usuario
                String input = JOptionPane.showInputDialog(this, "Por favor, ingrese la velocidad de frenado:", "Entrada de Velocidad", JOptionPane.QUESTION_MESSAGE);
        
    
                // Convertir el valor ingresado a un número entero
                int velocidad = Integer.parseInt(input);
    
                // Llamar al método frenarBruscamenteVehiculo con la velocidad ingresada
                simulador.frenarVehiculo(velocidad);
                Velocidad.setText(simulador.getVelocidadVehiculo() + " km/h");
                Estado.setText("Encendido");
                Estado.setForeground(Color.GREEN);
                Cilindraje.setText(simulador.getVehiculo().getLlantas().getLimitePatinaje() + " km/h");
                Cilindraje1.setText(simulador.getVehiculo().getMotor().getVelocidadMaxima() + " km/h");
                Freno freno = new Freno(this, true);
                freno.setVisible(true);

                }
        }catch (NumberFormatException e) {
            // Manejar el error si la entrada no es un número válido
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor numérico válido.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }catch (VehiculoApagadoException e) {
            JOptionPane.showMessageDialog(this,  e.getMessage() ,"Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FrenoMouseClicked

    private void FrenoBruscoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrenoBruscoMouseClicked
try {
    // Guardar velocidad antes de frenar
    int velocidadAntes = (int) simulador.getVelocidadVehiculo();

    // Frenar el vehículo
    simulador.frenarBruscamenteVehiculo();

    // Actualizar interfaz
    Velocidad.setText(simulador.getVelocidadVehiculo() + " km/h");
    Estado.setText("Encendido");
    Estado.setForeground(Color.GREEN);
    Cilindraje.setText(simulador.getVehiculo().getLlantas().getLimitePatinaje() + " km/h");
    Cilindraje1.setText(simulador.getVehiculo().getMotor().getVelocidadMaxima() + " km/h");

    // Verificar si había velocidad antes de frenar
    if (velocidadAntes > 0) {
        FrenadoBrusco freno = new FrenadoBrusco(this, true);
        freno.setVisible(true);

        JOptionPane.showMessageDialog(this, "¡El vehículo frenó bruscamente y patinó!", "Aviso de Patinaje", JOptionPane.WARNING_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "El vehículo ya estaba detenido. Solo se ha aplicado el frenado normal.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }

} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor numérico válido.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
} catch (VehiculoApagadoException e) {
    JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
} catch (FrenadoBruscoException e) {
    JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}

     
    }//GEN-LAST:event_FrenoBruscoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acelerador;
    private javax.swing.JLabel Apagar;
    private javax.swing.JLabel Cilindraje;
    private javax.swing.JLabel Cilindraje1;
    private javax.swing.JLabel Encender;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel Freno;
    private javax.swing.JLabel FrenoBrusco;
    private javax.swing.JLabel Velocidad;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
