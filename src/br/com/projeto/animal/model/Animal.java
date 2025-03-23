package br.com.projeto.animal.model;

public class Animal {
    public String tipo;
    public String nome;
    public String cor;
    public int qtddeanosquesobrevive;

    public Animal(String tipo,String nome,String cor,int qtddeanosquesobrevive){
        this.tipo=tipo;
        this.nome=nome;
        this.cor=cor;
        this.qtddeanosquesobrevive=qtddeanosquesobrevive;
    }
    public void exibirInfor(){
        System.out.printf("O tipo do animal é %s, o nome dele é %s, a cor dele é %s, e ele sobrevive por %d anos",this.tipo,this.nome,this.cor,this.qtddeanosquesobrevive);
    }
    public void calcularIdadeEmMeses(){
        System.out.printf("A quantidade de meses do animal é %d",this.qtddeanosquesobrevive*12);
    }
}
