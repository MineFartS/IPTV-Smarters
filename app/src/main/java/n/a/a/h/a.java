package n.a.a.h;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class a extends c<Activity> {
    public a(Activity activity) {
        super(activity);
    }

    @Override // n.a.a.h.c
    public Context a() {
        return b();
    }

    @Override // n.a.a.h.c
    @SuppressLint({"NewApi"})
    public void e(String str, int i2, int i3, int i4, String... strArr) {
        if (f(strArr)) {
            h(b().getFragmentManager(), str, i2, i3, i4, strArr);
        } else {
            a.i.h.a.q(b(), strArr, i4);
        }
    }

    @Override // n.a.a.h.c
    public boolean g(String str) {
        return a.i.h.a.u(b(), str);
    }
}
