public class Pessoa {
    private String nome;
    private double idade;
    private String cpf;
    private double telefone;

    public Pessoa(String nome, double idade, String cpf, double telefone){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(double idade){
        this.idade = idade;
    }
    public double getIdade(){
        return idade;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setTelefone(double telefone){
        this.telefone = telefone;
    }
    public double getTelefone(){
        return telefone;
    }

}