package tp.poo3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JButton;
import tp.poo3.Botao;
//import tp.poo3.Game;
import javax.swing.*;
//import botoes.controleBotoes;

public class Genius extends javax.swing.JFrame {
    
    public List<Botao> resposta;
    public int contador = 0, aux = 0, gameStart = 0;
    public int i = 0, lvl = 1, count = 0;
    Botao novoBotao1 = new Botao("Verde");
    Botao novoBotao2 = new Botao("Vermelho");
    Botao novoBotao3 = new Botao("Azul");
    Botao novoBotao4 = new Botao("Amarelo");
    ExecutorService executorService = Executors.newSingleThreadExecutor();

    
    public Genius() {
        super("Genius game!");
        this.resposta = new ArrayList<>();
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    
    
    List<Botao> lista = new ArrayList<>();
    public List<Botao> criarLista(){
        int num;
        Random random = new Random();
        
        for (int x = count;x < lvl; x++){
            num = random.nextInt(4);
            
            switch(num){
                case 0:
                    lista.add(novoBotao1);
                    break;
                case 1:
                    lista.add(novoBotao2);
                    break;
                case 2:
                    lista.add(novoBotao3);
                    break;
                case 3:
                    lista.add(novoBotao4);
                    break;
            }
        }
       
        for(i = 0; i< lista.size(); i++){
            switch(lista.get(i).getCorBotao()){
                case "Verde":
                    executorService.submit(acendeVerde());
                    break;
                case "Vermelho":
                    executorService.submit(acendeVermelho());
                    break;
                case "Azul":
                    executorService.submit(acendeAzul());
                    break;
                case "Amarelo":
                    executorService.submit(acendeAmarelo());
                    break;
            }
        }
        return lista;
    }
    
    public boolean apertaVerde(List<Botao> lista, int atual){
        return lista.get(atual).getCorBotao().equals("Verde");
    }
    
    public boolean apertaVermelho(List<Botao> lista, int atual){
        return lista.get(atual).getCorBotao().equals("Vermelho");
    }
    
    public boolean apertaAzul(List<Botao> lista, int atual){
        return lista.get(atual).getCorBotao().equals("Azul");
    }
    public boolean apertaAmarelo(List<Botao> lista, int atual){
        return lista.get(atual).getCorBotao().equals("Amarelo");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        BotaoVerde = new javax.swing.JButton();
        BotaoVermelho = new javax.swing.JButton();
        BotaoAzul = new javax.swing.JButton();
        BotaoAmarelo = new javax.swing.JButton();
        BotaoInicializa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("      Bem vindo ao Genius!!");
        jTextField1.setSelectionColor(new java.awt.Color(255, 255, 255));

        BotaoVerde.setBackground(new java.awt.Color(0, 153, 0));
        BotaoVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVerdeActionPerformed(evt);
            }
        });

        BotaoVermelho.setBackground(new java.awt.Color(153, 0, 0));
        BotaoVermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVermelhoActionPerformed(evt);
            }
        });

        BotaoAzul.setBackground(new java.awt.Color(0, 0, 100));
        BotaoAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAzulActionPerformed(evt);
            }
        });

        BotaoAmarelo.setBackground(new java.awt.Color(150, 150, 0));
        BotaoAmarelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAmareloActionPerformed(evt);
            }
        });

        BotaoInicializa.setBackground(new java.awt.Color(255, 255, 255));
        BotaoInicializa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotaoInicializa.setText("Iniciar");
        BotaoInicializa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoInicializaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotaoVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(175, Short.MAX_VALUE))
            .addComponent(jTextField1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoInicializa)
                .addGap(286, 286, 286))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(BotaoInicializa)
                .addContainerGap(60, Short.MAX_VALUE))
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

    
    
    
    
    
    private void BotaoVermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVermelhoActionPerformed
       if (gameStart == 0) return;
        if(apertaVermelho(lista, count)){
            resposta.add(count,novoBotao2);
            
            jogo();
        }
        else{
            JOptionPane.showMessageDialog(null, "Desculpe, você perdeu!!");
            lista.clear();
            resposta.clear();
            count = 0;
            lvl = 1;
            gameStart = 0;
        }
    }//GEN-LAST:event_BotaoVermelhoActionPerformed

    private void BotaoVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVerdeActionPerformed
        if (gameStart == 0) return;
        if(apertaVerde(lista, count)){
            resposta.add(count, novoBotao1);
            
            jogo();
        }
        else{
            JOptionPane.showMessageDialog(null, "Desculpe, você perdeu!!");
            lista.clear();
            resposta.clear();
            count = 0;
            lvl = 1;
            gameStart = 0;
        }
    }//GEN-LAST:event_BotaoVerdeActionPerformed

    private void BotaoInicializaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoInicializaActionPerformed
        gameStart = 1;
        lista.clear();
        resposta.clear();
        count = 0;
        lvl = 1;
        criarLista();   
    }//GEN-LAST:event_BotaoInicializaActionPerformed

    private void BotaoAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAzulActionPerformed
        if (gameStart == 0) return;
        if(apertaAzul(lista, count)){
            resposta.add(count, novoBotao3);
            
            jogo();
        }
        else{
            JOptionPane.showMessageDialog(null, "Desculpe, você perdeu!!");
            lista.clear();
            resposta.clear();
            count = 0;
            lvl = 1;
            gameStart = 0;
        }
        
    }//GEN-LAST:event_BotaoAzulActionPerformed

    private void BotaoAmareloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAmareloActionPerformed
        if (gameStart == 0) return;
        if(apertaAmarelo(lista, count)){ 
            resposta.add(count, novoBotao4);
            
            jogo();
        }
        else{
            JOptionPane.showMessageDialog(null, "Desculpe, você perdeu!!");
            lista.clear();
            resposta.clear();
            count = 0;
            lvl = 1;
            gameStart = 0;
        }
    }//GEN-LAST:event_BotaoAmareloActionPerformed
    
    
    public Runnable acendeVerde(){
        
        Runnable r = new Runnable(){
            @Override
            public void run(){
                try {
                    Thread.sleep(500);
                    BotaoVerde.setBackground(Color.green);
                    Thread.sleep(500);
                    BotaoVerde.setBackground(new java.awt.Color(0, 153, 0));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        return r;
        
    }
    
    public Runnable acendeVermelho(){
        
        Runnable r = new Runnable(){
            @Override
            public void run(){
                try {
                    Thread.sleep(500);
                    BotaoVermelho.setBackground(Color.red);
                    Thread.sleep(500);
                    BotaoVermelho.setBackground(new java.awt.Color(153, 0, 0));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        return r;
    }

    public Runnable acendeAzul(){
        Runnable r = new Runnable(){
            @Override
            public void run(){
                try {
                    Thread.sleep(500);
                    BotaoAzul.setBackground(Color.blue);
                    Thread.sleep(500);
                    BotaoAzul.setBackground(new java.awt.Color(0, 0, 100));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        return r;
    }
    
    public Runnable acendeAmarelo(){
        Runnable r = new Runnable(){
            @Override
            public void run(){
                try {
                    Thread.sleep(500);
                    BotaoAmarelo.setBackground(Color.yellow);
                    Thread.sleep(500);
                    BotaoAmarelo.setBackground(new java.awt.Color(150, 150, 0));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        return r;
    }
    
 
    
    
    public void jogo(){
        
        if (resposta.get(count).equals(lista.get(count))){
            count++;
            
            if(count == lvl){
                lvl++;
                if(lvl == 9){
                    JOptionPane.showMessageDialog(null, "PARABÉNS!! VOCE É VENCEU!!");
                    lista.clear();
                    resposta.clear();
                    count = 0;
                    lvl = 1;
                    gameStart = 0;
                }
                else{
                   criarLista();
                   count = 0; 
                }
            }
        }
    }
    
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Genius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Genius().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAmarelo;
    private javax.swing.JButton BotaoAzul;
    private javax.swing.JButton BotaoInicializa;
    private javax.swing.JButton BotaoVerde;
    private javax.swing.JButton BotaoVermelho;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
