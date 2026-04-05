package c.f.a.c.k.b;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class k {
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(c.f.a.c.k.b.y3 r14, android.database.sqlite.SQLiteDatabase r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String[] r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.k.a(c.f.a.c.k.b.y3, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void b(y3 y3Var, SQLiteDatabase sQLiteDatabase) {
        if (y3Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            y3Var.r().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            y3Var.r().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            y3Var.r().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        y3Var.r().a("Failed to turn on database write permission for owner");
    }
}
