package c.h.a.k.a;

import android.content.Context;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c.h.a.i.q.l f17369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17370b;

    public m(Context context) {
        this.f17370b = context;
        f17369a = new c.h.a.i.q.l(context);
    }

    public int a(String str) {
        c.h.a.k.e.a.f().p(str);
        return f17369a.x(str);
    }

    public void b(String str) {
        new c.h.a.i.q.l(this.f17370b).n(str);
    }

    public ArrayList<GetEpisdoeDetailsCallback> c(String str) {
        c.h.a.i.q.l lVar = f17369a;
        if (lVar != null) {
            return lVar.s(str);
        }
        return null;
    }

    public final void d(Context context, List<GetEpisdoeDetailsCallback> list, int i2) {
        try {
            new c.h.a.i.q.l(context).d(list.get(i2));
        } catch (Exception unused) {
        }
    }

    public final void e(Context context, List<GetEpisdoeDetailsCallback> list, int i2) {
        d(context, list, i2);
    }

    public void f() {
        if (c.h.a.k.e.a.f() == null || h(c.h.a.k.e.a.f().e(), c.h.a.i.q.m.z(this.f17370b)) != 0) {
            return;
        }
        try {
            i(this.f17370b, c.h.a.i.a.c().b().get(c.h.a.k.e.a.f().d()).r());
            e(this.f17370b, c.h.a.i.a.c().b(), c.h.a.k.e.a.f().d());
        } catch (Exception unused) {
        }
    }

    public void g(Context context, GetEpisdoeDetailsCallback getEpisdoeDetailsCallback) {
        try {
            new c.h.a.i.q.l(context).d(getEpisdoeDetailsCallback);
        } catch (Exception unused) {
        }
    }

    public int h(String str, int i2) {
        return f17369a.x(str);
    }

    public void i(Context context, String str) {
        try {
            new c.h.a.i.q.l(context).Q(str);
        } catch (Exception unused) {
        }
    }

    public void j(String str, long j2) {
        c.h.a.i.q.l lVar = f17369a;
        if (lVar != null) {
            lVar.U(str, Long.valueOf(j2));
        }
    }
}
