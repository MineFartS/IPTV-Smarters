package h.l.c;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class g {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) d(new IllegalStateException(str + " must not be null")));
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            g(str);
        }
    }

    public static <T extends Throwable> T d(T t) {
        return (T) e(t, g.class.getName());
    }

    public static <T extends Throwable> T e(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }

    public static void f() {
        throw ((h.a) d(new h.a()));
    }

    public static void g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        throw ((IllegalArgumentException) d(new IllegalArgumentException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + InstructionFileId.DOT + stackTraceElement.getMethodName() + ", parameter " + str)));
    }
}
