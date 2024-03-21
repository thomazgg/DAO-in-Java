# DAO in Java
> Data acess object

## O que é DAO?
> Uma DAO "Decentralized Autonomous Organization", que em português significa "Organização Autônoma Descentralizada". é uma entidade organizacional executada por meio de código inteligente em uma blockchain, sem uma autoridade central. 
> Ela é transparente, democrática e autônoma, permitindo que os participantes contribuam, tomem decisões e se beneficiem dos resultados de forma descentralizada. 
> As regras são definidas em contratos inteligentes e todas as transações e decisões são registradas na blockchain. 
> As DAOs têm o potencial de revolucionar a governança e colaboração, eliminando intermediários, mas também apresentam desafios legais e de segurança.

## Instruções
> Desenvolva uma classe que simule um DAO (Data access object) para objetos do tipo Aluno. 
> Esta classe deve ter as 4 operações básicas que são adicionar, atualizar, buscar e remover (CRUD).

### O método **adicionar** irá receber como parâmetro um object do tipo pessoa e não irá retornar nada

```
public void adicionar(Pessoa p){

}
```

### O método **atualizar** irá receber como parâmetro um object do tipo pessoa e não irá retornar nada

```
public void atualizar(Pessoa p){

}
```

### O método **buscar** irá receber como parâmetro um número e irá retornar o objeto pessoa que está na posição do vetor correspondente

```
public Pessoa buscar(Int indice){

}
```

### O método **remover** irá receber como parâmetro um número e irá remover o objeto pessoa que está na posição do vetor correspondente. Esse método deverá retornar um boolean (true ou false), indicando se a operação foi feita com sucesso

```
public boolean remover(Int indice){

}
```

## Para esta simulação, utilize como banco de dados uma array de uma dimensão (um vetor) com 10 posições como o mostrado abaixo:

```
### Aluno[] alunos = new Aluno[10];
```

### A classe aluno deve ter os seguintes atributos:
- nome
- email
### Faça uma classe de teste.

> plus: 
> Altere o método buscar e use um objeto pessoa ao invés de um número para fazer a busca
> Altere o método remover e use um objeto pessoa ao invés de um número para fazer a busca e remover o objeto
