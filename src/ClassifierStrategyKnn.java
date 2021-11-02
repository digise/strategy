public class ClassifierStrategyKnn implements IClassifierStrategy{

    public ClassifierStrategyKnn() {
    }

    @Override
    public void execute(IDistanceStrategy distanceStrategy) {
        distanceStrategy.computed();
        System.out.println("ClassifierKnn executed");
    }



}
