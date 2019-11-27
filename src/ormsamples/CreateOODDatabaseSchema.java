/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.ORMDatabaseInitiator;

import orm.OODPersistentManager;

public class CreateOODDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(OODPersistentManager.instance());
			OODPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
