public class BrainLuck {
    public BrainLuck(String code) {
    }
    public String process(String input) {
        char[] chars = new char[10000];
        int pointer = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '>' -> ++pointer;
                case '<' -> --pointer;
            }
        }
        return "";
    }

}
