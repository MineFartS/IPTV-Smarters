package c.f.a.c.d.u.u.k;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends AsyncTask<Uri, Long, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f12038a = new c.f.a.c.d.v.b("FetchBitmapTask");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f12039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f12040c;

    public d(Context context, int i2, int i3, boolean z, long j2, int i4, int i5, int i6, f fVar) {
        this.f12039b = c.f.a.c.j.c.h.a(context.getApplicationContext(), this, new h(this), i2, i3, false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, Constants.MAXIMUM_UPLOAD_PARTS);
        this.f12040c = fVar;
    }

    public d(Context context, int i2, int i3, boolean z, f fVar) {
        this(context, i2, i3, false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, Constants.MAXIMUM_UPLOAD_PARTS, fVar);
    }

    public d(Context context, f fVar) {
        this(context, 0, 0, false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, Constants.MAXIMUM_UPLOAD_PARTS, fVar);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bitmap doInBackground(Uri... uriArr) {
        if (uriArr.length == 1 && uriArr[0] != null) {
            try {
                return this.f12039b.m2(uriArr[0]);
            } catch (RemoteException e2) {
                f12038a.b(e2, "Unable to call %s on %s.", "doFetch", g.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        f fVar = this.f12040c;
        if (fVar != null) {
            fVar.a(bitmap2);
        }
    }
}
