
package facade;


public class Medicamento {
    
    private String nome;
    private String codMedicamento;

    public Medicamento(String nome, String codMedicamento) {
        this.nome = nome;
        this.codMedicamento = codMedicamento;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodMedicamento() {
        return codMedicamento;
    }

    public void setCodMedicamento(String codMedicamento) {
        this.codMedicamento = codMedicamento;
    }
    
    
    
}
