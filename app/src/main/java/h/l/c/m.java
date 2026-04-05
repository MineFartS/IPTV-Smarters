package h.l.c;

/* JADX INFO: loaded from: classes2.dex */
public class m {
    public h.n.b a(Class cls) {
        return new c(cls);
    }

    public h.n.d b(i iVar) {
        return iVar;
    }

    public String c(f fVar) {
        String string = fVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String d(h hVar) {
        return c(hVar);
    }
}
