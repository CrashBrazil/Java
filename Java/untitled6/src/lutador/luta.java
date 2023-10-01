package lutador;

import java.util.Random;

public class luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;


    // Setters and Getters
    public void SetterDesafiado(Lutador dd){
        this.desafiado = dd;
    }
    public Lutador GetterDesafiado(){
        return this.desafiado;
    }
    public void SetterDesafiante(Lutador DS){
        this.desafiante = DS;
    }
    public Lutador GetterDesafiante(){
        return this.desafiante;
    }



    //    metodos
    public void marcaluta(Lutador Desafiante,Lutador Desafiado){
        if (Desafiante.GetterCatergoria().equals( Desafiado.GetterCatergoria()) && Desafiado != Desafiante){
            this.aprovado = true;
            this.desafiante = Desafiante;
            this.desafiado = Desafiado;
        }
        else {
            this.aprovado = false;
            this.desafiante = null;
            this.desafiado = null;
        }

    }
    public void lutar(){
        if (this.aprovado == true){
            this.desafiante.apresentar();
            this.desafiado.apresentar();

            Random aleatorio = new Random();


        }


    }













}
