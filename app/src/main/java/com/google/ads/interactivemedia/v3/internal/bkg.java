package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bkg implements bmj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bke f21276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21279d = 0;

    private bkg(bke bkeVar) {
        bld.j(bkeVar, "input");
        this.f21276a = bkeVar;
        bkeVar.f21266c = this;
    }

    private final <T> T S(bmk<T> bmkVar, bkm bkmVar) {
        int i2 = this.f21278c;
        this.f21278c = bnp.c(bnp.a(this.f21277b), 4);
        try {
            T tE = bmkVar.e();
            bmkVar.h(tE, this, bkmVar);
            bmkVar.f(tE);
            if (this.f21277b == this.f21278c) {
                return tE;
            }
            throw blf.g();
        } finally {
            this.f21278c = i2;
        }
    }

    private final <T> T T(bmk<T> bmkVar, bkm bkmVar) throws blf {
        int iQ = this.f21276a.q();
        bke bkeVar = this.f21276a;
        if (bkeVar.f21264a >= bkeVar.f21265b) {
            throw new blf("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iH = bkeVar.h(iQ);
        T tE = bmkVar.e();
        this.f21276a.f21264a++;
        bmkVar.h(tE, this, bkmVar);
        bmkVar.f(tE);
        this.f21276a.C(0);
        r5.f21264a--;
        this.f21276a.D(iH);
        return tE;
    }

    private final void U(int i2) throws blf {
        if (this.f21276a.g() != i2) {
            throw blf.h();
        }
    }

    private final void V(int i2) throws ble {
        if (bnp.b(this.f21277b) != i2) {
            throw blf.a();
        }
    }

    private static final void W(int i2) throws blf {
        if ((i2 & 3) != 0) {
            throw blf.g();
        }
    }

    private static final void X(int i2) throws blf {
        if ((i2 & 7) != 0) {
            throw blf.g();
        }
    }

    public static bkg q(bke bkeVar) {
        bkg bkgVar = bkeVar.f21266c;
        return bkgVar != null ? bkgVar : new bkg(bkeVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void A(List<Long> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof blo)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f21276a.r()));
                    if (this.f21276a.F()) {
                        return;
                    } else {
                        iP = this.f21276a.p();
                    }
                } while (iP == this.f21277b);
                this.f21279d = iP;
                return;
            }
            if (iB != 2) {
                throw blf.a();
            }
            int iQ = this.f21276a.q();
            X(iQ);
            int iG = this.f21276a.g() + iQ;
            do {
                list.add(Long.valueOf(this.f21276a.r()));
            } while (this.f21276a.g() < iG);
            return;
        }
        blo bloVar = (blo) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 1) {
            do {
                bloVar.f(this.f21276a.r());
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP2 = this.f21276a.p();
                }
            } while (iP2 == this.f21277b);
            this.f21279d = iP2;
            return;
        }
        if (iB2 != 2) {
            throw blf.a();
        }
        int iQ2 = this.f21276a.q();
        X(iQ2);
        int iG2 = this.f21276a.g() + iQ2;
        do {
            bloVar.f(this.f21276a.r());
        } while (this.f21276a.g() < iG2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void B(List<Float> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof bkt)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 2) {
                int iQ = this.f21276a.q();
                W(iQ);
                int iG = this.f21276a.g() + iQ;
                do {
                    list.add(Float.valueOf(this.f21276a.f()));
                } while (this.f21276a.g() < iG);
                return;
            }
            if (iB != 5) {
                throw blf.a();
            }
            do {
                list.add(Float.valueOf(this.f21276a.f()));
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP = this.f21276a.p();
                }
            } while (iP == this.f21277b);
            this.f21279d = iP;
            return;
        }
        bkt bktVar = (bkt) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 2) {
            int iQ2 = this.f21276a.q();
            W(iQ2);
            int iG2 = this.f21276a.g() + iQ2;
            do {
                bktVar.e(this.f21276a.f());
            } while (this.f21276a.g() < iG2);
            return;
        }
        if (iB2 != 5) {
            throw blf.a();
        }
        do {
            bktVar.e(this.f21276a.f());
            if (this.f21276a.F()) {
                return;
            } else {
                iP2 = this.f21276a.p();
            }
        } while (iP2 == this.f21277b);
        this.f21279d = iP2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final <T> void C(List<T> list, bmk<T> bmkVar, bkm bkmVar) throws blf {
        int iP;
        if (bnp.b(this.f21277b) != 3) {
            throw blf.a();
        }
        int i2 = this.f21277b;
        do {
            list.add(S(bmkVar, bkmVar));
            if (this.f21276a.F() || this.f21279d != 0) {
                return;
            } else {
                iP = this.f21276a.p();
            }
        } while (iP == i2);
        this.f21279d = iP;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void D(List<Integer> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof bky)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f21276a.k()));
                    if (this.f21276a.F()) {
                        return;
                    } else {
                        iP = this.f21276a.p();
                    }
                } while (iP == this.f21277b);
                this.f21279d = iP;
                return;
            }
            if (iB != 2) {
                throw blf.a();
            }
            int iG = this.f21276a.g() + this.f21276a.q();
            do {
                list.add(Integer.valueOf(this.f21276a.k()));
            } while (this.f21276a.g() < iG);
            U(iG);
            return;
        }
        bky bkyVar = (bky) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 0) {
            do {
                bkyVar.g(this.f21276a.k());
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP2 = this.f21276a.p();
                }
            } while (iP2 == this.f21277b);
            this.f21279d = iP2;
            return;
        }
        if (iB2 != 2) {
            throw blf.a();
        }
        int iG2 = this.f21276a.g() + this.f21276a.q();
        do {
            bkyVar.g(this.f21276a.k());
        } while (this.f21276a.g() < iG2);
        U(iG2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void E(List<Long> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof blo)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f21276a.s()));
                    if (this.f21276a.F()) {
                        return;
                    } else {
                        iP = this.f21276a.p();
                    }
                } while (iP == this.f21277b);
                this.f21279d = iP;
                return;
            }
            if (iB != 2) {
                throw blf.a();
            }
            int iG = this.f21276a.g() + this.f21276a.q();
            do {
                list.add(Long.valueOf(this.f21276a.s()));
            } while (this.f21276a.g() < iG);
            U(iG);
            return;
        }
        blo bloVar = (blo) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 0) {
            do {
                bloVar.f(this.f21276a.s());
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP2 = this.f21276a.p();
                }
            } while (iP2 == this.f21277b);
            this.f21279d = iP2;
            return;
        }
        if (iB2 != 2) {
            throw blf.a();
        }
        int iG2 = this.f21276a.g() + this.f21276a.q();
        do {
            bloVar.f(this.f21276a.s());
        } while (this.f21276a.g() < iG2);
        U(iG2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final <T> void F(List<T> list, bmk<T> bmkVar, bkm bkmVar) throws blf {
        int iP;
        if (bnp.b(this.f21277b) != 2) {
            throw blf.a();
        }
        int i2 = this.f21277b;
        do {
            list.add(T(bmkVar, bkmVar));
            if (this.f21276a.F() || this.f21279d != 0) {
                return;
            } else {
                iP = this.f21276a.p();
            }
        } while (iP == i2);
        this.f21279d = iP;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void G(List<Integer> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof bky)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 2) {
                int iQ = this.f21276a.q();
                W(iQ);
                int iG = this.f21276a.g() + iQ;
                do {
                    list.add(Integer.valueOf(this.f21276a.n()));
                } while (this.f21276a.g() < iG);
                return;
            }
            if (iB != 5) {
                throw blf.a();
            }
            do {
                list.add(Integer.valueOf(this.f21276a.n()));
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP = this.f21276a.p();
                }
            } while (iP == this.f21277b);
            this.f21279d = iP;
            return;
        }
        bky bkyVar = (bky) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 2) {
            int iQ2 = this.f21276a.q();
            W(iQ2);
            int iG2 = this.f21276a.g() + iQ2;
            do {
                bkyVar.g(this.f21276a.n());
            } while (this.f21276a.g() < iG2);
            return;
        }
        if (iB2 != 5) {
            throw blf.a();
        }
        do {
            bkyVar.g(this.f21276a.n());
            if (this.f21276a.F()) {
                return;
            } else {
                iP2 = this.f21276a.p();
            }
        } while (iP2 == this.f21277b);
        this.f21279d = iP2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void H(List<Long> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof blo)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f21276a.w()));
                    if (this.f21276a.F()) {
                        return;
                    } else {
                        iP = this.f21276a.p();
                    }
                } while (iP == this.f21277b);
                this.f21279d = iP;
                return;
            }
            if (iB != 2) {
                throw blf.a();
            }
            int iQ = this.f21276a.q();
            X(iQ);
            int iG = this.f21276a.g() + iQ;
            do {
                list.add(Long.valueOf(this.f21276a.w()));
            } while (this.f21276a.g() < iG);
            return;
        }
        blo bloVar = (blo) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 1) {
            do {
                bloVar.f(this.f21276a.w());
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP2 = this.f21276a.p();
                }
            } while (iP2 == this.f21277b);
            this.f21279d = iP2;
            return;
        }
        if (iB2 != 2) {
            throw blf.a();
        }
        int iQ2 = this.f21276a.q();
        X(iQ2);
        int iG2 = this.f21276a.g() + iQ2;
        do {
            bloVar.f(this.f21276a.w());
        } while (this.f21276a.g() < iG2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void I(List<Integer> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof bky)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f21276a.o()));
                    if (this.f21276a.F()) {
                        return;
                    } else {
                        iP = this.f21276a.p();
                    }
                } while (iP == this.f21277b);
                this.f21279d = iP;
                return;
            }
            if (iB != 2) {
                throw blf.a();
            }
            int iG = this.f21276a.g() + this.f21276a.q();
            do {
                list.add(Integer.valueOf(this.f21276a.o()));
            } while (this.f21276a.g() < iG);
            U(iG);
            return;
        }
        bky bkyVar = (bky) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 0) {
            do {
                bkyVar.g(this.f21276a.o());
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP2 = this.f21276a.p();
                }
            } while (iP2 == this.f21277b);
            this.f21279d = iP2;
            return;
        }
        if (iB2 != 2) {
            throw blf.a();
        }
        int iG2 = this.f21276a.g() + this.f21276a.q();
        do {
            bkyVar.g(this.f21276a.o());
        } while (this.f21276a.g() < iG2);
        U(iG2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void J(List<Long> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof blo)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f21276a.x()));
                    if (this.f21276a.F()) {
                        return;
                    } else {
                        iP = this.f21276a.p();
                    }
                } while (iP == this.f21277b);
                this.f21279d = iP;
                return;
            }
            if (iB != 2) {
                throw blf.a();
            }
            int iG = this.f21276a.g() + this.f21276a.q();
            do {
                list.add(Long.valueOf(this.f21276a.x()));
            } while (this.f21276a.g() < iG);
            U(iG);
            return;
        }
        blo bloVar = (blo) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 0) {
            do {
                bloVar.f(this.f21276a.x());
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP2 = this.f21276a.p();
                }
            } while (iP2 == this.f21277b);
            this.f21279d = iP2;
            return;
        }
        if (iB2 != 2) {
            throw blf.a();
        }
        int iG2 = this.f21276a.g() + this.f21276a.q();
        do {
            bloVar.f(this.f21276a.x());
        } while (this.f21276a.g() < iG2);
        U(iG2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void K(List<String> list) throws blf {
        L(list, false);
    }

    public final void L(List<String> list, boolean z) throws blf {
        int iP;
        int iP2;
        if (bnp.b(this.f21277b) != 2) {
            throw blf.a();
        }
        if (!(list instanceof blk) || z) {
            do {
                list.add(z ? u() : t());
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP = this.f21276a.p();
                }
            } while (iP == this.f21277b);
            this.f21279d = iP;
            return;
        }
        blk blkVar = (blk) list;
        do {
            blkVar.i(p());
            if (this.f21276a.F()) {
                return;
            } else {
                iP2 = this.f21276a.p();
            }
        } while (iP2 == this.f21277b);
        this.f21279d = iP2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void M(List<String> list) throws blf {
        L(list, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void N(List<Integer> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof bky)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f21276a.q()));
                    if (this.f21276a.F()) {
                        return;
                    } else {
                        iP = this.f21276a.p();
                    }
                } while (iP == this.f21277b);
                this.f21279d = iP;
                return;
            }
            if (iB != 2) {
                throw blf.a();
            }
            int iG = this.f21276a.g() + this.f21276a.q();
            do {
                list.add(Integer.valueOf(this.f21276a.q()));
            } while (this.f21276a.g() < iG);
            U(iG);
            return;
        }
        bky bkyVar = (bky) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 0) {
            do {
                bkyVar.g(this.f21276a.q());
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP2 = this.f21276a.p();
                }
            } while (iP2 == this.f21277b);
            this.f21279d = iP2;
            return;
        }
        if (iB2 != 2) {
            throw blf.a();
        }
        int iG2 = this.f21276a.g() + this.f21276a.q();
        do {
            bkyVar.g(this.f21276a.q());
        } while (this.f21276a.g() < iG2);
        U(iG2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void O(List<Long> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof blo)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f21276a.y()));
                    if (this.f21276a.F()) {
                        return;
                    } else {
                        iP = this.f21276a.p();
                    }
                } while (iP == this.f21277b);
                this.f21279d = iP;
                return;
            }
            if (iB != 2) {
                throw blf.a();
            }
            int iG = this.f21276a.g() + this.f21276a.q();
            do {
                list.add(Long.valueOf(this.f21276a.y()));
            } while (this.f21276a.g() < iG);
            U(iG);
            return;
        }
        blo bloVar = (blo) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 0) {
            do {
                bloVar.f(this.f21276a.y());
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP2 = this.f21276a.p();
                }
            } while (iP2 == this.f21277b);
            this.f21279d = iP2;
            return;
        }
        if (iB2 != 2) {
            throw blf.a();
        }
        int iG2 = this.f21276a.g() + this.f21276a.q();
        do {
            bloVar.f(this.f21276a.y());
        } while (this.f21276a.g() < iG2);
        U(iG2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final boolean P() throws ble {
        V(0);
        return this.f21276a.G();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final boolean Q() {
        int i2;
        if (this.f21276a.F() || (i2 = this.f21277b) == this.f21278c) {
            return false;
        }
        return this.f21276a.H(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r6.put(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        return;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void R(java.util.Map<K, V> r6, com.google.ads.interactivemedia.v3.internal.bls<K, V> r7) throws com.google.ads.interactivemedia.v3.internal.blf {
        /*
            r5 = this;
            r0 = 2
            r5.V(r0)
            com.google.ads.interactivemedia.v3.internal.bke r1 = r5.f21276a
            int r1 = r1.q()
            com.google.ads.interactivemedia.v3.internal.bke r2 = r5.f21276a
            int r1 = r2.h(r1)
            K r7 = r7.f21371b
        L12:
            int r7 = r5.c()     // Catch: java.lang.Throwable -> L53
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r7 == r2) goto L4a
            com.google.ads.interactivemedia.v3.internal.bke r2 = r5.f21276a     // Catch: java.lang.Throwable -> L53
            boolean r2 = r2.F()     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L25
            goto L4a
        L25:
            r2 = 1
            java.lang.String r4 = "Unable to parse map entry."
            if (r7 == r2) goto L3a
            if (r7 == r0) goto L39
            boolean r7 = r5.Q()     // Catch: com.google.ads.interactivemedia.v3.internal.ble -> L3d java.lang.Throwable -> L53
            if (r7 == 0) goto L33
            goto L12
        L33:
            com.google.ads.interactivemedia.v3.internal.blf r7 = new com.google.ads.interactivemedia.v3.internal.blf     // Catch: com.google.ads.interactivemedia.v3.internal.ble -> L3d java.lang.Throwable -> L53
            r7.<init>(r4)     // Catch: com.google.ads.interactivemedia.v3.internal.ble -> L3d java.lang.Throwable -> L53
            throw r7     // Catch: com.google.ads.interactivemedia.v3.internal.ble -> L3d java.lang.Throwable -> L53
        L39:
            throw r3     // Catch: com.google.ads.interactivemedia.v3.internal.ble -> L3d java.lang.Throwable -> L53
        L3a:
            int r7 = com.google.ads.interactivemedia.v3.internal.bkf.f21275b     // Catch: com.google.ads.interactivemedia.v3.internal.ble -> L3d java.lang.Throwable -> L53
            throw r3     // Catch: com.google.ads.interactivemedia.v3.internal.ble -> L3d java.lang.Throwable -> L53
        L3d:
            boolean r7 = r5.Q()     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L44
            goto L12
        L44:
            com.google.ads.interactivemedia.v3.internal.blf r6 = new com.google.ads.interactivemedia.v3.internal.blf     // Catch: java.lang.Throwable -> L53
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L53
            throw r6     // Catch: java.lang.Throwable -> L53
        L4a:
            r6.put(r3, r3)     // Catch: java.lang.Throwable -> L53
            com.google.ads.interactivemedia.v3.internal.bke r6 = r5.f21276a
            r6.D(r1)
            return
        L53:
            r6 = move-exception
            com.google.ads.interactivemedia.v3.internal.bke r7 = r5.f21276a
            r7.D(r1)
            goto L5b
        L5a:
            throw r6
        L5b:
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bkg.R(java.util.Map, com.google.ads.interactivemedia.v3.internal.bls):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final double a() throws ble {
        V(1);
        return this.f21276a.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final float b() throws ble {
        V(5);
        return this.f21276a.f();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final int c() throws blf {
        int iP = this.f21279d;
        if (iP != 0) {
            this.f21277b = iP;
            this.f21279d = 0;
        } else {
            iP = this.f21276a.p();
            this.f21277b = iP;
        }
        if (iP == 0 || iP == this.f21278c) {
            return Integer.MAX_VALUE;
        }
        return bnp.a(iP);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final int d() {
        return this.f21277b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final int e() throws ble {
        V(0);
        return this.f21276a.i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final int f() throws ble {
        V(5);
        return this.f21276a.j();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final int g() throws ble {
        V(0);
        return this.f21276a.k();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final int h() throws ble {
        V(5);
        return this.f21276a.n();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final int i() throws ble {
        V(0);
        return this.f21276a.o();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final int j() throws ble {
        V(0);
        return this.f21276a.q();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final long k() throws ble {
        V(1);
        return this.f21276a.r();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final long l() throws ble {
        V(0);
        return this.f21276a.s();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final long m() throws ble {
        V(1);
        return this.f21276a.w();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final long n() throws ble {
        V(0);
        return this.f21276a.x();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final long o() throws ble {
        V(0);
        return this.f21276a.y();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final bkd p() throws ble {
        V(2);
        return this.f21276a.z();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final <T> T r(bmk<T> bmkVar, bkm bkmVar) throws ble {
        V(3);
        return (T) S(bmkVar, bkmVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final <T> T s(bmk<T> bmkVar, bkm bkmVar) throws ble {
        V(2);
        return (T) T(bmkVar, bkmVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final String t() throws ble {
        V(2);
        return this.f21276a.A();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final String u() throws ble {
        V(2);
        return this.f21276a.B();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void v(List<Boolean> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof bjv)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f21276a.G()));
                    if (this.f21276a.F()) {
                        return;
                    } else {
                        iP = this.f21276a.p();
                    }
                } while (iP == this.f21277b);
                this.f21279d = iP;
                return;
            }
            if (iB != 2) {
                throw blf.a();
            }
            int iG = this.f21276a.g() + this.f21276a.q();
            do {
                list.add(Boolean.valueOf(this.f21276a.G()));
            } while (this.f21276a.g() < iG);
            U(iG);
            return;
        }
        bjv bjvVar = (bjv) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 0) {
            do {
                bjvVar.e(this.f21276a.G());
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP2 = this.f21276a.p();
                }
            } while (iP2 == this.f21277b);
            this.f21279d = iP2;
            return;
        }
        if (iB2 != 2) {
            throw blf.a();
        }
        int iG2 = this.f21276a.g() + this.f21276a.q();
        do {
            bjvVar.e(this.f21276a.G());
        } while (this.f21276a.g() < iG2);
        U(iG2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void w(List<bkd> list) throws blf {
        int iP;
        if (bnp.b(this.f21277b) != 2) {
            throw blf.a();
        }
        do {
            list.add(p());
            if (this.f21276a.F()) {
                return;
            } else {
                iP = this.f21276a.p();
            }
        } while (iP == this.f21277b);
        this.f21279d = iP;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void x(List<Double> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof bkk)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f21276a.e()));
                    if (this.f21276a.F()) {
                        return;
                    } else {
                        iP = this.f21276a.p();
                    }
                } while (iP == this.f21277b);
                this.f21279d = iP;
                return;
            }
            if (iB != 2) {
                throw blf.a();
            }
            int iQ = this.f21276a.q();
            X(iQ);
            int iG = this.f21276a.g() + iQ;
            do {
                list.add(Double.valueOf(this.f21276a.e()));
            } while (this.f21276a.g() < iG);
            return;
        }
        bkk bkkVar = (bkk) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 1) {
            do {
                bkkVar.e(this.f21276a.e());
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP2 = this.f21276a.p();
                }
            } while (iP2 == this.f21277b);
            this.f21279d = iP2;
            return;
        }
        if (iB2 != 2) {
            throw blf.a();
        }
        int iQ2 = this.f21276a.q();
        X(iQ2);
        int iG2 = this.f21276a.g() + iQ2;
        do {
            bkkVar.e(this.f21276a.e());
        } while (this.f21276a.g() < iG2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void y(List<Integer> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof bky)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f21276a.i()));
                    if (this.f21276a.F()) {
                        return;
                    } else {
                        iP = this.f21276a.p();
                    }
                } while (iP == this.f21277b);
                this.f21279d = iP;
                return;
            }
            if (iB != 2) {
                throw blf.a();
            }
            int iG = this.f21276a.g() + this.f21276a.q();
            do {
                list.add(Integer.valueOf(this.f21276a.i()));
            } while (this.f21276a.g() < iG);
            U(iG);
            return;
        }
        bky bkyVar = (bky) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 0) {
            do {
                bkyVar.g(this.f21276a.i());
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP2 = this.f21276a.p();
                }
            } while (iP2 == this.f21277b);
            this.f21279d = iP2;
            return;
        }
        if (iB2 != 2) {
            throw blf.a();
        }
        int iG2 = this.f21276a.g() + this.f21276a.q();
        do {
            bkyVar.g(this.f21276a.i());
        } while (this.f21276a.g() < iG2);
        U(iG2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmj
    public final void z(List<Integer> list) throws blf {
        int iP;
        int iP2;
        if (!(list instanceof bky)) {
            int iB = bnp.b(this.f21277b);
            if (iB == 2) {
                int iQ = this.f21276a.q();
                W(iQ);
                int iG = this.f21276a.g() + iQ;
                do {
                    list.add(Integer.valueOf(this.f21276a.j()));
                } while (this.f21276a.g() < iG);
                return;
            }
            if (iB != 5) {
                throw blf.a();
            }
            do {
                list.add(Integer.valueOf(this.f21276a.j()));
                if (this.f21276a.F()) {
                    return;
                } else {
                    iP = this.f21276a.p();
                }
            } while (iP == this.f21277b);
            this.f21279d = iP;
            return;
        }
        bky bkyVar = (bky) list;
        int iB2 = bnp.b(this.f21277b);
        if (iB2 == 2) {
            int iQ2 = this.f21276a.q();
            W(iQ2);
            int iG2 = this.f21276a.g() + iQ2;
            do {
                bkyVar.g(this.f21276a.j());
            } while (this.f21276a.g() < iG2);
            return;
        }
        if (iB2 != 5) {
            throw blf.a();
        }
        do {
            bkyVar.g(this.f21276a.j());
            if (this.f21276a.F()) {
                return;
            } else {
                iP2 = this.f21276a.p();
            }
        } while (iP2 == this.f21277b);
        this.f21279d = iP2;
    }
}
