package classwork.lesson20;

public enum Language {
    HY("Armenia"),
    ENG("Britain, USA, Australia"),
    RUS("Russia"),
    CH;
    private String country;
    Language(String country){
        this.country = country;
    }
    Language(){
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
