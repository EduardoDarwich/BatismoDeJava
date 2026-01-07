package desafiosMuitoLoucos;

public class Desafio4 {
    public static void main(String[] args) {
         interface Ninja{
            void mostrarInformacoes();
            void executarHabilidade();
        }

        class NinjaBasico implements Ninja{

            String nome;
            int idade;
            String habilidade;


            public void mostrarInformacoes(){
                System.out.println("Essas são as informações básicas de um ninja básico " + nome + " "+ idade + " "+ habilidade );
            }

            public void executarHabilidade(){
                System.out.println("Essas são as habilidades básicas de um ninja básico " + habilidade);
            }


        }

         class NinjaAvancado implements Ninja{

            public NinjaAvancado(String especialidade) {
                this.especialidade = especialidade;
            }

            String nome;
            int idade;
            String habilidade;
            String especialidade;



            @Override
            public void mostrarInformacoes() {
                System.out.println("Essas são as informações básicas de um ninja avançado " + nome + " "+ idade + " "+ habilidade + " " + especialidade );

            }

            @Override
            public void executarHabilidade() {
                System.out.println("Essas são as habilidades básicas de um ninja avançado " + habilidade + " " + especialidade);

            }
        }

        NinjaBasico ninjaBasico = new NinjaBasico();
         ninjaBasico.nome = "konohamaru";
         ninjaBasico.habilidade = "se esconder";
         ninjaBasico.idade = 12;

        ninjaBasico.executarHabilidade();
        ninjaBasico.mostrarInformacoes();

        NinjaAvancado ninjaAvancado = new NinjaAvancado("Jinchuriki");
        ninjaAvancado.idade=18;
        ninjaAvancado.nome = "naruto";
        ninjaAvancado.habilidade = "rasengan";

        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();
    }


}
