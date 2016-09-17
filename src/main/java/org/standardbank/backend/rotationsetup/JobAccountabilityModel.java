package org.standardbank.backend.rotationsetup;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JobAccountabilityModel {
	private String keyJobAccountability;
	private String keyPerformanceIndicator;
	
	public JobAccountabilityModel(String keyJobAccountability, String keyPerformanceIndicator){
		this.keyJobAccountability = keyJobAccountability;
		this.keyPerformanceIndicator = keyPerformanceIndicator;
	}
	public String getKeyJobAccountability() {
		return keyJobAccountability;
	}
	public void setKeyJobAccountability(String keyJobAccountability) {
		this.keyJobAccountability = keyJobAccountability;
	}
	public String getKeyPerformanceIndicator() {
		return keyPerformanceIndicator;
	}
	public void setKeyPerformanceIndicator(String keyPerformanceIndicator) {
		this.keyPerformanceIndicator = keyPerformanceIndicator;
	}

}
