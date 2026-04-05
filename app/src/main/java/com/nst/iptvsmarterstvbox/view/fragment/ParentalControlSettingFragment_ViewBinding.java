package com.nst.iptvsmarterstvbox.view.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import b.c.b;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlSettingFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParentalControlSettingFragment f29022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f29023c;

    public class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ParentalControlSettingFragment f29024d;

        public a(ParentalControlSettingFragment parentalControlSettingFragment) {
            this.f29024d = parentalControlSettingFragment;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f29024d.onViewClicked();
        }
    }

    public ParentalControlSettingFragment_ViewBinding(ParentalControlSettingFragment parentalControlSettingFragment, View view) {
        this.f29022b = parentalControlSettingFragment;
        parentalControlSettingFragment.tvOldPassword = (EditText) c.c(view, R.id.tv_old_password, "field 'tvOldPassword'", EditText.class);
        parentalControlSettingFragment.tvNewPassword = (EditText) c.c(view, R.id.tv_new_password, "field 'tvNewPassword'", EditText.class);
        parentalControlSettingFragment.tvConfirmPassword = (EditText) c.c(view, R.id.tv_confirm_password, "field 'tvConfirmPassword'", EditText.class);
        View viewB = c.b(view, R.id.bt_save_password, "field 'btSavePassword' and method 'onViewClicked'");
        parentalControlSettingFragment.btSavePassword = (Button) c.a(viewB, R.id.bt_save_password, "field 'btSavePassword'", Button.class);
        this.f29023c = viewB;
        viewB.setOnClickListener(new a(parentalControlSettingFragment));
    }

    @Override // butterknife.Unbinder
    public void a() {
        ParentalControlSettingFragment parentalControlSettingFragment = this.f29022b;
        if (parentalControlSettingFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29022b = null;
        parentalControlSettingFragment.tvOldPassword = null;
        parentalControlSettingFragment.tvNewPassword = null;
        parentalControlSettingFragment.tvConfirmPassword = null;
        parentalControlSettingFragment.btSavePassword = null;
        this.f29023c.setOnClickListener(null);
        this.f29023c = null;
    }
}
