/*
 *   Exemplo02.java
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

package br.edu.ufcg.atal.miniteste06.exemplos;
import java.util.LinkedList;
import java.util.List;

import br.edu.ufcg.atal.miniteste06.Aresta;
import br.edu.ufcg.atal.miniteste06.BellmanFord;
import br.edu.ufcg.atal.miniteste06.Exemplo;
import br.edu.ufcg.atal.miniteste06.Grafo;
import br.edu.ufcg.atal.miniteste06.No;

public class Exemplo02 implements Exemplo {
    private Grafo grafo;
    private No origem;
    private No destino;
    
    public Exemplo02() {
        No a = new No("A");
        No b = new No("B");
        No c = new No("C");
        No d = new No("D");

        List<No> vertices = new LinkedList<No>();
        vertices.add(a);
        vertices.add(b);
        vertices.add(c);
        vertices.add(d);

        Aresta ab = new Aresta();
        ab.setOrigem(a);
        ab.setDestino(b);
        ab.setDelay(-7);
        ab.setBandwidth(1);

        Aresta ac = new Aresta();
        ac.setOrigem(a);
        ac.setDestino(c);
        ac.setDelay(6);
        ac.setBandwidth(2);

        Aresta ad = new Aresta();
        ad.setOrigem(a);
        ad.setDestino(d);
        ad.setDelay(9);
        ad.setBandwidth(1);

        Aresta bc = new Aresta();
        bc.setOrigem(b);
        bc.setDestino(c);
        bc.setDelay(-6);
        bc.setBandwidth(2);

        Aresta cd = new Aresta();
        cd.setOrigem(c);
        cd.setDestino(d);
        cd.setDelay(4);
        cd.setBandwidth(2);

        Aresta db = new Aresta();
        db.setOrigem(d);
        db.setDestino(b);
        db.setDelay(5);
        db.setBandwidth(1);

        Aresta dc = new Aresta();
        dc.setOrigem(d);
        dc.setDestino(c);
        dc.setDelay(-10);
        dc.setBandwidth(2);

        List<Aresta> arestas = new LinkedList<Aresta>();
        arestas.add(ab);
        arestas.add(ac);
        arestas.add(ad);
        arestas.add(bc);
        arestas.add(cd);
        arestas.add(db);
        arestas.add(dc);

        Grafo g = new Grafo();
        g.V = vertices;
        g.E = arestas;

        this.grafo = g;
        this.origem = a;
        this.destino = d;
    }

    @Override
    public Grafo grafo() {
        return this.grafo;
    }
    @Override
    public No origem() {
        return this.origem;
    }
    @Override
    public No destino() {
        return this.destino;
    }

}
