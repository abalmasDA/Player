public class Player implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("Track is playing");
    }

    @Override
    public void record() {
        System.out.println("Track is recorded");
    }

    @Override
    public void pause() {
        System.out.println("Track is paused");
    }

    @Override
    public void stop() {
        System.out.println("Track is stopped");
    }
}
