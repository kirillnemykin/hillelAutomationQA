package org.example.homework.homework_16;

public enum ProgrammingLanguage {
    FRONTEND("front-end"),
    JAVA("java"),
    PHP("php"),
    PYTHON("python"),
    DEVOPS("devops"),
    DATASCIENCE("hi-tech"),
    CSHARP("c-sharp"),
    JAVASCRIPT("javascript"),
    FULLSTACK("full-stack");

    private final String language;

    ProgrammingLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
