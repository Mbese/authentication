package org.standardbank.backend.rotationsetup;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BehaviouralRequirementsModel {
	private String valueName;
	private String valueDescription;
	
	public BehaviouralRequirementsModel(String valueName, String valueDescription){
		this.valueName = valueName;
		this.valueDescription = valueDescription;
	}
	
	public BehaviouralRequirementsModel() {
		
	}

	public String getValueName() {
		return valueName;
	}
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
	public String getValueDescription() {
		return valueDescription;
	}
	public void setValueDescription(String valueDescription) {
		this.valueDescription = valueDescription;
	}
	
	

}
