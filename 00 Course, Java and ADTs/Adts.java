public class Adts {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.set(0, "word");
        System.out.println("Item at 0 is: " + list.get(0)); // word

        list.add(0, "first");
        System.out.println("Item at 0 is: " + list.get(0)); // first
        System.out.println("Item at 1 is: " + list.get(1)); // word

        list.remove(0);
        System.out.println("Item at 0 is: " + list.get(0)); // word

        ///////////////////

        String[] arr = new String[10];

        arr[0] = "word";
        System.out.println("Item at 0 is: " + arr[0]);
    }
}