import java.util.Date;
import java.util.List;
// Classe Funcionario
public class Funcionario {
    private String matricula;
    private String nome;
    private String endereco;
    private List<String> telefones;
    private String cargo;
    private double salario;
    private Date dataAdmissao;
    private String qualificacoes;
    private Funcionario supervisor;
    public static void main(String[] args) {
        
    }

    // Getters e Setters
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public List<String> getTelefones() { return telefones; }
    public void setTelefones(List<String> telefones) { this.telefones = telefones; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public Date getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(Date dataAdmissao) { this.dataAdmissao = dataAdmissao; }

    public String getQualificacoes() { return qualificacoes; }
    public void setQualificacoes(String qualificacoes) { this.qualificacoes = qualificacoes; }

    public Funcionario getSupervisor() { return supervisor; }
    public void setSupervisor(Funcionario supervisor) { this.supervisor = supervisor; }
}
