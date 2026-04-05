package c.h.a.k.d.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.nst.iptvsmarterstvbox.R;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f17814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f17815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f17816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f17817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f17818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f17819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences f17820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences f17821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SharedPreferences f17822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SharedPreferences f17823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences.Editor f17824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SharedPreferences.Editor f17825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences.Editor f17826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f17827o;

    public a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f17813a = applicationContext;
        this.f17814b = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        this.f17815c = this.f17813a.getSharedPreferences("pref.using_opensl_es", 0);
        this.f17822j = this.f17813a.getSharedPreferences("pref.using_opengl", 0);
        SharedPreferences sharedPreferences = this.f17813a.getSharedPreferences("pref.using_media_codec", 0);
        this.f17823k = sharedPreferences;
        this.f17824l = sharedPreferences.edit();
        SharedPreferences sharedPreferences2 = this.f17813a.getSharedPreferences("auto_start", 0);
        this.f17818f = sharedPreferences2;
        this.f17825m = sharedPreferences2.edit();
        SharedPreferences sharedPreferences3 = this.f17813a.getSharedPreferences("pref.billing_p", 0);
        this.f17821i = sharedPreferences3;
        this.f17826n = sharedPreferences3.edit();
        this.f17816d = this.f17813a.getSharedPreferences("pref.using_infbuf", 0);
        this.f17817e = this.f17813a.getSharedPreferences("pref.using_sub_font_size", 0);
        this.f17818f = this.f17813a.getSharedPreferences("auto_start", 0);
        this.f17819g = this.f17813a.getSharedPreferences("automation_channels", 0);
        this.f17820h = this.f17813a.getSharedPreferences("automation_epg", 0);
        this.f17827o = this.f17813a.getSharedPreferences("loginPrefs", 0);
    }

    public String A() {
        try {
            return this.f17818f.getString("pref.screen_type", BuildConfig.FLAVOR);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean B() {
        return this.f17818f.getBoolean("show_epg_in_channels_list", c.h.a.h.n.a.i0);
    }

    public String C() {
        return this.f17827o.getString("serverTimeZone", c.h.a.h.n.a.g0);
    }

    public boolean D() {
        return this.f17823k.getString("pref.using_media_codec", c.h.a.h.n.a.d0).equals(this.f17813a.getResources().getString(R.string.hardware_decoder));
    }

    public boolean E() {
        return this.f17814b.getBoolean(this.f17813a.getString(R.string.pref_key_using_media_codec_auto_rotate), false);
    }

    public boolean F() {
        return this.f17814b.getBoolean(this.f17813a.getString(R.string.pref_key_using_mediadatasource), false);
    }

    public boolean G() {
        return this.f17815c.getString("pref.using_opensl_es", BuildConfig.FLAVOR).equals("checked");
    }

    public Boolean H() {
        return Boolean.valueOf(this.f17818f.getBoolean("full_epg", true));
    }

    public void I(Boolean bool) {
        SharedPreferences.Editor editor = this.f17825m;
        if (editor != null) {
            editor.putBoolean("subtitle_active", bool.booleanValue());
            this.f17825m.apply();
        }
    }

    public void J(boolean z) {
        try {
            SharedPreferences.Editor editor = this.f17825m;
            if (editor != null) {
                editor.putBoolean("auto_clear_cache", z);
            }
        } catch (Exception unused) {
        }
    }

    public void K(String str) {
        SharedPreferences.Editor editor = this.f17825m;
        if (editor != null) {
            editor.putString("autoplay_seconds", str);
            this.f17825m.apply();
        }
    }

    public void L(Boolean bool) {
        SharedPreferences.Editor editor = this.f17825m;
        if (editor != null) {
            editor.putBoolean("autoplay", bool.booleanValue());
            this.f17825m.apply();
        }
    }

    public void M(Boolean bool) {
        SharedPreferences.Editor editor = this.f17825m;
        if (editor != null) {
            editor.putBoolean("auto_start", bool.booleanValue());
            this.f17825m.apply();
        }
    }

    public void N(boolean z) {
        try {
            SharedPreferences.Editor editor = this.f17825m;
            if (editor != null) {
                editor.putBoolean("auto_play_channel_in_live", z);
            }
        } catch (Exception unused) {
        }
    }

    public void O(String str, String str2, int i2) {
        try {
            this.f17826n.putString("pref_billing_p_email", str);
            this.f17826n.putString("pref_billing_p_pass", str2);
            this.f17826n.putInt("pref_billing_p_id", i2);
            this.f17826n.apply();
        } catch (Exception unused) {
        }
    }

    public void P() {
        try {
            this.f17826n.putString("pref_billing_p_date", String.valueOf(System.currentTimeMillis()));
            this.f17826n.apply();
        } catch (Exception unused) {
        }
    }

    public void Q(Boolean bool) {
        try {
            this.f17826n.putBoolean("pref_billing_p_is_p", bool.booleanValue());
            this.f17826n.apply();
        } catch (Exception unused) {
        }
    }

    public void R(int i2) {
        try {
            this.f17825m.putInt("pref.brightness", i2);
            this.f17825m.apply();
        } catch (Exception unused) {
        }
    }

    public void S(boolean z) {
        try {
            SharedPreferences.Editor editor = this.f17825m;
            if (editor != null) {
                editor.putBoolean("show_epg_in_channels_list", z);
            }
        } catch (Exception unused) {
        }
    }

    public void T(Boolean bool) {
        try {
            this.f17826n.putBoolean("pref_billing_p_max_conn", bool.booleanValue());
            this.f17826n.apply();
        } catch (Exception unused) {
        }
    }

    public void U(String str) {
        this.f17824l.putString("pref.using_media_codec", str);
        this.f17824l.apply();
    }

    public void V(int i2) {
        try {
            this.f17825m.putInt("recently_added_limit", i2);
            this.f17825m.apply();
        } catch (Exception unused) {
        }
    }

    public void W(int i2) {
        SharedPreferences.Editor editor = this.f17825m;
        if (editor != null) {
            editor.putInt("recently_watched_limit_live", i2);
            this.f17825m.apply();
        }
    }

    public void X(String str) {
        try {
            this.f17825m.putString("pref.screen_type", str);
            this.f17825m.apply();
        } catch (Exception unused) {
        }
    }

    public void Y(Boolean bool) {
        SharedPreferences.Editor editor = this.f17825m;
        if (editor != null) {
            editor.putBoolean("full_epg", bool.booleanValue());
            this.f17825m.apply();
        }
    }

    public void a() {
        try {
            this.f17826n.clear().commit();
        } catch (Exception unused) {
        }
    }

    public Boolean b() {
        return Boolean.valueOf(this.f17818f.getBoolean("subtitle_active", true));
    }

    public boolean c() {
        return this.f17818f.getBoolean("auto_clear_cache", c.h.a.h.n.a.h0);
    }

    public String d() {
        return this.f17818f.getString("autoplay_seconds", c.h.a.h.n.a.b0);
    }

    public Boolean e() {
        return Boolean.valueOf(this.f17818f.getBoolean("autoplay", true));
    }

    public Boolean f() {
        return Boolean.valueOf(this.f17818f.getBoolean("auto_start", true));
    }

    public int g() {
        return this.f17819g.getInt("automation_channels_days", c.h.a.h.n.a.l0);
    }

    public int h() {
        return this.f17820h.getInt("automation_epg_days", c.h.a.h.n.a.p0);
    }

    public boolean i() {
        return this.f17818f.getBoolean("auto_play_channel_in_live", c.h.a.h.n.a.j0);
    }

    public String j() {
        try {
            return this.f17821i.getString("pref_billing_p_date", BuildConfig.FLAVOR);
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public String k() {
        try {
            return this.f17821i.getString("pref_billing_p_email", BuildConfig.FLAVOR);
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public int l() {
        try {
            return this.f17821i.getInt("pref_billing_p_id", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    public Boolean m() {
        try {
            return Boolean.valueOf(this.f17821i.getBoolean("pref_billing_p_is_p", false));
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public String n() {
        try {
            return this.f17821i.getString("pref_billing_p_pass", BuildConfig.FLAVOR);
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public int o() {
        try {
            return this.f17818f.getInt("pref.brightness", c.h.a.h.n.a.r0);
        } catch (Exception unused) {
            return c.h.a.h.n.a.r0;
        }
    }

    public boolean p() {
        return this.f17814b.getBoolean(this.f17813a.getString(R.string.pref_key_enable_background_play), false);
    }

    public boolean q() {
        return this.f17814b.getBoolean(this.f17813a.getString(R.string.pref_key_enable_detached_surface_texture), false);
    }

    public boolean r() {
        return this.f17814b.getBoolean(this.f17813a.getString(R.string.pref_key_enable_no_view), false);
    }

    public boolean s() {
        return this.f17814b.getBoolean(this.f17813a.getString(R.string.pref_key_enable_surface_view), false);
    }

    public boolean t() {
        return this.f17814b.getBoolean(this.f17813a.getString(R.string.pref_key_enable_texture_view), false);
    }

    public Boolean u() {
        try {
            return Boolean.valueOf(this.f17821i.getBoolean("pref_billing_p_max_conn", false));
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public boolean v() {
        return this.f17814b.getBoolean(this.f17813a.getString(R.string.pref_key_media_codec_handle_resolution_change), false);
    }

    public String w() {
        return this.f17822j.getString("pref.using_opengl", BuildConfig.FLAVOR);
    }

    public int x() {
        String string = this.f17823k.getString("pref.using_media_codec", c.h.a.h.n.a.d0);
        if (string.equals(this.f17813a.getResources().getString(R.string.native_decoder))) {
            return 3;
        }
        if (string.equals(this.f17813a.getResources().getString(R.string.hardware_decoder))) {
            return 2;
        }
        string.equals(this.f17813a.getResources().getString(R.string.software_decoder));
        return 2;
    }

    public int y() {
        return this.f17818f.getInt("recently_added_limit", c.h.a.h.n.a.Z);
    }

    public int z() {
        return this.f17818f.getInt("recently_watched_limit_live", c.h.a.h.n.a.a0);
    }
}
