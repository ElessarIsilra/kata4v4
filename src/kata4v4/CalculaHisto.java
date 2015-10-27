package kata4v4;

public class CalculaHisto {

    public static <T> Histogram<T> computeHisto(T[] vector) {
        Histogram<T> histo = new Histogram<>();
        for (T key : vector) {
            histo.increment(key);

        }

        return histo;
    }
}
