package c.d.a.n.i.o;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5647c;

    public static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f5648a;

        public a(DisplayMetrics displayMetrics) {
            this.f5648a = displayMetrics;
        }

        @Override // c.d.a.n.i.o.i.b
        public int a() {
            return this.f5648a.heightPixels;
        }

        @Override // c.d.a.n.i.o.i.b
        public int b() {
            return this.f5648a.widthPixels;
        }
    }

    public interface b {
        int a();

        int b();
    }

    public i(Context context) {
        this(context, (ActivityManager) context.getSystemService("activity"), new a(context.getResources().getDisplayMetrics()));
    }

    public i(Context context, ActivityManager activityManager, b bVar) {
        this.f5647c = context;
        int iB = b(activityManager);
        int iB2 = bVar.b() * bVar.a() * 4;
        int i2 = iB2 * 4;
        int i3 = iB2 * 2;
        int i4 = i3 + i2;
        if (i4 <= iB) {
            this.f5646b = i3;
        } else {
            int iRound = Math.round(iB / 6.0f);
            this.f5646b = iRound * 2;
            i2 = iRound * 4;
        }
        this.f5645a = i2;
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated memory cache size: ");
            sb.append(e(this.f5646b));
            sb.append(" pool size: ");
            sb.append(e(this.f5645a));
            sb.append(" memory class limited? ");
            sb.append(i4 > iB);
            sb.append(" max size: ");
            sb.append(e(iB));
            sb.append(" memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(" isLowMemoryDevice: ");
            sb.append(d(activityManager));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    public static int b(ActivityManager activityManager) {
        return Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (d(activityManager) ? 0.33f : 0.4f));
    }

    @TargetApi(19)
    public static boolean d(ActivityManager activityManager) {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 19 ? activityManager.isLowRamDevice() : i2 < 11;
    }

    public int a() {
        return this.f5645a;
    }

    public int c() {
        return this.f5646b;
    }

    public final String e(int i2) {
        return Formatter.formatFileSize(this.f5647c, i2);
    }
}
