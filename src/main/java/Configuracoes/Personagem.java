package Configuracoes;

public class Personagem {
    private Personagem() {};
    private static Personagem instance = new Personagem();
    public static Personagem getInstance() {
        return instance;
    }

    private double altura;
    private double peso;
    private String sexo;

    public double GetAltura(){
        return altura;
    }

    public void SetAltura(double altura) {
        this.altura = altura;
    }

    public double GetPeso(){
        return peso;
    }

    public void SetPeso(double peso) {
        this.peso = peso;
    }

    public String GetSexo(){
        return sexo;
    }

    public void SetSexo(String sexo) {
        this.sexo = sexo;
    }
}
