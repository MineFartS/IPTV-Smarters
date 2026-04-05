package c.d.a.n.k.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f5800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.l.a f5801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f5802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.d.a.e<c.d.a.l.a, c.d.a.l.a, Bitmap, Bitmap> f5805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f5806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5807h;

    public static class b extends c.d.a.r.h.g<Bitmap> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Handler f5808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f5810f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bitmap f5811g;

        public b(Handler handler, int i2, long j2) {
            this.f5808d = handler;
            this.f5809e = i2;
            this.f5810f = j2;
        }

        public Bitmap k() {
            return this.f5811g;
        }

        @Override // c.d.a.r.h.j
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, c.d.a.r.g.c<? super Bitmap> cVar) {
            this.f5811g = bitmap;
            this.f5808d.sendMessageAtTime(this.f5808d.obtainMessage(1, this), this.f5810f);
        }
    }

    public interface c {
        void a(int i2);
    }

    public class d implements Handler.Callback {
        public d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                f.this.e((b) message.obj);
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            c.d.a.g.g((b) message.obj);
            return false;
        }
    }

    public static class e implements c.d.a.n.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f5813a;

        public e() {
            this(UUID.randomUUID());
        }

        public e(UUID uuid) {
            this.f5813a = uuid;
        }

        @Override // c.d.a.n.c
        public void a(MessageDigest messageDigest) {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // c.d.a.n.c
        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return ((e) obj).f5813a.equals(this.f5813a);
            }
            return false;
        }

        @Override // c.d.a.n.c
        public int hashCode() {
            return this.f5813a.hashCode();
        }
    }

    public f(Context context, c cVar, c.d.a.l.a aVar, int i2, int i3) {
        this(cVar, aVar, null, c(context, aVar, i2, i3, c.d.a.g.i(context).l()));
    }

    public f(c cVar, c.d.a.l.a aVar, Handler handler, c.d.a.e<c.d.a.l.a, c.d.a.l.a, Bitmap, Bitmap> eVar) {
        this.f5803d = false;
        this.f5804e = false;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new d()) : handler;
        this.f5800a = cVar;
        this.f5801b = aVar;
        this.f5802c = handler;
        this.f5805f = eVar;
    }

    public static c.d.a.e<c.d.a.l.a, c.d.a.l.a, Bitmap, Bitmap> c(Context context, c.d.a.l.a aVar, int i2, int i3, c.d.a.n.i.n.c cVar) {
        h hVar = new h(cVar);
        g gVar = new g();
        return c.d.a.g.u(context).w(gVar, c.d.a.l.a.class).c(aVar).a(Bitmap.class).u(c.d.a.n.k.a.b()).h(hVar).r(true).j(c.d.a.n.i.b.NONE).p(i2, i3);
    }

    public void a() {
        h();
        b bVar = this.f5806g;
        if (bVar != null) {
            c.d.a.g.g(bVar);
            this.f5806g = null;
        }
        this.f5807h = true;
    }

    public Bitmap b() {
        b bVar = this.f5806g;
        if (bVar != null) {
            return bVar.k();
        }
        return null;
    }

    public final void d() {
        if (!this.f5803d || this.f5804e) {
            return;
        }
        this.f5804e = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f5801b.h());
        this.f5801b.a();
        this.f5805f.q(new e()).m(new b(this.f5802c, this.f5801b.d(), jUptimeMillis));
    }

    public void e(b bVar) {
        if (this.f5807h) {
            this.f5802c.obtainMessage(2, bVar).sendToTarget();
            return;
        }
        b bVar2 = this.f5806g;
        this.f5806g = bVar;
        this.f5800a.a(bVar.f5809e);
        if (bVar2 != null) {
            this.f5802c.obtainMessage(2, bVar2).sendToTarget();
        }
        this.f5804e = false;
        d();
    }

    public void f(c.d.a.n.g<Bitmap> gVar) {
        if (gVar == null) {
            throw new NullPointerException("Transformation must not be null");
        }
        this.f5805f = this.f5805f.w(gVar);
    }

    public void g() {
        if (this.f5803d) {
            return;
        }
        this.f5803d = true;
        this.f5807h = false;
        d();
    }

    public void h() {
        this.f5803d = false;
    }
}
