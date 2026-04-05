package c.f.c.p;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static g f16160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SimpleDateFormat f16161b = new SimpleDateFormat("dd/MM/yyyy z");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f16162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferences f16163d;

    public g(Context context) {
        this.f16162c = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.f16163d = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    public static synchronized g a(Context context) {
        if (f16160a == null) {
            f16160a = new g(context);
        }
        return f16160a;
    }

    public static boolean b(long j2, long j3) {
        Date date = new Date(j2);
        Date date2 = new Date(j3);
        SimpleDateFormat simpleDateFormat = f16161b;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    public synchronized boolean c(long j2) {
        return d("fire-global", j2);
    }

    public synchronized boolean d(String str, long j2) {
        if (!this.f16162c.contains(str)) {
            this.f16162c.edit().putLong(str, j2).apply();
            return true;
        }
        if (!b(this.f16162c.getLong(str, -1L), j2)) {
            return false;
        }
        this.f16162c.edit().putLong(str, j2).apply();
        return true;
    }
}
