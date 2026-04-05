package c.h.a.e.d;

import java.util.concurrent.TimeUnit;
import k.x;
import o.m;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static m f16700a;

    public static m a() {
        x.b bVar = new x.b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        x xVarA = bVar.c(120L, timeUnit).g(120L, timeUnit).e(120L, timeUnit).d(false).a();
        m mVar = f16700a;
        if (mVar != null) {
            return mVar;
        }
        m mVarD = new m.b().b("https://cms.alldrama.tv/").a(o.p.a.a.d()).f(xVarA).d();
        f16700a = mVarD;
        return mVarD;
    }
}
