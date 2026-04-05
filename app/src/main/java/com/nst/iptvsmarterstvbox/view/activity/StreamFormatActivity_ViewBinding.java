package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class StreamFormatActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StreamFormatActivity f26764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f26765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f26766d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ StreamFormatActivity f26767d;

        public a(StreamFormatActivity streamFormatActivity) {
            this.f26767d = streamFormatActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26767d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ StreamFormatActivity f26769d;

        public b(StreamFormatActivity streamFormatActivity) {
            this.f26769d = streamFormatActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26769d.onViewClicked(view);
        }
    }

    public StreamFormatActivity_ViewBinding(StreamFormatActivity streamFormatActivity, View view) {
        this.f26764b = streamFormatActivity;
        streamFormatActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        streamFormatActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        View viewB = c.b(view, R.id.bt_save_changes, "field 'btSaveChanges' and method 'onViewClicked'");
        streamFormatActivity.btSaveChanges = (Button) c.a(viewB, R.id.bt_save_changes, "field 'btSaveChanges'", Button.class);
        this.f26765c = viewB;
        viewB.setOnClickListener(new a(streamFormatActivity));
        View viewB2 = c.b(view, R.id.btn_back_playerselection, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        streamFormatActivity.btnBackPlayerselection = (Button) c.a(viewB2, R.id.btn_back_playerselection, "field 'btnBackPlayerselection'", Button.class);
        this.f26766d = viewB2;
        viewB2.setOnClickListener(new b(streamFormatActivity));
        streamFormatActivity.rgRadio = (RadioGroup) c.c(view, R.id.rg_radio, "field 'rgRadio'", RadioGroup.class);
        streamFormatActivity.rbM3u8 = (RadioButton) c.c(view, R.id.rb_m3u8, "field 'rbM3u8'", RadioButton.class);
        streamFormatActivity.rbTs = (RadioButton) c.c(view, R.id.rb_ts, "field 'rbTs'", RadioButton.class);
        streamFormatActivity.rbDefault = (RadioButton) c.c(view, R.id.rb_default, "field 'rbDefault'", RadioButton.class);
        streamFormatActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        streamFormatActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        streamFormatActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        StreamFormatActivity streamFormatActivity = this.f26764b;
        if (streamFormatActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26764b = null;
        streamFormatActivity.toolbar = null;
        streamFormatActivity.appbarToolbar = null;
        streamFormatActivity.btSaveChanges = null;
        streamFormatActivity.btnBackPlayerselection = null;
        streamFormatActivity.rgRadio = null;
        streamFormatActivity.rbM3u8 = null;
        streamFormatActivity.rbTs = null;
        streamFormatActivity.rbDefault = null;
        streamFormatActivity.date = null;
        streamFormatActivity.time = null;
        streamFormatActivity.logo = null;
        this.f26765c.setOnClickListener(null);
        this.f26765c = null;
        this.f26766d.setOnClickListener(null);
        this.f26766d = null;
    }
}
