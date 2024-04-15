public class ConsoleResolver {
    GameBoard g;

    public ConsoleResolver(GameBoard g) {
        this.g = g;
    }
    public void HandelInput(String s){
        String command = s.split(" ")[0];
        String args = s.split(" ")[1];
        switch (command){
            case "move": ;
        }
    }
}
