
package facade;


public class FachadaClinica {
    
    Medico medico;
    Paciente paciente;
    ServicosFarmacia farmacia;
    Consulta consulta;

    public FachadaClinica(Medico medico, Paciente paciente) {
        this.medico = medico;
        this.paciente = paciente;
       
    }
    
    
    public void marcarConsulta(Paciente pac, Medico med, String data, String hora){
        consulta = new Consulta(data, hora, med, pac);
        consulta.agendarConsulta(pac, med, hora, data);
        
    }
    
    public void obterReceita(Paciente pac, Medico med, Medicamento medicamento){
        
        consulta.gerarReceita(pac, med, medicamento);
        
    }
    
    public ReceitaMedica retornarReceita(Paciente pac, Medico med, Medicamento medicamento){
       return consulta.returnReceita(pac, med, medicamento);
    }
    
    public void receberMedicacao(ReceitaMedica receita){
        
        farmacia = new ServicosFarmacia();
        farmacia.receberMedicamento(receita);
        
        
    }
    
}
