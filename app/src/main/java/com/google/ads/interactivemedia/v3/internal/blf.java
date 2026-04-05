package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class blf extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    public blf(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public blf(String str) {
        super(str);
    }

    public static ble a() {
        return new ble();
    }

    public static blf b() {
        return new blf("Protocol message end-group tag did not match expected tag.");
    }

    public static blf c() {
        return new blf("Protocol message contained an invalid tag (zero).");
    }

    public static blf d() {
        return new blf("Protocol message had invalid UTF-8.");
    }

    public static blf e() {
        return new blf("CodedInputStream encountered a malformed varint.");
    }

    public static blf f() {
        return new blf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static blf g() {
        return new blf("Failed to parse the message.");
    }

    public static blf h() {
        return new blf("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
