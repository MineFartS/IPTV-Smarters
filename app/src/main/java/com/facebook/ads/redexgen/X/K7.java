package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class K7 {
    public final AdErrorType A00;
    public final String A01;

    public K7(int i2, String str) {
        this(AdErrorType.adErrorTypeFromCode(i2), str);
    }

    public K7(AdErrorType adErrorType, @Nullable String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static AdError A00(K7 k7) {
        if (k7.A04().isPublicError()) {
            return new AdError(k7.A04().getErrorCode(), k7.A05());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }

    public static K7 A01(AdErrorType adErrorType) {
        return new K7(adErrorType, (String) null);
    }

    public static K7 A02(AdErrorType adErrorType, @Nullable String str) {
        return new K7(adErrorType, str);
    }

    public static K7 A03(K8 k8) {
        return new K7(k8.A00(), k8.A01());
    }

    public final AdErrorType A04() {
        return this.A00;
    }

    public final String A05() {
        return this.A01;
    }
}
