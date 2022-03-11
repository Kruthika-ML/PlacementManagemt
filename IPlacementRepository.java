package com.placementmgmt.repository;

import com.cg.placementmgmt.entities.Placement;

public interface IPlacementRepository {
	public abstract void addPlacement(Placement placement);

	public abstract void updatePlacement(Placement placement);

	public abstract Placement searchPlacement(int id);

	public abstract void commitTransaction();

	public abstract void beginTransaction();
}