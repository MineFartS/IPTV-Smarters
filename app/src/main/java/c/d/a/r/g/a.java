package c.d.a.r.g;

import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import c.d.a.r.g.f;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* JADX INFO: loaded from: classes.dex */
public class a<T extends Drawable> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<T> f5916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b<T> f5918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b<T> f5919d;

    /* JADX INFO: renamed from: c.d.a.r.g.a$a, reason: collision with other inner class name */
    public static class C0112a implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5920a;

        public C0112a(int i2) {
            this.f5920a = i2;
        }

        @Override // c.d.a.r.g.f.a
        public Animation build() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(this.f5920a);
            return alphaAnimation;
        }
    }

    public a() {
        this(IjkMediaCodecInfo.RANK_SECURE);
    }

    public a(int i2) {
        this(new g(new C0112a(i2)), i2);
    }

    public a(g<T> gVar, int i2) {
        this.f5916a = gVar;
        this.f5917b = i2;
    }

    @Override // c.d.a.r.g.d
    public c<T> a(boolean z, boolean z2) {
        return z ? e.c() : z2 ? b() : c();
    }

    public final c<T> b() {
        if (this.f5918c == null) {
            this.f5918c = new b<>(this.f5916a.a(false, true), this.f5917b);
        }
        return this.f5918c;
    }

    public final c<T> c() {
        if (this.f5919d == null) {
            this.f5919d = new b<>(this.f5916a.a(false, false), this.f5917b);
        }
        return this.f5919d;
    }
}
