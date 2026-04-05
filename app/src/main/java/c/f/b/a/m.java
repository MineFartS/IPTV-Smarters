package c.f.b.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.b.a.c f15793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f15795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15796d;

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.f.b.a.c f15797a;

        /* JADX INFO: renamed from: c.f.b.a.m$a$a, reason: collision with other inner class name */
        public class C0184a extends b {
            public C0184a(m mVar, CharSequence charSequence) {
                super(mVar, charSequence);
            }

            @Override // c.f.b.a.m.b
            public int f(int i2) {
                return i2 + 1;
            }

            @Override // c.f.b.a.m.b
            public int g(int i2) {
                return a.this.f15797a.c(this.f15799d, i2);
            }
        }

        public a(c.f.b.a.c cVar) {
            this.f15797a = cVar;
        }

        @Override // c.f.b.a.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(m mVar, CharSequence charSequence) {
            return new C0184a(mVar, charSequence);
        }
    }

    public static abstract class b extends c.f.b.a.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CharSequence f15799d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c.f.b.a.c f15800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f15801f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15802g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15803h;

        public b(m mVar, CharSequence charSequence) {
            this.f15800e = mVar.f15793a;
            this.f15801f = mVar.f15794b;
            this.f15803h = mVar.f15796d;
            this.f15799d = charSequence;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (r0 >= r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        
            if (r6.f15800e.e(r6.f15799d.charAt(r0)) == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        
            r0 = r0 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        
            if (r1 <= r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        
            if (r6.f15800e.e(r6.f15799d.charAt(r1 - 1)) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        
            r1 = r1 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        
            if (r6.f15801f == false) goto L39;
         */
        @Override // c.f.b.a.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String a() {
            /*
                r6 = this;
            L0:
                int r0 = r6.f15802g
            L2:
                int r1 = r6.f15802g
                r2 = -1
                if (r1 == r2) goto L8e
                int r1 = r6.g(r1)
                if (r1 != r2) goto L16
                java.lang.CharSequence r1 = r6.f15799d
                int r1 = r1.length()
                r6.f15802g = r2
                goto L1c
            L16:
                int r3 = r6.f(r1)
                r6.f15802g = r3
            L1c:
                int r3 = r6.f15802g
                if (r3 != r0) goto L2f
                int r3 = r3 + 1
                r6.f15802g = r3
                java.lang.CharSequence r1 = r6.f15799d
                int r1 = r1.length()
                if (r3 <= r1) goto L2
                r6.f15802g = r2
                goto L2
            L2f:
                if (r0 >= r1) goto L42
                c.f.b.a.c r3 = r6.f15800e
                java.lang.CharSequence r4 = r6.f15799d
                char r4 = r4.charAt(r0)
                boolean r3 = r3.e(r4)
                if (r3 == 0) goto L42
                int r0 = r0 + 1
                goto L2f
            L42:
                if (r1 <= r0) goto L57
                c.f.b.a.c r3 = r6.f15800e
                java.lang.CharSequence r4 = r6.f15799d
                int r5 = r1 + (-1)
                char r4 = r4.charAt(r5)
                boolean r3 = r3.e(r4)
                if (r3 == 0) goto L57
                int r1 = r1 + (-1)
                goto L42
            L57:
                boolean r3 = r6.f15801f
                if (r3 == 0) goto L5e
                if (r0 != r1) goto L5e
                goto L0
            L5e:
                int r3 = r6.f15803h
                r4 = 1
                if (r3 != r4) goto L80
                java.lang.CharSequence r1 = r6.f15799d
                int r1 = r1.length()
                r6.f15802g = r2
            L6b:
                if (r1 <= r0) goto L83
                c.f.b.a.c r2 = r6.f15800e
                java.lang.CharSequence r3 = r6.f15799d
                int r4 = r1 + (-1)
                char r3 = r3.charAt(r4)
                boolean r2 = r2.e(r3)
                if (r2 == 0) goto L83
                int r1 = r1 + (-1)
                goto L6b
            L80:
                int r3 = r3 - r4
                r6.f15803h = r3
            L83:
                java.lang.CharSequence r2 = r6.f15799d
                java.lang.CharSequence r0 = r2.subSequence(r0, r1)
                java.lang.String r0 = r0.toString()
                return r0
            L8e:
                java.lang.Object r0 = r6.b()
                java.lang.String r0 = (java.lang.String) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.b.a.m.b.a():java.lang.String");
        }

        public abstract int f(int i2);

        public abstract int g(int i2);
    }

    public interface c {
        Iterator<String> a(m mVar, CharSequence charSequence);
    }

    public m(c cVar) {
        this(cVar, false, c.f.b.a.c.f(), Integer.MAX_VALUE);
    }

    public m(c cVar, boolean z, c.f.b.a.c cVar2, int i2) {
        this.f15795c = cVar;
        this.f15794b = z;
        this.f15793a = cVar2;
        this.f15796d = i2;
    }

    public static m d(char c2) {
        return e(c.f.b.a.c.d(c2));
    }

    public static m e(c.f.b.a.c cVar) {
        k.j(cVar);
        return new m(new a(cVar));
    }

    public List<String> f(CharSequence charSequence) {
        k.j(charSequence);
        Iterator<String> itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add(itG.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator<String> g(CharSequence charSequence) {
        return this.f15795c.a(this, charSequence);
    }
}
