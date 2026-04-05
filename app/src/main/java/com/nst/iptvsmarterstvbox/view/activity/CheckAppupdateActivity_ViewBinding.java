package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class CheckAppupdateActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CheckAppupdateActivity f25440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f25441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f25442d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CheckAppupdateActivity f25443d;

        public a(CheckAppupdateActivity checkAppupdateActivity) {
            this.f25443d = checkAppupdateActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25443d.onclickView(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CheckAppupdateActivity f25445d;

        public b(CheckAppupdateActivity checkAppupdateActivity) {
            this.f25445d = checkAppupdateActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25445d.onclickView(view);
        }
    }

    public CheckAppupdateActivity_ViewBinding(CheckAppupdateActivity checkAppupdateActivity, View view) {
        this.f25440b = checkAppupdateActivity;
        checkAppupdateActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        checkAppupdateActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        checkAppupdateActivity.title = (TextView) c.c(view, R.id.tv_check_app_update_title, "field 'title'", TextView.class);
        checkAppupdateActivity.message = (TextView) c.c(view, R.id.tv_check_app_update_message, "field 'message'", TextView.class);
        checkAppupdateActivity.pbLoader = (ProgressBar) c.c(view, R.id.pb_paging_loader, "field 'pbLoader'", ProgressBar.class);
        checkAppupdateActivity.nested_checkupdate = (NestedScrollView) c.c(view, R.id.nested_checkupdate, "field 'nested_checkupdate'", NestedScrollView.class);
        checkAppupdateActivity.ll_marginLayout = (LinearLayout) c.c(view, R.id.ll_marginLayout, "field 'll_marginLayout'", LinearLayout.class);
        View viewB = c.b(view, R.id.btn_later, "field 'btn_later' and method 'onclickView'");
        checkAppupdateActivity.btn_later = (Button) c.a(viewB, R.id.btn_later, "field 'btn_later'", Button.class);
        this.f25441c = viewB;
        viewB.setOnClickListener(new a(checkAppupdateActivity));
        View viewB2 = c.b(view, R.id.btn_update, "field 'btn_update' and method 'onclickView'");
        checkAppupdateActivity.btn_update = (Button) c.a(viewB2, R.id.btn_update, "field 'btn_update'", Button.class);
        this.f25442d = viewB2;
        viewB2.setOnClickListener(new b(checkAppupdateActivity));
        checkAppupdateActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        CheckAppupdateActivity checkAppupdateActivity = this.f25440b;
        if (checkAppupdateActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25440b = null;
        checkAppupdateActivity.date = null;
        checkAppupdateActivity.time = null;
        checkAppupdateActivity.title = null;
        checkAppupdateActivity.message = null;
        checkAppupdateActivity.pbLoader = null;
        checkAppupdateActivity.nested_checkupdate = null;
        checkAppupdateActivity.ll_marginLayout = null;
        checkAppupdateActivity.btn_later = null;
        checkAppupdateActivity.btn_update = null;
        checkAppupdateActivity.logo = null;
        this.f25441c.setOnClickListener(null);
        this.f25441c = null;
        this.f25442d.setOnClickListener(null);
        this.f25442d = null;
    }
}
