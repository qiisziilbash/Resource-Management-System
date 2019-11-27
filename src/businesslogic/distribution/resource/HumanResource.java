/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package businesslogic.distribution.resource;

import java.io.Serializable;

public class HumanResource extends businesslogic.distribution.resource.Resource implements Serializable{
	public HumanResource() {
	}
	
	private businesslogic.accounting.job.Programming programming;
	
	public void setProgramming(businesslogic.accounting.job.Programming value) {
		this.programming = value;
	}
	
	public businesslogic.accounting.job.Programming getProgramming() {
		return programming;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
