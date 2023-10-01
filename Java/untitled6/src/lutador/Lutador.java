package lutador;

public class Lutador {
//    Propiedades
   private String nome;
   private String nacionalidade;
   private int idade;
   private double altura;
   private double peso;
   private String categoria;
   private int vitoria;
   private int derrota;
   private int empates;


    //  Construtor

    public Lutador(String nome,String nacionalidade,int idade,double altura,double peso,int vitoria,int derrota,int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.SetterPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empates = empates;
    }


    //    Setters and Getters
    public String GetterNome () {
        return this.nome;

    }
    public void SetterNome(String nome){
        this.nome = nome;
    }
    public String GetterNacionalidade(){
      return this.nacionalidade ;
    }
    public void SetterNacionalidade(String Nacio){
        this.nacionalidade = Nacio;
    }
    public int GetterIdade (){
        return this.idade;
    }
    public void SetterIdade (int Ida){
        this.idade = Ida;
    }
    public  double GetterAltura(){
        return this.altura;
    }

    public void SetterAltura(double Alt){
        this.altura = Alt;
    }
    public double GetterPeso(){
        return this.peso;
    }
    public void SetterPeso(double pe){
        this.peso = pe;
        SetterCategoria();
    }
    public String GetterCatergoria(){
        return this.categoria;
    }
    private void SetterCategoria(){
        if (peso <52.2){
            this.categoria = "Invalido";
        }
        else  if (peso <= 70.3){
            this.categoria = "Leve";
        }
        else if (peso <= 83.9){
            this.categoria = "Medio";
        }
        else if (peso <= 120.2){
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Invalido";
        }
    }
    public int GetterVitoria(){
        return this.vitoria;
    }
    public void SetterVitoria(int vit){
        this.vitoria = vit;
    }
    public int GetterDerrota(){
        return this.derrota;
    }
    public void SetterDerrota(int Derr){
        this.derrota = Derr;

    }
    public int GetterEmpate (){
        return this.empates;
    }
    public void SetterEmpate(int Emp){
        this.empates = Emp;
    }

//    Metódos
    public void apresentar(){
        System.out.println("Lutador " + GetterNome());
        System.out.println("Origem " + GetterNacionalidade());
        System.out.println(GetterIdade() + " Anos");
        System.out.println(GetterAltura() + " M de altura");
        System.out.println("Pesando " + GetterPeso() + "Kg");
        System.out.println("Ganhou " + GetterVitoria());
        System.out.println("Perdeu " + GetterDerrota());
        System.out.println("Empatou " + GetterEmpate());
    }
    public void status(){
        System.out.println(GetterNome());
        System.out.println("Sua categoria é " + GetterCatergoria());
        System.out.println(GetterVitoria() + " Vitorias");
        System.out.println(GetterDerrota() + " Derrotas");
        System.out.println(GetterEmpate() + " Empates");
    }
    public void GanharVitorias(){
        SetterVitoria(GetterVitoria() + 1);
    }
    public void PerdeDerrotas(){
        SetterDerrota(GetterDerrota() + 1);
    }
    public void Empates(){
        SetterEmpate(GetterEmpate() + 1);
    }








}
