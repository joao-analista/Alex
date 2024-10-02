import java.util.List;
public class EmpresaManutencao {
    private String cnpj;
    private String razaoSocial;
    private String endereco;
    private List<String> telefones;
    private String pessoaContato;
    public static void main(String[] args) {
        
    }

    // Getters e Setters
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public List<String> getTelefones() { return telefones; }
    public void setTelefones(List<String> telefones) { this.telefones = telefones; }

    public String getPessoaContato() { return pessoaContato; }
    public void setPessoaContato(String pessoaContato) { this.pessoaContato = pessoaContato; }
}
