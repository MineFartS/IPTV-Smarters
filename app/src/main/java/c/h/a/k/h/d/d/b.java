package c.h.a.k.h.d.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import c.k.a.q;
import c.k.b.c0;
import c.k.b.s;
import c.k.b.t;
import com.nst.iptvsmarterstvbox.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SimpleDateFormat f17930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static t f17931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SharedPreferences f17932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Context f17933d;

    public static class a implements t.d {
        @Override // c.k.b.t.d
        public void a(t tVar, Uri uri, Exception exc) {
            Log.e("EPGUtil", exc.getMessage());
        }
    }

    public static String a(long j2) {
        LocalDate localDate = new LocalDate(j2);
        return localDate.dayOfWeek().getAsShortText() + " " + localDate.getDayOfMonth() + "/" + localDate.getMonthOfYear();
    }

    public static String b(Context context, long j2) {
        f17933d = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("timeFormat", 0);
        f17932c = sharedPreferences;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sharedPreferences.getString("timeFormat", c.h.a.h.n.a.m0), Locale.US);
        f17930a = simpleDateFormat;
        return simpleDateFormat.format(Long.valueOf(j2));
    }

    public static void c(Context context) {
        if (f17931b == null) {
            f17931b = new t.b(context).b(new s(new q())).c(new a()).a();
        }
    }

    public static void d(Context context, String str, int i2, int i3, c0 c0Var) {
        c(context);
        ((str == null || str.equals(BuildConfig.FLAVOR)) ? f17931b.j(R.drawable.logo_placeholder_white) : f17931b.l(str).k(i2, i3).b()).i(c0Var);
    }
}
