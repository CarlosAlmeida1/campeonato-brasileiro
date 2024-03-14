import java.util.ArrayList;
import  javax.swing.JOptionPane;

public class Main {
  public static ArrayList<Jogador> jogador;

  public static void main(String[] args) {
    jogador = new ArrayList<>();

    String opcoes = {}

      
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

}
