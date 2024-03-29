import java.util.ArrayList;

import  javax.swing.JOptionPane;

public class Main {
  public static ArrayList<Jogador> jogador;
  public static ArrayList<Equipe> equipe;

  public static void main(String[] args) {
    jogador = new ArrayList<>();
    equipe = new ArrayList<>();

  String[] opcoes = {"Gerenciar jogadores", "Gerenciar Equipess", "Sair"};
 int opcaoSelecionada = 0;
 
         while (opcaoSelecionada != 2) {
     opcaoSelecionada = JOptionPane.showOptionDialog(null, "Selecione uma opção",
             "Menu inicial", JOptionPane.DEFAULT_OPTION,
             JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[2]);
     
     if (opcaoSelecionada == 0 || opcaoSelecionada == -1){
         cadastrarJogadores();
     } else if (opcaoSelecionada == 1){
         cadastrarEquipes();
     }
}
} 
         
         
public static void cadastrarJogadores(){

  String[] opcoes2 = { "Cadastrar Jogador", "Deletar Jogador", "Editar Jogador", "Listar Jogadores"
   ,"Sair"};
 int opcaoSelecionada2 = 0;
 
               while (opcaoSelecionada2 != 4) {
     opcaoSelecionada2 = JOptionPane.showOptionDialog(null, "Selecione uma opção",
             "Menu inicial", JOptionPane.DEFAULT_OPTION,
             JOptionPane.QUESTION_MESSAGE, null, opcoes2, opcoes2[4]);
     
     if(opcaoSelecionada2 == 0){
         cadastrarJogador();
     }
     else if(opcaoSelecionada2 == 1){
         excluirJogador();
     }
      else if(opcaoSelecionada2 == 2){
          editarJogadores();
      } 
      else if(opcaoSelecionada2 == 3){
          listarJogadores();
      }
     
    }
     
}
  public static void cadastrarJogador(){
    String nome = JOptionPane.showInputDialog("Digite o nome do jogador");
    String posicao = JOptionPane.showInputDialog("Digite a posição do jogador");
    int numeroJogador = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do jogador"));

    jogador.add(new Jogador(nome, posicao, numeroJogador));
  }

  public static void excluirJogador(){
    Object[] jogadoresCadastrados = jogador.toArray();

    Jogador jogadorSelecionado = (Jogador) JOptionPane.showInputDialog(null, "Escolha um jogador", "Excluir Jogador", JOptionPane.QUESTION_MESSAGE, null, jogadoresCadastrados, jogadoresCadastrados[0]);

    jogador.remove(jogadorSelecionado);
  }

  public static void editarJogadores(){
    Object[] jogadorCadastrados = jogador.toArray();

    Jogador jogadorSelecionado = (Jogador) JOptionPane.showInputDialog(null, "Escolha um jogador", "Editar Jogador", JOptionPane.QUESTION_MESSAGE, null, jogadorCadastrados, jogadorCadastrados[0]);

    String nome = JOptionPane.showInputDialog("Digite o nome do jogador", jogadorSelecionado.getNome());
    String posicao = JOptionPane.showInputDialog("Digite a posição do jogador", jogadorSelecionado.getPosicao());
    int numeroJogador = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do jogador"), jogadorSelecionado.getNumeroJogador());

    jogadorSelecionado.setNome(nome);
    jogadorSelecionado.setPosicao(posicao);
    jogadorSelecionado.setNumeroJogador(numeroJogador);
  }
  
  public static void listarJogadores(){
    String jogadores = "";
    for (Jogador jogador : jogador) {
      jogadores += "Nome: " + jogador.getNome() + " - Posição: " + jogador.getPosicao() + " - Número: " + jogador.getNumeroJogador() + "\n";
    }
    JOptionPane.showMessageDialog(null, jogadores);
  }

  public static void cadastrarEquipes(){
   String[] opcoes3 = {"Cadastrar Equipe", "Deletar Equipe", "Editar Equipe", "Listar Equipes", "Adicionar Jogadors","Sair"};

    int opcaoSelecionada3 = 0;

    while (opcaoSelecionada3 != 4) {
      opcaoSelecionada3 = JOptionPane.showOptionDialog(null, "Selecione uma opção", "Menu inicial", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes3, opcoes3[4]);

      if (opcaoSelecionada3 == 0) {
        cadastrarEquipe();
      } 
      else if (opcaoSelecionada3 == 1){
        excluirEquipe();
      }
      else if (opcaoSelecionada3 == 2){
        editarEquipe();
      }
      else if (opcaoSelecionada3 == 3){
        listarEquipes();
      }
      else if (opcaoSelecionada3 == 4){
        adicionarJogadores();
      }
    }

  }

  public static void cadastrarEquipe(){
    String nome = JOptionPane.showInputDialog("Digite o nome da equipe");
    String tecnico = JOptionPane.showInputDialog("Digite o nome do técnico");

    equipe.add(new Equipe(nome, tecnico));
  }

  public static void excluirEquipe(){
    Object[] equipesCadastradas = equipe.toArray();

    Equipe equipeSelecionada = (Equipe) JOptionPane.showInputDialog(null, "Escolha uma equipe", "Excluir Equipe", JOptionPane.QUESTION_MESSAGE, null, equipesCadastradas, equipesCadastradas[0]);

    equipe.remove(equipeSelecionada);
  }

  public static void editarEquipe(){
    Object[] equipesCadastradas = equipe.toArray();

    Equipe equipeSelecionada = (Equipe) JOptionPane.showInputDialog(null, "Escolha uma equipe", "Editar Equipe", JOptionPane.QUESTION_MESSAGE, null, equipesCadastradas, equipesCadastradas[0]);

    String nome = JOptionPane.showInputDialog("Digite o nome da equipe", equipeSelecionada.getNome());
    String tecnico = JOptionPane.showInputDialog("Digite o nome do técnico", equipeSelecionada.getTecnico());

    equipeSelecionada.setNome(nome);
    equipeSelecionada.setTecnico(tecnico);

  }

    public static void adicionarJogadores(){
      Object[] adicionarJogadores = jogador.toArray();
      Object[] equipesCadastradas = equipe.toArray();

      Equipe equipeSelecionada = (Equipe) JOptionPane.showInputDialog(null, "Escolha uma equipe", "Adicionar Jogadores", JOptionPane.QUESTION_MESSAGE, null, equipesCadastradas, equipesCadastradas[0]);
      Jogador jogadorSelecionado = (Jogador) JOptionPane.showInputDialog(null, "Escolha um jogador", "Adicionar Jogadores", JOptionPane.QUESTION_MESSAGE, null, adicionarJogadores, adicionarJogadores[0]);

      equipeSelecionada.adicionarJogador(jogadorSelecionado);
  }

  public static void listarEquipes(){
    String equipes = "";
    for (Equipe equipe : equipe) {
      equipes += "Nome: " + equipe.getNome() + " - Técnico: " + equipe.getTecnico() + "\n" + "Jogadores:" + equipe.getJogadores();
    }
    JOptionPane.showMessageDialog(null, equipes);
  }

}
