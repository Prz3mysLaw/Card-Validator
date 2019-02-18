package issuers;

import java.util.ArrayList;
import java.util.List;

public class IssuerDetector implements Detector {

    List<IssuerRule> issuerRules;

    public IssuerDetector() {

        issuerRules = new ArrayList<IssuerRule>();
        issuerRules.add(new IssuerRule("Master Card", "51", 16));
        issuerRules.add(new IssuerRule("Master Card", "52", 16));
        issuerRules.add(new IssuerRule("Master Card", "53", 16));
        issuerRules.add(new IssuerRule("Master Card", "54", 16));
        issuerRules.add(new IssuerRule("Master Card", "55", 16));
        issuerRules.add(new IssuerRule("Visa", "4", 16));
        issuerRules.add(new IssuerRule("American Express", "34", 15));
        issuerRules.add(new IssuerRule("American Express", "37", 15));
    }

    public String detect(String number) {
        String issuer = "UNKNOWN";
        String processedNumber = number.replace(" ", "").trim();

        for (IssuerRule issuerRule : issuerRules) {
            if (processedNumber.startsWith(issuerRule.getPrefix()) && processedNumber.length() == issuerRule.getLengtth()){
                issuer = issuerRule.getIssuer();
            }
        }


        return issuer;
    }
}
