/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1;

/**
 *
 * @author Jhordan
 */
public class Professor {

    private String nome;
    private int ctps;

    public Professor(String nome, int ctps) {
        this.nome = nome;
        this.ctps = ctps;
    }

    public String toString() {
        return "Professor{" + "nome=" + nome + ", ctps=" + ctps + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

}
