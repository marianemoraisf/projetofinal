import projetofinal.Aluno;
import projetofinal.Video;
import projetofinal.Visualizacao;

public class ProjetoFinal {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula POO");
        v[1] = new Video("Aula HTML5");
        v[2] = new Video("Aula CSS");

        Aluno g[] = new Aluno[2];
        g[0] = new Aluno("Mariane", 26, "F", "marianemoraif");
        g[1] = new Aluno("Bruno", 25, "M", "brunopvieira");

        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[0]);
        vis[1].avaliar(85.0f);
        System.out.println(vis[1].toString());

        // System.out.println("VIDEOS\n----------------------");
        // System.out.println(v[0].toString());
        // System.out.println(v[1].toString());
        // System.out.println(v[2].toString());
        // System.out.println("\nGAFANHOTOS\n---------------------");
        // System.out.println(g[0].toString());
        // System.out.println(g[1].toString());

    }
}
