package i.a;

import h.k.d;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface a extends d.b {
    public static final b e0 = b.f30390a;

    /* JADX INFO: renamed from: i.a.a$a, reason: collision with other inner class name */
    public static final class C0308a {
        public static /* synthetic */ void a(a aVar, CancellationException cancellationException, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                cancellationException = null;
            }
            aVar.a(cancellationException);
        }
    }

    public static final class b implements d.c<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f30390a = new b();

        static {
            CoroutineExceptionHandler.a aVar = CoroutineExceptionHandler.d0;
        }
    }

    void a(@Nullable CancellationException cancellationException);
}
