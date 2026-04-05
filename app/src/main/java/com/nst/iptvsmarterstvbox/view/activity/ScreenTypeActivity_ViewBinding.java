package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class ScreenTypeActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScreenTypeActivity f26232b;

    public ScreenTypeActivity_ViewBinding(ScreenTypeActivity screenTypeActivity, View view) {
        this.f26232b = screenTypeActivity;
        screenTypeActivity.rg_mobile_tv = (RadioGroup) c.c(view, R.id.rg_mobile_tv, "field 'rg_mobile_tv'", RadioGroup.class);
        screenTypeActivity.rb_mobile = (RadioButton) c.c(view, R.id.rb_mobile, "field 'rb_mobile'", RadioButton.class);
        screenTypeActivity.rb_tv = (RadioButton) c.c(view, R.id.rb_tv, "field 'rb_tv'", RadioButton.class);
        screenTypeActivity.btn_save = (TextView) c.c(view, R.id.btn_save, "field 'btn_save'", TextView.class);
        screenTypeActivity.tv_device_type_is = (TextView) c.c(view, R.id.tv_device_type_is, "field 'tv_device_type_is'", TextView.class);
        screenTypeActivity.ll_yes_button_main_layout = (LinearLayout) c.c(view, R.id.ll_yes_button_main_layout, "field 'll_yes_button_main_layout'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ScreenTypeActivity screenTypeActivity = this.f26232b;
        if (screenTypeActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26232b = null;
        screenTypeActivity.rg_mobile_tv = null;
        screenTypeActivity.rb_mobile = null;
        screenTypeActivity.rb_tv = null;
        screenTypeActivity.btn_save = null;
        screenTypeActivity.tv_device_type_is = null;
        screenTypeActivity.ll_yes_button_main_layout = null;
    }
}
