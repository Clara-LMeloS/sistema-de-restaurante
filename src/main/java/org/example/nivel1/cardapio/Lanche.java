package org.example.nivel1.cardapio;

public class Lanche implements ItemCardapio {

    private String nome;
    private double preco;
    private boolean queijo = true;
    private boolean cebola = true;
    private boolean tomate = true;
    private boolean alface = true;


    /*O meu construtor está chamando os meus setters (que vão validar minhas condições)
    e os getters vão me retornar os valores que foram armazenados nos setters.
     Eles não são chamados pelo meu construtor.
     */

    public Lanche(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }


      @Override
    public String getDescricao() {
        if (queijo) {}
        return getNome();
    }
    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }
    public boolean isQueijo() {
        return queijo;
    }
    public boolean isCebola() {
        return cebola;
    }
    public boolean isTomate() {
        return tomate;
    }
    public boolean isAlface() {
        return alface;
    }

    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }

    public void setCebola(boolean cebola) {
        this.cebola = cebola;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public void setAlface(boolean alface) {
        this.alface = alface;
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