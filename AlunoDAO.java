public class AlunoDAO {
    private Aluno[] alunos;
    private int quantidadeAlunos;

    // Construtor
    public AlunoDAO() {
        alunos = new Aluno[10];
        quantidadeAlunos = 0;
    }

    // Método para adicionar um aluno
    public void adicionar(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
            System.out.println("Aluno adicionado com sucesso!");
        } else {
            System.out.println("Não foi possível adicionar o aluno. Limite máximo atingido.");
        }
    }
    
    // Método para obter a quantidade de alunos
    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
    
    // Método para obter todos os alunos
    public Aluno[] getAlunos() {
        return alunos;
    }
    
    // Método para imprimir o nome de todos os alunos
    public void imprimirNomesAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println("Nome do aluno: " + aluno.getNome() + " / Email: " + aluno.getEmail());
            }
        }
    }
    
    // Método para atualizar um aluno
    public void atualizar(String nomeAluno, Aluno alunoAtualizado) {
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].getNome().equals(nomeAluno)){
                alunos[i] = alunoAtualizado;
                System.out.println("Aluno atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Aluno não encontrado para atualização.");
    }
    
    // Método para buscar um aluno pelo nome
    public Aluno buscar(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno != null && aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        // Retorna null se o aluno não for encontrado
        return null;
    }
    
    public boolean remover(String nome) {
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].getNome().equals(nome)) {
                // Move os elementos restantes do array para cobrir a posição removida
                for (int j = i; j < quantidadeAlunos - 1; j++) {
                    alunos[j] = alunos[j + 1];
                }
                // Define o último elemento como null e decrementa a quantidade de alunos
                alunos[quantidadeAlunos - 1] = null;
                quantidadeAlunos--;
                System.out.println("Aluno removido com sucesso!");
                return true;
            }
        }
        System.out.println("Aluno não encontrado para remoção.");
        return false;
    }
}
