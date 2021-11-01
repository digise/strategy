public class ClassifierStrategySOM implements IClassifierStrategy {

    private IDIstanceStrategy distanceStrategy;
    public ClassifierStrategySOM(IDIstanceStrategy distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }

    @Override
    public void execute() {
        distanceStrategy.computed();
        System.out.println("ClassifierSOM executed");
    }
}
