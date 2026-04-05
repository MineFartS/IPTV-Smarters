package c.k.b;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import c.k.b.t;
import c.k.b.y;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public class o extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f18740b = {"orientation"};

    public enum a {
        MICRO(3, 96, 96),
        MINI(1, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, 384),
        FULL(2, -1, -1);

        public final int androidKind;
        public final int height;
        public final int width;

        a(int i2, int i3, int i4) {
            this.androidKind = i2;
            this.width = i3;
            this.height = i4;
        }
    }

    public o(Context context) {
        super(context);
    }

    public static int k(ContentResolver contentResolver, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, f18740b, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                int i2 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i2;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static a l(int i2, int i3) {
        a aVar = a.MICRO;
        if (i2 <= aVar.width && i3 <= aVar.height) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i2 > aVar2.width || i3 > aVar2.height) ? a.FULL : aVar2;
    }

    @Override // c.k.b.g, c.k.b.y
    public boolean c(w wVar) {
        Uri uri = wVar.f18787e;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // c.k.b.g, c.k.b.y
    public y.a f(w wVar, int i2) {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.f18697a.getContentResolver();
        int iK = k(contentResolver, wVar.f18787e);
        String type = contentResolver.getType(wVar.f18787e);
        boolean z = type != null && type.startsWith("video/");
        if (wVar.c()) {
            a aVarL = l(wVar.f18791i, wVar.f18792j);
            if (!z && aVarL == a.FULL) {
                return new y.a(null, j(wVar), t.e.DISK, iK);
            }
            long id = ContentUris.parseId(wVar.f18787e);
            BitmapFactory.Options optionsD = y.d(wVar);
            optionsD.inJustDecodeBounds = true;
            y.a(wVar.f18791i, wVar.f18792j, aVarL.width, aVarL.height, optionsD, wVar);
            if (z) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id, aVarL == a.FULL ? 1 : aVarL.androidKind, optionsD);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id, aVarL.androidKind, optionsD);
            }
            if (thumbnail != null) {
                return new y.a(thumbnail, null, t.e.DISK, iK);
            }
        }
        return new y.a(null, j(wVar), t.e.DISK, iK);
    }
}
