class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }
}

public class Exemplo {
    public static void alterarNome(Pessoa p) {
        p.nome = "Maria";
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João");
        System.out.println("Antes: " + pessoa.nome);
        alterarNome(pessoa);
        System.out.println("Depois: " + pessoa.nome); 
    }
}
