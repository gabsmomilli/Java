package rh;

public class Pessoa {
    char sexo;
    String nome;
    double altura;
    float massa;

    public Pessoa(String nome, char s,double altura,float m) {
        this.nome=nome;
        sexo=s;
        this.altura=altura;
        massa=m;
    }
    public void andar (int passos) {

        System.out.println("Andei " + passos+ " passos");
    }
    public boolean sorrir () {
        return true;
    }
    public static void main(String[]args){
        Pessoa G=new Pessoa("Gabi",'F',1.65, 50);
        Pessoa N= new Pessoa("Nathan", 'M',1.65, 80);
        G.andar(8);
        System.out.println(N.sorrir());
    }
}