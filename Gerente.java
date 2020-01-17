    public class Gerente extends funcionario{
        int numeroFuncionariosgerenciados;

        public Gerente(String nome, String cpf, double salario, int cargo){
            super(nome, cpf, salario, cargo);
            this.numeroFuncionariosgerenciados = numeroFuncionariosgerenciados;

        }

        @Override
        public double bonificacao(double salario){
            salario = salario * 0.5;
            return salario;
        }
        public void teste(){
            System.out.println("ola allaye");
        }
        public void teste(String nome){
            System.out.println("ola allaye: " +nome);

        }
        public void teste(String nome, String sobrenome )

    }

