package c.h.a.g.d;

import android.content.Context;
import android.provider.MediaStore;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import org.achartengine.ChartFactory;

/* JADX INFO: loaded from: classes2.dex */
public class a extends a.q.b.b {
    public static final String[] x = {TransferTable.COLUMN_ID, ChartFactory.TITLE, "_data", "_size", "date_added", "duration"};

    public a(Context context) {
        super(context);
        L(x);
        P(MediaStore.Files.getContentUri("external"));
        O("date_added DESC");
        M("mime_type=? or mime_type=? or mime_type=?");
        N(new String[]{"audio/mpeg", "audio/mp3", "audio/x-ms-wma"});
    }
}
