import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Player can work in playback or recording mode, select one of them:" + "\n"
                + "1 -> Playback" + "\n"
                + "2 -> Recording" + "\n");
        String inputActionUser = scanner.next();

        switch (inputActionUser) {

            case "1":
                Playable playerPlayable = new Player();
                playerPlayable.play();
                playerPlayable.pause();
                playerPlayable.stop();
                break;
            case "2":
                Recordable playerRecordable = new Player();
                playerRecordable.record();
                playerRecordable.pause();
                playerRecordable.stop();
                break;
            default:
                System.out.println("There is no such feature");
        }


    }


}


