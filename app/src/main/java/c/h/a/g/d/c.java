package c.h.a.g.d;

import android.content.Context;
import android.provider.MediaStore;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import org.achartengine.ChartFactory;

/* JADX INFO: loaded from: classes2.dex */
public class c extends a.q.b.b {
    public static final String[] x = {TransferTable.COLUMN_ID, ChartFactory.TITLE, "_data", "_size", "bucket_id", "bucket_display_name", "date_added", "orientation"};

    public c(Context context) {
        super(context);
        L(x);
        P(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        O("date_added DESC");
        M("mime_type=? or mime_type=? or mime_type=? or mime_type=?");
        N(new String[]{"image/jpeg", "image/png", "image/jpg", "image/gif"});
    }
}
