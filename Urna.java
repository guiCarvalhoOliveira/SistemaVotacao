import java.util.ArrayList;
import java.util.List;

public class Urna {

    private List<Candidato> candidatos = new ArrayList<>();
    private List<Long> cpfQueVotaram = new ArrayList<>();
    
    public void cadastrarCandidato(Candidato a){
        candidatos.add(a);
    }

    public void votar(int numeroCandidato, long cpfVotante){
            Candidato candidato;

        if (cpfQueVotaram.contains(cpfVotante)) {
            System.out.print("Você ja forneceu seu voto\n");
            return;
        }

        candidato = null;
        for (Candidato listar : candidatos) {
            if (listar.getNumero() == numeroCandidato) {
                candidato = listar;
                break;
            }
        }

        if (candidato == null) {
            System.out.print("Candidato não encontrado\n");
            return;
        }

        cpfQueVotaram.add(cpfVotante);
        candidato.receberVoto();
        System.out.print("Você votou no " + candidato.getNome() + " de número " + candidato.getNumero() + "\n");
    }

    
    @Override
    public String toString(){
            Candidato candidato;

            if(candidatos.isEmpty()){
                return "Nenhum candidato cadastrado";
            }
        
        Candidato vencedor = candidatos.get(0);
        for(Candidato atual: candidatos){
            if(atual.getVotos()>vencedor.getVotos()){
                vencedor = atual;
            }
        
        }   
        return String.format("O vencedor é %s com %d de votos", vencedor.getNome(), vencedor.getVotos());
        
    }

}
