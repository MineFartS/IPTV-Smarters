package c.d.a.r.g;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import c.d.a.r.g.c;

/* JADX INFO: loaded from: classes.dex */
public class b<T extends Drawable> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<T> f5921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5922b;

    public b(c<T> cVar, int i2) {
        this.f5921a = cVar;
        this.f5922b = i2;
    }

    @Override // c.d.a.r.g.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(T t, c.a aVar) {
        Drawable drawableE = aVar.e();
        if (drawableE == null) {
            this.f5921a.a(t, aVar);
            return false;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableE, t});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(this.f5922b);
        aVar.c(transitionDrawable);
        return true;
    }
}
