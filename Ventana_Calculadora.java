/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARTHA
 */
public class Ventana_Calculadora extends javax.swing.JFrame {
    private String cadenaNumeros="";
    private double numero1,resultado;
    private String operacion = "nula";
    private boolean activado=true;
    private boolean punto = true;
    
    
    /**
     * Creates new form Ventana_Calculadora
     */
    public Ventana_Calculadora() {
        initComponents();
        setSize(300,450);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Panel = new javax.swing.JPanel();
        EtiquetaMuestra = new javax.swing.JLabel();
        EtiquetaNumeros = new javax.swing.JLabel();
        BotonBorrarTodo = new javax.swing.JButton();
        BotonRaiz = new javax.swing.JButton();
        BotonDividir = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        BotonMultiplicar = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        BotonResta = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        BotonSuma = new javax.swing.JButton();
        BotonCambiarSigno = new javax.swing.JButton();
        BotonCero = new javax.swing.JButton();
        BotonPunto = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        CalculadoraEstandar = new javax.swing.JMenuItem();
        ConversorDivisas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        Panel.setLayout(new java.awt.GridBagLayout());

        EtiquetaMuestra.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EtiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        Panel.add(EtiquetaMuestra, gridBagConstraints);

        EtiquetaNumeros.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        EtiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EtiquetaNumeros.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        Panel.add(EtiquetaNumeros, gridBagConstraints);

        BotonBorrarTodo.setBackground(new java.awt.Color(204, 204, 204));
        BotonBorrarTodo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BotonBorrarTodo.setText("c");
        BotonBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarTodoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonBorrarTodo, gridBagConstraints);

        BotonRaiz.setBackground(new java.awt.Color(204, 204, 204));
        BotonRaiz.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARTHA\\Desktop\\iconos Calculadora\\raizcuadrada.png")); // NOI18N
        BotonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRaizActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonRaiz, gridBagConstraints);

        BotonDividir.setBackground(new java.awt.Color(204, 204, 204));
        BotonDividir.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARTHA\\Desktop\\iconos Calculadora\\dividir.png")); // NOI18N
        BotonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDividirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonDividir, gridBagConstraints);

        BotonBorrar.setBackground(new java.awt.Color(204, 204, 204));
        BotonBorrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARTHA\\Desktop\\iconos Calculadora\\borrar.png")); // NOI18N
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonBorrar, gridBagConstraints);

        Boton7.setBackground(new java.awt.Color(204, 204, 255));
        Boton7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Boton7.setText("7");
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton7, gridBagConstraints);

        Boton9.setBackground(new java.awt.Color(204, 204, 255));
        Boton9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Boton9.setText("9");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton9, gridBagConstraints);

        Boton8.setBackground(new java.awt.Color(204, 204, 255));
        Boton8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Boton8.setText("8");
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton8, gridBagConstraints);

        BotonMultiplicar.setBackground(new java.awt.Color(204, 204, 204));
        BotonMultiplicar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BotonMultiplicar.setText("X");
        BotonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMultiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonMultiplicar, gridBagConstraints);

        Boton4.setBackground(new java.awt.Color(204, 204, 255));
        Boton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Boton4.setText("4");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton4, gridBagConstraints);

        Boton5.setBackground(new java.awt.Color(204, 204, 255));
        Boton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Boton5.setText("5");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton5, gridBagConstraints);

        Boton6.setBackground(new java.awt.Color(204, 204, 255));
        Boton6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Boton6.setText("6");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton6, gridBagConstraints);

        BotonResta.setBackground(new java.awt.Color(204, 204, 204));
        BotonResta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotonResta.setText("-");
        BotonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRestaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonResta, gridBagConstraints);

        Boton1.setBackground(new java.awt.Color(204, 204, 255));
        Boton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Boton1.setText("1");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton1, gridBagConstraints);

        Boton2.setBackground(new java.awt.Color(204, 204, 255));
        Boton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Boton2.setText("2");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton2, gridBagConstraints);

        Boton3.setBackground(new java.awt.Color(204, 204, 255));
        Boton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Boton3.setText("3");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton3, gridBagConstraints);

        BotonSuma.setBackground(new java.awt.Color(204, 204, 204));
        BotonSuma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotonSuma.setText("+");
        BotonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonSuma, gridBagConstraints);

        BotonCambiarSigno.setBackground(new java.awt.Color(204, 204, 204));
        BotonCambiarSigno.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARTHA\\Desktop\\iconos Calculadora\\masmenos.png")); // NOI18N
        BotonCambiarSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiarSignoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonCambiarSigno, gridBagConstraints);

        BotonCero.setBackground(new java.awt.Color(204, 204, 255));
        BotonCero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotonCero.setText("0");
        BotonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonCero, gridBagConstraints);

        BotonPunto.setBackground(new java.awt.Color(204, 204, 204));
        BotonPunto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotonPunto.setText(".");
        BotonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonPunto, gridBagConstraints);

        BotonIgual.setBackground(new java.awt.Color(204, 204, 204));
        BotonIgual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotonIgual.setText("=");
        BotonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonIgual, gridBagConstraints);

        Menu.setText("Usos");
        Menu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        CalculadoraEstandar.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARTHA\\Desktop\\iconos Calculadora\\calculadora.png")); // NOI18N
        CalculadoraEstandar.setText("Calculadora Estandar");
        Menu.add(CalculadoraEstandar);

        ConversorDivisas.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARTHA\\Desktop\\iconos Calculadora\\divisas.png")); // NOI18N
        ConversorDivisas.setText("Conversor de Divisas");
        ConversorDivisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConversorDivisasActionPerformed(evt);
            }
        });
        Menu.add(ConversorDivisas);
        Menu.add(jSeparator1);

        Salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARTHA\\Desktop\\iconos Calculadora\\Salir.png")); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Menu.add(Salir);

        BarraMenu.add(Menu);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_SalirActionPerformed

    private void ConversorDivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConversorDivisasActionPerformed
        // TODO add your handling code here:
        
        VentanaDivisas conversorDivisas = new VentanaDivisas();
        
        conversorDivisas.setVisible(true);
 
        dispose();
        
    }//GEN-LAST:event_ConversorDivisasActionPerformed

    private void BotonBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarTodoActionPerformed
        // TODO add your handling code here:
        EtiquetaMuestra.setText("");
        EtiquetaNumeros.setText("0");
        cadenaNumeros="";
        operacion="nula";
        activado=true;
        punto=true;
        
    }//GEN-LAST:event_BotonBorrarTodoActionPerformed

    private void BotonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRaizActionPerformed
        // TODO add your handling code here:
   
        numero1 = Double.parseDouble(cadenaNumeros);
        EtiquetaMuestra.setText("sqrt("+cadenaNumeros+")");
        resultado = Math.sqrt(numero1);
        EtiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado);
        punto=true;
        
        
    }//GEN-LAST:event_BotonRaizActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        // TODO add your handling code here:
        int tama??o = cadenaNumeros.length();
        if(tama??o>0){
            if(tama??o==1){
                cadenaNumeros="0";
            }else{
                cadenaNumeros = cadenaNumeros.substring(0,cadenaNumeros.length()-1);
            }                    
            EtiquetaNumeros.setText(cadenaNumeros);
            
        }
        
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        // TODO add your handling code here:

        if(EtiquetaNumeros.getText()=="0"){
            cadenaNumeros = "1";
        }else{
            cadenaNumeros+="1";
        }
       
       EtiquetaNumeros.setText(cadenaNumeros);
       activado=true; 
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        // TODO add your handling code here:
        if(EtiquetaNumeros.getText()=="0"){
            cadenaNumeros = "2";
        }else{
            cadenaNumeros+="2";
        }
        
       EtiquetaNumeros.setText(cadenaNumeros);
       activado=true;
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        // TODO add your handling code here:
       
       if(EtiquetaNumeros.getText()=="0"){
            cadenaNumeros = "3";
        }else{
            cadenaNumeros+="3";
        }
       
       EtiquetaNumeros.setText(cadenaNumeros);
       activado=true;
    }//GEN-LAST:event_Boton3ActionPerformed

    private void BotonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCeroActionPerformed
        // TODO add your handling code here:
        
        if(cadenaNumeros!=""){
           if(EtiquetaNumeros.getText()=="0"){
                cadenaNumeros = "0";
            }else{
                cadenaNumeros+="0";
            }
           EtiquetaNumeros.setText(cadenaNumeros);
           activado=true;
        }
        
        
    }//GEN-LAST:event_BotonCeroActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        // TODO add your handling code here:
       if(EtiquetaNumeros.getText()=="0"){
            cadenaNumeros = "4";
        }else{
            cadenaNumeros+="4";
        }
       EtiquetaNumeros.setText(cadenaNumeros);
       activado=true;
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        // TODO add your handling code here:
       if(EtiquetaNumeros.getText()=="0"){
            cadenaNumeros = "5";
        }else{
            cadenaNumeros+="5";
        }
       EtiquetaNumeros.setText(cadenaNumeros);
       activado=true;
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        // TODO add your handling code here:
       if(EtiquetaNumeros.getText()=="0"){
            cadenaNumeros = "6";
        }else{
            cadenaNumeros+="6";
        }
       EtiquetaNumeros.setText(cadenaNumeros);
       activado=true;
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        // TODO add your handling code here:
       if(EtiquetaNumeros.getText()=="0"){
            cadenaNumeros = "7";
        }else{
            cadenaNumeros+="7";
        }
       EtiquetaNumeros.setText(cadenaNumeros);
       activado=true;
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        // TODO add your handling code here:
       if(EtiquetaNumeros.getText()=="0"){
            cadenaNumeros = "8";
        }else{
            cadenaNumeros+="8";
        }
       EtiquetaNumeros.setText(cadenaNumeros);
       activado=true;
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        // TODO add your handling code here:
       if(EtiquetaNumeros.getText()=="0"){
            cadenaNumeros = "9";
        }else{
            cadenaNumeros+="9";
        }
       EtiquetaNumeros.setText(cadenaNumeros);
       activado=true;
    }//GEN-LAST:event_Boton9ActionPerformed

    private void BotonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumaActionPerformed
        // TODO add your handling code here:
        if(activado==true){
            numero1 = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText(cadenaNumeros+"+");
            cadenaNumeros = "";
            operacion = "sumar";
            
            activado=false;
        }
        punto=true;
        
    }//GEN-LAST:event_BotonSumaActionPerformed

    private void BotonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgualActionPerformed
        // TODO add your handling code here:
        double numero2;
        if(operacion.equalsIgnoreCase("nula")){
            EtiquetaNumeros.setText(cadenaNumeros);
            
        }else if(operacion.equalsIgnoreCase("sumar")){
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1+numero2;
            EtiquetaNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion="nula";
        }else if(operacion.equals("restar")){
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1-numero2;
            EtiquetaNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion="nula";
        }else if(operacion.equals("multiplicar")){
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1*numero2;
            EtiquetaNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion="nula";
        }else if(operacion.equals("dividir")){
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1/numero2;
            EtiquetaNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion="nula";
        }
        
        EtiquetaMuestra.setText("");
        activado=true;
        
    }//GEN-LAST:event_BotonIgualActionPerformed

    private void BotonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPuntoActionPerformed
        // TODO add your handling code here:
        
        if(punto==true){
            
            if(cadenaNumeros ==""){
            cadenaNumeros="0.";
            }else{
            cadenaNumeros+=".";
            }
            EtiquetaNumeros.setText(cadenaNumeros);
        }
        
        
        punto=false;
    }//GEN-LAST:event_BotonPuntoActionPerformed

    private void BotonCambiarSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiarSignoActionPerformed
        // TODO add your handling code here:
        
        if(cadenaNumeros.charAt(0) != '-'){
            
            cadenaNumeros = "-"+cadenaNumeros;
        }else{
            cadenaNumeros = cadenaNumeros.substring(1,cadenaNumeros.length());
        }
        EtiquetaNumeros.setText(cadenaNumeros);
    }//GEN-LAST:event_BotonCambiarSignoActionPerformed

    private void BotonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRestaActionPerformed
        // TODO add your handling code here:
        
        if(activado==true){
            numero1 = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText(cadenaNumeros+"-");
            cadenaNumeros = "";
            operacion = "restar";
            
            activado=false;
            punto=true;
        }
    }//GEN-LAST:event_BotonRestaActionPerformed

    private void BotonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMultiplicarActionPerformed
        // TODO add your handling code here:
        if(activado==true){
            numero1 = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText(cadenaNumeros+"x");
            cadenaNumeros = "";
            operacion = "multiplicar";
            
            activado=false;
            punto=true;
        }
        
    }//GEN-LAST:event_BotonMultiplicarActionPerformed

    private void BotonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDividirActionPerformed
        // TODO add your handling code here:
        if(activado==true){
            numero1 = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText(cadenaNumeros+"/");
            cadenaNumeros = "";
            operacion = "dividir";
            
            activado=false;
            punto=true;
        }
    }//GEN-LAST:event_BotonDividirActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonBorrarTodo;
    private javax.swing.JButton BotonCambiarSigno;
    private javax.swing.JButton BotonCero;
    private javax.swing.JButton BotonDividir;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonMultiplicar;
    private javax.swing.JButton BotonPunto;
    private javax.swing.JButton BotonRaiz;
    private javax.swing.JButton BotonResta;
    private javax.swing.JButton BotonSuma;
    private javax.swing.JMenuItem CalculadoraEstandar;
    private javax.swing.JMenuItem ConversorDivisas;
    private javax.swing.JLabel EtiquetaMuestra;
    private javax.swing.JLabel EtiquetaNumeros;
    private javax.swing.JMenu Menu;
    private javax.swing.JPanel Panel;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
