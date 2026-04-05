package c.f.a.b.e3;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.z2.o f7904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.f.a.b.z2.j f7905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.f.a.b.z2.k f7906c;

    public p(c.f.a.b.z2.o oVar) {
        this.f7904a = oVar;
    }

    @Override // c.f.a.b.e3.n0
    public void a(long j2, long j3) {
        ((c.f.a.b.z2.j) c.f.a.b.j3.g.e(this.f7905b)).a(j2, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    @Override // c.f.a.b.e3.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(c.f.a.b.i3.l r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, c.f.a.b.z2.l r15) throws c.f.a.b.e3.b1 {
        /*
            r7 = this;
            c.f.a.b.z2.g r6 = new c.f.a.b.z2.g
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f7906c = r6
            c.f.a.b.z2.j r8 = r7.f7905b
            if (r8 == 0) goto L10
            return
        L10:
            c.f.a.b.z2.o r8 = r7.f7904a
            c.f.a.b.z2.j[] r8 = r8.b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f7905b = r8
            goto L75
        L20:
            int r10 = r8.length
            r0 = 0
        L22:
            if (r0 >= r10) goto L71
            r1 = r8[r0]
            boolean r2 = r1.e(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.f7905b = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            c.f.a.b.j3.g.g(r14)
            r6.r()
            goto L71
        L35:
            c.f.a.b.z2.j r1 = r7.f7905b
            if (r1 != 0) goto L67
            long r1 = r6.getPosition()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L65
            goto L67
        L42:
            r8 = move-exception
            c.f.a.b.z2.j r9 = r7.f7905b
            if (r9 != 0) goto L4f
            long r9 = r6.getPosition()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L50
        L4f:
            r13 = 1
        L50:
            c.f.a.b.j3.g.g(r13)
            r6.r()
            throw r8
        L57:
            c.f.a.b.z2.j r1 = r7.f7905b
            if (r1 != 0) goto L67
            long r1 = r6.getPosition()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L65
            goto L67
        L65:
            r1 = 0
            goto L68
        L67:
            r1 = 1
        L68:
            c.f.a.b.j3.g.g(r1)
            r6.r()
            int r0 = r0 + 1
            goto L22
        L71:
            c.f.a.b.z2.j r10 = r7.f7905b
            if (r10 == 0) goto L7b
        L75:
            c.f.a.b.z2.j r8 = r7.f7905b
            r8.c(r15)
            return
        L7b:
            c.f.a.b.e3.b1 r10 = new c.f.a.b.e3.b1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = c.f.a.b.j3.x0.M(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = c.f.a.b.j3.g.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            goto La2
        La1:
            throw r10
        La2:
            goto La1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.p.b(c.f.a.b.i3.l, android.net.Uri, java.util.Map, long, long, c.f.a.b.z2.l):void");
    }

    @Override // c.f.a.b.e3.n0
    public int c(c.f.a.b.z2.w wVar) {
        return ((c.f.a.b.z2.j) c.f.a.b.j3.g.e(this.f7905b)).g((c.f.a.b.z2.k) c.f.a.b.j3.g.e(this.f7906c), wVar);
    }

    @Override // c.f.a.b.e3.n0
    public long d() {
        c.f.a.b.z2.k kVar = this.f7906c;
        if (kVar != null) {
            return kVar.getPosition();
        }
        return -1L;
    }

    @Override // c.f.a.b.e3.n0
    public void e() {
        c.f.a.b.z2.j jVar = this.f7905b;
        if (jVar instanceof c.f.a.b.z2.i0.f) {
            ((c.f.a.b.z2.i0.f) jVar).h();
        }
    }

    @Override // c.f.a.b.e3.n0
    public void release() {
        c.f.a.b.z2.j jVar = this.f7905b;
        if (jVar != null) {
            jVar.release();
            this.f7905b = null;
        }
        this.f7906c = null;
    }
}
