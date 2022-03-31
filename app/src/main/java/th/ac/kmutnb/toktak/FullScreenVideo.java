package th.ac.kmutnb.toktak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FullScreenVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_video);
        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemCelebration = new VideoItem();

        videoItemCelebration.videoURL = "android.resource://th.ac.kmutnb.toktak/"+R.raw.video1;
        videoItemCelebration.videoTitle = "Bird 1";
        videoItemCelebration.videoDescription = "bird 1";
        videoItems.add(videoItemCelebration);


        VideoItem videoItemParty = new VideoItem();
        videoItemParty.videoURL = "android.resource://th.ac.kmutnb.toktak/"+R.raw.video4;
        videoItemParty.videoTitle = "Bird 2";
        videoItemParty.videoDescription = "bird 2";
        videoItems.add(videoItemParty);

        videosViewPager.setAdapter(new VideosAdapter(videoItems));
    }
}