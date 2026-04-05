package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.event.ProgressEvent;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public enum o implements bkz {
    ERROR_ENCODE_SIZE_FAIL(1),
    ERROR_UNKNOWN(3),
    ERROR_NO_SIGNALS(5),
    ERROR_ENCRYPTION(7),
    ERROR_MEMORY(9),
    ERROR_SIMULATOR(11),
    ERROR_SERVICE(13),
    ERROR_THREAD(15),
    PSN_WEB64_FAIL(2),
    PSN_DECRYPT_SIZE_FAIL(4),
    PSN_MD5_CHECK_FAIL(8),
    PSN_MD5_SIZE_FAIL(16),
    PSN_MD5_FAIL(32),
    PSN_DECODE_FAIL(64),
    PSN_SALT_FAIL(128),
    PSN_BITSLICER_FAIL(256),
    PSN_REQUEST_TYPE_FAIL(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED),
    PSN_INVALID_ERROR_CODE(1024),
    PSN_TIMESTAMP_EXPIRED(2048),
    PSN_ENCODE_SIZE_FAIL(ProgressEvent.PART_FAILED_EVENT_CODE),
    PSN_BLANK_VALUE(8192),
    PSN_INITIALIZATION_FAIL(16384),
    PSN_GASS_CLIENT_FAIL(32768),
    PSN_SIGNALS_TIMEOUT(65536),
    PSN_TINK_FAIL(131072);

    private final int A;

    o(int i2) {
        this.A = i2;
    }

    public final int a() {
        return this.A;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + o.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.A + " name=" + name() + '>';
    }
}
