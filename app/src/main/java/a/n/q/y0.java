package a.n.q;

import a.n.q.x0;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends x0 {
    /* JADX WARN: Code restructure failed: missing block: B:101:0x012e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x012f, code lost:
    
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0146, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2 A[PHI: r9
  0x00c2: PHI (r9v24 int) = (r9v13 int), (r9v4 int) binds: [B:77:0x00e5, B:65:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6 A[PHI: r9
  0x00c6: PHI (r9v17 int) = (r9v13 int), (r9v4 int) binds: [B:77:0x00e5, B:65:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff A[LOOP:2: B:84:0x00ff->B:100:0x0123, LOOP_START, PHI: r6 r9 r10
  0x00ff: PHI (r6v13 int) = (r6v6 int), (r6v18 int) binds: [B:83:0x00fd, B:100:0x0123] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r9v20 int) = (r9v18 int), (r9v21 int) binds: [B:83:0x00fd, B:100:0x0123] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r10v5 int) = (r10v4 int), (r10v7 int) binds: [B:83:0x00fd, B:100:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.n.q.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean J(int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.q.y0.J(int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x012c, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0143, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0 A[PHI: r8
  0x00c0: PHI (r8v23 int) = (r8v14 int), (r8v4 int) binds: [B:76:0x00e0, B:63:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3 A[PHI: r8
  0x00c3: PHI (r8v16 int) = (r8v14 int), (r8v4 int) binds: [B:76:0x00e0, B:63:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc A[LOOP:2: B:84:0x00fc->B:100:0x0120, LOOP_START, PHI: r5 r8 r9
  0x00fc: PHI (r5v13 int) = (r5v6 int), (r5v19 int) binds: [B:83:0x00fa, B:100:0x0120] A[DONT_GENERATE, DONT_INLINE]
  0x00fc: PHI (r8v19 int) = (r8v17 int), (r8v20 int) binds: [B:83:0x00fa, B:100:0x0120] A[DONT_GENERATE, DONT_INLINE]
  0x00fc: PHI (r9v5 int) = (r9v4 int), (r9v7 int) binds: [B:83:0x00fa, B:100:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.n.q.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Q(int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.q.y0.Q(int, boolean):boolean");
    }

    public final int R(boolean z) {
        boolean z2 = false;
        if (z) {
            for (int i2 = this.f2831g; i2 >= this.f2830f; i2--) {
                int i3 = q(i2).f2834a;
                if (i3 == 0) {
                    z2 = true;
                } else if (z2 && i3 == this.f2829e - 1) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i4 = this.f2830f; i4 <= this.f2831g; i4++) {
            int i5 = q(i4).f2834a;
            if (i5 == this.f2829e - 1) {
                z2 = true;
            } else if (z2 && i5 == 0) {
                return i4;
            }
        }
        return -1;
    }

    public int S(int i2) {
        x0.a aVarN;
        int i3 = this.f2830f;
        if (i3 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.f2827c) {
            int iC = this.f2826b.c(i3);
            if (q(this.f2830f).f2834a == i2) {
                return iC;
            }
            int i4 = this.f2830f;
            do {
                i4++;
                if (i4 <= M()) {
                    aVarN = q(i4);
                    iC += aVarN.f2978b;
                }
            } while (aVarN.f2834a != i2);
            return iC;
        }
        int iC2 = this.f2826b.c(this.f2831g);
        x0.a aVarN2 = q(this.f2831g);
        if (aVarN2.f2834a != i2) {
            int i5 = this.f2831g;
            do {
                i5--;
                if (i5 >= L()) {
                    iC2 -= aVarN2.f2978b;
                    aVarN2 = q(i5);
                }
            } while (aVarN2.f2834a != i2);
        }
        return iC2 + aVarN2.f2979c;
        return Integer.MIN_VALUE;
    }

    public int T(int i2) {
        x0.a aVarN;
        int i3 = this.f2830f;
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        if (this.f2827c) {
            int iC = this.f2826b.c(this.f2831g);
            x0.a aVarN2 = q(this.f2831g);
            if (aVarN2.f2834a != i2) {
                int i4 = this.f2831g;
                do {
                    i4--;
                    if (i4 >= L()) {
                        iC -= aVarN2.f2978b;
                        aVarN2 = q(i4);
                    }
                } while (aVarN2.f2834a != i2);
            }
            return iC - aVarN2.f2979c;
        }
        int iC2 = this.f2826b.c(i3);
        if (q(this.f2830f).f2834a == i2) {
            return iC2;
        }
        int i5 = this.f2830f;
        do {
            i5++;
            if (i5 <= M()) {
                aVarN = q(i5);
                iC2 += aVarN.f2978b;
            }
        } while (aVarN.f2834a != i2);
        return iC2;
        return Integer.MAX_VALUE;
    }

    @Override // a.n.q.j
    public int i(boolean z, int i2, int[] iArr) {
        int i3;
        int iC = this.f2826b.c(i2);
        x0.a aVarN = q(i2);
        int i4 = aVarN.f2834a;
        if (this.f2827c) {
            i3 = i4;
            int i5 = i3;
            int i6 = 1;
            int i7 = iC;
            for (int i8 = i2 + 1; i6 < this.f2829e && i8 <= this.f2831g; i8++) {
                x0.a aVarN2 = q(i8);
                i7 += aVarN2.f2978b;
                int i9 = aVarN2.f2834a;
                if (i9 != i5) {
                    i6++;
                    if (!z ? i7 >= iC : i7 <= iC) {
                        i5 = i9;
                    } else {
                        iC = i7;
                        i2 = i8;
                        i3 = i9;
                        i5 = i3;
                    }
                }
            }
        } else {
            int i10 = 1;
            int i11 = i4;
            x0.a aVarN3 = aVarN;
            int i12 = iC;
            iC = this.f2826b.b(i2) + iC;
            i3 = i11;
            for (int i13 = i2 - 1; i10 < this.f2829e && i13 >= this.f2830f; i13--) {
                i12 -= aVarN3.f2978b;
                aVarN3 = q(i13);
                int i14 = aVarN3.f2834a;
                if (i14 != i11) {
                    i10++;
                    int iB = this.f2826b.b(i13) + i12;
                    if (!z ? iB >= iC : iB <= iC) {
                        i11 = i14;
                    } else {
                        iC = iB;
                        i2 = i13;
                        i3 = i14;
                        i11 = i3;
                    }
                }
            }
        }
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i2;
        }
        return iC;
    }

    @Override // a.n.q.j
    public int k(boolean z, int i2, int[] iArr) {
        int iB;
        int iC = this.f2826b.c(i2);
        x0.a aVarN = q(i2);
        int i3 = aVarN.f2834a;
        if (this.f2827c) {
            int i4 = 1;
            iB = iC - this.f2826b.b(i2);
            int i5 = i3;
            for (int i6 = i2 - 1; i4 < this.f2829e && i6 >= this.f2830f; i6--) {
                iC -= aVarN.f2978b;
                aVarN = q(i6);
                int i7 = aVarN.f2834a;
                if (i7 != i5) {
                    i4++;
                    int iB2 = iC - this.f2826b.b(i6);
                    if (!z ? iB2 >= iB : iB2 <= iB) {
                        i5 = i7;
                    } else {
                        iB = iB2;
                        i2 = i6;
                        i3 = i7;
                        i5 = i3;
                    }
                }
            }
        } else {
            int i8 = i3;
            int i9 = i8;
            int i10 = 1;
            int i11 = iC;
            for (int i12 = i2 + 1; i10 < this.f2829e && i12 <= this.f2831g; i12++) {
                x0.a aVarN2 = q(i12);
                i11 += aVarN2.f2978b;
                int i13 = aVarN2.f2834a;
                if (i13 != i9) {
                    i10++;
                    if (!z ? i11 >= iC : i11 <= iC) {
                        i9 = i13;
                    } else {
                        iC = i11;
                        i2 = i12;
                        i8 = i13;
                        i9 = i8;
                    }
                }
            }
            iB = iC;
            i3 = i8;
        }
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i2;
        }
        return iB;
    }
}
