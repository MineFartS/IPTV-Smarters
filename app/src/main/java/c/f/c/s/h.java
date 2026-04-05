package c.f.c.s;

/* JADX INFO: loaded from: classes2.dex */
public class h extends c.f.c.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f16272b;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public h(a aVar) {
        this.f16272b = aVar;
    }

    public h(String str, a aVar) {
        super(str);
        this.f16272b = aVar;
    }
}
