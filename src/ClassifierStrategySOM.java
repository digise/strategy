public class ClassifierStrategySOM implements IClassifierStrategy{

    public ClassifierStrategySOM() {
    }

    @Override
    public void execute(IDistanceStrategy distanceStrategy) {
        distanceStrategy.computed();
        System.out.println("ClassifierSOM executed");
    }
}
