import java.util.Date;
import java.util.List;

public class Encomenda {
    private String numero;
    private Date dataInclusao;
    private double valorTotal;
    private double valorDesconto;
    private double valorLiquido;
    private String formaPagamento;
    private int quantidadeParcelas;
    private List<Produto> produtos; // Adicionando a lista de produtos
    public static void main(String[] args) {
        
    }

    // Getters e Setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public Date getDataInclusao() { return dataInclusao; }
    public void setDataInclusao(Date dataInclusao) { this.dataInclusao = dataInclusao; }

    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }

    public double getValorDesconto() { return valorDesconto; }
    public void setValorDesconto(double valorDesconto) { this.valorDesconto = valorDesconto; }

    public double getValorLiquido() { return valorLiquido; }
    public void setValorLiquido(double valorLiquido) { this.valorLiquido = valorLiquido; }

    public String getFormaPagamento() { return formaPagamento; }
    public void setFormaPagamento(String formaPagamento) { this.formaPagamento = formaPagamento; }

    public int getQuantidadeParcelas() { return quantidadeParcelas; }
    public void setQuantidadeParcelas(int quantidadeParcelas) { this.quantidadeParcelas = quantidadeParcelas; }

    public List<Produto> getProdutos() { return produtos; } // Getter para produtos
    public void setProdutos(List<Produto> produtos) { this.produtos = produtos; } // Setter para produtos
}
