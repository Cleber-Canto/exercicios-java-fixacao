public class ContatoAgenda {
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private String observacoes;

    public ContatoAgenda(String nome, String telefone, String email, String endereco, String observacoes) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.observacoes = observacoes;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void exibirContato() {
        System.out.println("📇 Contato:");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
        System.out.println("Observações: " + observacoes);
    }
}
