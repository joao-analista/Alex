import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class app {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente();
        cliente.setCnpj("12.345.678/0001-90");
        cliente.setRazaoSocial("Loja de Móveis Exemplo LTDA");
        cliente.setEnderecoCobranca("Rua Exemplo, 123");
        cliente.setEnderecoCorrespondencia("Rua Correspondencia, 456");
        cliente.setEnderecoEntrega("Avenida Entrega, 789");
        cliente.setTelefones(new ArrayList<>(List.of("11-1234-5678", "11-9876-5432")));
        cliente.setPessoaContato("José Silva");
        cliente.setRamoAtividade("Varejo de Móveis");
        cliente.setDataCadastro(new Date());

        // Criando um produto
        Produto produto = new Produto();
        produto.setCodigo("P001");
        produto.setNome("Mesa de Jantar");
        produto.setCor("Madeira Natural");
        produto.setDimensoes("1.80m x 0.90m");
        produto.setPeso(25.0);
        produto.setPreco(1500.00);
        produto.setTempoMedioFabricacao(10); // em dias
        produto.setDesenho("desenho_mesa.jpg");

        // Criando uma encomenda
        Encomenda encomenda = new Encomenda();
        encomenda.setNumero("E001");
        encomenda.setDataInclusao(new Date());
        encomenda.setValorTotal(1500.00);
        encomenda.setValorDesconto(0.00);
        encomenda.setValorLiquido(1500.00);
        encomenda.setFormaPagamento("Cartão de Crédito");
        encomenda.setQuantidadeParcelas(3);

        // Adicionando produto à encomenda
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        encomenda.setProdutos(produtos);
        
        // Exibindo informações
        System.out.println("Cliente:");
        System.out.println("CNPJ: " + cliente.getCnpj());
        System.out.println("Razão Social: " + cliente.getRazaoSocial());
        System.out.println("Pessoa de Contato: " + cliente.getPessoaContato());

        System.out.println("\nProduto:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        
        System.out.println("\nEncomenda:");
        System.out.println("Número: " + encomenda.getNumero());
        System.out.println("Valor Total: R$ " + encomenda.getValorTotal());
    }
}
