package c.f.b.a;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15788a;

    public class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f15789b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, String str) {
            super(gVar, null);
            this.f15789b = str;
        }

        @Override // c.f.b.a.g
        public CharSequence g(@NullableDecl Object obj) {
            return obj == null ? this.f15789b : g.this.g(obj);
        }

        @Override // c.f.b.a.g
        public g h(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    public g(g gVar) {
        this.f15788a = gVar.f15788a;
    }

    public /* synthetic */ g(g gVar, a aVar) {
        this(gVar);
    }

    public g(String str) {
        this.f15788a = (String) k.j(str);
    }

    public static g e(char c2) {
        return new g(String.valueOf(c2));
    }

    public static g f(String str) {
        return new g(str);
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A a(A a2, Iterator<?> it) throws IOException {
        k.j(a2);
        if (it.hasNext()) {
            while (true) {
                a2.append(g(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                a2.append(this.f15788a);
            }
        }
        return a2;
    }

    @CanIgnoreReturnValue
    public final StringBuilder b(StringBuilder sb, Iterator<?> it) {
        try {
            a(sb, it);
            return sb;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String c(Iterable<?> iterable) {
        return d(iterable.iterator());
    }

    public final String d(Iterator<?> it) {
        return b(new StringBuilder(), it).toString();
    }

    public CharSequence g(Object obj) {
        k.j(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public g h(String str) {
        k.j(str);
        return new a(this, str);
    }
}
