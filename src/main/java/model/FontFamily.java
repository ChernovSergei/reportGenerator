package model;

public enum FontFamily {
    TIMES_NEW_ROMAN("Times New Roman"),
    CALIBRI("Calibri"),
    ARIAL("Arial"),
    GEORGIA("Georgia"),
    GARAMOND("Garamond"),
    COURIER("Courier"),
    NEWVERDANA("NewVerdana"),
    TAHOMA("Tahoma"),
    HELVETICA("Helvetica"),
    CONSOLAS("Consolas");

    private final String name;

    FontFamily(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
