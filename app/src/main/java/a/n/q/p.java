package a.n.q;

import a.n.q.q;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2872a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f2874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f2875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f2876e;

    public static final class a extends q.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2877g;

        public a(int i2) {
            this.f2877g = i2;
        }

        public int j(View view) {
            return r.a(view, this, this.f2877g);
        }
    }

    public p() {
        a aVar = new a(1);
        this.f2873b = aVar;
        a aVar2 = new a(0);
        this.f2874c = aVar2;
        this.f2875d = aVar2;
        this.f2876e = aVar;
    }

    public final a a() {
        return this.f2875d;
    }

    public final void b(int i2) {
        a aVar;
        this.f2872a = i2;
        if (i2 == 0) {
            this.f2875d = this.f2874c;
            aVar = this.f2873b;
        } else {
            this.f2875d = this.f2873b;
            aVar = this.f2874c;
        }
        this.f2876e = aVar;
    }
}
