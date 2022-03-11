package com.cg.placementmgmt.service;

import com.cg.placementmgmt.entities.Placement;

public interface IPlacementService {
	public abstract void addPlacement(Placement placement);

	public abstract void updatePlacement(Placement placement);

	public abstract Placement searchPlacement(int id);

	public abstract boolean cancelIPlacement(int id);
}