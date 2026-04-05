package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1274az implements InterfaceC0708Gb {
    public final C0731Gy A00;
    public final Map<String, H4> A01;
    public final Map<String, C0732Gz> A02;
    public final long[] A03;

    public C1274az(C0731Gy c0731Gy, Map<String, H4> map, Map<String, C0732Gz> map2) {
        Map<String, H4> mapEmptyMap;
        this.A00 = c0731Gy;
        this.A02 = map2;
        if (map != null) {
            mapEmptyMap = Collections.unmodifiableMap(map);
        } else {
            mapEmptyMap = Collections.emptyMap();
        }
        this.A01 = mapEmptyMap;
        this.A03 = c0731Gy.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final List<C0707Ga> A5r(long j2) {
        return this.A00.A0E(j2, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final long A6G(int i2) {
        return this.A03[i2];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final int A6H() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final int A6b(long j2) {
        int iA0A = J1.A0A(this.A03, j2, false, false);
        if (iA0A < this.A03.length) {
            return iA0A;
        }
        return -1;
    }
}
