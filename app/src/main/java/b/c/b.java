package b.c;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f5005b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Runnable f5006c = new Runnable() { // from class: b.c.a
        @Override // java.lang.Runnable
        public final void run() {
            b.f5005b = true;
        }
    };

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (f5005b) {
            f5005b = false;
            view.post(f5006c);
            a(view);
        }
    }
}
