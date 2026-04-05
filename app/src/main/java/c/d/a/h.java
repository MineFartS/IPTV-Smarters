package c.d.a;

import android.content.Context;
import android.os.Build;
import c.d.a.n.i.o.a;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.d.a.n.i.c f5353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.d.a.n.i.n.c f5354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.d.a.n.i.o.h f5355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExecutorService f5356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ExecutorService f5357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.d.a.n.a f5358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a.InterfaceC0104a f5359h;

    public h(Context context) {
        this.f5352a = context.getApplicationContext();
    }

    public g a() {
        if (this.f5356e == null) {
            this.f5356e = new c.d.a.n.i.p.a(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (this.f5357f == null) {
            this.f5357f = new c.d.a.n.i.p.a(1);
        }
        c.d.a.n.i.o.i iVar = new c.d.a.n.i.o.i(this.f5352a);
        if (this.f5354c == null) {
            if (Build.VERSION.SDK_INT >= 11) {
                this.f5354c = new c.d.a.n.i.n.f(iVar.a());
            } else {
                this.f5354c = new c.d.a.n.i.n.d();
            }
        }
        if (this.f5355d == null) {
            this.f5355d = new c.d.a.n.i.o.g(iVar.c());
        }
        if (this.f5359h == null) {
            this.f5359h = new c.d.a.n.i.o.f(this.f5352a);
        }
        if (this.f5353b == null) {
            this.f5353b = new c.d.a.n.i.c(this.f5355d, this.f5359h, this.f5357f, this.f5356e);
        }
        if (this.f5358g == null) {
            this.f5358g = c.d.a.n.a.DEFAULT;
        }
        return new g(this.f5353b, this.f5355d, this.f5354c, this.f5352a, this.f5358g);
    }
}
