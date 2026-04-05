package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import h.c;
import h.d;
import h.k.a;
import h.l.c.g;
import h.l.c.j;
import h.l.c.l;
import h.n.e;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class AndroidExceptionPreHandler extends a implements CoroutineExceptionHandler, h.l.b.a<Method> {
    public static final /* synthetic */ e[] $$delegatedProperties = {l.b(new j(l.a(AndroidExceptionPreHandler.class), "preHandler", "getPreHandler()Ljava/lang/reflect/Method;"))};
    private final c preHandler$delegate;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.d0);
        this.preHandler$delegate = d.a(this);
    }

    private final Method getPreHandler() {
        c cVar = this.preHandler$delegate;
        e eVar = $$delegatedProperties[0];
        return (Method) cVar.getValue();
    }

    public void handleException(@NotNull h.k.d dVar, @NotNull Throwable th) {
        g.c(dVar, "context");
        g.c(th, "exception");
        Thread threadCurrentThread = Thread.currentThread();
        if (Build.VERSION.SDK_INT >= 28) {
            g.b(threadCurrentThread, "thread");
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            return;
        }
        Method preHandler = getPreHandler();
        Object objInvoke = preHandler != null ? preHandler.invoke(null, new Object[0]) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) (objInvoke instanceof Thread.UncaughtExceptionHandler ? objInvoke : null);
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(threadCurrentThread, th);
        }
    }

    @Override // h.l.b.a
    @Nullable
    public Method invoke() {
        try {
            boolean z = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            g.b(declaredMethod, "it");
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z = true;
                }
            }
            if (z) {
                return declaredMethod;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
