package it.epicode.settimana4;

import java.sql.SQLException;

public class ProvaDbTirocinio {

	public static void main(String[] args) {
		
		TirocinioDbConnector tir = new TirocinioDbConnector();

//		try {
//			System.out.println(tir.cercaTirocinanti());
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}

		try {
			System.out.println(tir.cercaTutor("M"));
			System.out.println(tir.cercaTirocinanti());
			
		//	tir.insertTirocinante(8, 013344, "Pippo", "DePaperis", "3E", 2, 2);
			
			//tir.cancellaTirocinante(8);
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		


	}

}
