package abstract_factory;

import model.Content;

public class ContentFactory {
    public static Content createContent(String type) {
        return switch (type) {
            case "VIDEO" -> new Content("Video Lesson", "VIDEO");
            case "AUDIO" -> new Content("Audio Lesson", "AUDIO");
            default -> new Content("Text Lesson", "TEXT");
        };
    }
}