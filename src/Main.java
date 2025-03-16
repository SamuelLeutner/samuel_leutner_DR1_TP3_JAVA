import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao TP 3 de Java de Samuel!");

        int x;

        do {
            System.out.println("\nEscolha um exercício para rodar:");
            System.out.print("Digite a opção desejada: ");
            System.out.println("0 - Sair");
            for (int i = 1; i <= 12; i++) {
                System.out.println(i + " - Exercício " + i);
            }

            x = sc.nextInt();
            sc.nextLine();

            switch (x) {
                case 0 -> System.exit(0);
                case 1 -> ex1();
                case 2 -> ex2();
                case 3 -> ex3();
                case 4 -> ex4();
                case 5 -> ex5();
                case 6 -> ex6();
                case 7 -> ex7();
                case 8 -> ex8();
                case 9 -> ex9();
                case 10 -> ex10();
                case 11 -> ex11();
                case 12 -> ex12();
                default -> System.out.println("Valor inválido! Tente novamente.");
            }
        } while (x != 0);
        sc.close();
    }

    public static void ex1() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 1:");

        /*
         * 1. Classe: Pode ser considerada uma abstração de algo, além de um conjunto de funcionalidades e moldes expecificos dessa abstrção.
         * 2. Objeto: É a instância da própria classe, os objetos herdam as mesmas funcionalidades da classe, porém encapsulam tanto estado quanto comportamento de cada objeto, assim se tornando único.
         * 3. Atributo: São as características da classe, ou seja, são as variáveis que definem o objeto na hora da criação.
         * 4. Método: São as funções que a classe pode executar, ou seja, são as ações que o objeto pode realizar.
         */

        System.out.println("Exemplo de criação de uma classe");
        class Carro {
            String marca;
            String modelo;
            int ano;
            String cor;

            void getInfo() {
                System.out.println("Explicação: Esse método exibe os valores dos atributos passados ao objeto anteriormente.");

                System.out.println("Marca: " + marca);
                System.out.println("Modelo: " + modelo);
                System.out.println("Ano: " + ano);
                System.out.println("Cor: " + cor);
            }

            void acelerar() {
                System.out.println("Acelerando...");
            }

            void frear() {
                System.out.println("Freando...");
            }
        }

        System.out.println("Exemplo de criação de um novo objeto.");
        Carro carro1 = new Carro();

        System.out.println("Exemplo de atribuição dos valores dos atributos do objeto.");
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2021;
        carro1.cor = "Vermelho";

        System.out.println("Exemplo de chamada dos método com os valores do objeto e métodos da classe.");
        carro1.acelerar();
        carro1.frear();
        carro1.getInfo();

        System.out.println("\n==============\n");
    }

    public static void ex2() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 2:");

        class Produto {
            String nome;
            double preco;
            int quantidadeEmEstoque;

            /*
            Nesse contexto de produto esses atributos inseridos acima são imporantes para poder criar cada objeto de produto
            como único passando o nome, preço e a quantidade em estoque. Atráves deles podemos criar, atualizar e exibir assim
            como está o requisito.
             */
        }

        System.out.println("\n==============\n");
    }

    public static void ex3() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 3:");

        class Produto {
            String nome;
            double preco;
            int quantidadeEmEstoque;

            public void alterarPreco(double novoPreco) {
                preco = novoPreco;
            }

            public void alterarQuantidade(int novaQuantidade) {
                quantidadeEmEstoque = novaQuantidade;
            }

            public void exibirInformacoes() {
                System.out.println("Nome do produto: " + nome);
                System.out.println("Preço do produto: " + preco);
                System.out.println("Quantidade em estoque do produto: " + quantidadeEmEstoque);
            }
        }

        Produto protudo1 = new Produto();
        protudo1.nome = "Placa de vídeo";
        protudo1.preco = 20000;
        protudo1.quantidadeEmEstoque = 1;

        System.out.println("Atualização do preço do produto: ");
        protudo1.alterarPreco(28000);

        System.out.println("Alterar quantidade do produto: ");
        protudo1.alterarQuantidade(5);

        System.out.println("Exibir informações do produto");
        protudo1.exibirInformacoes();

        System.out.println("\n==============\n");
    }

    public static void ex4() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 4:");

        class Produto {
            String nome;
            double preco;
            int quantidadeEmEstoque;

            public void alterarPreco(double novoPreco) {
                preco = novoPreco;
            }

            public void alterarQuantidade(int novaQuantidade) {
                quantidadeEmEstoque = novaQuantidade;
            }

            public void exibirInformacoes() {
                System.out.println("Nome do produto: " + nome);
                System.out.println("Preço do produto: " + preco);
                System.out.println("Quantidade em estoque do produto: " + quantidadeEmEstoque);
            }
        }

        Produto produto1 = new Produto();

        produto1.nome = "Processador";
        produto1.preco = 2500;
        produto1.quantidadeEmEstoque = 10;

        produto1.alterarPreco(3000);

        produto1.alterarQuantidade(15);

        produto1.exibirInformacoes();

        System.out.println("\n==============\n");
    }

    public static void ex5() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 5:");

        class Produto {
            String nome;
            double preco;
            int quantidadeEmEstoque;

            public void alterarPreco(double novoPreco) {
                preco = novoPreco;
            }

            public void alterarQuantidade(int novaQuantidade) {
                quantidadeEmEstoque = novaQuantidade;
            }

            public void exibirInformacoes() {
                System.out.println("Nome do produto: " + nome);
                System.out.println("Preço do produto: " + preco);
                System.out.println("Quantidade em estoque do produto: " + quantidadeEmEstoque);
            }

            public String getNome() {
                return nome;
            }

            public double getPreco() {
                return preco;
            }

            public int getQuantidadeEmEstoque() {
                return quantidadeEmEstoque;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public void setPreco(double preco) {
                this.preco = preco;
            }

            public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
                this.quantidadeEmEstoque = quantidadeEmEstoque;
            }
        }

        Produto produto1 = new Produto();
        produto1.nome = "Gabinete";
        produto1.preco = 500;
        produto1.quantidadeEmEstoque = 10;

        System.out.println("Informações antes de alterar");
        produto1.exibirInformacoes();

        produto1.setNome("Gabinete Lian Li");
        produto1.setPreco(2500);
        produto1.setQuantidadeEmEstoque(30);

        System.out.println("\nInformações depois de alterar");
        System.out.println("Get nome: " + produto1.getNome());
        System.out.println("Get preço: " + produto1.getPreco());
        System.out.println("Get quantidade em estoque: " + produto1.getQuantidadeEmEstoque());

        /* Os métodos getters e setters são extremamente uteis em linguagens orientadas a objetos. Eles nos proporciona acessar
        modificar os atributos de uma classe e também saber quais são os métodos que podemos acessar ou não. Pela regra de négocio,
        quando passamos os private, protected ou public. Assim conseguimos controlar e facilitar o desenvolvimento.
         */

        System.out.println("\n==============\n");
    }

    public static void ex6() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 6:");

        class Produto {
            String nome;
            double preco;
            int quantidadeEmEstoque;

            public Produto(String nome, double preco, int quantidadeEmEstoque) {
                this.nome = nome;
                this.preco = preco;
                this.quantidadeEmEstoque = quantidadeEmEstoque;
            }

            public void alterarPreco(double novoPreco) {
                preco = novoPreco;
            }

            public void alterarQuantidade(int novaQuantidade) {
                quantidadeEmEstoque = novaQuantidade;
            }

            public void exibirInformacoes() {
                System.out.println("Nome do produto: " + nome);
                System.out.println("Preço do produto: " + preco);
                System.out.println("Quantidade em estoque do produto: " + quantidadeEmEstoque);
            }

            public String getNome() {
                return nome;
            }

            public double getPreco() {
                return preco;
            }

            public int getQuantidadeEmEstoque() {
                return quantidadeEmEstoque;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public void setPreco(double preco) {
                this.preco = preco;
            }

            public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
                this.quantidadeEmEstoque = quantidadeEmEstoque;
            }
        }

        /*
        Construtores em linguagens orientadas a objeto são fundamentais para instanciar a classe definida.
        Eles são chamados automaticamente e utiliza os valores passados por parametro. Assim facilitando e otimizando
        linhas de código. Além de poder utilizar para instanciar outras classes ou chamar funções automaticamente.
         */

        Produto produto1 = new Produto("Plama mãe", 1500, 500);
        produto1.exibirInformacoes();

        System.out.println("\n==============\n");
    }

    public static void ex7() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 7:");

        class Conta {
            private String nome;
            private int numero;
            private String agencia;
            private double saldo;
            private String dataAbertura;
        }

        System.out.println("\n==============\n");
    }

    public static void ex8() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 8:");
        System.out.println("\n==============\n");
    }

    public static void ex9() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 9:");
        System.out.println("\n==============\n");
    }

    public static void ex10() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 10:");
        System.out.println("\n==============\n");
    }

    public static void ex11() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 11:");
        System.out.println("\n==============\n");
    }

    public static void ex12() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 12:");
        System.out.println("\n==============\n");
    }
}
