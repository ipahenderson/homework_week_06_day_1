import java.util.ArrayList;
import java.util.Collections;


public class EightBall{

private ArrayList<String> options;

    public EightBall(){
        this.options = new ArrayList<>();
        }

    public void add(String word){
        this.options.add(word);
    }

    public int getOptionCount(){
        return this.options.size();
    }

    public String shake() {
       Collections.shuffle(options);
       return options.get(0);
    }

    public void remove(String word) {
        this.options.remove(word);
    }
}
