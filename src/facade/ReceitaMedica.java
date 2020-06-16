
package facade;

public class ReceitaMedica {
    
    private Paciente paciente;
    private Medico medico;
    private Medicamento medicamento;

    public ReceitaMedica(Paciente paciente, Medico medico, Medicamento medicamento) {
        this.paciente = paciente;
        this.medico = medico;
        this.medicamento = medicamento;
    }

    @Override
    public String toString() {
        return "\n--- Receita Médica ---" + "\n\nPaciente: " + this.paciente.getNome() + "\nMedico: " + this.medico.getNome() + "\nMedicamento: " + this.medicamento.getNome();
    }

   
    
    
    

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    
    
    
    
}
