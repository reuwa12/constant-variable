public class Main {
    public static void main(String[] args) {
        // "happy". "angry", "sad", etc.
        String mood = "tired";

        switch (mood) {
            case "happy":
                System.out.println("나는 행복하다. 왜냐하면 행복하기 때문이다.");
                break;
            case "angry":
                System.out.println("나는 화가난다. 왜냐하면 화가나기 때문이다.");
                break;
            case "sad":
                System.out.println("나는 슬프다. 왜냐하면 슬프기 때문이다.");
                break;
                default:
                    System.out.println("지금 내 기분은 이 단어들로는 표현할 수 없다.");
        }
    }
}