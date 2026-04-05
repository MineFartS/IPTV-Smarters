package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class acz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f19228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final acj[] f19229b;

    public acz(int[] iArr, acj[] acjVarArr) {
        this.f19228a = iArr;
        this.f19229b = acjVarArr;
    }

    public final void a(long j2) {
        for (acj acjVar : this.f19229b) {
            acjVar.B(j2);
        }
    }

    public final int[] b() {
        int[] iArr = new int[this.f19229b.length];
        int i2 = 0;
        while (true) {
            acj[] acjVarArr = this.f19229b;
            if (i2 >= acjVarArr.length) {
                return iArr;
            }
            iArr[i2] = acjVarArr[i2].j();
            i2++;
        }
    }

    public final sf c(int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f19228a;
            if (i3 >= iArr.length) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i2);
                Log.e("BaseMediaChunkOutput", sb.toString());
                return new ri();
            }
            if (i2 == iArr[i3]) {
                return this.f19229b[i3];
            }
            i3++;
        }
    }
}
