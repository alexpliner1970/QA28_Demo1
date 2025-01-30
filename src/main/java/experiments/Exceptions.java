package experiments;

public class Exceptions {
    public static void main(String[] args) {
        String[] strArray = {"str1", "str2", "str3"};
        unchecedExeptions(strArray);
        try {
            pause();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private static void unchecedExeptions(String[] strArrey) {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(strArrey[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("created exception " + e.getMessage());
        }
        System.out.println("program is working");
    }
private static void pause() throws InterruptedException {
        checedExeption();
    System.out.println("pause 3 sec");
}
    private static void checedExeption() throws InterruptedException {
        Thread.sleep(3000);
    }
}
