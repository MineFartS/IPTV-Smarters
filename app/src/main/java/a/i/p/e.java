package a.i.p;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.i.p.d f1942a = new C0039e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.i.p.d f1943b = new C0039e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.i.p.d f1944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a.i.p.d f1945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a.i.p.d f1946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a.i.p.d f1947f;

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1948a = new a(true);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f1949b;

        public a(boolean z) {
            this.f1949b = z;
        }

        @Override // a.i.p.e.c
        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            boolean z = false;
            while (i2 < i4) {
                int iA = e.a(Character.getDirectionality(charSequence.charAt(i2)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i2++;
                    } else if (!this.f1949b) {
                        return 1;
                    }
                } else if (this.f1949b) {
                    return 0;
                }
                z = true;
                i2++;
            }
            if (z) {
                return this.f1949b ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f1950a = new b();

        @Override // a.i.p.e.c
        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            int iB = 2;
            while (i2 < i4 && iB == 2) {
                iB = e.b(Character.getDirectionality(charSequence.charAt(i2)));
                i2++;
            }
            return iB;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i2, int i3);
    }

    public static abstract class d implements a.i.p.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f1951a;

        public d(c cVar) {
            this.f1951a = cVar;
        }

        @Override // a.i.p.d
        public boolean a(CharSequence charSequence, int i2, int i3) {
            if (charSequence == null || i2 < 0 || i3 < 0 || charSequence.length() - i3 < i2) {
                throw new IllegalArgumentException();
            }
            return this.f1951a == null ? b() : c(charSequence, i2, i3);
        }

        public abstract boolean b();

        public final boolean c(CharSequence charSequence, int i2, int i3) {
            int iA = this.f1951a.a(charSequence, i2, i3);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a.i.p.e$e, reason: collision with other inner class name */
    public static class C0039e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f1952b;

        public C0039e(c cVar, boolean z) {
            super(cVar);
            this.f1952b = z;
        }

        @Override // a.i.p.e.d
        public boolean b() {
            return this.f1952b;
        }
    }

    public static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f1953b = new f();

        public f() {
            super(null);
        }

        @Override // a.i.p.e.d
        public boolean b() {
            return a.i.p.f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f1950a;
        f1944c = new C0039e(bVar, false);
        f1945d = new C0039e(bVar, true);
        f1946e = new C0039e(a.f1948a, false);
        f1947f = f.f1953b;
    }

    public static int a(int i2) {
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i2) {
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return 0;
            }
            switch (i2) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
