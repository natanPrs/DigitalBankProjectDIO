public class Cliente {

    private String nome;
    private int ID;

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.ID = id;
    }

    public String getNome() {
        return nome;
    }

    public int getID() {
        return ID;
    }
}
