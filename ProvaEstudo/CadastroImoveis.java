import java.util.ArrayList;

public class CadastroImoveis {

    private ArrayList<Imovel> imoveis= new ArrayList<>();

    public void add(Imovel x){
        imoveis.add(x);
    }

    public void listar(){
        for(Imovel lista : imoveis){
            System.out.println(lista.toString());
        }
    }
    
}
