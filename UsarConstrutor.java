public class UsarConstrutor {
    public static void main(String[] args) {
        PessoaRenzo pessoa1;
        pessoa1 = new PessoaRenzo("Renzo", "Leandro" , "Desenvolvimento de Sistema", "Universidade Cruzeiro do Sul" ,18, 987654321, 123456789);
        System.out.println("NOME : " + pessoa1.nome);
        System.out.println("SOBRENOME : " + pessoa1.sobrenome);
        System.out.println("CURSO TÉCNICO : " + pessoa1.cursotecnico);
        System.out.println("FACULDADE : " + pessoa1.faculdade);
        System.out.println("IDADE : " + pessoa1.idade);
        System.out.println("CPF : " + pessoa1.cpf);
        System.out.println("RG : " + pessoa1.rg);
        System.out.println("-------------------------------------------------------");





        Computador2024 computador1;
        computador1 = new Computador2024("Pichau HX500M", "Mancer Thunder 300W", "Ryzen 5 5600gt", "B350M" );
        System.out.println("GABINETE : " + computador1.gabinete);
        System.out.println("FONTE : " + computador1.fonte);
        System.out.println("PROCESSADOR : " + computador1.processador);
        System.out.println("PLACA MÃE : " + computador1.placamae);
        System.out.println("-------------------------------------------------------");





        LivroVSCODE livro1;
        livro1 = new LivroVSCODE("O Homem do Castelo Alta", "Philip K. Dick", 312, 1962);
        System.out.println("TíTULO : " + livro1.titulo);
        System.out.println("AUTOR : " + livro1.autor);
        System.out.println("PáGINAS : " + livro1.paginas);
        System.out.println("ANO QUE FOI LANÇADO O LIVRO : " + livro1.ano);
        System.out.println("-------------------------------------------------------");
   
    }
}