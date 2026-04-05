package c.h.a.k.a;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import minefarts.iptvsmarters.view.activity.BackupAndRestoreActivity;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BackupAndRestoreActivity f17360a;

    public /* synthetic */ e(BackupAndRestoreActivity backupAndRestoreActivity) {
        this.f17360a = backupAndRestoreActivity;
    }

    @Override // com.amplifyframework.core.Consumer
    public final void accept(Object obj) {
        this.f17360a.k1((StorageUploadFileResult) obj);
    }
}
