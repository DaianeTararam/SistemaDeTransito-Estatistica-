import java.io.*;
import javax.swing.JOptionPane;

public class ClasseMetodos {
    float soma = 0f;
    public Estatistica[] CadastrarEstatistica(Estatistica[] estatistica){
        int i;
        for(i = 0; i < 10; i++){
            estatistica[i] = new Estatistica();
        }
        for(i = 0; i < 10; i++){
            estatistica[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade: "));
            estatistica[i].NomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade: ");
            estatistica[i].QuantidadeAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes"));
        }
        return estatistica;
        
    }
    public void ProcedureQuantidadeAcidentes(Estatistica[] estatistica) throws IOException{
        int i;
        for(i = 0; i < 10; i++){
            if(estatistica[i].QuantidadeAcidentes > 100 && estatistica[i].QuantidadeAcidentes < 500){
                System.out.println(estatistica[i].NomeCidade + " teve entre 100 e 500 acidentes.");
            }
        }
    }
    public void ProcedureMaiorMenor(Estatistica[] estatistica)/*throws IOException*/{
        int i;
        int maior = estatistica[0].QuantidadeAcidentes;
        int menor = estatistica[0].QuantidadeAcidentes;;
        int opcao = 0;
        String cidadeMenor = estatistica[0].NomeCidade;
        String cidadeMaior = estatistica[0].NomeCidade;

        for(i = 0; i < 10; i++){
            if (estatistica[i].QuantidadeAcidentes < menor){
                menor = estatistica[i].QuantidadeAcidentes; 
                cidadeMenor = estatistica[i].NomeCidade;
            }
            if (estatistica[i].QuantidadeAcidentes > maior){
                maior = estatistica[i].QuantidadeAcidentes;
                cidadeMaior = estatistica[i].NomeCidade;
            }
            soma = soma + estatistica[i].QuantidadeAcidentes;
        }
        
        while(opcao!= 9){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Cidade com o maior número de acidentes\n1 - MAIOR \n2 - MENOR\n9 - Voltar"));
            switch(opcao){
                case 1:
                    JOptionPane.showMessageDialog(null, "A cidade com maior número de acidentes é: " + cidadeMaior + " com: "+ maior + " acidentes");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "A cidade com menor número de acidentes é: "+ cidadeMenor + " com: "+ menor + " acidentes");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Finalização concluída!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
                    break;

            }
        }
        
    }   
    
    public void AcimaMedia(Estatistica[] estatistica){
        float media;
        int i;
        media = soma/ 10;
        System.out.println("Cidades com acidentes acima da média:");
        for (i = 0; i < 10; i++){
            if (estatistica[i].QuantidadeAcidentes > media){
                System.out.println(estatistica[i].NomeCidade);
            }
        }

    }
        
}
