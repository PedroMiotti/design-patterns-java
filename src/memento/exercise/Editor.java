package memento.exercise;


public class Editor {
    private String content;
    private String fontName;
    private String fontSize;


    public EditorState createState(){
        return new EditorState(content, fontName, fontSize);
    }

    public void restore(EditorState state){
        this.content = state.getContent();
        this.fontName = state.getFontName();
        this.fontSize = state.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }
}
