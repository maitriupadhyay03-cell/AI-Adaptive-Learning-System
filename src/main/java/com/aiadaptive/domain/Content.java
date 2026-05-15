package com.aiadaptive.domain;

public class Content {
    private final String id;
    private String title;
    private String format; // video, audio, text
    private String difficulty;

    public Content(String id, String title, String format, String difficulty) {
        this.id = id;
        this.title = title;
        this.format = format;
        this.difficulty = difficulty;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getFormat() { return format; }
    public String getDifficulty() { return difficulty; }

    public void setTitle(String title) { this.title = title; }
    public void setFormat(String format) { this.format = format; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
}