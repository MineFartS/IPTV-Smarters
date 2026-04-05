package c.h.a.g.d;

import android.content.Context;
import android.provider.MediaStore;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import org.achartengine.ChartFactory;

/* JADX INFO: loaded from: classes2.dex */
public class d extends a.q.b.b {
    public static final String[] x = {TransferTable.COLUMN_ID, ChartFactory.TITLE, "_data", "_size", "bucket_id", "bucket_display_name", "date_added", "duration"};

    public d(Context context) {
        super(context);
        L(x);
        P(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        O("date_added DESC");
        M("mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=?");
        N(new String[]{"video/mpeg", "video/mp4", "video/x-matroska", "video/3gpp", "video/MP2T", "video/x-flv", "video/x-msvideo", "video/x-ms-wmv", "video/quicktime"});
    }
}
