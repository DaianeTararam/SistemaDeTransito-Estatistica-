import java.io.IOException;

import javax.swing.JOptionPane;

public class ClassePrincipal {
    public static void main(String[] args) throws IOException {
        ClasseMetodos m = new ClasseMetodos();
        Estatistica[] estatistica = new Estatistica[10];
        int opcao = 0;

        while(opcao != 9){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU ESTATÍSTICA"+
                                                               "\n1 - Cadastro de estatística"+
                                                               "\n2 - Consulta por quantidade de acidentes"+
                                                               "\n3 - Consulta por estatística de acidentes"+
                                                               "\n4 - Acidentes acima da média das 10 cidades"+
                                                               "\n9 - Finaliza"));
            switch(opcao){
                case 1:
                    estatistica = m.CadastrarEstatistica(estatistica);
                    break;
                case 2:
                    m.ProcedureQuantidadeAcidentes(estatistica);
                    break;
                case 3: 
                    m.ProcedureMaiorMenor(estatistica);
                    break;
                case 4:
                    m.AcimaMedia(estatistica);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Finalizado com sucesso!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;

            }
        }
    }
}
