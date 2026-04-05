package minefarts.iptvsmarters.view.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.i.a.f.f;
import minefarts.iptvsmarters.R;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class YouTubePlayerActivity extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public YouTubePlayerView f27186d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.i.a.f.c f27188f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f27191i;

    @BindView
    public RelativeLayout llcontrol;

    @BindView
    public AppCompatImageView pauseBT;

    @BindView
    public AppCompatImageView playBT;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27187e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27189g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27190h = false;

    public class a implements f {

        /* JADX INFO: renamed from: minefarts.iptvsmarters.view.activity.YouTubePlayerActivity$a$a, reason: collision with other inner class name */
        public class C0279a extends c.i.a.f.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c.i.a.f.c f27193b;

            public C0279a(c.i.a.f.c cVar) {
                this.f27193b = cVar;
            }

            @Override // c.i.a.f.a, c.i.a.f.g
            public void a(int i2) {
                if (i2 == 0) {
                    YouTubePlayerActivity.this.finish();
                }
                if (i2 == 1) {
                    YouTubePlayerActivity.this.f27189g = true;
                    YouTubePlayerActivity.this.f27190h = false;
                }
                if (i2 == 2) {
                    YouTubePlayerActivity.this.f27190h = false;
                    YouTubePlayerActivity.this.f27189g = false;
                }
            }

            @Override // c.i.a.f.a, c.i.a.f.g
            public void h() {
                String str = YouTubePlayerActivity.this.f27187e;
                YouTubePlayerActivity.this.f27188f = this.f27193b;
                if (str == null || str.isEmpty()) {
                    return;
                }
                YouTubePlayerActivity.this.findViewById(R.id.exo_play).setVisibility(4);
                YouTubePlayerActivity.this.findViewById(R.id.exo_pause).setVisibility(0);
                this.f27193b.f(str, 0.0f);
                YouTubePlayerActivity.this.f27189g = true;
            }

            @Override // c.i.a.f.a, c.i.a.f.g
            public void onError(int i2) {
            }
        }

        public a() {
        }

        @Override // c.i.a.f.f
        public void a(c.i.a.f.c cVar) {
            cVar.d(new C0279a(cVar));
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            YouTubePlayerActivity.this.findViewById(R.id.controls).setVisibility(4);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            YouTubePlayerActivity.this.findViewById(R.id.controls).setVisibility(4);
        }
    }

    @SuppressLint({"ResourceType"})
    public final void C0() {
        this.f27191i = new Handler();
        this.f27186d.getPlayerUIController();
        Intent intent = getIntent();
        if (intent != null) {
            this.f27187e = intent.getStringExtra("you_tube_trailer");
        }
        this.f27186d.getPlayerUIController().b(false);
        if (new c.h.a.k.d.a.a(this).A().equals(c.h.a.h.n.a.s0)) {
            this.f27186d.getPlayerUIController().o(false);
        } else {
            this.f27186d.getPlayerUIController().o(true);
        }
        this.f27186d.getPlayerUIController().e(false);
        this.f27186d.getPlayerUIController().j(true);
        this.f27186d.m(new a(), true);
        this.f27191i.removeCallbacksAndMessages(null);
        this.f27191i.postDelayed(new b(), 2000L);
    }

    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 23 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AppCompatImageView appCompatImageView;
        switch (view.getId()) {
            case R.id.exo_pause /* 2131427946 */:
                c.i.a.f.c cVar = this.f27188f;
                if (cVar == null) {
                    return;
                }
                cVar.pause();
                findViewById(R.id.exo_play).setVisibility(0);
                findViewById(R.id.exo_pause).setVisibility(4);
                this.pauseBT.clearFocus();
                appCompatImageView = this.playBT;
                break;
            case R.id.exo_play /* 2131427947 */:
                c.i.a.f.c cVar2 = this.f27188f;
                if (cVar2 == null) {
                    return;
                }
                cVar2.play();
                findViewById(R.id.exo_play).setVisibility(4);
                findViewById(R.id.exo_pause).setVisibility(0);
                this.playBT.clearFocus();
                appCompatImageView = this.pauseBT;
                break;
            default:
                return;
        }
        appCompatImageView.requestFocus();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_you_tube_player);
        ButterKnife.a(this);
        this.f27186d = (YouTubePlayerView) findViewById(R.id.youtube_player_view);
        this.f27186d.addView(getLayoutInflater().inflate(R.layout.youtubecustonui, (ViewGroup) null));
        this.playBT = (AppCompatImageView) findViewById(R.id.exo_play);
        this.pauseBT = (AppCompatImageView) findViewById(R.id.exo_pause);
        findViewById(R.id.exo_play).setOnClickListener(this);
        findViewById(R.id.exo_pause).setOnClickListener(this);
        C0();
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        YouTubePlayerView youTubePlayerView = this.f27186d;
        if (youTubePlayerView != null) {
            youTubePlayerView.release();
        }
    }

    @Override // a.b.k.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        if (i2 == 23 || i2 == 66 || i2 == 166 || i2 == 167) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        AppCompatImageView appCompatImageView;
        c.i.a.f.c cVar;
        keyEvent.getRepeatCount();
        if (i2 != 23 && i2 != 66) {
            return super.onKeyUp(i2, keyEvent);
        }
        findViewById(R.id.controls).setVisibility(0);
        if (findViewById(R.id.controls).getVisibility() == 0) {
            if (!this.f27189g || (cVar = this.f27188f) == null) {
                c.i.a.f.c cVar2 = this.f27188f;
                if (cVar2 != null) {
                    this.f27189g = true;
                    cVar2.play();
                    findViewById(R.id.exo_play).setVisibility(4);
                    findViewById(R.id.exo_pause).setVisibility(0);
                    this.pauseBT.requestFocus();
                    appCompatImageView = this.playBT;
                }
            } else {
                this.f27189g = false;
                cVar.pause();
                findViewById(R.id.exo_play).setVisibility(0);
                findViewById(R.id.exo_pause).setVisibility(4);
                this.playBT.requestFocus();
                appCompatImageView = this.pauseBT;
            }
            appCompatImageView.clearFocus();
        }
        this.f27191i.removeCallbacksAndMessages(null);
        this.f27191i.postDelayed(new c(), 2000L);
        return true;
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
