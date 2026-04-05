package c.c.a.a;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f5092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f5093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile i f5094c;

        public /* synthetic */ a(Context context, c0 c0Var) {
            this.f5093b = context;
        }

        public c a() {
            if (this.f5093b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f5094c == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f5092a) {
                return new d(null, this.f5092a, this.f5093b, this.f5094c);
            }
            throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
        }

        public a b() {
            this.f5092a = true;
            return this;
        }

        public a c(i iVar) {
            this.f5094c = iVar;
            return this;
        }
    }

    public static a e(Context context) {
        return new a(context, null);
    }

    public abstract void a(c.c.a.a.a aVar, b bVar);

    public abstract void b();

    public abstract boolean c();

    public abstract g d(Activity activity, f fVar);

    public abstract void f(String str, h hVar);

    public abstract void g(j jVar, k kVar);

    public abstract void h(e eVar);
}
