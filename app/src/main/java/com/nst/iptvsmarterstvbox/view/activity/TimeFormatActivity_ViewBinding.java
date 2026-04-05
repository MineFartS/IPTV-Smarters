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
public class TimeFormatActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TimeFormatActivity f26882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f26883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f26884d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TimeFormatActivity f26885d;

        public a(TimeFormatActivity timeFormatActivity) {
            this.f26885d = timeFormatActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26885d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TimeFormatActivity f26887d;

        public b(TimeFormatActivity timeFormatActivity) {
            this.f26887d = timeFormatActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26887d.onViewClicked(view);
        }
    }

    public TimeFormatActivity_ViewBinding(TimeFormatActivity timeFormatActivity, View view) {
        this.f26882b = timeFormatActivity;
        timeFormatActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        timeFormatActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        View viewB = c.b(view, R.id.bt_save_changes, "field 'btSaveChanges' and method 'onViewClicked'");
        timeFormatActivity.btSaveChanges = (Button) c.a(viewB, R.id.bt_save_changes, "field 'btSaveChanges'", Button.class);
        this.f26883c = viewB;
        viewB.setOnClickListener(new a(timeFormatActivity));
        View viewB2 = c.b(view, R.id.btn_back_playerselection, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        timeFormatActivity.btnBackPlayerselection = (Button) c.a(viewB2, R.id.btn_back_playerselection, "field 'btnBackPlayerselection'", Button.class);
        this.f26884d = viewB2;
        viewB2.setOnClickListener(new b(timeFormatActivity));
        timeFormatActivity.rgRadio = (RadioGroup) c.c(view, R.id.rg_radio, "field 'rgRadio'", RadioGroup.class);
        timeFormatActivity.rb24hr = (RadioButton) c.c(view, R.id.rb_24hr, "field 'rb24hr'", RadioButton.class);
        timeFormatActivity.rb12hr = (RadioButton) c.c(view, R.id.rb_12hr, "field 'rb12hr'", RadioButton.class);
        timeFormatActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        timeFormatActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        timeFormatActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        TimeFormatActivity timeFormatActivity = this.f26882b;
        if (timeFormatActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26882b = null;
        timeFormatActivity.toolbar = null;
        timeFormatActivity.appbarToolbar = null;
        timeFormatActivity.btSaveChanges = null;
        timeFormatActivity.btnBackPlayerselection = null;
        timeFormatActivity.rgRadio = null;
        timeFormatActivity.rb24hr = null;
        timeFormatActivity.rb12hr = null;
        timeFormatActivity.date = null;
        timeFormatActivity.time = null;
        timeFormatActivity.logo = null;
        this.f26883c.setOnClickListener(null);
        this.f26883c = null;
        this.f26884d.setOnClickListener(null);
        this.f26884d = null;
    }
}
