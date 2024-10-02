public class Ferramenta {
    private String codigo;
    private String nome;
    private int quantidadeEstoque;
    private double precoUnitario;
    private String unidadeEstoque;
        public static void main(String[] args) {
            
        }

    // Getters e Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }

    public double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(double precoUnitario) { this.precoUnitario = precoUnitario; }

    public String getUnidadeEstoque() { return unidadeEstoque; }
    public void setUnidadeEstoque(String unidadeEstoque) { this.unidadeEstoque = unidadeEstoque; }
}
