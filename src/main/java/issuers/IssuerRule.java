package issuers;

public class IssuerRule {
    private String issuer;
    private String prefix;
    private int lengtth;

    public IssuerRule(String issuer, String prefix, int lengtth) {
        this.issuer = issuer;
        this.prefix = prefix;
        this.lengtth = lengtth;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getLengtth() {
        return lengtth;
    }
}
