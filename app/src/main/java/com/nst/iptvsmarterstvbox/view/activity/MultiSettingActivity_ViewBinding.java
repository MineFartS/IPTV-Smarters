package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class MultiSettingActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MultiSettingActivity f25877b;

    public MultiSettingActivity_ViewBinding(MultiSettingActivity multiSettingActivity, View view) {
        this.f25877b = multiSettingActivity;
        multiSettingActivity.btn_multi = (Button) c.c(view, R.id.btn_multi, "field 'btn_multi'", Button.class);
        multiSettingActivity.save = (Button) c.c(view, R.id.save, "field 'save'", Button.class);
        multiSettingActivity.back = (Button) c.c(view, R.id.back, "field 'back'", Button.class);
        multiSettingActivity.showPopup = (CheckBox) c.c(view, R.id.show_popup, "field 'showPopup'", CheckBox.class);
        multiSettingActivity.screen_pic = (ImageView) c.c(view, R.id.screen_pic, "field 'screen_pic'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        MultiSettingActivity multiSettingActivity = this.f25877b;
        if (multiSettingActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25877b = null;
        multiSettingActivity.btn_multi = null;
        multiSettingActivity.save = null;
        multiSettingActivity.back = null;
        multiSettingActivity.showPopup = null;
        multiSettingActivity.screen_pic = null;
    }
}
