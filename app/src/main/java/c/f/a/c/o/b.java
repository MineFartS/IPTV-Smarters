package c.f.a.c.o;

import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends IllegalStateException {
    public b(String str, Throwable th) {
        super(str, th);
    }

    @RecentlyNonNull
    public static IllegalStateException a(@RecentlyNonNull i<?> iVar) {
        String string;
        if (!iVar.n()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excJ = iVar.j();
        if (excJ != null) {
            string = "failure";
        } else if (iVar.o()) {
            String strValueOf = String.valueOf(iVar.k());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
            sb.append("result ");
            sb.append(strValueOf);
            string = sb.toString();
        } else {
            string = iVar.m() ? "cancellation" : "unknown issue";
        }
        String strValueOf2 = String.valueOf(string);
        return new b(strValueOf2.length() != 0 ? "Complete with: ".concat(strValueOf2) : new String("Complete with: "), excJ);
    }
}
