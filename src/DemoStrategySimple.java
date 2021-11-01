public class DemoStrategySimple {

    public static void main(String[] args) {
        System.out.println("--- KNN with Euclidean distance---");
        ContextSimple context = new ContextSimple(new ClassifierStrategyKnn(new EuclideanDistance()));
        context.run();

        System.out.println("--- KNN with Manhattan distance---");
        context = new ContextSimple(new ClassifierStrategyKnn(new ManhattanDistance()));
        context.run();

        System.out.println("--- K-means with Manhattan distance---");
        context.setClassifierStrategy(new ClassifierStrategyKmeans(new ManhattanDistance()));
        context.run();

        System.out.println("--- SOM with Euclidean distance---");
        context.setClassifierStrategy(new ClassifierStrategySOM(new EuclideanDistance()));
        context.run();
    }
}
