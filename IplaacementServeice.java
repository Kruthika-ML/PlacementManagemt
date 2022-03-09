public interface IplaacementServeice {
    public placement addPlacement(Placement placement);
    public placement updatePlacement(Placement placement);
    public placement searchPlacement(long id);
    public placement cancelPlacement(long id):boolean;
}
