package c.f.a.c.j.c;

import android.content.SharedPreferences;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f12927a = new c.f.a.c.d.v.b("ApplicationAnalyticsSession");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f12928b = System.currentTimeMillis();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12931e = f12928b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12932f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f12933g;

    public static la a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return null;
        }
        la laVar = new la();
        if (!sharedPreferences.contains("application_id")) {
            return null;
        }
        laVar.f12929c = sharedPreferences.getString("application_id", BuildConfig.FLAVOR);
        if (!sharedPreferences.contains("receiver_metrics_id")) {
            return null;
        }
        laVar.f12930d = sharedPreferences.getString("receiver_metrics_id", BuildConfig.FLAVOR);
        if (!sharedPreferences.contains("analytics_session_id")) {
            return null;
        }
        laVar.f12931e = sharedPreferences.getLong("analytics_session_id", 0L);
        if (!sharedPreferences.contains("event_sequence_number")) {
            return null;
        }
        laVar.f12932f = sharedPreferences.getInt("event_sequence_number", 0);
        if (!sharedPreferences.contains("receiver_session_id")) {
            return null;
        }
        laVar.f12933g = sharedPreferences.getString("receiver_session_id", BuildConfig.FLAVOR);
        return laVar;
    }

    public static la c() {
        la laVar = new la();
        f12928b++;
        return laVar;
    }

    public final void b(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        f12927a.a("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("application_id", this.f12929c);
        editorEdit.putString("receiver_metrics_id", this.f12930d);
        editorEdit.putLong("analytics_session_id", this.f12931e);
        editorEdit.putInt("event_sequence_number", this.f12932f);
        editorEdit.putString("receiver_session_id", this.f12933g);
        editorEdit.apply();
    }
}
