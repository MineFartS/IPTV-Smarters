package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GK {

    @Nullable
    public final String A00;

    @NonNull
    public final String A01;

    @Nullable
    public final String A02;

    public GK(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GK gk = (GK) obj;
        return J1.A0k(this.A01, gk.A01) && J1.A0k(this.A02, gk.A02) && J1.A0k(this.A00, gk.A00);
    }

    public final int hashCode() {
        String str = this.A01;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.A02;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A00;
        int result = str3 != null ? str3.hashCode() : 0;
        return iHashCode2 + result;
    }
}
