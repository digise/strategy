public class ClassifierStrategyKmeans implements IClassifierStrategy {

    private IDIstanceStrategy distanceStrategy;
    public ClassifierStrategyKmeans(IDIstanceStrategy distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }

    @Override
    public void execute() {
        distanceStrategy.computed();
        System.out.println("ClassifierKmeans executed");
    }
}
