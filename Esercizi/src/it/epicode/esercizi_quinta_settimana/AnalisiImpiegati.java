package it.epicode.esercizi_quinta_settimana;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnalisiImpiegati {

	private List<Impiegato> listaImpiegati; //nelle instance fields posso non inizializzare le variabili, nel body di una funzione le variabili non sono inizializzate
	
	public AnalisiImpiegati(List<Impiegato> listaImpiegati) {
		this.listaImpiegati = listaImpiegati;
		Collections.sort(this.listaImpiegati, (i1, i2) -> i1.getCognome().compareTo(i2.getCognome())); 	//sort funziona su collection di classi che implementano comparable
	}
	
	public BigDecimal trovaMinimoStipendioMaschile() {
		Optional<BigDecimal> minimoOpt = listaImpiegati.stream()
										  .filter(i -> i.getSesso()== Sesso.MASCHIO) 	//filtro gli impiegati di sesso maschile
										  .map(i -> i.getStipendio())			//trasformo stream di impiegati in stream di stipendi
										  .min((s1, s2) -> s1.compareTo(s2));	//colpevole di optional
										  
		BigDecimal minimo = minimoOpt.orElse(BigDecimal.ZERO); 	//se optional ha valore me lo ritorna, altrimenti al suo posto ritorna valore di default che passo in input
		return minimo;
//		if(minimo.isPresent()) {
//			return minimo.get(); 
//		} 
//		return BigDecimal.ZERO; 	//uso variabile statica di BigDecimal 
		
		
		//return minimo.isPresent() ? minimo.get() : BigDecimal.ZERO; //espressione booleana seguita da ?, se true mi ritorna il primo valore, altrimenti il secondo se la booleana falsa
	}
	
	public BigDecimal trovaMinimoStipendioMaschileVintage() {
		if(listaImpiegati.isEmpty()) {
			return BigDecimal.ZERO;
		}
		BigDecimal minimo = listaImpiegati.get(0).getStipendio();
		for(Impiegato i : listaImpiegati) {
			if(i.getSesso()== Sesso.MASCHIO) {
				minimo = minimo.min(i.getStipendio());
			}
		}
		return minimo;
	}
	
	public BigDecimal trovaMassimoStipendioFemminile() {
		return listaImpiegati.stream()
							.filter(i -> i.getSesso() == Sesso.FEMMINA)
							.map(i -> i.getStipendio())
							.max((s1, s2) -> s1.compareTo(s2))
							.orElse(BigDecimal.ZERO);
		
	}
	
	public BigDecimal trovaModaStipendi() {
		Map<BigDecimal, Integer> mappaStipendi = new HashMap<>();
		List<BigDecimal> listaStipendi = listaImpiegati.stream().map(i -> i.getStipendio()).collect(Collectors.toList());
		for(BigDecimal s : listaStipendi) {
			if(mappaStipendi.containsKey(s)) { 			//chiave gia presente nella mappa
				Integer value = mappaStipendi.get(s);
				mappaStipendi.put(s, value + 1);
			} else {									//nuova chiave da inserire
				mappaStipendi.put(s, 1);
			}
		} 
		return mappaStipendi.entrySet().stream()
									   .max((a1, a2) -> a1.getValue() - a2.getValue()) //mi da optional
									   .map(kv -> kv.getKey())
									   .orElse(BigDecimal.ZERO);
		
	}
	
	public BigDecimal trovaModaMigliore() {
		Map<BigDecimal, Integer> mappaStipendi = new HashMap<>();
		listaImpiegati.stream().map(i -> i.getStipendio())
		.forEach(s -> {
			if(mappaStipendi.containsKey(s)) { 			//creazione delle frequenze degli stipendi e popoliamo la mappa
				Integer value = mappaStipendi.get(s);
				mappaStipendi.put(s, value + 1);
			} else {							
				mappaStipendi.put(s, 1);
			}
		});
		
		return mappaStipendi.entrySet().stream()
									   .max((a1, a2) -> a1.getValue() - a2.getValue()) //mi da optional
									   .map(kv -> kv.getKey())
									   .orElse(BigDecimal.ZERO);
		
	}
	
	public BigDecimal trovaModaEcstasy() {
		return listaImpiegati.stream()					
					  		 .collect(Collectors.toMap(Impiegato::getStipendio, i -> 1, (e, r) -> e + r))		//prima lambda decide come chiamare la chiave e per ogni impiegato la chiave avra come valore lo stipendio
					  		 .entrySet()																		//quando trovo uno stipendio, lo registro nella mappa con valore 1. se ne trovo un altro sovrascrivo 1 a 1. //esistente 1, rimpiazzo 1
					  		 .stream()
					  		 .sorted((a1, a2) -> a2.getValue() - a1.getValue())
					  		 .findFirst()
					  		 .map(Map.Entry::getKey) 															//prende la chiave del primo
					  		 .orElse(BigDecimal.ZERO);
	}																											//tutti gli operatori che ritornano un singolo elemento a partire da una sequenza ritorneranno optional
}
