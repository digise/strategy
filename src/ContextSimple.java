public class ContextSimple{

    private IClassifierStrategy classifierStrategy;
    public ContextSimple(IClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }

    public IClassifierStrategy getClassifierStrategy() {
        return classifierStrategy;
    }

    public void setClassifierStrategy(IClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }

    public void run(){
        classifierStrategy.execute();
    }
}
