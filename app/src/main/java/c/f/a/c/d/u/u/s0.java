package c.f.a.c.d.u.u;

import android.graphics.Bitmap;
import com.google.android.gms.cast.framework.media.MediaNotificationService;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 implements c.f.a.c.d.u.u.k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaNotificationService.a f12111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaNotificationService f12112b;

    public s0(MediaNotificationService mediaNotificationService, MediaNotificationService.a aVar) {
        this.f12112b = mediaNotificationService;
        this.f12111a = aVar;
    }

    @Override // c.f.a.c.d.u.u.k.a
    public final void a(Bitmap bitmap) {
        MediaNotificationService.a aVar = this.f12111a;
        aVar.f24181b = bitmap;
        this.f12112b.f24179o = aVar;
        this.f12112b.h();
    }
}
