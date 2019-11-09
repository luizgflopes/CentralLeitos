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

# Como adicionar as classes no projeto sem precisar alterar o projeto todo:
- Clonar o projeto no Git na sua máquina local e abrir no NetBeans Junto com o seu projeto onde tem as suas classes.
- No seu projeto, você vai pegar a classe Java e Copiar, clicar com o botão direito em cima do pacote do projeto que clonou do Git 'Colar' -> Refatorar Copiar.
Desta forma você vai adicinar a sua classe no projeto sem precisar mexer nas demais classes!
Ficar atento para colocar as classes java dentro do pacote que tem o mesmo nome que o seu.