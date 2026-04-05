package minefarts.iptvsmarters.view.activity;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.vpn.activities.ProfileActivity;
import java.util.ArrayList;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SettingsActivity extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static SharedPreferences f26549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c.h.a.k.d.a.a f26550e;

    @BindView
    public CardView cardAppUpdate;

    @BindView
    public CardView cardRateus;

    @BindView
    public CardView card_backup_restore;

    @BindView
    public CardView card_screenType;

    @BindView
    public CardView cvExteranlPlayers;

    @BindView
    public CardView cv_vpn;

    @BindView
    public CardView cvplayersettingscard;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f26551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f26552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.i.q.f f26553h;

    @BindView
    public ImageView iv_Rateus;

    @BindView
    public ImageView iv_automation;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public ImageView iv_backup_restore;

    @BindView
    public ImageView iv_epg_shift;

    @BindView
    public ImageView iv_external_player;

    @BindView
    public ImageView iv_general_settings;

    @BindView
    public ImageView iv_multi_inner;

    @BindView
    public ImageView iv_parental;

    @BindView
    public ImageView iv_player_selection;

    @BindView
    public ImageView iv_player_settings;

    @BindView
    public ImageView iv_screenType;

    @BindView
    public ImageView iv_speed_test;

    @BindView
    public ImageView iv_stream_format;

    @BindView
    public ImageView iv_time_format;

    @BindView
    public ImageView iv_vpn;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow f26556k;

    @BindView
    public LinearLayout llAppUpdate;

    @BindView
    public LinearLayout llExternalPlayer;

    @BindView
    public LinearLayout llPlayer;

    @BindView
    public LinearLayout ll_Rateus;

    @BindView
    public LinearLayout ll_backup_restore;

    @BindView
    public LinearLayout ll_screenType;

    @BindView
    public LinearLayout ll_vpn;

    @BindView
    public ImageView logo;

    @BindView
    public LinearLayout multi_inner;

    @BindView
    public CardView multiscreen;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f26559n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f26560o;

    @BindView
    public LinearLayout rlAutomation;

    @BindView
    public CardView rlAutomationCard;

    @BindView
    public LinearLayout rlEPGShift;

    @BindView
    public CardView rlEPGShiftCard;

    @BindView
    public LinearLayout rlGeneralSettings;

    @BindView
    public CardView rlGeneralSettingsCard;

    @BindView
    public LinearLayout rlParental;

    @BindView
    public CardView rlParentalCard;

    @BindView
    public CardView rlPlayerCard;

    @BindView
    public LinearLayout rlPlayerSettings;

    @BindView
    public CardView rlStreamCard;

    @BindView
    public LinearLayout rlStreamFormat;

    @BindView
    public CardView rlTimeCard;

    @BindView
    public LinearLayout rlTimeFormat;

    @BindView
    public LinearLayout speed_test;

    @BindView
    public CardView speedtest;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.b f26554i = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.b f26555j = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f26557l = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f26558m = BuildConfig.FLAVOR;
    public Thread p = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SettingsActivity.this.f26556k.dismiss();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f26562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SettingsActivity f26563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EditText f26564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String[] f26565e;

        public b(String str, SettingsActivity settingsActivity, EditText editText, String[] strArr) {
            this.f26562b = str;
            this.f26563c = settingsActivity;
            this.f26564d = editText;
            this.f26565e = strArr;
        }

        public final boolean a(String str) {
            this.f26565e[0] = String.valueOf(this.f26564d.getText());
            String[] strArr = this.f26565e;
            return (strArr[0] == null || strArr[0].equals(BuildConfig.FLAVOR) || this.f26565e[0].isEmpty() || str == null || str.isEmpty() || str.equals(BuildConfig.FLAVOR) || !this.f26565e[0].equals(str)) ? false : true;
        }

        public final boolean b() {
            this.f26565e[0] = String.valueOf(this.f26564d.getText());
            String[] strArr = this.f26565e;
            if (strArr == null || !strArr[0].equals(BuildConfig.FLAVOR)) {
                String[] strArr2 = this.f26565e;
                return (strArr2 == null || strArr2[0].equals(BuildConfig.FLAVOR)) ? false : true;
            }
            Toast.makeText(this.f26563c, SettingsActivity.this.getResources().getString(R.string.enter_password_error), 1).show();
            return false;
        }

        public final void c(boolean z) {
            if (z) {
                SettingsActivity.this.f26556k.dismiss();
                d();
            } else {
                SettingsActivity settingsActivity = this.f26563c;
                if (settingsActivity != null) {
                    Toast.makeText(settingsActivity, SettingsActivity.this.getResources().getString(R.string.parental_invalid_password), 1).show();
                }
                this.f26564d.getText().clear();
            }
        }

        public final void d() {
            SettingsActivity.this.startActivity(new Intent(SettingsActivity.this, (Class<?>) ParentalControlActivitity.class));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b()) {
                c(a(this.f26562b));
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SettingsActivity.this.f26556k.dismiss();
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f26568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EditText f26569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String[] f26570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ EditText f26571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Activity f26572f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f26573g;

        public d(String[] strArr, EditText editText, String[] strArr2, EditText editText2, Activity activity, String str) {
            this.f26568b = strArr;
            this.f26569c = editText;
            this.f26570d = strArr2;
            this.f26571e = editText2;
            this.f26572f = activity;
            this.f26573g = str;
        }

        public final boolean a() {
            String[] strArr;
            this.f26568b[0] = String.valueOf(this.f26569c.getText());
            this.f26570d[0] = String.valueOf(this.f26571e.getText());
            String[] strArr2 = this.f26568b;
            return (strArr2 == null || strArr2[0].equals(BuildConfig.FLAVOR) || (strArr = this.f26570d) == null || strArr[0].equals(BuildConfig.FLAVOR) || !this.f26568b[0].equals(this.f26570d[0])) ? false : true;
        }

        public final boolean b() {
            String[] strArr;
            Activity activity;
            Resources resources;
            int i2;
            this.f26568b[0] = String.valueOf(this.f26569c.getText());
            this.f26570d[0] = String.valueOf(this.f26571e.getText());
            String[] strArr2 = this.f26568b;
            if (strArr2 == null || !strArr2[0].equals(BuildConfig.FLAVOR)) {
                String[] strArr3 = this.f26568b;
                if (strArr3 == null || strArr3[0].equals(BuildConfig.FLAVOR) || (strArr = this.f26570d) == null || !strArr[0].equals(BuildConfig.FLAVOR)) {
                    String[] strArr4 = this.f26568b;
                    return (strArr4 == null || this.f26570d == null || strArr4[0].equals(BuildConfig.FLAVOR) || this.f26570d[0].equals(BuildConfig.FLAVOR)) ? false : true;
                }
                activity = this.f26572f;
                resources = SettingsActivity.this.getResources();
                i2 = R.string.parental_confirm_password;
            } else {
                activity = this.f26572f;
                resources = SettingsActivity.this.getResources();
                i2 = R.string.enter_password_error;
            }
            Toast.makeText(activity, resources.getString(i2), 1).show();
            return false;
        }

        public final void c(boolean z) {
            if (!z) {
                Activity activity = this.f26572f;
                if (activity != null) {
                    Toast.makeText(activity, SettingsActivity.this.getResources().getString(R.string.parental_password_confirm_password_match_error), 1).show();
                }
                this.f26569c.getText().clear();
                this.f26571e.getText().clear();
                return;
            }
            c.h.a.i.q.h hVar = new c.h.a.i.q.h();
            hVar.g(String.valueOf(this.f26568b[0]));
            hVar.e(this.f26573g);
            hVar.f(c.h.a.i.q.m.z(this.f26572f));
            if (SettingsActivity.this.f26553h != null) {
                SettingsActivity.this.f26553h.w(hVar);
                SettingsActivity.this.f26556k.dismiss();
                d();
            }
        }

        public final void d() {
            SettingsActivity.this.startActivity(new Intent(this.f26572f, (Class<?>) ParentalControlActivitity.class));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b()) {
                c(a());
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(SettingsActivity.this.f26551f);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SettingsActivity.this.onBackPressed();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(SettingsActivity.this.f26551f);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = SettingsActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = SettingsActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(SettingsActivity.this.f26551f);
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(SettingsActivity.this.f26551f);
        }
    }

    public class k implements DialogInterface.OnClickListener {
        public k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class l implements DialogInterface.OnClickListener {
        public l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    SettingsActivity.this.B0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class o implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26585b;

        public o(View view) {
            this.f26585b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26585b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26585b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26585b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            Object obj;
            float f2;
            ImageView imageView;
            int i2;
            View view2;
            View view3;
            if (z) {
                float f3 = z ? 1.12f : 1.0f;
                b(f3);
                c(f3);
                View view4 = this.f26585b;
                if (view4 != null && view4.getTag() != null && this.f26585b.getTag().equals("2")) {
                    SettingsActivity.this.rlParental.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_parental.setImageResource(R.drawable.settings_parental_control_focus);
                }
                View view5 = this.f26585b;
                if (view5 != null && view5.getTag() != null && this.f26585b.getTag().equals("3")) {
                    SettingsActivity.this.rlEPGShift.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_epg_shift.setImageResource(R.drawable.settings_epg_focus);
                }
                if (!c.h.a.i.q.m.f(SettingsActivity.this.f26551f).equals("m3u") && (view3 = this.f26585b) != null && view3.getTag() != null && this.f26585b.getTag().equals("5")) {
                    SettingsActivity.this.rlStreamFormat.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_stream_format.setImageResource(R.drawable.settings_stream_format_focus);
                }
                View view6 = this.f26585b;
                if (view6 != null && view6.getTag() != null && this.f26585b.getTag().equals("6")) {
                    SettingsActivity.this.rlTimeFormat.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_time_format.setImageResource(R.drawable.settings_time_format_focus);
                }
                View view7 = this.f26585b;
                if (view7 != null && view7.getTag() != null && this.f26585b.getTag().equals("8")) {
                    SettingsActivity.this.f26559n.setBackgroundResource(R.drawable.back_btn_effect);
                }
                View view8 = this.f26585b;
                if (view8 != null && view8.getTag() != null && this.f26585b.getTag().equals("9")) {
                    SettingsActivity.this.f26560o.setBackgroundResource(R.drawable.logout_btn_effect);
                }
                View view9 = this.f26585b;
                if (view9 != null && view9.getTag() != null && this.f26585b.getTag().equals("10")) {
                    SettingsActivity.this.rlAutomation.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_automation.setImageResource(R.drawable.settings_automation_focus);
                }
                View view10 = this.f26585b;
                if (view10 != null && view10.getTag() != null && this.f26585b.getTag().equals("11")) {
                    SettingsActivity.this.rlGeneralSettings.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_general_settings.setImageResource(R.drawable.settings_settings_focus);
                }
                View view11 = this.f26585b;
                if (view11 != null && view11.getTag() != null && this.f26585b.getTag().equals("12")) {
                    SettingsActivity.this.llPlayer.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_player_selection.setImageResource(R.drawable.settings_player_section_focus);
                }
                View view12 = this.f26585b;
                if (view12 != null && view12.getTag() != null && this.f26585b.getTag().equals("13")) {
                    SettingsActivity.this.rlPlayerSettings.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_player_settings.setImageResource(R.drawable.settings_player_settings_focus);
                }
                View view13 = this.f26585b;
                if (view13 != null && view13.getTag() != null && this.f26585b.getTag().equals("14")) {
                    SettingsActivity.this.ll_Rateus.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_Rateus.setImageResource(R.drawable.settings_rating_focus);
                }
                View view14 = this.f26585b;
                if (view14 != null && view14.getTag() != null && this.f26585b.getTag().equals("15")) {
                    SettingsActivity.this.llAppUpdate.setBackgroundResource(R.drawable.settings_box_focus);
                }
                View view15 = this.f26585b;
                if (view15 != null && view15.getTag() != null && this.f26585b.getTag().equals("16")) {
                    SettingsActivity.this.llExternalPlayer.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_external_player.setImageResource(R.drawable.settings_external_player_focus);
                }
                View view16 = this.f26585b;
                if (view16 != null && view16.getTag() != null && this.f26585b.getTag().equals("17")) {
                    SettingsActivity.this.ll_vpn.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_vpn.setImageResource(R.drawable.settings_vpn_focus);
                }
                View view17 = this.f26585b;
                if (view17 != null && view17.getTag() != null && this.f26585b.getTag().equals("18")) {
                    SettingsActivity.this.multi_inner.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_multi_inner.setImageResource(R.drawable.settings_multiscreen_focus);
                }
                View view18 = this.f26585b;
                if (view18 != null && view18.getTag() != null && this.f26585b.getTag().equals("19")) {
                    SettingsActivity.this.speed_test.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_speed_test.setImageResource(R.drawable.settings_speed_test_focus);
                }
                View view19 = this.f26585b;
                if (view19 != null && view19.getTag() != null && this.f26585b.getTag().equals("20")) {
                    SettingsActivity.this.ll_screenType.setBackgroundResource(R.drawable.settings_box_focus);
                    SettingsActivity.this.iv_screenType.setImageResource(R.drawable.settings_switch_focus);
                }
                View view20 = this.f26585b;
                if (view20 == null || view20.getTag() == null || !this.f26585b.getTag().equals("21")) {
                    return;
                }
                SettingsActivity.this.ll_backup_restore.setBackgroundResource(R.drawable.settings_box_focus);
                imageView = SettingsActivity.this.iv_backup_restore;
                i2 = R.drawable.backup_restore_focus;
            } else {
                if (z) {
                    return;
                }
                if (z) {
                    obj = "16";
                    f2 = 1.09f;
                } else {
                    obj = "16";
                    f2 = 1.0f;
                }
                b(f2);
                c(f2);
                a(z);
                View view21 = this.f26585b;
                if (view21 != null && view21.getTag() != null && this.f26585b.getTag().equals("2")) {
                    SettingsActivity.this.rlParental.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_parental.setImageResource(R.drawable.settings_parental_control);
                }
                View view22 = this.f26585b;
                if (view22 != null && view22.getTag() != null && this.f26585b.getTag().equals("3")) {
                    SettingsActivity.this.rlEPGShift.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_epg_shift.setImageResource(R.drawable.settings_epg);
                }
                if (!c.h.a.i.q.m.f(SettingsActivity.this.f26551f).equals("m3u") && (view2 = this.f26585b) != null && view2.getTag() != null && this.f26585b.getTag().equals("5")) {
                    SettingsActivity.this.rlStreamFormat.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_stream_format.setImageResource(R.drawable.settings_stream_format);
                }
                View view23 = this.f26585b;
                if (view23 != null && view23.getTag() != null && this.f26585b.getTag().equals("6")) {
                    SettingsActivity.this.rlTimeFormat.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_time_format.setImageResource(R.drawable.settings_time_format);
                }
                View view24 = this.f26585b;
                if (view24 != null && view24.getTag() != null && this.f26585b.getTag().equals("8")) {
                    SettingsActivity.this.f26559n.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view25 = this.f26585b;
                if (view25 != null && view25.getTag() != null && this.f26585b.getTag().equals("9")) {
                    SettingsActivity.this.f26560o.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view26 = this.f26585b;
                if (view26 != null && view26.getTag() != null && this.f26585b.getTag().equals("10")) {
                    SettingsActivity.this.rlAutomation.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_automation.setImageResource(R.drawable.settings_automation);
                }
                View view27 = this.f26585b;
                if (view27 != null && view27.getTag() != null && this.f26585b.getTag().equals("11")) {
                    SettingsActivity.this.rlGeneralSettings.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_general_settings.setImageResource(R.drawable.settings_settings);
                }
                View view28 = this.f26585b;
                if (view28 != null && view28.getTag() != null && this.f26585b.getTag().equals("12")) {
                    SettingsActivity.this.llPlayer.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_player_selection.setImageResource(R.drawable.settings_player_section);
                }
                View view29 = this.f26585b;
                if (view29 != null && view29.getTag() != null && this.f26585b.getTag().equals("13")) {
                    SettingsActivity.this.rlPlayerSettings.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_player_settings.setImageResource(R.drawable.settings_player_settings);
                }
                View view30 = this.f26585b;
                if (view30 != null && view30.getTag() != null && this.f26585b.getTag().equals("14")) {
                    SettingsActivity.this.ll_Rateus.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_Rateus.setImageResource(R.drawable.settings_rating);
                }
                View view31 = this.f26585b;
                if (view31 != null && view31.getTag() != null && this.f26585b.getTag().equals("15")) {
                    SettingsActivity.this.llAppUpdate.setBackgroundResource(R.drawable.ripple_white);
                }
                View view32 = this.f26585b;
                if (view32 != null && view32.getTag() != null && this.f26585b.getTag().equals(obj)) {
                    SettingsActivity.this.llExternalPlayer.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_external_player.setImageResource(R.drawable.settings_external_player);
                }
                View view33 = this.f26585b;
                if (view33 != null && view33.getTag() != null && this.f26585b.getTag().equals("17")) {
                    SettingsActivity.this.ll_vpn.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_vpn.setImageResource(R.drawable.settings_vpn);
                }
                View view34 = this.f26585b;
                if (view34 != null && view34.getTag() != null && this.f26585b.getTag().equals("18")) {
                    SettingsActivity.this.multi_inner.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_multi_inner.setImageResource(R.drawable.settings_multiscreen);
                }
                View view35 = this.f26585b;
                if (view35 != null && view35.getTag() != null && this.f26585b.getTag().equals("19")) {
                    SettingsActivity.this.speed_test.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_speed_test.setImageResource(R.drawable.settings_speed_test);
                }
                View view36 = this.f26585b;
                if (view36 != null && view36.getTag() != null && this.f26585b.getTag().equals("20")) {
                    SettingsActivity.this.ll_screenType.setBackgroundResource(R.drawable.ripple_white);
                    SettingsActivity.this.iv_screenType.setImageResource(R.drawable.settings_switch);
                }
                View view37 = this.f26585b;
                if (view37 == null || view37.getTag() == null || !this.f26585b.getTag().equals("21")) {
                    return;
                }
                SettingsActivity.this.ll_backup_restore.setBackgroundResource(R.drawable.ripple_white);
                imageView = SettingsActivity.this.iv_backup_restore;
                i2 = R.drawable.backup_restore;
            }
            imageView.setImageResource(i2);
        }
    }

    @SuppressLint({"InlinedApi"})
    public final void A0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT >= 21) {
            window.setStatusBarColor(a.i.i.b.d(this, R.color.colorPrimaryDark));
        }
    }

    public void B0() {
        runOnUiThread(new g());
    }

    @SuppressLint({"InlinedApi"})
    public void C0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public final void D0() {
        this.f26551f = this;
        this.f26553h = new c.h.a.i.q.f(this.f26551f);
        this.f26552g = getSharedPreferences("loginPrefs", 0);
    }

    public final void E0(SettingsActivity settingsActivity, int i2, String str, String str2, String str3) {
        View viewInflate = ((LayoutInflater) settingsActivity.getSystemService("layout_inflater")).inflate(f26550e.A().equals(c.h.a.h.n.a.s0) ? R.layout.view_password_verification_tv : R.layout.view_password_verification, (RelativeLayout) settingsActivity.findViewById(R.id.rl_password_verification));
        PopupWindow popupWindow = new PopupWindow(settingsActivity);
        this.f26556k = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f26556k.setWidth(-1);
        this.f26556k.setHeight(-1);
        this.f26556k.setFocusable(true);
        this.f26556k.showAtLocation(viewInflate, 17, 0, 0);
        this.f26559n = (Button) viewInflate.findViewById(R.id.bt_save_password);
        this.f26560o = (Button) viewInflate.findViewById(R.id.bt_close);
        Button button = this.f26559n;
        if (button != null) {
            button.setOnFocusChangeListener(new o(button));
        }
        Button button2 = this.f26560o;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new o(button2));
        }
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_password);
        editText.requestFocus();
        this.f26560o.setOnClickListener(new a());
        this.f26559n.setOnClickListener(new b(str3, settingsActivity, editText, new String[1]));
    }

    @SuppressLint({"RtlHardcoded"})
    public final void F0(Activity activity, int i2, String str) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(R.id.rl_password_prompt);
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            View viewInflate = f26550e.A().equals(c.h.a.h.n.a.s0) ? layoutInflater.inflate(R.layout.view_password_prompt_tv, relativeLayout) : layoutInflater.inflate(R.layout.view_password_prompt, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f26556k = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f26556k.setWidth(-1);
            this.f26556k.setHeight(-1);
            this.f26556k.setFocusable(true);
            this.f26556k.showAtLocation(viewInflate, 17, 0, 0);
            this.f26559n = (Button) viewInflate.findViewById(R.id.bt_save_password);
            this.f26560o = (Button) viewInflate.findViewById(R.id.bt_close);
            Button button = this.f26559n;
            if (button != null) {
                button.setOnFocusChangeListener(new o(button));
            }
            Button button2 = this.f26560o;
            if (button2 != null) {
                button2.setOnFocusChangeListener(new o(button2));
            }
            EditText editText = (EditText) viewInflate.findViewById(R.id.tv_password);
            EditText editText2 = (EditText) viewInflate.findViewById(R.id.tv_confirm_password);
            if (activity.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
                editText2.setGravity(21);
            }
            this.f26560o.setOnClickListener(new c());
            this.f26559n.setOnClickListener(new d(new String[1], editText, new String[1], editText2, activity, str));
        } catch (NullPointerException | Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.tv_header_title) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f26551f = this;
        C0();
        super.onCreate(bundle);
        f26550e = new c.h.a.k.d.a.a(this.f26551f);
        if (c.h.a.h.n.a.M.booleanValue() && !f26550e.m().booleanValue()) {
            finish();
            startActivity(new Intent(this, (Class<?>) APPInPurchaseActivity.class));
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        }
        String strA = f26550e.A();
        setContentView(c.h.a.i.q.m.f(this.f26551f).equals("m3u") ? strA.equals(c.h.a.h.n.a.s0) ? R.layout.activity_settings_m3u_tv : R.layout.activity_settings_m3u : strA.equals(c.h.a.h.n.a.s0) ? R.layout.activity_settings_tv : R.layout.activity_settings);
        ButterKnife.a(this);
        c.h.a.h.n.a.f17037a = false;
        c.h.a.i.q.m.e0("settings", this.f26551f);
        CardView cardView = this.cvExteranlPlayers;
        if (cardView != null) {
            cardView.setOnFocusChangeListener(new o(cardView));
        }
        CardView cardView2 = this.card_screenType;
        if (cardView2 != null) {
            cardView2.setOnFocusChangeListener(new o(cardView2));
        }
        CardView cardView3 = this.card_backup_restore;
        if (cardView3 != null) {
            cardView3.setOnFocusChangeListener(new o(cardView3));
        }
        CardView cardView4 = this.multiscreen;
        if (cardView4 != null) {
            cardView4.setOnFocusChangeListener(new o(cardView4));
        }
        CardView cardView5 = this.speedtest;
        if (cardView5 != null) {
            cardView5.setOnFocusChangeListener(new o(cardView5));
        }
        CardView cardView6 = this.rlPlayerCard;
        if (cardView6 != null) {
            cardView6.setOnFocusChangeListener(new o(cardView6));
        }
        CardView cardView7 = this.rlParentalCard;
        if (cardView7 != null) {
            cardView7.setOnFocusChangeListener(new o(cardView7));
        }
        CardView cardView8 = this.rlEPGShiftCard;
        if (cardView8 != null) {
            cardView8.setOnFocusChangeListener(new o(cardView8));
        }
        CardView cardView9 = this.rlStreamCard;
        if (cardView9 != null) {
            cardView9.setOnFocusChangeListener(new o(cardView9));
        }
        CardView cardView10 = this.rlTimeCard;
        if (cardView10 != null) {
            cardView10.setOnFocusChangeListener(new o(cardView10));
        }
        CardView cardView11 = this.rlAutomationCard;
        if (cardView11 != null) {
            cardView11.setOnFocusChangeListener(new o(cardView11));
        }
        CardView cardView12 = this.rlGeneralSettingsCard;
        if (cardView12 != null) {
            cardView12.setOnFocusChangeListener(new o(cardView12));
            if (strA.equals(c.h.a.h.n.a.s0)) {
                this.rlGeneralSettingsCard.requestFocus();
                this.rlGeneralSettingsCard.setFocusableInTouchMode(true);
            }
            this.rlGeneralSettingsCard.requestFocus();
        }
        CardView cardView13 = this.cv_vpn;
        cardView13.setOnFocusChangeListener(new o(cardView13));
        CardView cardView14 = this.cvplayersettingscard;
        if (cardView14 != null) {
            cardView14.setOnFocusChangeListener(new o(cardView14));
        }
        CardView cardView15 = this.cardAppUpdate;
        cardView15.setOnFocusChangeListener(new o(cardView15));
        CardView cardView16 = this.cardRateus;
        cardView16.setOnFocusChangeListener(new o(cardView16));
        boolean zI = c.h.a.i.q.m.i(this.f26551f);
        if (!zI) {
            new c.h.a.h.n.b(this).execute(new Void[0]);
        }
        if (zI) {
            this.cardRateus.setVisibility(0);
            this.cardAppUpdate.setVisibility(0);
            CardView cardView17 = this.cardAppUpdate;
            cardView17.setOnFocusChangeListener(new o(cardView17));
            CardView cardView18 = this.cardRateus;
            cardView18.setOnFocusChangeListener(new o(cardView18));
        }
        this.logo.setOnClickListener(new e());
        this.iv_back_button.setOnClickListener(new f());
        getWindow().setFlags(1024, 1024);
        A0();
        v0((Toolbar) findViewById(R.id.toolbar));
        D0();
        Thread thread = this.p;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new n());
            this.p = thread2;
            thread2.start();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_text_icon);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.toolbar.getChildCount(); i2++) {
            if (this.toolbar.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.toolbar.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout && (context = this.f26551f) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new i()).g(getResources().getString(R.string.no), new h()).n();
        }
        if (itemId == R.id.menu_load_channels_vod) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f26551f.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f26551f.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f26551f.getResources().getString(R.string.yes), new j());
            aVar.g(this.f26551f.getResources().getString(R.string.no), new k());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f26551f.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f26551f.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f26551f.getResources().getString(R.string.yes), new l());
            aVar2.g(this.f26551f.getResources().getString(R.string.no), new m());
            aVar2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.p;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.p.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        CardView cardView;
        C0();
        super.onResume();
        Thread thread = this.p;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new n());
            this.p = thread2;
            thread2.start();
        }
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        c.h.a.h.n.e.g(this.f26551f);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26552g = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26552g.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else {
            SharedPreferences sharedPreferences2 = getSharedPreferences("selectedPlayer", 0);
            this.f26552g = sharedPreferences2;
            if (!sharedPreferences2.getString("selectedPlayer", getResources().getString(R.string.ijk_player)).equals(getResources().getString(R.string.ijk_player)) ? (cardView = this.cvplayersettingscard) != null : (cardView = this.cvplayersettingscard) != null) {
                cardView.setVisibility(0);
            }
        }
        SharedPreferences sharedPreferences3 = getSharedPreferences("timeFormat", 0);
        f26549d = sharedPreferences3;
        sharedPreferences3.getString("timeFormat", c.h.a.h.n.a.m0);
    }

    @OnClick
    public void onViewClicked(View view) {
        Intent intent;
        Intent intent2;
        String str;
        String str2;
        switch (view.getId()) {
            case R.id.card_Rateus /* 2131427695 */:
            case R.id.ll_Rateus /* 2131428279 */:
                intent = new Intent(this, (Class<?>) RateUsActivity.class);
                startActivity(intent);
                return;
            case R.id.card_app_update /* 2131427696 */:
            case R.id.ll_app_update /* 2131428289 */:
                intent = new Intent(this, (Class<?>) CheckAppupdateActivity.class);
                startActivity(intent);
                return;
            case R.id.card_backup_restore /* 2131427697 */:
            case R.id.ll_backup_restore /* 2131428299 */:
                intent2 = new Intent(this, (Class<?>) BackupAndRestoreActivity.class);
                break;
            case R.id.card_screenType /* 2131427701 */:
            case R.id.ll_screenType /* 2131428458 */:
                intent2 = new Intent(this, (Class<?>) ScreenTypeSettingsActivity.class);
                break;
            case R.id.cv_external_players /* 2131427792 */:
            case R.id.ll_external_player /* 2131428369 */:
                intent2 = new Intent(this, (Class<?>) AddedExternalPlayerActivity.class);
                break;
            case R.id.cv_player_card_ /* 2131427793 */:
            case R.id.rl_player /* 2131428984 */:
                intent2 = new Intent(this, (Class<?>) PlayerSelectionActivity.class);
                break;
            case R.id.cv_player_settings /* 2131427794 */:
            case R.id.rl_player_settings /* 2131428986 */:
                intent2 = new Intent(this, (Class<?>) PlayerSettingsActivity.class);
                break;
            case R.id.cv_vpn /* 2131427796 */:
            case R.id.ll_vpn /* 2131428502 */:
                intent = new Intent(this, (Class<?>) ProfileActivity.class);
                intent.putExtra("typeid", "settings");
                startActivity(intent);
                return;
            case R.id.multi_inner /* 2131428697 */:
            case R.id.multiscreen /* 2131428699 */:
                intent = new Intent(this, (Class<?>) MultiSettingActivity.class);
                startActivity(intent);
                return;
            case R.id.rl_automation /* 2131428901 */:
            case R.id.rl_automation_card /* 2131428902 */:
                intent2 = new Intent(this, (Class<?>) AutomationActivity.class);
                break;
            case R.id.rl_epg_shift /* 2131428926 */:
            case R.id.rl_epg_shift_card /* 2131428927 */:
                intent2 = new Intent(this, (Class<?>) EPGSettingsActivity.class);
                break;
            case R.id.rl_general_settings /* 2131428934 */:
            case R.id.rl_general_settings_card /* 2131428935 */:
                intent = new Intent(this, (Class<?>) GeneralSettingsActivity.class);
                startActivity(intent);
                return;
            case R.id.rl_parental /* 2131428976 */:
            case R.id.rl_parental_card /* 2131428977 */:
                String string = getSharedPreferences("loginPrefs", 0).getString("username", BuildConfig.FLAVOR);
                c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.f26551f);
                this.f26553h = fVar;
                ArrayList<c.h.a.i.q.h> arrayListC1 = fVar.c1(c.h.a.i.q.m.z(this.f26551f));
                if (arrayListC1 != null) {
                    String strA = BuildConfig.FLAVOR;
                    String strC = strA;
                    for (c.h.a.i.q.h hVar : arrayListC1) {
                        if (hVar.a().equals(string) && !hVar.c().isEmpty()) {
                            strA = hVar.a();
                            strC = hVar.c();
                        }
                    }
                    str = strA;
                    str2 = strC;
                } else {
                    str = BuildConfig.FLAVOR;
                    str2 = str;
                }
                if (str != null && !str.equals(BuildConfig.FLAVOR) && !str.isEmpty()) {
                    E0(this, 100, string, str, str2);
                    return;
                } else {
                    if (string.isEmpty() || string.equals(BuildConfig.FLAVOR)) {
                        return;
                    }
                    F0(this, 100, string);
                    return;
                }
            case R.id.rl_stream_format /* 2131429004 */:
            case R.id.rl_stream_format_card /* 2131429005 */:
                intent2 = new Intent(this, (Class<?>) StreamFormatActivity.class);
                break;
            case R.id.rl_time_format /* 2131429011 */:
            case R.id.rl_time_format_card /* 2131429012 */:
                intent2 = new Intent(this, (Class<?>) TimeFormatActivity.class);
                break;
            case R.id.speed_test /* 2131429139 */:
            case R.id.speedtest /* 2131429140 */:
                intent = new Intent(this, (Class<?>) SpeedTestActivity.class);
                startActivity(intent);
                return;
            default:
                return;
        }
        startActivity(intent2);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C0();
    }
}
