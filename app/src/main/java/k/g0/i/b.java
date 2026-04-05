package k.g0.i;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);

    public final int httpCode;

    b(int i2) {
        this.httpCode = i2;
    }

    public static b fromHttp2(int i2) {
        for (b bVar : values()) {
            if (bVar.httpCode == i2) {
                return bVar;
            }
        }
        return null;
    }
}
