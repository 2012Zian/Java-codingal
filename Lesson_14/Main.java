package Lesson_14;
import java.util.Arrays;
class DataSet{
    private double[] data;
    private int dataSize;
    private double sum;
    public DataSet() {
        data = new double[100];
        dataSize = 0;
        sum = 0;

    }
    public void add(double value) {
        if (dataSize == data.length) {
            System.out.println("DataSet is full");
            return;
        }
        data[dataSize] = value;
        dataSize++;
        sum += value;


    }
    public double getAverage() {
    return (dataSize == 0?0 : sum / dataSize);
    }
    public double getStandardDeviation() {
        if (dataSize == 0) return 0;
        double mean = getAverage();
        double sumOfSquares = 0.0;
        for (int i = 0; i < dataSize; i++) {
            double diff = data[i] - mean;
            sumOfSquares += diff * diff;
        }

        return Math.sqrt(sumOfSquares / dataSize);
    }
    public static double calculateAverage(DataSet[] datasets) {
        double total = 0.0;
        for (DataSet ds : datasets) {
            total += ds.getAverage();
        }
        return total / datasets.length;
    }
    @Override
    public String toString() {
        return "DataSet{" +
        "data=" + Arrays.toString(data) +
        ", dataSize=" + dataSize +
        ", sum=" + sum +
        '}';
    }
}
public class Main {
    public static void main(String[] args){
        DataSet dataset = new DataSet();
        dataset.add(10.0);
        dataset.add(3.7);
        dataset.add(4.5);
        System.out.println("Standard Deviation: " + dataset.getStandardDeviation());
        
    }
}
