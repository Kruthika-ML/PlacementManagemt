
package com.cg.placementmgmt.service;

        import com.cg.placementmanagement.entities.Placement;
        import com.placementmanagement.repository.IPlacementRepository;
        import com.placementmanagement.repository.IPlacementRepositoryImpl;

public class IPlacementServiceImpl implements IPlacementService {
    public IPlacementServiceImpl() {
        repo = new IPlacementRepositoryImpl();
    }

    @Override
    public void addPlacement(Placement placement) {
        repo.beginTransaction();
        repo.addPlacement(placement);
        repo.commitTransaction();
    }

    @Override
    public void updatePlacement(Placement placement) {
        repo.beginTransaction();
        repo.updatePlacement(placement);
        repo.commitTransaction();

    }

    @Override
    public Placement searchPlacement(int id) {
        Placement placement = repo.searchPlacement(id);
        return placement;
    }
    @Override
    public boolean cancelIPlacement(int id) {

        return false;
    }

}