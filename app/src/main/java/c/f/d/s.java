package c.f.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s {
    private static final /* synthetic */ s[] $VALUES;
    public static final s DEFAULT;
    public static final s STRING;

    public enum a extends s {
        public a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // c.f.d.s
        public j serialize(Long l2) {
            return new o(l2);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        s sVar = new s("STRING", 1) { // from class: c.f.d.s.b
            {
                a aVar2 = null;
            }

            @Override // c.f.d.s
            public j serialize(Long l2) {
                return new o(String.valueOf(l2));
            }
        };
        STRING = sVar;
        $VALUES = new s[]{aVar, sVar};
    }

    private s(String str, int i2) {
    }

    public /* synthetic */ s(String str, int i2, a aVar) {
        this(str, i2);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    public abstract j serialize(Long l2);
}
