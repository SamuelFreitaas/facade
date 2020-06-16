
package facade;


public class Principal {

    
    public static void main(String[] args) {
    
        Medico medico = new Medico();
        medico.setNome("João Paulo Lopes da Silva");
        medico.setRegistroMedico("04-5896");
        
        Paciente paciente = new Paciente();
        paciente.setNome("Stefani Joanne Angelina");
        paciente.setTelefone("4002-8922");
        
        ServicosFarmacia farmacia = new ServicosFarmacia();
        
        Medicamento medic1 = new Medicamento("Ibuprofeno", "721");
        Medicamento medic2 = new Medicamento("Sataneasol", "698");
        Medicamento medic3 = new Medicamento("Gardenal",  "911");
        
        farmacia.addMedicamento(medic1);
        farmacia.addMedicamento(medic2);
        farmacia.addMedicamento(medic3);
       
        
        FachadaClinica fachada = new FachadaClinica(medico, paciente);
        
        fachada.marcarConsulta(paciente, medico, "17/06/2020", "14h20");
        
        fachada.obterReceita(paciente, medico, medic1);
        
        fachada.receberMedicacao(fachada.retornarReceita(paciente, medico, medic3));
        
        
    }
    
}
