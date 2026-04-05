package c.f.a.b.x2;

import android.os.Looper;
import c.f.a.b.k1;
import c.f.a.b.x2.a0;
import c.f.a.b.x2.y;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;

/* JADX INFO: loaded from: classes.dex */
public interface c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f10329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final c0 f10330b;

    public static class a implements c0 {
        @Override // c.f.a.b.x2.c0
        public /* synthetic */ b a(Looper looper, a0.a aVar, k1 k1Var) {
            return b0.a(this, looper, aVar, k1Var);
        }

        @Override // c.f.a.b.x2.c0
        public y b(Looper looper, a0.a aVar, k1 k1Var) {
            if (k1Var.p == null) {
                return null;
            }
            return new h0(new y.a(new q0(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // c.f.a.b.x2.c0
        public Class<r0> c(k1 k1Var) {
            if (k1Var.p != null) {
                return r0.class;
            }
            return null;
        }

        @Override // c.f.a.b.x2.c0
        public /* synthetic */ void prepare() {
            b0.b(this);
        }

        @Override // c.f.a.b.x2.c0
        public /* synthetic */ void release() {
            b0.c(this);
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10331a = new b() { // from class: c.f.a.b.x2.m
            @Override // c.f.a.b.x2.c0.b
            public final void release() {
                d0.a();
            }
        };

        void release();
    }

    static {
        a aVar = new a();
        f10329a = aVar;
        f10330b = aVar;
    }

    b a(Looper looper, a0.a aVar, k1 k1Var);

    y b(Looper looper, a0.a aVar, k1 k1Var);

    Class<? extends ExoMediaCrypto> c(k1 k1Var);

    void prepare();

    void release();
}
