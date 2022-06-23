public class BoxingMatch {
    public static void main(String[] args) {
        Fighter Rachel = new Fighter("Rachel", 3, 55, 90, 0);
        Fighter Joe = new Fighter("Joe", 7, 45, 90, 0);
        Ring ring = new Ring(Rachel, Joe, 90, 100);
       ring.run();
    }
}
