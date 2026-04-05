package c.f.a.b.j3;

import android.os.Handler;
import android.os.Message;
import c.f.a.b.j3.v;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<b> f9273a = new ArrayList(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f9274b;

    public static final class b implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Message f9275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s0 f9276b;

        public b() {
        }

        @Override // c.f.a.b.j3.v.a
        public void a() {
            ((Message) g.e(this.f9275a)).sendToTarget();
            b();
        }

        public final void b() {
            this.f9275a = null;
            this.f9276b = null;
            s0.n(this);
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) g.e(this.f9275a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, s0 s0Var) {
            this.f9275a = message;
            this.f9276b = s0Var;
            return this;
        }
    }

    public s0(Handler handler) {
        this.f9274b = handler;
    }

    public static b m() {
        b bVar;
        List<b> list = f9273a;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
        }
        return bVar;
    }

    public static void n(b bVar) {
        List<b> list = f9273a;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // c.f.a.b.j3.v
    public v.a a(int i2, int i3, int i4) {
        return m().d(this.f9274b.obtainMessage(i2, i3, i4), this);
    }

    @Override // c.f.a.b.j3.v
    public boolean b(Runnable runnable) {
        return this.f9274b.post(runnable);
    }

    @Override // c.f.a.b.j3.v
    public v.a c(int i2) {
        return m().d(this.f9274b.obtainMessage(i2), this);
    }

    @Override // c.f.a.b.j3.v
    public boolean d(v.a aVar) {
        return ((b) aVar).c(this.f9274b);
    }

    @Override // c.f.a.b.j3.v
    public boolean e(int i2) {
        return this.f9274b.hasMessages(i2);
    }

    @Override // c.f.a.b.j3.v
    public boolean f(int i2) {
        return this.f9274b.sendEmptyMessage(i2);
    }

    @Override // c.f.a.b.j3.v
    public v.a g(int i2, int i3, int i4, Object obj) {
        return m().d(this.f9274b.obtainMessage(i2, i3, i4, obj), this);
    }

    @Override // c.f.a.b.j3.v
    public boolean h(int i2, long j2) {
        return this.f9274b.sendEmptyMessageAtTime(i2, j2);
    }

    @Override // c.f.a.b.j3.v
    public void i(int i2) {
        this.f9274b.removeMessages(i2);
    }

    @Override // c.f.a.b.j3.v
    public v.a j(int i2, Object obj) {
        return m().d(this.f9274b.obtainMessage(i2, obj), this);
    }

    @Override // c.f.a.b.j3.v
    public void k(Object obj) {
        this.f9274b.removeCallbacksAndMessages(obj);
    }
}
