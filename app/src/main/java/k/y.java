package k;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public enum y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final String protocol;

    y(String str) {
        this.protocol = str;
    }

    public static y get(String str) throws IOException {
        y yVar = HTTP_1_0;
        if (str.equals(yVar.protocol)) {
            return yVar;
        }
        y yVar2 = HTTP_1_1;
        if (str.equals(yVar2.protocol)) {
            return yVar2;
        }
        y yVar3 = HTTP_2;
        if (str.equals(yVar3.protocol)) {
            return yVar3;
        }
        y yVar4 = SPDY_3;
        if (str.equals(yVar4.protocol)) {
            return yVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
