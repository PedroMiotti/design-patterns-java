package behavioural.mediator;

public class ArticlesDialogBox extends DialogBox{
    private ListBox articlesListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);


    @Override
    public void changed(UIControl control) {
        if(control == articlesListBox)
            articleSelected();
        else if ( control == titleTextBox)
            titleChanged();
    }

    private void articleSelected(){
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged(){
        String content = titleTextBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty());

        saveButton.setEnabled(!isEmpty);
    }

    public void simulateUserInteraction(){
        articlesListBox.setSelection("Article 1");
//        titleTextBox.setContent(""); Sets the button enables property to false, because there is no content
        System.out.println("TextBox : " + titleTextBox.getContent());
        System.out.println("Button : " + saveButton.isEnabled());

    }
}
