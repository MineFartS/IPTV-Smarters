package minefarts.iptvsmarters.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.h.n.e;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ScreenTypeSettingsActivity extends a.b.k.c implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChanges;

    @BindView
    public Button btnBackPlayerselection;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f26233d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.h.a.k.d.a.a f26234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f26235f = null;

    @BindView
    public ImageView logo;

    @BindView
    public RadioButton rb_mobile;

    @BindView
    public RadioButton rb_tv;

    @BindView
    public RadioGroup rg_mobile_tv;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.b(ScreenTypeSettingsActivity.this.f26233d);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = e.C(ScreenTypeSettingsActivity.this.f26233d);
                String strQ = e.q(string);
                TextView textView = ScreenTypeSettingsActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = ScreenTypeSettingsActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ScreenTypeSettingsActivity.this.A0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class d implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26239b;

        public d(View view) {
            this.f26239b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26239b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26239b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            View view3;
            int i2;
            if (!z) {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                a(f2);
                b(f2);
                View view4 = this.f26239b;
                if ((view4 == null || view4.getTag() == null || !this.f26239b.getTag().equals("1")) && ((view2 = this.f26239b) == null || view2.getTag() == null || !this.f26239b.getTag().equals("2"))) {
                    return;
                }
                this.f26239b.setBackgroundResource(R.drawable.black_button_dark);
                return;
            }
            f2 = z ? 1.05f : 1.0f;
            View view5 = this.f26239b;
            if (view5 == null || view5.getTag() == null || !this.f26239b.getTag().equals("1")) {
                View view6 = this.f26239b;
                if (view6 == null || view6.getTag() == null || !this.f26239b.getTag().equals("2")) {
                    View view7 = this.f26239b;
                    if (view7 == null || view7.getTag() == null) {
                        return;
                    }
                    this.f26239b.setBackground(ScreenTypeSettingsActivity.this.getResources().getDrawable(R.drawable.selector_tracks_layout));
                    return;
                }
                a(f2);
                b(f2);
                view3 = this.f26239b;
                i2 = R.drawable.logout_btn_effect;
            } else {
                a(f2);
                b(f2);
                view3 = this.f26239b;
                i2 = R.drawable.back_btn_effect;
            }
            view3.setBackgroundResource(i2);
        }
    }

    public void A0() {
        runOnUiThread(new b());
    }

    public final void B0() {
        Button button = this.btSaveChanges;
        if (button != null) {
            button.setOnFocusChangeListener(new d(button));
            this.btSaveChanges.requestFocus();
            this.btSaveChanges.requestFocusFromTouch();
        }
        Button button2 = this.btnBackPlayerselection;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new d(button2));
        }
        RadioButton radioButton = this.rb_mobile;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new d(radioButton));
        }
        RadioButton radioButton2 = this.rb_tv;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new d(radioButton2));
        }
    }

    public final void C0() {
        RadioButton radioButton;
        c.h.a.k.d.a.a aVar;
        String str;
        if (this.f26234e.A().equals(BuildConfig.FLAVOR)) {
            if ((this.f26233d.getResources().getConfiguration().screenLayout & 15) == 3) {
                aVar = this.f26234e;
                str = c.h.a.h.n.a.s0;
            } else {
                aVar = this.f26234e;
                str = c.h.a.h.n.a.t0;
            }
            aVar.X(str);
        }
        String strA = this.f26234e.A();
        if (strA.equals(c.h.a.h.n.a.t0)) {
            radioButton = this.rb_mobile;
        } else if (!strA.equals(c.h.a.h.n.a.s0)) {
            return;
        } else {
            radioButton = this.rb_tv;
        }
        radioButton.setChecked(true);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.tv_header_title) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f26233d = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f26233d);
        this.f26234e = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_screen_type_settings_tv : R.layout.activity_screen_type_settings);
        ButterKnife.a(this);
        B0();
        z0();
        v0((Toolbar) findViewById(R.id.toolbar));
        getWindow().setFlags(1024, 1024);
        C0();
        Thread thread = this.f26235f;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new c());
            this.f26235f = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new a());
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f26235f;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f26235f.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f26235f;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new c());
            this.f26235f = thread2;
            thread2.start();
        }
        e.g(this.f26233d);
    }

    @OnClick
    public void onViewClicked(View view) {
        c.h.a.k.d.a.a aVar;
        String str;
        int id = view.getId();
        if (id != R.id.bt_save_changes) {
            if (id != R.id.btn_back_playerselection) {
                return;
            }
            finish();
            return;
        }
        RadioButton radioButton = (RadioButton) findViewById(this.rg_mobile_tv.getCheckedRadioButtonId());
        if (!radioButton.getTag().toString().equals("Mobile")) {
            if (radioButton.getTag().toString().equals("TV")) {
                aVar = this.f26234e;
                str = c.h.a.h.n.a.s0;
            }
            Toast.makeText(this, getResources().getString(R.string.player_setting_save), 0).show();
        }
        aVar = this.f26234e;
        str = c.h.a.h.n.a.t0;
        aVar.X(str);
        Toast.makeText(this, getResources().getString(R.string.player_setting_save), 0).show();
    }

    public final void z0() {
        Window window = getWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            window.clearFlags(67108864);
        }
        if (i2 >= 21) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (i2 >= 21) {
            window.setStatusBarColor(a.i.i.b.d(this, R.color.colorPrimaryDark));
        }
    }
}
