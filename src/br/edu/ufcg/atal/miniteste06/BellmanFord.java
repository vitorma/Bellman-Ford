/*
 *   BellmanFord.java
 *
 *   Copyright 2012 Vitor Morato Almeida.
 *
 *   This file is part of Bellman-Ford.
 *
 *   Bellman-Ford is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   MySeries is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Bellman-Ford.  If not, see <http://www.gnu.org/licenses/>.
 */

package br.edu.ufcg.atal.miniteste06;

public class BellmanFord {
    
    private Grafo grafo;
    private No origem;
    private No destino;

    public BellmanFord(Grafo grafo, No origem, No destino) {
        this.grafo = grafo;
        this.origem = origem;
        this.destino = destino;
    }
    public void executar(){
        inicializarGrafo();
        for(Aresta a : this.grafo.E){
            relaxar(a);
        }
        if(!temCicloNegativo()){
            imprimeResultado();
        } else {
            System.out.println("Erro grafo tem ciclo negativo");
        }
    }
    private void inicializarGrafo(){
        for(No vertice : this.grafo.V){
            if(vertice.equals(this.origem)){
                vertice.setDistancia(0);
            } else {
                vertice.setDistancia(Double.POSITIVE_INFINITY);
            }
            vertice.setPredecessor(null);
        }
    }
    private void relaxar(Aresta aresta){
        No origem = aresta.getOrigem();
        No destino = aresta.getDestino();
        double custoAresta = getCusto(aresta);
        if(destino.getDistancia() > (origem.getDistancia() + custoAresta)){
            destino.setDistancia(origem.getDistancia() + custoAresta);
            destino.setPredecessor(origem);
        }
    }

    private double getCusto(Aresta aresta) {
        double custoAresta = (aresta.getDelay()/aresta.getBandwidth());
        return custoAresta;
    }
    private boolean temCicloNegativo() {
        for(Aresta a : this.grafo.E){
            No origem = a.getOrigem();
            No destino = a.getDestino();
            if(origem.getDistancia() + getCusto(a) < destino.getDistancia()){
                return true;
            }
        }
        return false;
    }
    
    private void imprimeResultado() {
        String caminho = "";
        String separador =  "->";
        No atual = destino;
        while(atual.getPredecessor() != null) {
            caminho = atual.getNome() + separador + caminho;
            atual = atual.getPredecessor();
        }
        if(caminho.isEmpty()){
            System.out.println("Nós não conectados");
            return;
    }
        caminho = origem.getNome() + separador + caminho.substring(0, caminho.length() - separador.length());
        System.out.println("Caminho: " + caminho +";" + " Custo: " + destino.getDistancia());
    }

}
