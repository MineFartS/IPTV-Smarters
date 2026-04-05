package a.b.k;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f143b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.f.b<WeakReference<e>> f144c = new a.f.b<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f145d = new Object();

    public static void c(e eVar) {
        synchronized (f145d) {
            y(eVar);
            f144c.add(new WeakReference<>(eVar));
        }
    }

    public static e g(Activity activity, d dVar) {
        return new f(activity, dVar);
    }

    public static e h(Dialog dialog, d dVar) {
        return new f(dialog, dVar);
    }

    public static int j() {
        return f143b;
    }

    public static void x(e eVar) {
        synchronized (f145d) {
            y(eVar);
        }
    }

    public static void y(e eVar) {
        synchronized (f145d) {
            Iterator<WeakReference<e>> it = f144c.iterator();
            while (it.hasNext()) {
                e eVar2 = it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(int i2);

    public abstract void B(View view);

    public abstract void C(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void D(Toolbar toolbar);

    public void E(int i2) {
    }

    public abstract void F(CharSequence charSequence);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void e(Context context) {
    }

    public Context f(Context context) {
        e(context);
        return context;
    }

    public abstract <T extends View> T i(int i2);

    public int k() {
        return -100;
    }

    public abstract MenuInflater l();

    public abstract a m();

    public abstract void n();

    public abstract void o();

    public abstract void p(Configuration configuration);

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w();

    public abstract boolean z(int i2);
}
