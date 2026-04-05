package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.view.View;
import android.widget.RelativeLayout;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class FreeTrailActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FreeTrailActivity f24726b;

    public FreeTrailActivity_ViewBinding(FreeTrailActivity freeTrailActivity, View view) {
        this.f24726b = freeTrailActivity;
        freeTrailActivity.rl_email = (RelativeLayout) c.c(view, R.id.rl_email, "field 'rl_email'", RelativeLayout.class);
        freeTrailActivity.rl_username = (RelativeLayout) c.c(view, R.id.rl_username, "field 'rl_username'", RelativeLayout.class);
        freeTrailActivity.rl_password = (RelativeLayout) c.c(view, R.id.rl_password, "field 'rl_password'", RelativeLayout.class);
        freeTrailActivity.rl_bt_submit = (RelativeLayout) c.c(view, R.id.rl_bt_submit, "field 'rl_bt_submit'", RelativeLayout.class);
        freeTrailActivity.rl_confirmpassword = (RelativeLayout) c.c(view, R.id.rl_confirmpassword, "field 'rl_confirmpassword'", RelativeLayout.class);
        freeTrailActivity.rl_already_register = (RelativeLayout) c.c(view, R.id.rl_already_register, "field 'rl_already_register'", RelativeLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        FreeTrailActivity freeTrailActivity = this.f24726b;
        if (freeTrailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24726b = null;
        freeTrailActivity.rl_email = null;
        freeTrailActivity.rl_username = null;
        freeTrailActivity.rl_password = null;
        freeTrailActivity.rl_bt_submit = null;
        freeTrailActivity.rl_confirmpassword = null;
        freeTrailActivity.rl_already_register = null;
    }
}
