public class TesteDAO {
    public static void main(String[] args) {
        // Criando um objeto AlunoDAO
        AlunoDAO alunoDAO = new AlunoDAO();

        // Adicionando alguns alunos
        alunoDAO.adicionar(new Aluno("Joao", "joao@example.com"));
        alunoDAO.adicionar(new Aluno("Maria", "maria@example.com"));

        // Criando um objeto Aluno com os dados atualizados
        String nomeAlunoAtualizar = "Maria";
        Aluno alunoAtualizado = new Aluno("Pedro", "pedro@gmail.com");
        
        // Imprimir nome dos Alunos
        alunoDAO.imprimirNomesAlunos();

        // Chamando o método atualizar
        alunoDAO.atualizar(nomeAlunoAtualizar, alunoAtualizado);

        // Imprimindo a quantidade de alunos
        System.out.println("Quantidade de alunos: " + alunoDAO.getQuantidadeAlunos());
        
        // Imprimir nome dos Alunos
        alunoDAO.imprimirNomesAlunos();
        
        // Buscando um aluno pelo nome
        String nomeAlunoBusca = "Joao";
        Aluno alunoEncontrado = alunoDAO.buscar(nomeAlunoBusca);

        // Verificando se o aluno foi encontrado
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado.getNome() + " / " + alunoEncontrado.getEmail());
        } else {
            System.out.println("Aluno não encontrado.");
        } 
        
        // Chamando o método atualizar
        alunoDAO.remover("Joao");

        // Imprimindo a quantidade de alunos
        System.out.println("Quantidade de alunos: " + alunoDAO.getQuantidadeAlunos());
    }
}
