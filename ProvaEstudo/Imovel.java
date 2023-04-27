public abstract class Imovel{

    private String proprietario;
    private int areaConstruida;

    public Imovel(String proprietario, int areaConstruida){
        this.proprietario=proprietario;
        this.areaConstruida=areaConstruida;
    }

    public int getAreaConstruida(){
        return areaConstruida;
    }
    
    public String getProprietario(){
        return proprietario;
    }

    public abstract double calculaImposto();

    public String toString(){
        return "Área: " + areaConstruida + " Proprietário: " + proprietario;
    }
}