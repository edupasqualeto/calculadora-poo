public class JanelaPrincipal extends javax.swing.JFrame {
    
    int primeiro, segundo, resultado;
    String operacao = "";
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName());

    public JanelaPrincipal() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(300, 400));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Display = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        getContentPane().setLayout(new java.awt.GridLayout(2, 1));

        Display.setEditable(false);
        Display.setBackground(new java.awt.Color(255, 255, 255));
        Display.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        Display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Display.setToolTipText("");
        Display.setMinimumSize(new java.awt.Dimension(300, 300));
        Display.setPreferredSize(new java.awt.Dimension(100, 120));
        Display.addActionListener(this::DisplayActionPerformed);
        getContentPane().add(Display);

        jPanel1.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 50));
        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        jButton1.setText("7");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel1.add(jButton1);

        jButton5.setText("8");
        jButton5.addActionListener(this::jButton5ActionPerformed);
        jPanel1.add(jButton5);

        jButton9.setText("9");
        jButton9.addActionListener(this::jButton9ActionPerformed);
        jPanel1.add(jButton9);

        jButton2.setText("/");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2);

        jButton3.setText("4");
        jButton3.addActionListener(this::jButton3ActionPerformed);
        jPanel1.add(jButton3);

        jButton13.setText("5");
        jButton13.addActionListener(this::jButton13ActionPerformed);
        jPanel1.add(jButton13);

        jButton10.setText("6");
        jButton10.addActionListener(this::jButton10ActionPerformed);
        jPanel1.add(jButton10);

        jButton8.setText("*");
        jButton8.addActionListener(this::jButton8ActionPerformed);
        jPanel1.add(jButton8);

        jButton7.setText("1");
        jButton7.addActionListener(this::jButton7ActionPerformed);
        jPanel1.add(jButton7);

        jButton12.setText("2");
        jButton12.addActionListener(this::jButton12ActionPerformed);
        jPanel1.add(jButton12);

        jButton6.setText("3");
        jButton6.addActionListener(this::jButton6ActionPerformed);
        jPanel1.add(jButton6);

        jButton16.setText("-");
        jButton16.addActionListener(this::jButton16ActionPerformed);
        jPanel1.add(jButton16);

        jButton15.setText("0");
        jButton15.addActionListener(this::jButton15ActionPerformed);
        jPanel1.add(jButton15);

        jButton14.setText("Limpar");
        jButton14.addActionListener(this::jButton14ActionPerformed);
        jPanel1.add(jButton14);

        jButton11.setText("=");
        jButton11.addActionListener(this::jButton11ActionPerformed);
        jPanel1.add(jButton11);

        jButton4.setText("+");
        jButton4.addActionListener(this::jButton4ActionPerformed);
        jPanel1.add(jButton4);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
    }//GEN-LAST:event_DisplayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adicionarNumero(7);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        adicionarNumero(6);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        adicionarNumero(5);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        adicionarNumero(8);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        adicionarNumero(9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adicionarNumero(4);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        adicionarNumero(1);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        adicionarNumero(2);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        adicionarNumero(3);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        adicionarNumero(0);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        limparDisplayTotal();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        definirOperacao("+");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String texto = Display.getText();
        if(texto.equals("Erro")) {
            System.out.println("Impossivel realizar operacoes com 'Erro'!");
            limparDisplayTotal();
            return;
        }
        if(texto.isEmpty() == true) {
            System.out.println("Nenhum segundo valor inserido, sem operacao!");
            limparDisplayTotal();
            Display.setText("Erro");
            return;
        }
        if(operacao.isEmpty() == true || texto.equals("-")) {
            System.out.println("Nenhuma operacao inserida, cancelado!");
            limparDisplayTotal();
            Display.setText("Erro");
            return;
        }
        segundo = Integer.parseInt(texto);
        limparDisplay();
        
        if(operacao.equals("+")) {
            resultado = primeiro + segundo;
        }
        else if(operacao.equals("-")) {
            resultado = primeiro - segundo;
        }
        else if(operacao.equals("*")) {
            resultado = primeiro * segundo;
        }
        else if(operacao.equals("/")) {
            if(segundo == 0) {
                System.out.println("Divisao por 0 nao permitida!");
                limparDisplayTotal();
                Display.setText("Erro");
                return;
            }         
            else {
                resultado = primeiro / segundo;
            }
        }
        
        Display.setText(String.valueOf(resultado));
        System.out.println(resultado);
        
        primeiro = resultado;
        segundo = 0;
        resultado = 0;
        operacao = "";        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        //aqui eh necessario fazer um caso especial para inserir o menos como sinal//
        String texto = Display.getText();
        if(texto.isEmpty()) {
            Display.setText("-");
            return;
        }

        definirOperacao("-");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        definirOperacao("*");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        definirOperacao("/");
    }//GEN-LAST:event_jButton2ActionPerformed

    void adicionarNumero(int valor) {
        String atual = Display.getText();
        if(atual.equals("Erro")) {
            limparDisplay();
            atual = "";
        }
        
        if(atual.isEmpty() == false && atual.charAt(0) == '-' && atual.length() < 4) {
            atual = atual+valor;
            Display.setText(atual);
        }
        
        else if (atual.length() < 3) {
            atual = atual+valor;
            Display.setText(atual);
        }
    }
    
    void definirOperacao(String operador) {
        String texto = Display.getText();
        if(texto.equals("Erro")) {
            limparDisplayTotal();
            return;
        }
        if(!operacao.equals("")) {
            operacao = operador;
            return;
        }
        if(texto.isEmpty() == true || texto.equals("-")) {
            Display.setText("Erro");
            System.out.println("Nenhum valor inserido antes, sem operacao!");
            return;
        }
        primeiro = Integer.parseInt(texto);
        operacao = operador;
        limparDisplay();
    }
        
    void limparDisplay() {
        Display.setText("");
    }
    
    void limparDisplayTotal() {
        Display.setText("");
        primeiro = 0;
        segundo = 0;
        resultado = 0;
        operacao = "";  
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new JanelaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Display;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}