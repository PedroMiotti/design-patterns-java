package memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state){
        this.states.add(state);
    }

    public EditorState pop(){
        //Get last item index
        int lastItemIndex = states.size() - 1;

        // Removing the last state
        EditorState lastState = states.get(lastItemIndex);
        states.remove(lastState);

        return lastState;

    }

}
