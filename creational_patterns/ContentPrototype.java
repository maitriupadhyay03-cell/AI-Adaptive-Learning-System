package abstract_factory;

public class ContentPrototype implements Cloneable {
    private final String title;

    public ContentPrototype(String title) {
        this.title = title;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return title;
    }
}