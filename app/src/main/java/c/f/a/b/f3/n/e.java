package c.f.a.b.f3.n;

import c.f.a.b.f3.g;
import c.f.a.b.f3.j;
import c.f.a.b.f3.k;
import c.f.a.b.f3.n.e;
import c.f.a.b.j3.x0;
import c.f.a.b.v2.h;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<b> f8154a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<k> f8155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityQueue<b> f8156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f8157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8159f;

    public static final class b extends j implements Comparable<b> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f8160j;

        public b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (isEndOfStream() != bVar.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j2 = this.f10278e - bVar.f10278e;
            if (j2 == 0) {
                j2 = this.f8160j - bVar.f8160j;
                if (j2 == 0) {
                    return 0;
                }
            }
            return j2 > 0 ? 1 : -1;
        }
    }

    public static final class c extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public h.a<c> f8161d;

        public c(h.a<c> aVar) {
            this.f8161d = aVar;
        }

        @Override // c.f.a.b.v2.h
        public final void release() {
            this.f8161d.a(this);
        }
    }

    public e() {
        for (int i2 = 0; i2 < 10; i2++) {
            this.f8154a.add(new b());
        }
        this.f8155b = new ArrayDeque<>();
        for (int i3 = 0; i3 < 2; i3++) {
            this.f8155b.add(new c(new h.a() { // from class: c.f.a.b.f3.n.b
                @Override // c.f.a.b.v2.h.a
                public final void a(h hVar) {
                    this.f8102a.n((e.c) hVar);
                }
            }));
        }
        this.f8156c = new PriorityQueue<>();
    }

    @Override // c.f.a.b.f3.g
    public void a(long j2) {
        this.f8158e = j2;
    }

    public abstract c.f.a.b.f3.f e();

    public abstract void f(j jVar);

    @Override // c.f.a.b.v2.c
    public void flush() {
        this.f8159f = 0L;
        this.f8158e = 0L;
        while (!this.f8156c.isEmpty()) {
            m((b) x0.i(this.f8156c.poll()));
        }
        b bVar = this.f8157d;
        if (bVar != null) {
            m(bVar);
            this.f8157d = null;
        }
    }

    @Override // c.f.a.b.v2.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public j c() {
        c.f.a.b.j3.g.g(this.f8157d == null);
        if (this.f8154a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f8154a.pollFirst();
        this.f8157d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // c.f.a.b.v2.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public k b() {
        k kVar;
        if (this.f8155b.isEmpty()) {
            return null;
        }
        while (!this.f8156c.isEmpty() && ((b) x0.i(this.f8156c.peek())).f10278e <= this.f8158e) {
            b bVar = (b) x0.i(this.f8156c.poll());
            if (bVar.isEndOfStream()) {
                kVar = (k) x0.i(this.f8155b.pollFirst());
                kVar.addFlag(4);
            } else {
                f(bVar);
                if (k()) {
                    c.f.a.b.f3.f fVarE = e();
                    kVar = (k) x0.i(this.f8155b.pollFirst());
                    kVar.g(bVar.f10278e, fVarE, Long.MAX_VALUE);
                } else {
                    m(bVar);
                }
            }
            m(bVar);
            return kVar;
        }
        return null;
    }

    public final k i() {
        return this.f8155b.pollFirst();
    }

    public final long j() {
        return this.f8158e;
    }

    public abstract boolean k();

    @Override // c.f.a.b.v2.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void d(j jVar) {
        c.f.a.b.j3.g.a(jVar == this.f8157d);
        b bVar = (b) jVar;
        if (bVar.isDecodeOnly()) {
            m(bVar);
        } else {
            long j2 = this.f8159f;
            this.f8159f = 1 + j2;
            bVar.f8160j = j2;
            this.f8156c.add(bVar);
        }
        this.f8157d = null;
    }

    public final void m(b bVar) {
        bVar.clear();
        this.f8154a.add(bVar);
    }

    public void n(k kVar) {
        kVar.clear();
        this.f8155b.add(kVar);
    }

    @Override // c.f.a.b.v2.c
    public void release() {
    }
}
