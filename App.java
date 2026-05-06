public class App {
    public static void main(String[] args) throws Exception {
        Urna urna = new Urna();
        Candidato c = new Candidato("Junior", 29);
        Candidato d = new Candidato("Marcelo", 12);
        urna.cadastrarCandidato(c);
        urna.cadastrarCandidato(d);

        urna.votar(29, 11080107681L);
        urna.votar(12, 11080107681L);
    }
}
