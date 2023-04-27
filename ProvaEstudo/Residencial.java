public class Residencial extends Imovel{

    private int areaTerreno;
    private static double VR= 100.0;
    private int count= 0;

    public Residencial(String proprietario, int areaConstruida, int areaTerreno){
        super(proprietario, areaConstruida);
        this.areaTerreno= areaTerreno;
    }

    public int getAreaTerreno(){
        return areaTerreno;
    }

    public void setVR(double newVR){
        VR= newVR;
    }
    
    public double getVR(){
        return VR;
    }

    @Override
    public double calculaImposto(){
        if(getAreaConstruida() <= 200){
            count=1;
            return 0;
        } else if(getAreaConstruida() > 200 && getAreaConstruida() <= 1000){
            int vrExtra= getAreaConstruida() - 200;
            count= 2;
            return vrExtra * VR;
        } else if(getAreaConstruida() > 1000){
            count=3;
            int vrExtra= getAreaConstruida() -200;
            return vrExtra * VR + 100 * VR;
        }
        return -1;
    }

    public String toString(){
        if(getAreaConstruida() <= 200){
            return "Proprietário: " + getProprietario() + " Sem imposto.";
        } else if(getAreaConstruida() > 200 && getAreaConstruida() <= 1000){
            return "Proprietário: " + getProprietario() + " Imposto: Qualquer metro quadrado acima de 200 x VR.";
        } else if(getAreaConstruida() > 1000){
            return "Proprietário: " + getProprietario() + " Imposto: Qualquer metro quadrado acima de 200 x VR. + Taxa de 100 VR's adicionais";
        }
        return "Proprietário: " + getProprietario();
    }
    
}
