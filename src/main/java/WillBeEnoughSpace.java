public class WillBeEnoughSpace {
    public static int enough(int cap, int on, int wait){
        int seats = on + wait;
        if (seats <= cap) {
            return 0;
        }
        return seats - cap;
    }
}
