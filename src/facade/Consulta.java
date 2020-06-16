
package facade;


public class Consulta {
    
    private String data;
    private String horario;
    private Medico medico;
    private Paciente paciente;

    public Consulta(String data, String horario, Medico medico, Paciente paciente) {
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
    }
    
    
    
    public void agendarConsulta(Paciente pac, Medico med, String horario, String data){
        System.out.println("--- Consulta Agendada ---");
        System.out.println("\nPaciente: "+ pac.getNome() + "\nMédico: "+ med.getNome() + "\nHorário: "
                + horario + "\nData: " + data);
        
    };
    
    public void gerarReceita(Paciente pac, Medico med, Medicamento medicamento){
        ReceitaMedica receita = new ReceitaMedica(pac, med, medicamento);
        System.out.println(receita.toString());
    };
    
     public ReceitaMedica returnReceita(Paciente pac, Medico med, Medicamento medicamento){
        ReceitaMedica receita = new ReceitaMedica(pac, med, medicamento);
        return receita;
    };
        
}
    
