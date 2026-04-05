package c.d.a.r.g;

import android.view.View;
import android.view.animation.Animation;
import c.d.a.r.g.c;

/* JADX INFO: loaded from: classes.dex */
public class f<R> implements c<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f5925a;

    public interface a {
        Animation build();
    }

    public f(a aVar) {
        this.f5925a = aVar;
    }

    @Override // c.d.a.r.g.c
    public boolean a(R r, c.a aVar) {
        View view = aVar.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.f5925a.build());
        return false;
    }
}
