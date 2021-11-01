public class ClassifierStrategyKnn implements IClassifierStrategy{

    private IDIstanceStrategy distanceStrategy;
    public ClassifierStrategyKnn(IDIstanceStrategy idIstanceStrategy) {
        this.distanceStrategy = idIstanceStrategy;
    }

    @Override
    public void execute() {
        distanceStrategy.computed();
        System.out.println("ClassifierKnn executed");
    }



}
