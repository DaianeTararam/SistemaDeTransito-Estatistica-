//Criado por Daiane Tararam
//Classe Abstrata
class Estatistica {
    int CodigoCidade;
    String NomeCidade;
    int QuantidadeAcidentes;
    
    //Método Construtor
    Estatistica(){
        this(0, "", 0);
        
    }
    //Método Procedimento
    Estatistica(int CodigoCidade, String NomeCidade, int QuantidadeAcidentes){
        this.CodigoCidade = CodigoCidade;
        this.NomeCidade = NomeCidade;
        this.QuantidadeAcidentes = QuantidadeAcidentes;
    }
    
}
