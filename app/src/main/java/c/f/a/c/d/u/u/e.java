package c.f.a.c.d.u.u;

import android.annotation.TargetApi;
import android.net.Uri;
import c.f.a.c.d.l;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class e {
    public static Uri a(MediaInfo mediaInfo, int i2) {
        l lVarP;
        if (mediaInfo == null || (lVarP = mediaInfo.P()) == null || lVarP.I() == null || lVarP.I().size() <= i2) {
            return null;
        }
        return lVarP.I().get(i2).J();
    }

    @TargetApi(21)
    public static Locale b(MediaTrack mediaTrack) {
        if (mediaTrack.L() == null) {
            return null;
        }
        boolean zG = c.f.a.c.f.t.l.g();
        String strL = mediaTrack.L();
        if (zG) {
            return Locale.forLanguageTag(strL);
        }
        String[] strArrSplit = strL.split("-");
        return strArrSplit.length == 1 ? new Locale(strArrSplit[0]) : new Locale(strArrSplit[0], strArrSplit[1]);
    }
}
