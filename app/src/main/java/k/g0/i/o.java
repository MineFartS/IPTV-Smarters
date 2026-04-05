package k.g0.i;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f30837b;

    public o(b bVar) {
        super("stream was reset: " + bVar);
        this.f30837b = bVar;
    }
}
