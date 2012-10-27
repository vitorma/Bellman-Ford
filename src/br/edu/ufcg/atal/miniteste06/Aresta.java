/*
 *   Aresta.java
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

public class Aresta {
	private No origem;
	private No destino;
	private double bandwidth;
	private double delay;

	public No getOrigem() {
		return origem;
	}

	public void setOrigem(No origem) {
		this.origem = origem;
	}

	public No getDestino() {
		return destino;
	}

	public void setDestino(No destino) {
		this.destino = destino;
	}

	public double getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(double bandwidth) {
		this.bandwidth = bandwidth;
	}

	public double getDelay() {
		return delay;
	}

	public void setDelay(double delay) {
		this.delay = delay;
	}

}