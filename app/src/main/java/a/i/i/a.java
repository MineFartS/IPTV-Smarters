package a.i.i;

import a.i.n.h;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, a.i.n.b bVar) throws Exception {
        Object objB;
        if (Build.VERSION.SDK_INT < 16) {
            if (bVar != null) {
                bVar.e();
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        }
        if (bVar != null) {
            try {
                objB = bVar.b();
            } catch (Exception e2) {
                if (e2 instanceof OperationCanceledException) {
                    throw new h();
                }
                throw e2;
            }
        } else {
            objB = null;
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) objB);
    }
}
