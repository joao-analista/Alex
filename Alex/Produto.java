// Classe Produto
public class Produto {
    private String codigo;
    private String nome;
    private String cor;
    private String dimensoes;
    private double peso;
    private double preco;
    private int tempoMedioFabricacao;
    private String desenho;
    public static void main(String[] args) {
        
    }

    // Getters e Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getDimensoes() { return dimensoes; }
    public void setDimensoes(String dimensoes) { this.dimensoes = dimensoes; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getTempoMedioFabricacao() { return tempoMedioFabricacao; }
    public void setTempoMedioFabricacao(int tempoMedioFabricacao) { this.tempoMedioFabricacao = tempoMedioFabricacao; }

    public String getDesenho() { return desenho; }
    public void setDesenho(String desenho) { this.desenho = desenho; }
}