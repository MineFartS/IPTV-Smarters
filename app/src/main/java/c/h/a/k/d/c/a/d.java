package c.h.a.k.d.c.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.widget.TableLayout;
import java.util.Locale;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f17831a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IMediaPlayer f17833c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray<View> f17832b = new SparseArray<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17834d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17835e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    public Handler f17836f = new a();

    public class a extends Handler {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r22) {
            /*
                Method dump skipped, instruction units count: 373
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c.h.a.k.d.c.a.d.a.handleMessage(android.os.Message):void");
        }
    }

    public d(Context context, TableLayout tableLayout) {
        this.f17831a = new h(context, tableLayout);
    }

    public static String i(long j2) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        if (j2 >= 1000) {
            objArr[0] = Float.valueOf(j2 / 1000.0f);
            return String.format(locale, "%.2f sec", objArr);
        }
        objArr[0] = Long.valueOf(j2);
        return String.format(locale, "%d msec", objArr);
    }

    public static String j(long j2) {
        return j2 >= 100000 ? String.format(Locale.US, "%.2f MB", Float.valueOf((j2 / 1000.0f) / 1000.0f)) : j2 >= 100 ? String.format(Locale.US, "%.1f KB", Float.valueOf(j2 / 1000.0f)) : String.format(Locale.US, "%d B", Long.valueOf(j2));
    }

    public static String k(long j2, long j3) {
        if (j3 <= 0 || j2 <= 0) {
            return "0 B/s";
        }
        float f2 = (j2 * 1000.0f) / j3;
        return f2 >= 1000000.0f ? String.format(Locale.US, "%.2f MB/s", Float.valueOf((f2 / 1000.0f) / 1000.0f)) : f2 >= 1000.0f ? String.format(Locale.US, "%.1f KB/s", Float.valueOf(f2 / 1000.0f)) : String.format(Locale.US, "%d B/s", Long.valueOf((long) f2));
    }

    public static int p() {
        return 0;
    }

    public void l(IMediaPlayer iMediaPlayer) {
        this.f17833c = iMediaPlayer;
        if (iMediaPlayer != null) {
            this.f17836f.sendEmptyMessageDelayed(1, 500L);
        } else {
            this.f17836f.removeMessages(1);
        }
    }

    public final void m(int i2, String str) {
        View view = this.f17832b.get(i2);
        if (view != null) {
            this.f17831a.l(view, str);
        } else {
            this.f17832b.put(i2, this.f17831a.c(i2, str));
        }
    }

    public void n(long j2) {
        this.f17834d = j2;
    }

    public void o(long j2) {
        this.f17835e = j2;
    }
}
