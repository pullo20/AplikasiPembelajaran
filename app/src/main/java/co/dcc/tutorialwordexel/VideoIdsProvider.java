package co.dcc.tutorialwordexel;

import java.util.Random;

public class VideoIdsProvider {
    private static String[] videoIds = {"YBGjNNcRvhc", "0tMPbnOfYOw", "YBGjNNcRvhc", "0tMPbnOfYOw"};
    private static String[] liveVideoIds = {"hHW1oY26kxQ"};
    private static Random random = new Random();

    public static String getNextVideoId() {
        return videoIds[random.nextInt(videoIds.length)];
    }

    public static String getNextLiveVideoId() {
        return liveVideoIds[random.nextInt(liveVideoIds.length)];
    }
}
