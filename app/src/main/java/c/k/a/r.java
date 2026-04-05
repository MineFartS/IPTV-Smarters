package c.k.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public enum r {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2-14");

    private final String protocol;

    r(String str) {
        this.protocol = str;
    }

    public static r get(String str) throws IOException {
        r rVar = HTTP_1_0;
        if (str.equals(rVar.protocol)) {
            return rVar;
        }
        r rVar2 = HTTP_1_1;
        if (str.equals(rVar2.protocol)) {
            return rVar2;
        }
        r rVar3 = HTTP_2;
        if (str.equals(rVar3.protocol)) {
            return rVar3;
        }
        r rVar4 = SPDY_3;
        if (str.equals(rVar4.protocol)) {
            return rVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
