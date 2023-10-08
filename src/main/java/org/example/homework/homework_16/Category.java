package org.example.homework.homework_16;

public enum Category {
    PROGRAMMING("programming"),
    TESTING("testing"),
    MANAGEMENT("management"),
    MARKETING("marketing"),
    DESIGN("design"),
    KIDS("kids");

    private final String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
