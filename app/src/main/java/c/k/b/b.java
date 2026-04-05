package c.k.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import c.k.b.t;
import c.k.b.y;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* JADX INFO: loaded from: classes2.dex */
public class b extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f18655a = 22;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager f18656b;

    public b(Context context) {
        this.f18656b = context.getAssets();
    }

    public static String j(w wVar) {
        return wVar.f18787e.toString().substring(f18655a);
    }

    @Override // c.k.b.y
    public boolean c(w wVar) {
        Uri uri = wVar.f18787e;
        return TransferTable.COLUMN_FILE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // c.k.b.y
    public y.a f(w wVar, int i2) {
        return new y.a(this.f18656b.open(j(wVar)), t.e.DISK);
    }
}
