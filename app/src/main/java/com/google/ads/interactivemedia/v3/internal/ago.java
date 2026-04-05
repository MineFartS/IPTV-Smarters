package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ago extends IOException {
    public ago(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
        sb.append("Unable to bind a sample queue to TrackGroup with mime type ");
        sb.append(str);
        sb.append(InstructionFileId.DOT);
        super(sb.toString());
    }
}
