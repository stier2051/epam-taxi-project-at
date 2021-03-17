package enums;

public enum Faculty {
    PHYSICS("Faculty of Physics"),
    MATHEMATICS("Faculty of Mathematics"),
    CHEMISTRY("Faculty of Chemistry"),
    EDUCATION("Faculty of Education"),
    LAW("Faculty of Law"),
    PHILOLOGY("Faculty of Philology"),
    PHILOSOPHY("Faculty of Philosophy");

    private String value;

    Faculty(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
