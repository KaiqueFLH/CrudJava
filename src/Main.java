import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static BancoDeDadosMovel bdMovel = new BancoDeDadosMovel();
    static BancoDeDadosProfissao bdProfissao = new BancoDeDadosProfissao();

    public static void main(String[] args) {
        menuInicial();
    }

    private static void menuInicial() {
        int opcao;
        do {
            System.out.println("""
                Bem Vindo! Cadastre no banco de Dados, Móveis ou Profissões.
                
                [1] - Cadastrar Profissão
                [2] - Cadastrar Móvel
                [3] - Sair.
                
                """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> crudProfissao();
                case 2 -> crudMovel();
            }
        }while (opcao !=3);

    }
//======================================================================================================================
    // AREA RELACIONADA A MOVEIS

    private static void crudMovel() {
        int opcao;

        do {
            System.out.println("""
                Você deseja Cadastrar, visualizar, atualizar ou remover um Móvel?
                
                [1] - Cadastrar
                [2] - Visualizar móvel por ID
                [3] - Visualizar todos os móveis
                [4] - Atualizar Móvel
                [5] - Remover Móvel
                [6] - Sair.
                
                """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> cadastroMovel();
                case 2 -> perguntaIdMovel();
                case 3 -> System.out.println(bdMovel.readAll());
                case 4 -> atualizaMovel();
                case 5 -> removeMovel();
                case 6 ->System.exit(0);
            }
        }while (opcao<1 || opcao>6);
    }

//======================================================================================================================
    // CADASTRO MOVEL

    private static void cadastroMovel() {
        int opcao;
        System.out.println("Qual Movel deseja cadastrar");
        System.out.println("""
                1 - Mesa
                2 - Cama
                3 - Sofá
                """);
        opcao = sc.nextInt();

        switch (opcao){
            case 1-> mesa();
            case 2-> cama();
            case 3-> sofa();
        }

    }
    private static void mesa() {
        System.out.println("Informe o comprimento em cm do seu móvel");
        double comprimentoEmCm = sc.nextDouble();
        System.out.println("Informe o preço do seu móvel");
        double preco = sc.nextDouble();
        System.out.println("Informe de que material é feito o seu móvel");
        String material = sc.next();
        System.out.println("Quantas Pernas tem a sua Mesa?");
        int quantidadePernas = sc.nextInt();
        System.out.println("Qual é o formato da sua mesa?");
        String formatoMesa = sc.next();
        bdMovel.create( new Mesa(comprimentoEmCm,preco,material,quantidadePernas,formatoMesa));
    }

    private static void cama() {

        System.out.println("Informe o comprimento em cm do seu móvel");
        double comprimentoEmCm = sc.nextDouble();
        System.out.println("Informe o preço do seu móvel");
        double preco = sc.nextDouble();
        System.out.println("Informe de que material é feito o seu móvel");
        String material = sc.next();
        System.out.println("Quantos travesseiros?");
        int quantidadeTravesseiros = sc.nextInt();

        bdMovel.create( new Cama(comprimentoEmCm,preco,material,quantidadeTravesseiros));
    }

    private static void sofa() {
        System.out.println("Informe o comprimento em cm do seu móvel");
        double comprimentoEmCm = sc.nextDouble();
        System.out.println("Informe o preço do seu móvel");
        double preco = sc.nextDouble();
        System.out.println("Informe de que material é feito o seu móvel");
        String material = sc.next();
        System.out.println("Quantos Assentos?");
        int quantidadeLugares = sc.nextInt();

        bdMovel.create( new Sofa(comprimentoEmCm,preco,material,quantidadeLugares));
    }

//======================================================================================================================

    private static void perguntaIdMovel() {
        System.out.println("Informe o id do Movel que quer buscar:");
        int id = sc.nextInt();

        for (Movel movel: bdMovel.getMoveis()){
            if (movel.id == id){
                System.out.println(bdMovel.readId(id));
            }else{
                System.out.println("Procurando ID...");
            }
        }
    }

    private static void atualizaMovel() {
    }

    private static void removeMovel() {
        System.out.println("Informe o id do Movel que quer remover:");
        int id = sc.nextInt();

        for (Movel movel: bdMovel.getMoveis()){
            if (movel.id == id){

                if (bdMovel.getMoveis().size()>1){
                    bdMovel.delete(id);
                    System.out.println("Removido com Sucesso!");
                }else {
                    System.out.println("você não pode remover todos os itens da lista.");
                }

            }else{
                System.out.println("Procurando ID...");
            }
        }
    }
//======================================================================================================================
    // AREA RELACIONADA A PROFISSÕES


    private static void crudProfissao() {
        int opcao;

        do {
            System.out.println("""
                Você deseja Cadastrar, visualizar, atualizar ou remover um Profissional?
                
                [1] - Cadastrar
                [2] - Visualizar Profissional por ID
                [3] - Visualizar todos os Profissionais
                [4] - Atualizar Profissional
                [5] - Remover Profissional
                [6] - Sair.
                
                """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> cadastroProfissao();
                case 2 -> perguntaIdProfissao();
                case 3 -> System.out.println(bdProfissao.readAll());
                case 4 -> atualizaProfissao();
                case 5 -> removeProfissao();
                case 6 ->System.exit(0);
            }
        }while (opcao<1 || opcao>6);
    }

    private static void cadastroProfissao() {
        int opcao;
        System.out.println("Qual Profissao deseja cadastrar");
        System.out.println("""
                1 - Professor
                2 - Programador
                3 - Jogador de Futebol
                """);
        opcao = sc.nextInt();

        switch (opcao){
            case 1-> professor();
            case 2-> programador();
            case 3-> jogadorFut();
        }

    }

    private static void professor() {
        System.out.println("Informe o Nome da sua Profissão");
        String nomeProfissao = sc.next();
        System.out.println("Informe o seu salario");
        double salario = sc.nextDouble();
        System.out.println("Informe a instituição a qual você trabalha");
        String instituicao = sc.next();
        System.out.println("Qual disciplina você ensina?");
        String disciplina = sc.next();
        System.out.println("Quantas turmas você possui?");
        int quantidadeTurmas = sc.nextInt();
        bdProfissao.create( new Professor(nomeProfissao,salario,instituicao,disciplina,quantidadeTurmas));
    }

    private static void programador() {

        System.out.println("Informe o Nome da sua Profissão");
        String nomeProfissao = sc.next();
        System.out.println("Informe o seu salario");
        double salario = sc.nextDouble();
        System.out.println("Informe a instituição a qual você trabalha");
        String instituicao = sc.next();
        System.out.println("Informe o Nome da sua linguagem Favorita");
        String linguagemFav = sc.next();
        System.out.println("Informe o seu nivel como desenvolvedor - [Junior, Pleno ou Senior]");
        String nivelDesenvolvimento = sc.next();
        bdProfissao.create( new Programador(nomeProfissao,salario,instituicao,linguagemFav,nivelDesenvolvimento));
    }

    private static void jogadorFut() {
        System.out.println("Informe o Nome da sua Profissão");
        String nomeProfissao = sc.next();
        System.out.println("Informe o seu salario");
        double salario = sc.nextDouble();
        System.out.println("Informe a instituição a qual você trabalha");
        String instituicao = sc.next();
        System.out.println("Informe o Nome do seu Patrocinador");
        String patrocinio = sc.next();
        System.out.println("Quantos gols você já fez?");
        int quantidadeGols = sc.nextInt();
        bdProfissao.create(new JogadorFutebol(nomeProfissao,salario,instituicao,patrocinio,quantidadeGols));
    }
//======================================================================================================================

    private static void perguntaIdProfissao() {
        System.out.println("Informe o id da Profissão que quer buscar:");
        int id = sc.nextInt();

        for (Profissao profissao: bdProfissao.getProfissoes()){
            if (profissao.id == id){
                System.out.println(bdProfissao.readId(id));
            }else{
                System.out.println("Procurando ID...");
            }
        }
    }

    private static void atualizaProfissao() {
    }

    private static void removeProfissao() {
        System.out.println("Informe o id da Profissão que quer remover:");
        int id = sc.nextInt();

        for (Profissao profissao: bdProfissao.getProfissoes()){
            if (profissao.id == id){

                if (bdProfissao.getProfissoes().size()>1){
                    bdProfissao.delete(id);
                    System.out.println("Removido com Sucesso!");
                }else {
                    System.out.println("você não pode remover todos os itens da lista.");
                }

            }else{
                System.out.println("Procurando ID...");
            }
        }
    }
//======================================================================================================================
}
