import java.util.Date;
import java.util.List;

// Classe Cliente
public class Cliente {
    private String cnpj;
    private String razaoSocial;
    private String enderecoCobranca;
    private String enderecoCorrespondencia;
    private String enderecoEntrega;
    private List<String> telefones;
    private String pessoaContato;
    private String ramoAtividade;
    private Date dataCadastro;

    // Getters e Setters
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }

    public String getEnderecoCobranca() { return enderecoCobranca; }
    public void setEnderecoCobranca(String enderecoCobranca) { this.enderecoCobranca = enderecoCobranca; }

    public String getEnderecoCorrespondencia() { return enderecoCorrespondencia; }
    public void setEnderecoCorrespondencia(String enderecoCorrespondencia) { this.enderecoCorrespondencia = enderecoCorrespondencia; }

    public String getEnderecoEntrega() { return enderecoEntrega; }
    public void setEnderecoEntrega(String enderecoEntrega) { this.enderecoEntrega = enderecoEntrega; }

    public List<String> getTelefones() { return telefones; }
    public void setTelefones(List<String> telefones) { this.telefones = telefones; }

    public String getPessoaContato() { return pessoaContato; }
    public void setPessoaContato(String pessoaContato) { this.pessoaContato = pessoaContato; }

    public String getRamoAtividade() { return ramoAtividade; }
    public void setRamoAtividade(String ramoAtividade) { this.ramoAtividade = ramoAtividade; }

    public Date getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(Date dataCadastro) { this.dataCadastro = dataCadastro; }
}