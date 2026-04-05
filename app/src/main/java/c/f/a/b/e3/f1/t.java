package c.f.a.b.e3.f1;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends IOException {
    public t(String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + InstructionFileId.DOT);
    }
}
