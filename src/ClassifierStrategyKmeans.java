public class ClassifierStrategyKmeans implements IClassifierStrategy{

    public ClassifierStrategyKmeans() {

    }

    @Override
    public void execute(IDistanceStrategy distanceStrategy) {
        distanceStrategy.computed();
        System.out.println("ClassifierKmeans executed");
    }
}
