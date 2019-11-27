/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.ORMDatabaseInitiator;

import orm.OODPersistentManager;

public class DropOODDatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(OODPersistentManager.instance());
				OODPersistentManager.instance().disposePersistentManager();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
