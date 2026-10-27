package org.example.nivel1.cardapio;

public class Lanche {

    private String nome;
    private double preco;

    /*O meu construtor está chamando os meus setters (que vão validar minhas condições)
    e os getters vão me retornar os valores que foram armazenados nos setters.
     Eles não são chamados pelo meu construtor.
     */

    public Lanche(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }

    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException(" Valor inválido! ");
        } else {
            this.preco = preco;
        }
    }
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException(" O nome não pode ficar em branco!");
        }else{
            this.nome = nome;
        }
    }
}