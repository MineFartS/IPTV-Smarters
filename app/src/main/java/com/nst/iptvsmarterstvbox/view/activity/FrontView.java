package minefarts.iptvsmarters.view.activity;

import a.b.k.c;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class FrontView extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25616d = false;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f25617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f25618c;

        public a(View view, View view2) {
            this.f25617b = view;
            this.f25618c = view2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FrontView frontView;
            boolean z = false;
            if (FrontView.this.f25616d) {
                this.f25617b.setVisibility(0);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                FrontView.this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25618c.getLayoutParams();
                float f2 = displayMetrics.density;
                layoutParams.width = (int) (200.0f * f2);
                layoutParams.height = (int) (150.0f * f2);
                layoutParams.leftMargin = (int) (20.0f * f2);
                layoutParams.topMargin = (int) (f2 * 50.0f);
                this.f25618c.setLayoutParams(layoutParams);
                frontView = FrontView.this;
            } else {
                this.f25617b.setVisibility(8);
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                FrontView.this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f25618c.getLayoutParams();
                layoutParams2.width = displayMetrics2.widthPixels;
                layoutParams2.height = displayMetrics2.heightPixels;
                layoutParams2.leftMargin = 0;
                layoutParams2.topMargin = 0;
                this.f25618c.setLayoutParams(layoutParams2);
                frontView = FrontView.this;
                z = true;
            }
            frontView.f25616d = z;
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_front_view);
        View viewFindViewById = findViewById(R.id.imageview_image);
        View viewFindViewById2 = findViewById(R.id.layout_to_hide);
        VideoView videoView = (VideoView) findViewById(R.id.video_view);
        videoView.setVideoURI(Uri.parse("https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4"));
        videoView.start();
        viewFindViewById.setOnClickListener(new a(viewFindViewById2, viewFindViewById));
    }
}
