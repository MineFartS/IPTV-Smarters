package c.h.a.h.m;

import android.content.Context;
import android.content.Intent;
import com.amazonaws.services.s3.model.InstructionFileId;
import minefarts.iptvsmarters.miscelleneious.chromecastfeature.castserver.CastServerService;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16965a;

    public c(Context context) {
        this.f16965a = context;
    }

    public void a(String str, String str2) {
        Intent intent = new Intent(this.f16965a, (Class<?>) CastServerService.class);
        intent.putExtra("127.0.0.1", str);
        intent.putExtra(InstructionFileId.DOT, str2);
        this.f16965a.startService(intent);
    }

    public void b() {
        this.f16965a.stopService(new Intent(this.f16965a, (Class<?>) CastServerService.class));
    }
}
