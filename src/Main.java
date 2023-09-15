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
                                    
                    [1] - Profissão
                    [2] - Móvel
                    [3] - Sair.
                                    
                    """);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> crudProfissao();
                case 2 -> crudMovel();
            }
        } while (opcao != 3);

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

            switch (opcao) {
                case 1 -> cadastroMovel();
                case 2 -> perguntaIdMovel();
                case 3 -> System.out.println(bdMovel.readAll());
                case 4 -> atualizaMovel();
                case 5 -> removeMovel();
                case 6 -> System.exit(0);
            }
        } while (opcao < 1 || opcao > 6);
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

        switch (opcao) {
            case 1 -> bdMovel.create(mesa());
            case 2 -> bdMovel.create(cama());
            case 3 -> bdMovel.create(sofa());
        }

    }

    private static Movel mesa() {
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

        return new Mesa(comprimentoEmCm, preco, material, quantidadePernas, formatoMesa);
    }

    private static Movel cama() {

        System.out.println("Informe o comprimento em cm do seu móvel");
        double comprimentoEmCm = sc.nextDouble();
        System.out.println("Informe o preço do seu móvel");
        double preco = sc.nextDouble();
        System.out.println("Informe de que material é feito o seu móvel");
        String material = sc.next();
        System.out.println("Quantos travesseiros?");
        int quantidadeTravesseiros = sc.nextInt();

        return new Cama(comprimentoEmCm, preco, material, quantidadeTravesseiros);
    }

    private static Movel sofa() {
        System.out.println("Informe o comprimento em cm do seu móvel");
        double comprimentoEmCm = sc.nextDouble();
        System.out.println("Informe o preço do seu móvel");
        double preco = sc.nextDouble();
        System.out.println("Informe de que material é feito o seu móvel");
        String material = sc.next();
        System.out.println("Quantos Assentos?");
        int quantidadeLugares = sc.nextInt();

        return new Sofa(comprimentoEmCm, preco, material, quantidadeLugares);
    }

//======================================================================================================================

    private static void perguntaIdMovel() {
        System.out.println("Informe o id do Movel que quer buscar:");
        int id = sc.nextInt();

        for (Movel movel : bdMovel.getMoveis()) {
            if (movel.getId() == id) {
                System.out.println(bdMovel.readId(id));
            } else {
                System.out.println("Procurando ID...");
            }
        }
    }

    private static void atualizaMovel() {
        System.out.println("Informe o id do Movel que quer atualizar:");
        int id = sc.nextInt();

        Movel movelAntigo = bdMovel.readId(id);

        if (movelAntigo != null) {
            if (movelAntigo instanceof Cama) {
                System.out.println(bdMovel.update(cama(), id));
            } else if (movelAntigo instanceof Mesa) {
                System.out.println(bdMovel.update(mesa(), id));
            } else {
                System.out.println(bdMovel.update(sofa(), id));
            }
        }
    }

    private static void removeMovel() {
        System.out.println("Informe o id do Movel que quer remover:");
        int id = sc.nextInt();
        bdMovel.delete(id);
        System.out.println("Removido com Sucesso!");
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

            switch (opcao) {
                case 1 -> cadastroProfissao();
                case 2 -> perguntaIdProfissao();
                case 3 -> System.out.println(bdProfissao.readAll());
                case 4 -> atualizaProfissao();
                case 5 -> removeProfissao();
                case 6 -> System.exit(0);
            }
        } while (opcao < 1 || opcao > 6);
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

        switch (opcao) {
            case 1 -> bdProfissao.create(professor());
            case 2 -> bdProfissao.create(programador());
            case 3 -> bdProfissao.create(jogadorFut());
        }

    }

    private static Profissao professor() {
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

        return new Professor(nomeProfissao, salario, instituicao, disciplina, quantidadeTurmas);
    }

    private static Profissao programador() {

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

        return new Programador(nomeProfissao, salario, instituicao, linguagemFav, nivelDesenvolvimento);
    }

    private static Profissao jogadorFut() {
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

        return new JogadorFutebol(nomeProfissao, salario, instituicao, patrocinio, quantidadeGols);
    }
//======================================================================================================================

    private static void perguntaIdProfissao() {
        System.out.println("Informe o id da Profissão que quer buscar:");
        int id = sc.nextInt();

        for (Profissao profissao : bdProfissao.getProfissoes()) {
            if (profissao.getId() == id) {
                System.out.println(bdProfissao.readId(id));
            } else {
                System.out.println("Procurando ID...");
            }
        }
    }

    private static void atualizaProfissao() {

        System.out.println("Informe o id da Profissão que quer atualizar:");
        int id = sc.nextInt();

        Profissao profissaoAntiga = bdProfissao.readId(id);

        if (profissaoAntiga != null) {
            if (profissaoAntiga instanceof Professor) {
                System.out.println(bdProfissao.update(professor(), id));
            } else if (profissaoAntiga instanceof Programador) {
                System.out.println(bdProfissao.update(programador(), id));
            } else {
                System.out.println(bdProfissao.update(jogadorFut(), id));
            }
        }

    }

    private static void removeProfissao() {
        System.out.println("Informe o id da Profissão que quer remover:");
        int id = sc.nextInt();
        bdProfissao.delete(id);
        System.out.println("Removido com Sucesso!");
    }
}

//======================================================================================================================

