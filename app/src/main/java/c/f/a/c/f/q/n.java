package c.f.a.c.f.q;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f12641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f12642b;

        public /* synthetic */ a(Object obj, u0 u0Var) {
            o.i(obj);
            this.f12642b = obj;
            this.f12641a = new ArrayList();
        }

        @RecentlyNonNull
        public a a(@RecentlyNonNull String str, Object obj) {
            List<String> list = this.f12641a;
            o.i(str);
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + strValueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(strValueOf);
            list.add(sb.toString());
            return this;
        }

        @RecentlyNonNull
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f12642b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f12641a.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(this.f12641a.get(i2));
                if (i2 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(@RecentlyNonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @RecentlyNonNull
    public static a c(@RecentlyNonNull Object obj) {
        return new a(obj, null);
    }
}
