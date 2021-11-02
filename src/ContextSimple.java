public class ContextSimple{

    private IClassifierStrategy classifierStrategy;
    private IDistanceStrategy distanceStrategy;
    public ContextSimple(IClassifierStrategy classifierStrategy, IDistanceStrategy distanceStrategy) {
        this.classifierStrategy = classifierStrategy;
        this.distanceStrategy = distanceStrategy;
    }

    public IClassifierStrategy getClassifierStrategy() {
        return classifierStrategy;
    }

    public void setClassifierStrategy(IClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }

    public IDistanceStrategy getDistanceStrategy() {
        return distanceStrategy;
    }

    public void setDistanceStrategy(IDistanceStrategy distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }

    public void run(){
        classifierStrategy.execute(distanceStrategy);
    }
}
