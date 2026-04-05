package c.f.a.c.j.h;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class w6 extends IOException {
    public w6(String str) {
        super(str);
    }

    public static w6 a() {
        return new w6("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static w6 b() {
        return new w6("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static w6 c() {
        return new w6("Protocol message contained an invalid tag (zero).");
    }

    public static v6 d() {
        return new v6("Protocol message tag had invalid wire type.");
    }

    public static w6 e() {
        return new w6("Failed to parse the message.");
    }

    public static w6 f() {
        return new w6("Protocol message had invalid UTF-8.");
    }
}
