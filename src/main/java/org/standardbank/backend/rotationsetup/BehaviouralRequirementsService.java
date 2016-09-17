package org.standardbank.backend.rotationsetup;

import java.util.ArrayList;
import java.util.List;

public class BehaviouralRequirementsService {

	public List<BehaviouralRequirementsModel> addBehaviouralRequirements() {
		BehaviouralRequirementsModel behaviouralRequirements = new BehaviouralRequirementsModel();
		List<BehaviouralRequirementsModel> valuesList = new ArrayList<>();
		
		behaviouralRequirements.setValueName("Serving our customers");
		behaviouralRequirements.setValueDescription("How would you expect yourself to serve our customers?");
		valuesList.add(behaviouralRequirements);
		
		behaviouralRequirements.setValueName("Growing our people");
		behaviouralRequirements.setValueDescription("How would you expect yourself to help grow our people?");
		valuesList.add(behaviouralRequirements);
		
		behaviouralRequirements.setValueName("Delivering to our shareholders");
		behaviouralRequirements.setValueDescription("How would you expect yourself to deliver to our shareholders?");
		valuesList.add(behaviouralRequirements);
		
		behaviouralRequirements.setValueName("Being proactive");
		behaviouralRequirements.setValueDescription("How would you expect yourself to be proactive?");
		valuesList.add(behaviouralRequirements);
		
		behaviouralRequirements.setValueName("Working in teams");
		behaviouralRequirements.setValueDescription("How would you expect yourself to work in teams?");
		valuesList.add(behaviouralRequirements);
		
		behaviouralRequirements.setValueName("Constantly raising the bar");
		behaviouralRequirements.setValueDescription("How would you expect yourself to constantly raise the bar?");
		valuesList.add(behaviouralRequirements);
		
		behaviouralRequirements.setValueName("Respecting each other");
		behaviouralRequirements.setValueDescription("How would you expect yourself to show respect to your colleagues?");
		valuesList.add(behaviouralRequirements);
		
		behaviouralRequirements.setValueName("Upholding the highest integrity");
		behaviouralRequirements.setValueDescription("How would you expect yourself to uphold the highest level of integrity?");
		valuesList.add(behaviouralRequirements);
		
		
		return valuesList;
	}

}
