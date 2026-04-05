package c.h.a;

import android.content.Context;
import android.widget.Toast;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference<Context> f16691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f16692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Toast f16693c;

    public c(Context context) {
        f16691a = new WeakReference<>(context);
    }

    public static c a(Context context) {
        if (f16692b == null || f16691a.get() == null) {
            f16692b = new c(context);
        }
        return f16692b;
    }

    public void b(int i2) {
        c(f16691a.get().getResources().getString(i2));
    }

    public void c(String str) {
        Toast toast = this.f16693c;
        if (toast == null) {
            this.f16693c = Toast.makeText(f16691a.get(), str, 0);
        } else {
            toast.setText(str);
            this.f16693c.setDuration(0);
        }
        this.f16693c.show();
    }
}
