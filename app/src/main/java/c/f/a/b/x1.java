package c.f.a.b;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes.dex */
public class x1 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0<x1> f10318b = new v0() { // from class: c.f.a.b.p0
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10320d;

    public x1(String str, Throwable th, int i2, long j2) {
        super(str, th);
        this.f10319c = i2;
        this.f10320d = j2;
    }

    public static String b(int i2) {
        if (i2 == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i2 == 5002) {
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        switch (i2) {
            case 1000:
                return "ERROR_CODE_UNSPECIFIED";
            case AdError.NO_FILL_ERROR_CODE /* 1001 */:
                return "ERROR_CODE_REMOTE_ERROR";
            case AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE /* 1002 */:
                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
            case 1003:
                return "ERROR_CODE_TIMEOUT";
            case 1004:
                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
            default:
                switch (i2) {
                    case AdError.SERVER_ERROR_CODE /* 2000 */:
                        return "ERROR_CODE_IO_UNSPECIFIED";
                    case AdError.INTERNAL_ERROR_CODE /* 2001 */:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                    case AdError.CACHE_ERROR_CODE /* 2002 */:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                    case AdError.INTERNAL_ERROR_2003 /* 2003 */:
                        return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                    case AdError.INTERNAL_ERROR_2004 /* 2004 */:
                        return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                    case 2005:
                        return "ERROR_CODE_IO_FILE_NOT_FOUND";
                    case AdError.INTERNAL_ERROR_2006 /* 2006 */:
                        return "ERROR_CODE_IO_NO_PERMISSION";
                    case 2007:
                        return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                    case AdError.REMOTE_ADS_SERVICE_ERROR /* 2008 */:
                        return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                    default:
                        switch (i2) {
                            case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                            case 3002:
                                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                            case 3003:
                                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                            case 3004:
                                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                            default:
                                switch (i2) {
                                    case 4001:
                                        return "ERROR_CODE_DECODER_INIT_FAILED";
                                    case 4002:
                                        return "ERROR_CODE_DECODER_QUERY_FAILED";
                                    case 4003:
                                        return "ERROR_CODE_DECODING_FAILED";
                                    case 4004:
                                        return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                    case 4005:
                                        return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                    default:
                                        switch (i2) {
                                            case 6000:
                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                            case AdError.MEDIAVIEW_MISSING_ERROR_CODE /* 6001 */:
                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                            case 6004:
                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                            case 6005:
                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                            case 6006:
                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                            case 6007:
                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                            case 6008:
                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                            default:
                                                return i2 >= 1000000 ? "custom error code" : "invalid error code";
                                        }
                                }
                        }
                }
        }
    }

    public final String a() {
        return b(this.f10319c);
    }
}
