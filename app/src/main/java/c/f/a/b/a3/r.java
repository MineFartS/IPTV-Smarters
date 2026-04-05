package c.f.a.b.a3;

import android.media.MediaCodec;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public class r extends c.f.a.b.v2.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f6477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6478c;

    public r(Throwable th, s sVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        sb.append(sVar == null ? null : sVar.f6479a);
        super(sb.toString(), th);
        this.f6477b = sVar;
        this.f6478c = x0.f9296a >= 21 ? a(th) : null;
    }

    public static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
