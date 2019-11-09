# CentralLeitos
Trabalho Interdisciplinar Programação Newton Paiva 3º Período

# Adicionar o LookAndFeel no projeto para padronização das telas e botões
Na sua tela do JFrame Apertar o CTRL + F e buscar por UIManager

- Sistema deve localizar o trecho de código:
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                  javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
              }

Você vai alterar apenas o IF, trocar pelo trecho do código abaixo:

if ("Nimbus".equals(info.getName())) {
                  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
              }
