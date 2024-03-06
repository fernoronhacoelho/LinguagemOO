public class Robo{
    String nome;
    String cor;
    float velocidadeMax;
    int nivelBateriaAtual
    float pesoCargaMax;
    String tipoTracao;
    boolean temAntea;
    public void printStatus(){
        System.out.println("---------------------------");
        System.out.println("Meu nome: " + nome);
        System.out.println("Cor do Robô: "+ cor);
        System.out.println("Vel Max: "+ velocidadeMax);
        System.out.println("Bat: " + nivelBaterialAtual);
        System.out.print.ln("Carga Max: " + pesoCargaMax);
        System.out.println("Tipo tração: "+ tipoTracao);
        System.out.println("Tem Antena: " + temAntena);
        System.out.println("----------------------------");
    }
    public static void main(String [] args){
        Robo obj1 = newRobo();
        obj1.nome="R-801";
        obj1.cor="azul";
        obj1.velocidadeMax = 6;
        obj1.nivelBateriaAtual = 78;
        obj1.tipoTracao = "esteira";
        obj1.temAntena= true;
        obj1.printStatus();
        Robo obj2 = newRobo();
        obj2.nome="R-701";
        obj2.cor="laranja";
        obj2.velocidadeMax = 3;
        obj2.nivelBateriaAtual = 51;
        obj2.tipoTracao = "esteira";
        obj2.temAntena= false;
        obj2.printStatus();
    }
}