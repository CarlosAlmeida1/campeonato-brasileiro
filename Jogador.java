public class Jogador {
  private String nome;
  private String posicao;
  private int numeroJogador;
  
  public Jogador(String nome, String posicao, int numeroJogador) {
    this.nome = nome;
    this.posicao = posicao;
    this.numeroJogador = numeroJogador;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getPosicao() {
    return posicao;
  }

  public void setPosicao(String posicao) {
    this.posicao = posicao;
  }

  public int getNumeroJogador() {
    return numeroJogador;
  }

  public void setNumeroJogador(int numeroJogador) {
    this.numeroJogador = numeroJogador;
  }

  public String toString(){
    return nome + " - " + posicao + " - " + numeroJogador;
  }

  
}
