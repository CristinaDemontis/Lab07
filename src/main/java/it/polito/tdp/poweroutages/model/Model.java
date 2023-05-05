package it.polito.tdp.poweroutages.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.poweroutages.DAO.PowerOutageDAO;

public class Model {
	
	PowerOutageDAO podao;
	
	public Model() {
		podao = new PowerOutageDAO();
	}
	
	public List<Nerc> getNercList() {
		return podao.getNercList();
	}
	
	public List<PowerOutageDAO> pre_ricorsione(Nerc azienda, int anni, int ore){
		int best_cnt_persone = 0; 
		
		List<PowerOutageDAO> parziale = new LinkedList<>(); 
		List<PowerOutageDAO> soluzione_migliore = ricorsione(parziale, anni, ore ); 
		
		return soluzione_migliore; 
	}
	
	
	public List<PowerOutageDAO> ricorsione(List<PowerOutageDAO> parziale_migliore, int anni, int ore ){ // rivedere i paramentri 
		
	
		
		return null; 
	}
}
