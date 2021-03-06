package com.apap.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apap.tutorial3.model.PilotModel;

@Service
public class PilotInMemoryService implements PilotService {
	private List<PilotModel> archivePilot;
	
	public PilotInMemoryService() {
		archivePilot = new ArrayList<>();
	}

	@Override
	public void addPilot(PilotModel pilot) {
		archivePilot.add(pilot);
	}

	@Override
	public List<PilotModel> getPilotList() {
		return archivePilot;
	}

	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		for (PilotModel i: archivePilot) {
			if (i.getLicenseNumber().equalsIgnoreCase(licenseNumber)) {
				return i;
			}
		}
		return null;
	}
	
	public PilotModel getPilotDetailById(String id) {
		for (PilotModel i: archivePilot) {
			if (i.getId().equalsIgnoreCase(id)) {
				return i;
			}
		}
		return null;
	}

}
