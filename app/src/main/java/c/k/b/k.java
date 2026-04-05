package c.k.b;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import c.k.b.t;
import c.k.b.y;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* JADX INFO: loaded from: classes2.dex */
public class k extends g {
    public k(Context context) {
        super(context);
    }

    public static int k(Uri uri) {
        int attributeInt = new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    @Override // c.k.b.g, c.k.b.y
    public boolean c(w wVar) {
        return TransferTable.COLUMN_FILE.equals(wVar.f18787e.getScheme());
    }

    @Override // c.k.b.g, c.k.b.y
    public y.a f(w wVar, int i2) {
        return new y.a(null, j(wVar), t.e.DISK, k(wVar.f18787e));
    }
}
