public class Candidato {
    private String nome;
    private int numero;
    private int votos;
    
    public Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public void receberVoto(){
        votos++;
    }

    @Override
    public String toString(){
        return String.format("Candidato: %s\nNúmero: %d\nQuantidade de votos: %d", nome,numero, votos);
    }
    
}
