import java.util.ArrayList;

public class Equipe {
  String nome;
  String tecnico;
  private ArrayList<Jogador> jogadores;

  public Equipe(String nome, String tecnico) {
    this.nome = nome;
    this.tecnico = tecnico;
    this.jogadores = new ArrayList<>();
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getTecnico() {
    return tecnico;
  }
  public void setTecnico(String tecnico) {
    this.tecnico = tecnico;
  }
  public ArrayList<Jogador> getJogadores() {
    return jogadores;
  }
  public void setJogadores(ArrayList<Jogador> jogadores) {
    this.jogadores = jogadores;
  }
}
