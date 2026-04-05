package c.f.b.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements l<Character> {

    public static abstract class a extends c {
        @Override // c.f.b.a.l
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.b(ch);
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f15779a;

        public b(char c2) {
            this.f15779a = c2;
        }

        @Override // c.f.b.a.c
        public boolean e(char c2) {
            return c2 == this.f15779a;
        }

        public String toString() {
            return "CharMatcher.is('" + c.g(this.f15779a) + "')";
        }
    }

    /* JADX INFO: renamed from: c.f.b.a.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0183c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15780a;

        public AbstractC0183c(String str) {
            this.f15780a = (String) k.j(str);
        }

        public final String toString() {
            return this.f15780a;
        }
    }

    public static final class d extends AbstractC0183c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f15781b = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override // c.f.b.a.c
        public int c(CharSequence charSequence, int i2) {
            k.l(i2, charSequence.length());
            return -1;
        }

        @Override // c.f.b.a.c
        public boolean e(char c2) {
            return false;
        }
    }

    public static c d(char c2) {
        return new b(c2);
    }

    public static c f() {
        return d.f15781b;
    }

    public static String g(char c2) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        k.l(i2, length);
        while (i2 < length) {
            if (e(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public abstract boolean e(char c2);
}
