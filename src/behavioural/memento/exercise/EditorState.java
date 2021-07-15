package memento.exercise;

public class EditorState {
    private String content;
    private String fontName;
    private String fontSize;

    public EditorState(String content, String fontName, String fontSize){
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public String getFontSize() {
        return fontSize;
    }
}
