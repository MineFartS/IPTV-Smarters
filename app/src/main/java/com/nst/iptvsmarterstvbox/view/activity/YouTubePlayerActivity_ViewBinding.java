package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class YouTubePlayerActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public YouTubePlayerActivity f27197b;

    public YouTubePlayerActivity_ViewBinding(YouTubePlayerActivity youTubePlayerActivity, View view) {
        this.f27197b = youTubePlayerActivity;
        youTubePlayerActivity.llcontrol = (RelativeLayout) c.c(view, R.id.controls, "field 'llcontrol'", RelativeLayout.class);
        youTubePlayerActivity.pauseBT = (AppCompatImageView) c.c(view, R.id.exo_pause, "field 'pauseBT'", AppCompatImageView.class);
        youTubePlayerActivity.playBT = (AppCompatImageView) c.c(view, R.id.exo_play, "field 'playBT'", AppCompatImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        YouTubePlayerActivity youTubePlayerActivity = this.f27197b;
        if (youTubePlayerActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f27197b = null;
        youTubePlayerActivity.llcontrol = null;
        youTubePlayerActivity.pauseBT = null;
        youTubePlayerActivity.playBT = null;
    }
}
