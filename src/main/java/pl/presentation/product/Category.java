package pl.presentation.product;

public enum Category {
    WSZYSTKIE("http://localhost:8080/lista"),
    SPOZYWCZE("http://localhost:8080/lista?category=spozywcze"),
    DOMOWE("http://localhost:8080/lista?category=domowe"),
    INNE("http://localhost:8080/lista?category=inne");

    private String articles;

    Category(String articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return articles;
    }
}
