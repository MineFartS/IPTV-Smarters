package c.d.a.n.k.h;

import c.d.a.n.j.l;

/* JADX INFO: loaded from: classes.dex */
public class g implements l<c.d.a.l.a, c.d.a.l.a> {

    public static class a implements c.d.a.n.h.c<c.d.a.l.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.d.a.l.a f5814a;

        public a(c.d.a.l.a aVar) {
            this.f5814a = aVar;
        }

        @Override // c.d.a.n.h.c
        public void a() {
        }

        @Override // c.d.a.n.h.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c.d.a.l.a b(c.d.a.i iVar) {
            return this.f5814a;
        }

        @Override // c.d.a.n.h.c
        public void cancel() {
        }

        @Override // c.d.a.n.h.c
        public String getId() {
            return String.valueOf(this.f5814a.d());
        }
    }

    @Override // c.d.a.n.j.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.d.a.n.h.c<c.d.a.l.a> a(c.d.a.l.a aVar, int i2, int i3) {
        return new a(aVar);
    }
}
