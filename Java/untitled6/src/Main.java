import lutador.Lutador;

public class Main {
    public static void main(String[] args) {
        Lutador L = new Lutador("Suel","Brazil",18,1.60,60,0,0,0);
        L.GanharVitorias();
        L.GanharVitorias();
        L.GanharVitorias();
        L.PerdeDerrotas();
        L.Empates();
        L.apresentar();




    }
}