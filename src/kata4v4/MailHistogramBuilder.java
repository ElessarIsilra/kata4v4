package kata4v4;

import java.util.ArrayList;

public class MailHistogramBuilder {
    public static Histogram<String> build(ArrayList <String> mails){
        Histogram<String> histogram= new Histogram<>();
        for (Object mail : mails) {
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
