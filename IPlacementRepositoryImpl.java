package com.placementmgmt.repository;

import javax.persistence.EntityManager;

import com.cg.placementmgmt.entities.Placement;

public class IPlacementRepositoryImpl implements IPlacementRepository {

	private EntityManager entityManager;

	public IPlacementRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addPlacement(Placement placement) {
		entityManager.persist(placement);
	}

	@Override
	public void updatePlacement(Placement placement) {
		entityManager.merge(placement);

	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement = entityManager.find(Placement.class, id);
		return placement;
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().commit();
	}

}