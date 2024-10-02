// Classe Maquina
import java.util.Date;

public class Maquina 
{
    private String codigo;
    private String nome;
    private int tempoMedioVida;
    private Date dataCompra;
    private Date dataFimGarantia;

    public static void main(String[] args) {
        
    }

    // Getters e Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getTempoMedioVida() { return tempoMedioVida; }
    public void setTempoMedioVida(int tempoMedioVida) { this.tempoMedioVida = tempoMedioVida; }

    public Date getDataCompra() { return dataCompra; }
    public void setDataCompra(Date dataCompra) { this.dataCompra = dataCompra; }

    public Date getDataFimGarantia() { return dataFimGarantia; }
    public void setDataFimGarantia(Date dataFimGarantia) { this.dataFimGarantia = dataFimGarantia; }
}

