public class Robo{
    String nome;
    String cor;
    float velocidadeMax;
    int nivelBateriaAtual
    float pesoCargaMax;
    String tipoTracao;
    boolean temAntea;
    public static void main(String [] args){
        Robo obj1 = newRobo();
        obj1.nome="R-801";
        obj1.cor="azul";
        obj1.velocidadeMax = 6;
        obj1.nivelBateriaAtual = 78;
        obj1.tipoTracao = "esteira";
        obj1.temAntena= true;
        System.out.println("Meu nome: " + obj1.nome);
        System.out.println("Cor do Robô: "+ obj1.cor);
        System.out.println("Vel Max: "+ obj1.velocidadeMax);
        System.out.println("Bat: " + obj1.nivelBaterialAtual);
        System.out.print.ln("Carga Max: " + obj1.pesoCargaMax);
        System.out.println("Tipo tração: "+ obj1.tipoTracao);
        System.out.println("Tem Antena: " + obj1.temAntena);
        
    }
}