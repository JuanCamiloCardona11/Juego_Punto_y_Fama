
package puntoyfama;
/**
 * @author JuanCamilo
 * 
 */
import javax.swing.JOptionPane;

public class VentanaPpal extends javax.swing.JFrame 
{
    private NumAleatorio aleatorio;              //Creamos el objeto de tipo NumAleatorio(De una clase creada por nosotros)
    private int[] vecNumAleatorio = new int[4];  //Este arreglo guardará el número aleatorio
    private int[] vecNumIngresado = new int[4];  //Este arreglo guardará el último número ingresado por el usuario
    private int intentos = 0;   //Variable para almacenar los intentos
    private ListaLigada objListaJuego = new ListaLigada();    

    public VentanaPpal()    //Constructor de la clase ventana
    {
        super("Punto y Fama");
        initComponents();
        getNumAleatorio();
        intentos = 0;
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.jTextFieldIntentos.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldIntentos = new javax.swing.JTextField();
        btnIngresarNumero = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jCheckBox0 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldFijo1 = new javax.swing.JTextField();
        jTextFieldFijo3 = new javax.swing.JTextField();
        jTextFieldFijo4 = new javax.swing.JTextField();
        jTextFieldFijo2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNumPunFam = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(173, 206, 116));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PUNTO Y FAMA");

        jTextFieldNumero.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTextFieldNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNumero.setToolTipText("Ingresa aquí un número entero positivo de cuatro cifras con todas sus cifras diferentes");
        jTextFieldNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese aquí un número");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Puntos");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Famas");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Intentos: ");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Números");

        jTextFieldIntentos.setEditable(false);
        jTextFieldIntentos.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jTextFieldIntentos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldIntentos.setToolTipText("Aquí se mostrarán tus intentos en el juego actual");
        jTextFieldIntentos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldIntentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIntentosActionPerformed(evt);
            }
        });

        btnIngresarNumero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIngresarNumero.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresarNumero.setText("Ingresar Número");
        btnIngresarNumero.setToolTipText("Haz clic aquí para el ingreso de un nuevo número de cuatro cifras");
        btnIngresarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNumeroActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("Haz clic aquí para salir y terminar ejecución del juego");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnReiniciar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(0, 0, 0));
        btnReiniciar.setText("Reiniciar Juego");
        btnReiniciar.setToolTipText("Haz clic aquí para reiniciar el juego");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        jCheckBox0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox0.setText("0");
        jCheckBox0.setToolTipText("Selecciona para descartar el número 0");

        jCheckBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox1.setText("1");
        jCheckBox1.setToolTipText("Selecciona para descartar el número 1");

        jCheckBox2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox2.setText("2");
        jCheckBox2.setToolTipText("Selecciona para descartar el número 2");

        jCheckBox3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox3.setText("3");
        jCheckBox3.setToolTipText("Selecciona para descartar el número 3");

        jCheckBox4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox4.setText("4");
        jCheckBox4.setToolTipText("Selecciona para descartar el número 4");

        jCheckBox5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox5.setText("5");
        jCheckBox5.setToolTipText("Selecciona para descartar el número 5");

        jCheckBox6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox6.setText("6");
        jCheckBox6.setToolTipText("Selecciona para descartar el número 6");

        jCheckBox8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox8.setText("8");
        jCheckBox8.setToolTipText("Selecciona para descartar el número 8");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox9.setText("9");
        jCheckBox9.setToolTipText("Selecciona para descartar el número 9");

        jCheckBox7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox7.setText("7");
        jCheckBox7.setToolTipText("Selecciona para descartar el número 7");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Números Descartados:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fijos:");

        jTextFieldFijo1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldFijo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFijo1.setToolTipText("Ingresa aquí tu primer número fijo");
        jTextFieldFijo1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextFieldFijo3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldFijo3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFijo3.setToolTipText("Ingresa aquí tu tercer número fijo");
        jTextFieldFijo3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextFieldFijo4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldFijo4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFijo4.setToolTipText("Ingresa aquí tu cuarto número fijo");
        jTextFieldFijo4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextFieldFijo2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldFijo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFijo2.setToolTipText("Ingresa aquí tu segundo número fijo");
        jTextFieldFijo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextAreaNumPunFam.setEditable(false);
        jTextAreaNumPunFam.setColumns(3);
        jTextAreaNumPunFam.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextAreaNumPunFam.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaNumPunFam.setRows(5);
        jTextAreaNumPunFam.setToolTipText("Aquí se mostrarán los números ingresados, como también sus puntos y famas");
        jTextAreaNumPunFam.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(jTextAreaNumPunFam);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Juan Camilo Cardona Calderón");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Elaborado por:");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/idea.png"))); // NOI18N
        jLabel16.setToolTipText("\"Nunca consideres el estudio como una obligación, sino como una oportunidad para penetrar en el bello y maravilloso mundo del saber\" Albert Einstein");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIngresarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel16))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel6)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel3)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel4)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldFijo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldFijo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jTextFieldFijo3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldFijo4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(201, 201, 201))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox4)
                                            .addComponent(jCheckBox3)
                                            .addComponent(jCheckBox2)
                                            .addComponent(jCheckBox1)
                                            .addComponent(jCheckBox0))
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox8)
                                            .addComponent(jCheckBox9)
                                            .addComponent(jCheckBox7)
                                            .addComponent(jCheckBox5)
                                            .addComponent(jCheckBox6))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jTextFieldIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldFijo2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFijo3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFijo4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldFijo1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIngresarNumero)
                        .addGap(30, 30, 30)
                        .addComponent(btnReiniciar)
                        .addGap(30, 30, 30)
                        .addComponent(btnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(20, 20, 20))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox0)
                            .addComponent(jCheckBox5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox9))
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed
    
    //Cuando el usuario presiona el botón de reseteo se reinicia los intentos, y los campos
    //de ayuda del usuario (checkbox, fijos y cajas de texto) se vacean para iniciar en
    //su estado natural para el nuevo intento
    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        intentos = 0;                                               
        this.jTextFieldIntentos.setText("0");   
        getNumAleatorio();
        resetearListaLigada();
        this.jTextFieldNumero.setText("");
        this.jTextAreaNumPunFam.setText("");
        this.jCheckBox0.setSelected(false);
        this.jCheckBox1.setSelected(false);
        this.jCheckBox2.setSelected(false);
        this.jCheckBox3.setSelected(false);
        this.jCheckBox4.setSelected(false);
        this.jCheckBox5.setSelected(false);
        this.jCheckBox6.setSelected(false);
        this.jCheckBox7.setSelected(false);
        this.jCheckBox8.setSelected(false);
        this.jCheckBox9.setSelected(false);
        this.jTextFieldFijo1.setText("");
        this.jTextFieldFijo2.setText("");
        this.jTextFieldFijo3.setText("");
        this.jTextFieldFijo4.setText("");
    }//GEN-LAST:event_btnReiniciarActionPerformed

    //Esta función nos saca de ejecución del programa
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        JOptionPane.showMessageDialog(this, "Ha decidido salir, hasta luego");
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    //Este botón sirve para ingresar un nuevo número
    private void btnIngresarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNumeroActionPerformed
        int numero = 0;
        boolean valido = false;
        try                         //Manejamos la excepción de formato de tipo numérico para 
        {                           //que el programa en tiempo de ejecución no se caiga
            numero = Integer.parseInt(this.jTextFieldNumero.getText());
            valido = validarNumero(numero);
        }
        catch(NumberFormatException e)      //Si ingresó una letra o símbolo diferente a un número
        {                                   //se desplegará el siguiente mensaje
            JOptionPane.showMessageDialog(this,"Ingrese un formato de número válido.");     
            this.jTextFieldNumero.setText("");
        }
        if(valido)      //Si el número es válido en formato númerico y en valores entramos a este condicional
        {
            intentos++;
            jTextFieldIntentos.setText(String.valueOf(intentos));
            if(verificarIgualdad())         //Si el número ingresado por el usuario es igual al aleatorio
            {                               //Entonces creamos el objeto JuegoTerminado y felicitamos al usuario
                JuegoTerminado ventanaFin = new JuegoTerminado(vecNumAleatorio, intentos);
                ventanaFin.setVisible(true);
                this.btnReiniciar.doClick();    //Esto hace que se ejecuten las acciones del botón "reiniciar juego"
            }
            else
            {
                objListaJuego.ingresarNumero(vecNumIngresado, vecNumAleatorio);     //Si el número aleatorio no coindice con
                imprimirNumerosPuntosYFamas();                                      //el ingresado por el usuario, se procede
            }                                                                       //a ingresarlo a la lista ligada y a mostrar
        }                                                                           //este número, sus puntos y sus famas en la 
        else                                                                        //caja de texto central 
        {
            JOptionPane.showMessageDialog(this,"Ingrese un número entero positivo de cuatro cifras.");
            this.jTextFieldNumero.setText("");
        }
        this.jTextFieldNumero.setText("");
    }//GEN-LAST:event_btnIngresarNumeroActionPerformed

    private void jTextFieldIntentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIntentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIntentosActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed
    private void getNumAleatorio()      //Esta función obtiene un nuevo número aleatorio
    {                                   //que servirá para el siguiente juego
        aleatorio = new NumAleatorio();
        vecNumAleatorio = aleatorio.getArreglo();
    }
    
    private boolean verificarNumero()   //Esta función verifica que los cuatro números
    {                                   // del arreglo sean diferentes entre si
        int i = 0,j;
        if(vecNumIngresado[0] == 0)
        {
            return(false);
        }
        else
        {
            while(i < 3)
            {
                j = i + 1;
                while(j < 4)
                {
                    if (vecNumIngresado[i] == vecNumIngresado[j])
                    {
                        return(false);
                    }
                    j++;    
                }
                i++;    
            }
        }
        return(true); 
    }
    
    private void descomponerNumero(int numero)  //Esta función descompe los dígitos del
    {                                           //número y los lleva a un arreglo
        int i = 3;
        int aux = numero;
        while(i >= 0)
        {
            vecNumIngresado[i] = aux % 10;
            aux /= 10;
            i--;
        }
    }
    
    private boolean validarNumero(int numero)   //Esta función valida que el número ingresado tenga 4 dígitos y además 
    {                                           //hace el llamado al método de verificar que los dígitos sean diferentes
        if(!(numero >= 1000 && numero <= 9999)) 
        {
            return(false);
        }
        descomponerNumero(numero);
        if(!verificarNumero())
        {
            return(false);
        }
        return(true);
    }
    
    public boolean verificarIgualdad()    //Esta función verifica que el número ingresado sea igual
    {                                     //al aleatorio, en dicho caso, el juego ha terminado
        int i = 0;
        while(i < 4)
        {
            if(vecNumAleatorio[i] != vecNumIngresado[i])
            {
                return(false);
            }
            i++;
        }
        return(true);
    } 
    
    public void imprimirNumerosPuntosYFamas()   //Esta función imprime el número que ingresó el usuario, sus respectivos
    {                                           //puntos y famas, lo hace cada vez que se ingresa un nuevo número válido      
        String datoUltimoNodo = objListaJuego.obtenerUltimoDato();
        String acumulador = "";
        acumulador += this.jTextAreaNumPunFam.getText() + "\n" + datoUltimoNodo + "\n";
        this.jTextAreaNumPunFam.setText("");
        this.jTextAreaNumPunFam.setText(acumulador);
    }
    
    public void resetearListaLigada()   //Esta función re-inicializa la lista ligada de números ingresados por el usuario
    {
        objListaJuego = new ListaLigada();
    }
    
    public static void main(String args[])  //Este es el método main del proyecto.
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPpal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarNumero;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox jCheckBox0;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaNumPunFam;
    private javax.swing.JTextField jTextFieldFijo1;
    private javax.swing.JTextField jTextFieldFijo2;
    private javax.swing.JTextField jTextFieldFijo3;
    private javax.swing.JTextField jTextFieldFijo4;
    private javax.swing.JTextField jTextFieldIntentos;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}
