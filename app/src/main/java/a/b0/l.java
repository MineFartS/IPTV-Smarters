package a.b0;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f959b;

    public static l b(ViewGroup viewGroup) {
        return (l) viewGroup.getTag(j.f938c);
    }

    public static void c(ViewGroup viewGroup, l lVar) {
        viewGroup.setTag(j.f938c, lVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f958a) != this || (runnable = this.f959b) == null) {
            return;
        }
        runnable.run();
    }
}
