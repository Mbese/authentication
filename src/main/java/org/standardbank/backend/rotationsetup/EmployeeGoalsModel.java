package org.standardbank.backend.rotationsetup;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeGoalsModel {
	private String goalTitle;
	private String goalTarget;
	private String keyPerformanceIndicator;
	
	public EmployeeGoalsModel(String goalTitle, String goalTarget, String keyPerformanceIndicator){
		this.goalTitle = goalTitle;
		this.goalTarget = goalTarget;
		this.keyPerformanceIndicator = keyPerformanceIndicator;
	}

	public String getGoalTitle() {
		return goalTitle;
	}

	public void setGoalTitle(String goalTitle) {
		this.goalTitle = goalTitle;
	}

	public String getGoalTarget() {
		return goalTarget;
	}

	public void setGoalTarget(String goalTarget) {
		this.goalTarget = goalTarget;
	}

	public String getKeyPerformanceIndicator() {
		return keyPerformanceIndicator;
	}

	public void setKeyPerformanceIndicator(String keyPerformanceIndicator) {
		this.keyPerformanceIndicator = keyPerformanceIndicator;
	}

}
