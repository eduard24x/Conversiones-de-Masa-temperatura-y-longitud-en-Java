/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionfuncional;

import javax.swing.JOptionPane;

/**
 *
 * @author Judith
 */
public class Conversiones extends javax.swing.JFrame {

    /**
     * Creates new form Conversiones
     */
    public Conversiones() {
        setTitle("Conversiones");
        initComponents();
        limpiarlongitud();
        bloquearlongitud();
        limpiartemperatura();
        bloqueartemperatura();
        limpiarmasa();
        bloquearmasa();
    }
    
    void bloquearmasa(){
        txtmasa.setEnabled(false);
        cbxopcionesmasa.setEnabled(false);
        btncalcularmasa.setEnabled(false);
        btncancelarmasa.setEnabled(false);
        btnlimpiarmasa.setEnabled(false);
    }
    
    void desbloquearmasa(){
        txtmasa.setEnabled(true);
        cbxopcionesmasa.setEnabled(true);
        btncalcularmasa.setEnabled(true);
        btncancelarmasa.setEnabled(true);
        btnlimpiarmasa.setEnabled(true);
    }
    
    void limpiarmasa(){
        txtmasa.setText(null);
        lblresultadomasa.setText(null);
    }

    
    void bloqueartemperatura(){
        txtgrado.setEnabled(false);
        cbxopcionestemeperatura.setEnabled(false);
        btncalculartemperatura.setEnabled(false);
        btncancelartemperatura.setEnabled(false);
        btnlimpiartemperatura.setEnabled(false);
        
    }
    
    void desbloqueartemperatura(){
        txtgrado.setEnabled(true);
        cbxopcionestemeperatura.setEnabled(true);
        btncalculartemperatura.setEnabled(true);
        btncancelartemperatura.setEnabled(true);
        btnlimpiartemperatura.setEnabled(true);
        
    }
    
    void limpiartemperatura(){
        txtgrado.setText(null);
        lblresultadotemperatura.setText(null);
    }
    
        
    void bloquearlongitud(){
        txtdatolongitud.setEnabled(false);
        cbxopcioneslongitud.setEnabled(false);
        jButton1.setEnabled(false);
        btncancelarlongitud1.setEnabled(false);
        btnlimpiarlongitud.setEnabled(false);
        
    }
    
    void desbloquearlongitud(){
        txtdatolongitud.setEnabled(true);
        cbxopcioneslongitud.setEnabled(true);
        jButton1.setEnabled(true);
        btncancelarlongitud1.setEnabled(true);
        btnlimpiarlongitud.setEnabled(true);
    }
    
    void limpiarlongitud(){
        txtdatolongitud.setText(null);
        lblresultado.setText(null);
    }
    
    
    void conversionmasa(){
         double dato=Double.parseDouble(txtmasa.getText());
        double resultado=0;
        //obtener el dato del combo
        int i=cbxopcionesmasa.getSelectedIndex();
        //condiciones
        if(i==0){
            resultado=1000*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" kg"));
        }else if(i==1){
            resultado=2204.62*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" lb"));
        }else if(i==2){
            resultado=403.4287935*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" g"));
        }else if(i==3){
            resultado=8103.083928*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" mg"));
        }else if(i==4){
            resultado=0.001*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" ton"));
        }else if(i==5){
            resultado=2.20462*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" lb"));
        }else if(i==6){
            resultado=1000*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" g"));
        }else if(i==7){
            resultado=403.4287935*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" mg"));
        }else if(i==8){
            resultado=0.000454*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" ton"));
        }else if(i==9){
            resultado=0.453592*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" kg"));
        }else if(i==10){
            resultado=453.592*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" g"));
        }else if(i==11){
            resultado=453592*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" mg"));
        }else if(i==12){
            resultado=0.002478752177*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" ton"));
        }else if(i==13){
            resultado=0.001*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" kg"));
        }else if(i==14){
            resultado=0.00220462*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" lb"));
        }else if(i==15){
            resultado=1000*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" mg"));
        }else if(i==15){
            resultado=0.0001234098041*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" ton"));
        }else if(i==17){
            resultado=0.002478752177*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" kg"));
        }else if(i==18){
            resultado=0.005464657049*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" lb"));
        }else if(i==19){
            resultado=0.001*dato;
            lblresultadomasa.setText(String.valueOf(" "+resultado+" g"));
        }
    }
    
    void conversiontemperatura(){
         double grado=Double.parseDouble(txtgrado.getText());
        double resultado=0;
        //obtener el dato del combo
        int i=cbxopcionestemeperatura.getSelectedIndex();
        //condiciones
        if(i==0){
            resultado=(1.8*grado)+32;
            lblresultadotemperatura.setText(String.valueOf(" "+resultado+" °F"));
        }else if(i==1){
            resultado=grado+273;
            lblresultadotemperatura.setText(String.valueOf(" "+resultado+" °K"));
        }else if(i==2){
            resultado=((9*grado)/5)+492;
            lblresultadotemperatura.setText(String.valueOf(" "+resultado+" °R"));
        }else if(i==3){
            resultado=(grado-32)/1.8;
            lblresultadotemperatura.setText(String.valueOf(" "+resultado+" °C"));
        }else if(i==4){
            resultado=((grado-32)/1.8)+273;
            lblresultadotemperatura.setText(String.valueOf(" "+resultado+" °K"));
        }else if(i==5){
            resultado=(grado-32)+492;
            lblresultadotemperatura.setText(String.valueOf(" "+resultado+" °R"));
        }else if(i==6){
            resultado=grado-273;
            lblresultadotemperatura.setText(String.valueOf(" "+resultado+" °C"));
        }else if(i==7){
            resultado=(grado-273)*1.8+32;
            lblresultadotemperatura.setText(String.valueOf(" "+resultado+" °F"));
        }else if(i==8){
            resultado=(((grado-273)*9)/5)+492;
            lblresultadotemperatura.setText(String.valueOf(" "+resultado+" °R"));
        }else if(i==9){
            resultado=((grado-492)*5)/9;
            lblresultadotemperatura.setText(String.valueOf(" "+resultado+" °C "));
        }else if(i==10){
            resultado=grado-460;
            lblresultadotemperatura.setText(String.valueOf(" "+resultado+" °F"));
        }else if(i==11){
            resultado=((grado-492)/1.8)+273;
            lblresultadotemperatura.setText(String.valueOf(" "+resultado+" °K"));
        }
    }
    
    
    void conversionlongitud(){
         try{
        double dato=Double.parseDouble(txtdatolongitud.getText());
        double resultado=0;
        //obtener el dato del combo
        int i=cbxopcioneslongitud.getSelectedIndex();
        //condiciones
        
        if(i==0){
            resultado=1000*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" m"));
        }else if(i==1){
            resultado=0.621371*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" millas"));
        }else if(i==2){
            resultado=100000*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" cm"));
        }else if(i==3){
            resultado=(1000000)*(dato);
            lblresultado.setText(String.valueOf(" "+resultado+" mm"));
        }else if(i==4){
            resultado=0.001*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" km"));
        }else if(i==5){
            resultado=0.000621371*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" millas"));
        }else if(i==6){
            resultado=100*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" cm"));
        }else if(i==7){
            resultado=1000*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" mm"));
        }else if(i==8){
            resultado=1.60934*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" km"));
        }else if(i==9){
            resultado=1609.34*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" m"));
        }else if(i==10){
            resultado=160934*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" cm"));
        }else if(i==11){
            resultado=649.1169287*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" mm"));
        }else if(i==12){
            resultado=0.006737946999*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" km"));
        }else if(i==13){
            resultado=0.01*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" m"));
        }else if(i==14){
            resultado=0.015402222*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" millas"));
        }else if(i==15){
            resultado=10*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" mm"));
        }else if(i==16){
            resultado=0.000001 *dato;
            lblresultado.setText(String.valueOf(" "+resultado+" km"));
        }else if(i==17){
            resultado=0.001*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" m"));
        }else if(i==18){
            resultado=0.005666160969*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" millas"));
        }else if(i==19){
            resultado=0.1*dato;
            lblresultado.setText(String.valueOf(" "+resultado+" cm"));
        }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Hay casillas en blanco\n"
                    + "O ha introducido un caracter\n"
                    + "Vuelva a intentarlo");
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
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbxopcionesmasa = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        btncalcularmasa = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtmasa = new javax.swing.JTextField();
        lblresultadomasa = new javax.swing.JLabel();
        btnnuevomasa = new javax.swing.JButton();
        btncancelarmasa = new javax.swing.JButton();
        btnlimpiarmasa = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbxopcionestemeperatura = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtgrado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btncalculartemperatura = new javax.swing.JButton();
        btncancelartemperatura = new javax.swing.JButton();
        btnlimpiartemperatura = new javax.swing.JButton();
        btnnuevotemperatura = new javax.swing.JButton();
        lblresultadotemperatura = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxopcioneslongitud = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdatolongitud = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblresultado = new javax.swing.JLabel();
        btnnuevolongitud = new javax.swing.JButton();
        btncancelarlongitud1 = new javax.swing.JButton();
        btnlimpiarlongitud = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 137, 233));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONVERSIONES");

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("CONVERSIONES DE MASA");

        cbxopcionesmasa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ton a kg", "ton a lb", "ton a g", "ton a mg", "kg a ton", "kg a lb", "kg a g", "kg a mg", "lb a ton", "lb a kg", "lb a g", "lb a mg", "g a ton", "g a kg", "g a lb", "g a mg", "mg a ton", "mg a hg", "mg a lb", "mg a g" }));
        cbxopcionesmasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxopcionesmasaActionPerformed(evt);
            }
        });

        jLabel9.setText("Seleccionar:");

        btncalcularmasa.setText("Calcular");
        btncalcularmasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularmasaActionPerformed(evt);
            }
        });

        jLabel10.setText("Dato:");

        txtmasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmasaKeyReleased(evt);
            }
        });

        lblresultadomasa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnnuevomasa.setText("Nueva conversión");
        btnnuevomasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevomasaActionPerformed(evt);
            }
        });

        btncancelarmasa.setText("Cancelar");
        btncancelarmasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarmasaActionPerformed(evt);
            }
        });

        btnlimpiarmasa.setText("Limpiar");
        btnlimpiarmasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarmasaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Resultado:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncalcularmasa)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblresultadomasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(61, 61, 61))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnnuevomasa)
                                .addGap(40, 40, 40)
                                .addComponent(btncancelarmasa)
                                .addGap(62, 62, 62)
                                .addComponent(btnlimpiarmasa)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxopcionesmasa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtmasa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxopcionesmasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtmasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btncalcularmasa)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblresultadomasa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevomasa)
                    .addComponent(btnlimpiarmasa)
                    .addComponent(btncancelarmasa))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane2.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane2.addTab("Masa", jDesktopPane2);

        jDesktopPane3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("CONVERSIONES DE TEMPERATURA");

        cbxopcionestemeperatura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "°C a °F", "°C a °K", "°C a °R", "°F a °C", "°F a °K", "°F a °R", "°K a °C", "°K a °F", "°K a °R", "°R a °C", "°R a °F", "°R a °K" }));
        cbxopcionestemeperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxopcionestemeperaturaActionPerformed(evt);
            }
        });

        jLabel6.setText("Seleccionar:");

        txtgrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtgradoKeyReleased(evt);
            }
        });

        jLabel7.setText("Dato:");

        btncalculartemperatura.setText("Calcular");
        btncalculartemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculartemperaturaActionPerformed(evt);
            }
        });

        btncancelartemperatura.setText("Cancelar");
        btncancelartemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelartemperaturaActionPerformed(evt);
            }
        });

        btnlimpiartemperatura.setText("Limpiar");
        btnlimpiartemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiartemperaturaActionPerformed(evt);
            }
        });

        btnnuevotemperatura.setText("Nueva conversión");
        btnnuevotemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevotemperaturaActionPerformed(evt);
            }
        });

        lblresultadotemperatura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Resultado:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncalculartemperatura)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblresultadotemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(61, 61, 61))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxopcionestemeperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtgrado, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnnuevotemperatura)
                                .addGap(40, 40, 40)
                                .addComponent(btncancelartemperatura)
                                .addGap(62, 62, 62)
                                .addComponent(btnlimpiartemperatura)
                                .addGap(35, 35, 35)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxopcionestemeperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtgrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btncalculartemperatura)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(lblresultadotemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevotemperatura)
                    .addComponent(btnlimpiartemperatura)
                    .addComponent(btncancelartemperatura))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane3.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane2.addTab("Temperatura", jDesktopPane3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("CONVERSIONES DE LONGITUD");

        cbxopcioneslongitud.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "km a m", "km a millas", "km a cm", "km a mm", "m a km", "m a millas", "m a cm", "m a mm", "millas a km", "millas a m", "millas a cm", "millas a mm", "cm a km", "cm a m", "cm a millas", "cm a mm", "mm a km", "mm a m", "mm a millas", "mm a cm" }));

        jLabel3.setText("Seleccionar:");

        jLabel4.setText("Dato:");

        txtdatolongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdatolongitudKeyReleased(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblresultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnnuevolongitud.setText("Nueva conversión");
        btnnuevolongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevolongitudActionPerformed(evt);
            }
        });

        btncancelarlongitud1.setText("Cancelar");
        btncancelarlongitud1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarlongitud1ActionPerformed(evt);
            }
        });

        btnlimpiarlongitud.setText("Limpiar");
        btnlimpiarlongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarlongitudActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Resultado:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxopcioneslongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdatolongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnnuevolongitud)
                                .addGap(40, 40, 40)
                                .addComponent(btncancelarlongitud1)
                                .addGap(62, 62, 62)
                                .addComponent(btnlimpiarlongitud)
                                .addGap(35, 35, 35))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel2)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(lblresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxopcioneslongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtdatolongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(lblresultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevolongitud)
                    .addComponent(btnlimpiarlongitud)
                    .addComponent(btncancelarlongitud1))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane4.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane2.addTab("Longitud", jDesktopPane4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(229, 229, 229))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       conversionlongitud();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnlimpiarlongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarlongitudActionPerformed
        // TODO add your handling code here:
        limpiarlongitud();
    }//GEN-LAST:event_btnlimpiarlongitudActionPerformed

    private void txtdatolongitudKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdatolongitudKeyReleased
        // TODO add your handling code here:
        conversionlongitud();
    }//GEN-LAST:event_txtdatolongitudKeyReleased

    private void btncancelarlongitud1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarlongitud1ActionPerformed
        // TODO add your handling code here:
        limpiarlongitud();
        bloquearlongitud();
    }//GEN-LAST:event_btncancelarlongitud1ActionPerformed

    private void btnnuevolongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevolongitudActionPerformed
        // TODO add your handling code here:
        desbloquearlongitud();
        limpiarlongitud();
    }//GEN-LAST:event_btnnuevolongitudActionPerformed

    private void txtgradoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgradoKeyReleased
        // TODO add your handling code here:
        conversiontemperatura();
    }//GEN-LAST:event_txtgradoKeyReleased

    private void btncalculartemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculartemperaturaActionPerformed
        // TODO add your handling code here:
        conversiontemperatura();
    }//GEN-LAST:event_btncalculartemperaturaActionPerformed

    private void btncancelartemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelartemperaturaActionPerformed
        // TODO add your handling code here:
        limpiartemperatura();
        bloqueartemperatura();
    }//GEN-LAST:event_btncancelartemperaturaActionPerformed

    private void btnlimpiartemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiartemperaturaActionPerformed
        // TODO add your handling code here:
        limpiartemperatura();
    }//GEN-LAST:event_btnlimpiartemperaturaActionPerformed

    private void btnnuevotemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevotemperaturaActionPerformed
        // TODO add your handling code here:
        limpiartemperatura();
        desbloqueartemperatura();
    }//GEN-LAST:event_btnnuevotemperaturaActionPerformed

    private void cbxopcionestemeperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxopcionestemeperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxopcionestemeperaturaActionPerformed

    private void cbxopcionesmasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxopcionesmasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxopcionesmasaActionPerformed

    private void txtmasaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmasaKeyReleased
        // TODO add your handling code here:
        conversionmasa();
    }//GEN-LAST:event_txtmasaKeyReleased

    private void btnnuevomasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevomasaActionPerformed
        // TODO add your handling code here:
        limpiarmasa();
        desbloquearmasa();
    }//GEN-LAST:event_btnnuevomasaActionPerformed

    private void btncancelarmasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarmasaActionPerformed
        // TODO add your handling code here:
        limpiarmasa();
        bloquearmasa();
    }//GEN-LAST:event_btncancelarmasaActionPerformed

    private void btnlimpiarmasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarmasaActionPerformed
        // TODO add your handling code here:
        limpiarmasa();
    }//GEN-LAST:event_btnlimpiarmasaActionPerformed

    private void btncalcularmasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularmasaActionPerformed
        // TODO add your handling code here:
        conversionmasa();
    }//GEN-LAST:event_btncalcularmasaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcularmasa;
    private javax.swing.JButton btncalculartemperatura;
    private javax.swing.JButton btncancelarlongitud1;
    private javax.swing.JButton btncancelarmasa;
    private javax.swing.JButton btncancelartemperatura;
    private javax.swing.JButton btnlimpiarlongitud;
    private javax.swing.JButton btnlimpiarmasa;
    private javax.swing.JButton btnlimpiartemperatura;
    private javax.swing.JButton btnnuevolongitud;
    private javax.swing.JButton btnnuevomasa;
    private javax.swing.JButton btnnuevotemperatura;
    private javax.swing.JComboBox cbxopcioneslongitud;
    private javax.swing.JComboBox cbxopcionesmasa;
    private javax.swing.JComboBox cbxopcionestemeperatura;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JLabel lblresultadomasa;
    private javax.swing.JLabel lblresultadotemperatura;
    private javax.swing.JTextField txtdatolongitud;
    private javax.swing.JTextField txtgrado;
    private javax.swing.JTextField txtmasa;
    // End of variables declaration//GEN-END:variables
}
