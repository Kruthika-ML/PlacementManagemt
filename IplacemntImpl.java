public class IplacemntImpl implements IPlacementRepository{
    private EntityManager entityManager;

    public IplacemntImpl() {
        entityManager=JPAUtil.getEntityManager();
    }

    @Override
    public placement addPlacement(Placement placement) {
        entityManager.persist(placement);
        return placement;
    }

    @Override
    public placement updatePlacement(Placement placement) {
        entityManager.merge(placement);
        return placement;
    }

    @Override
    public placement searchPlacement(long id) {
        entityManager.find(placement);
        return placement;
    }

    @Override
    public placement cancelPlacement(long id) {
        entityManager.remove(placement);
        return placement;
    }

        @Override
        public placement commitTransaction() {
            entityManager.getTransaction.commit();
    }

    @Override
    public placement beginTransaction() {
        entityManager.getTransaction.begin();

}
