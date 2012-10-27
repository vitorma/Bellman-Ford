/*
 *   No.java
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

public class No {

	private String nome;
	private double distancia;
	private No predecessor;

	public No(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public No getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(No predecessor) {
		this.predecessor = predecessor;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof No))
			return false;
		return this.nome.equals(((No) obj).getNome());
	}
}