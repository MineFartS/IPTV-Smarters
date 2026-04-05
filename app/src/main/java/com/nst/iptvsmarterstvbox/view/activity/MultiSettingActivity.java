package com.nst.iptvsmarterstvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.i.q.m;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class MultiSettingActivity extends a.b.k.c {

    @BindView
    public Button back;

    @BindView
    public Button btn_multi;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f25851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f25852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f25853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f25854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f25855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f25856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f25857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow f25858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.k.d.a.a f25859l;

    @BindView
    public Button save;

    @BindView
    public ImageView screen_pic;

    @BindView
    public CheckBox showPopup;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.C0(multiSettingActivity.f25851d);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiSettingActivity.this.D0();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiSettingActivity.this.onBackPressed();
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f25863b;

        public d(Context context) {
            this.f25863b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.Y("default", this.f25863b);
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.screen_pic.setImageDrawable(multiSettingActivity.getResources().getDrawable(R.drawable.default_));
            MultiSettingActivity.this.f25858k.dismiss();
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f25865b;

        public e(Context context) {
            this.f25865b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.Y("screen1", this.f25865b);
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.screen_pic.setImageDrawable(multiSettingActivity.getResources().getDrawable(R.drawable.screen1));
            MultiSettingActivity.this.f25858k.dismiss();
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f25867b;

        public f(Context context) {
            this.f25867b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.Y("screen2", this.f25867b);
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.screen_pic.setImageDrawable(multiSettingActivity.getResources().getDrawable(R.drawable.screen2));
            MultiSettingActivity.this.f25858k.dismiss();
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f25869b;

        public g(Context context) {
            this.f25869b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.Y("screen3", this.f25869b);
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.screen_pic.setImageDrawable(multiSettingActivity.getResources().getDrawable(R.drawable.screen3));
            MultiSettingActivity.this.f25858k.dismiss();
        }
    }

    public class h implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f25871b;

        public h(Context context) {
            this.f25871b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.Y("screen4", this.f25871b);
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.screen_pic.setImageDrawable(multiSettingActivity.getResources().getDrawable(R.drawable.screen4));
            MultiSettingActivity.this.f25858k.dismiss();
        }
    }

    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f25873b;

        public i(Context context) {
            this.f25873b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.Y("screen5", this.f25873b);
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.screen_pic.setImageDrawable(multiSettingActivity.getResources().getDrawable(R.drawable.screen5));
            MultiSettingActivity.this.f25858k.dismiss();
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f25875b;

        public j(View view) {
            this.f25875b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25875b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25875b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25875b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            int i2;
            if (!z) {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                if ((this.f25875b.getTag() == null || !this.f25875b.getTag().equals("1")) && ((this.f25875b.getTag() == null || !this.f25875b.getTag().equals("2")) && (this.f25875b.getTag() == null || !this.f25875b.getTag().equals("3")))) {
                    return;
                }
                this.f25875b.setBackgroundResource(R.drawable.black_button_dark);
                return;
            }
            f2 = z ? 1.09f : 1.0f;
            if (this.f25875b.getTag() != null && this.f25875b.getTag().equals("1")) {
                view2 = this.f25875b;
                i2 = R.drawable.blue_btn_effect;
            } else if (this.f25875b.getTag() != null && this.f25875b.getTag().equals("2")) {
                view2 = this.f25875b;
                i2 = R.drawable.back_btn_effect;
            } else {
                if (this.f25875b.getTag() == null || !this.f25875b.getTag().equals("3")) {
                    return;
                }
                view2 = this.f25875b;
                i2 = R.drawable.logout_btn_effect;
            }
            view2.setBackgroundResource(i2);
            b(f2);
            c(f2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B0() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.MultiSettingActivity.B0():void");
    }

    @SuppressLint({"ResourceType"})
    public final void C0(Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0) ? R.layout.screen_selector_popup_tv : R.layout.screen_selector_popup, (LinearLayout) findViewById(R.id.screenPopup));
        this.f25852e = (ImageView) viewInflate.findViewById(R.id.deafult);
        this.f25853f = (ImageView) viewInflate.findViewById(R.id.screen1);
        this.f25854g = (ImageView) viewInflate.findViewById(R.id.screen2);
        this.f25855h = (ImageView) viewInflate.findViewById(R.id.screen3);
        this.f25856i = (ImageView) viewInflate.findViewById(R.id.screen4);
        this.f25857j = (ImageView) viewInflate.findViewById(R.id.screen5);
        PopupWindow popupWindow = new PopupWindow(context);
        this.f25858k = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f25858k.setWidth(-1);
        this.f25858k.setHeight(-1);
        this.f25858k.setFocusable(true);
        this.f25858k.showAtLocation(viewInflate, 0, 0, 0);
        this.f25852e.setOnClickListener(new d(context));
        this.f25853f.setOnClickListener(new e(context));
        this.f25854g.setOnClickListener(new f(context));
        this.f25855h.setOnClickListener(new g(context));
        this.f25856i.setOnClickListener(new h(context));
        this.f25857j.setOnClickListener(new i(context));
    }

    public final void D0() {
        Boolean bool = this.showPopup.isChecked() ? Boolean.TRUE : Boolean.FALSE;
        m.k0(bool, this.f25851d);
        m.c0(bool, this.f25851d);
        Toast.makeText(this.f25851d, getResources().getString(R.string.player_setting_save), 0).show();
        onBackPressed();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f25851d = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f25851d);
        this.f25859l = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_multi_setting_new_tv : R.layout.activity_multi_setting_new);
        ButterKnife.a(this);
        B0();
    }
}
