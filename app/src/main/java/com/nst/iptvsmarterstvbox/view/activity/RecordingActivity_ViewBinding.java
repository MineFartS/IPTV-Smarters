package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class RecordingActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecordingActivity f26179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f26180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f26181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f26182e;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RecordingActivity f26183d;

        public a(RecordingActivity recordingActivity) {
            this.f26183d = recordingActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26183d.NoRecordingfound();
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RecordingActivity f26185d;

        public b(RecordingActivity recordingActivity) {
            this.f26185d = recordingActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26185d.onViewClicked();
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RecordingActivity f26187d;

        public c(RecordingActivity recordingActivity) {
            this.f26187d = recordingActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26187d.HandleDontAsk();
        }
    }

    public RecordingActivity_ViewBinding(RecordingActivity recordingActivity, View view) {
        this.f26179b = recordingActivity;
        recordingActivity.appbarToolbar = (AppBarLayout) b.c.c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        recordingActivity.pbLoader = (ProgressBar) b.c.c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        recordingActivity.recyclerView = (RecyclerView) b.c.c.c(view, R.id.my_recycler_view, "field 'recyclerView'", RecyclerView.class);
        View viewB = b.c.c.b(view, R.id.tv_no_record_found, "field 'tvNoRecordFound' and method 'NoRecordingfound'");
        recordingActivity.tvNoRecordFound = (TextView) b.c.c.a(viewB, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        this.f26180c = viewB;
        viewB.setOnClickListener(new a(recordingActivity));
        recordingActivity.date = (TextView) b.c.c.c(view, R.id.date, "field 'date'", TextView.class);
        recordingActivity.time = (TextView) b.c.c.c(view, R.id.time, "field 'time'", TextView.class);
        View viewB2 = b.c.c.b(view, R.id.bt_change, "field 'btBrowse' and method 'onViewClicked'");
        recordingActivity.btBrowse = (Button) b.c.c.a(viewB2, R.id.bt_change, "field 'btBrowse'", Button.class);
        this.f26181d = viewB2;
        viewB2.setOnClickListener(new b(recordingActivity));
        recordingActivity.textViewRecordingDir = (TextView) b.c.c.c(view, R.id.tv_recording_dir_change, "field 'textViewRecordingDir'", TextView.class);
        recordingActivity.rlRecordingDirChange = (LinearLayout) b.c.c.c(view, R.id.rl_recording_dir_change, "field 'rlRecordingDirChange'", LinearLayout.class);
        View viewB3 = b.c.c.b(view, R.id.tv_no_record_found_dontaskmeagain, "field 'tv_no_record_found_dontaskmeagain' and method 'HandleDontAsk'");
        recordingActivity.tv_no_record_found_dontaskmeagain = (TextView) b.c.c.a(viewB3, R.id.tv_no_record_found_dontaskmeagain, "field 'tv_no_record_found_dontaskmeagain'", TextView.class);
        this.f26182e = viewB3;
        viewB3.setOnClickListener(new c(recordingActivity));
        recordingActivity.logo = (ImageView) b.c.c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        recordingActivity.iv_back_button = (ImageView) b.c.c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        RecordingActivity recordingActivity = this.f26179b;
        if (recordingActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26179b = null;
        recordingActivity.appbarToolbar = null;
        recordingActivity.pbLoader = null;
        recordingActivity.recyclerView = null;
        recordingActivity.tvNoRecordFound = null;
        recordingActivity.date = null;
        recordingActivity.time = null;
        recordingActivity.btBrowse = null;
        recordingActivity.textViewRecordingDir = null;
        recordingActivity.rlRecordingDirChange = null;
        recordingActivity.tv_no_record_found_dontaskmeagain = null;
        recordingActivity.logo = null;
        recordingActivity.iv_back_button = null;
        this.f26180c.setOnClickListener(null);
        this.f26180c = null;
        this.f26181d.setOnClickListener(null);
        this.f26181d = null;
        this.f26182e.setOnClickListener(null);
        this.f26182e = null;
    }
}
