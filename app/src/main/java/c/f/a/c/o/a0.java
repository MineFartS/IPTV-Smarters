package c.f.a.c.o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f14566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f14567c;

    public a0(b0 b0Var, i iVar) {
        this.f14567c = b0Var;
        this.f14566b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            i iVarA = this.f14567c.f14569b.a(this.f14566b.k());
            if (iVarA == null) {
                this.f14567c.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = k.f14585b;
            iVarA.g(executor, this.f14567c);
            iVarA.e(executor, this.f14567c);
            iVarA.a(executor, this.f14567c);
        } catch (g e2) {
            if (e2.getCause() instanceof Exception) {
                this.f14567c.onFailure((Exception) e2.getCause());
            } else {
                this.f14567c.onFailure(e2);
            }
        } catch (CancellationException unused) {
            this.f14567c.c();
        } catch (Exception e3) {
            this.f14567c.onFailure(e3);
        }
    }
}
