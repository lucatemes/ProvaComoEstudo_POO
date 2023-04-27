public class App {
    public static void main(String[] args){
        /*
        ⦁	neste diagrama pode ser observado polimorfismo? Sim, nas classes residencial e comercial, pois a classe imovel é abstrata, então para criar objetos deste tipo deverá utilizar polimorfismo
        ⦁	neste diagrama pode ser observado sobrecarga? Sim, na classe cadastro imoveis, metodo listar.
        ⦁	neste diagrama pode ser observado sobrescrita? Sim, no método abstrato calculaImposto.
        ⦁	qual a implicação da classe Imovel ser abstract? Não poderá ser instanciados objetos do tipo Imovel, apensa Comercial ou Residencial.
        ⦁	qual a implicação do método calculaImposto ser abstract? O método deverá ser sobrescrito nas classes que herdam a superclasse, só assim para poder ser instanciado.
        */
        Imovel casa = new Residencial("Joca", 201, 801);
        CadastroImoveis lista= new CadastroImoveis();
        lista.add(casa);
        lista.listar();

    }
}
