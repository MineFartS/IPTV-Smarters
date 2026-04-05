package com.google.ads.interactivemedia.v3.api;

import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class AdError extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdErrorCode f18935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdErrorType f18936b;

    public enum AdErrorCode {
        INTERNAL_ERROR(-1),
        VAST_MALFORMED_RESPONSE(100),
        UNKNOWN_AD_RESPONSE(1010),
        VAST_TRAFFICKING_ERROR(200),
        VAST_LOAD_TIMEOUT(Constants.BUCKET_REDIRECT_STATUS_CODE),
        VAST_TOO_MANY_REDIRECTS(302),
        VIDEO_PLAY_ERROR(400),
        VAST_MEDIA_LOAD_TIMEOUT(402),
        VAST_LINEAR_ASSET_MISMATCH(Constants.BUCKET_ACCESS_FORBIDDEN_STATUS_CODE),
        OVERLAY_AD_PLAYING_FAILED(500),
        OVERLAY_AD_LOADING_FAILED(502),
        VAST_NONLINEAR_ASSET_MISMATCH(503),
        COMPANION_AD_LOADING_FAILED(603),
        UNKNOWN_ERROR(900),
        VAST_EMPTY_RESPONSE(1009),
        FAILED_TO_REQUEST_ADS(1005),
        VAST_ASSET_NOT_FOUND(1007),
        ADS_REQUEST_NETWORK_ERROR(1012),
        INVALID_ARGUMENTS(1101),
        PLAYLIST_NO_CONTENT_TRACKING(1205),
        UNEXPECTED_ADS_LOADED_EVENT(1206);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18938b;

        AdErrorCode(int i2) {
            this.f18938b = i2;
        }

        public boolean equals(int i2) {
            return this.f18938b == i2;
        }

        public int getErrorNumber() {
            return this.f18938b;
        }

        @Override // java.lang.Enum
        public String toString() {
            String strName = name();
            int i2 = this.f18938b;
            StringBuilder sb = new StringBuilder(String.valueOf(strName).length() + 41);
            sb.append("AdErrorCode [name: ");
            sb.append(strName);
            sb.append(", number: ");
            sb.append(i2);
            sb.append("]");
            return sb.toString();
        }
    }

    public enum AdErrorType {
        LOAD,
        PLAY
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdError(AdErrorType adErrorType, int i2, String str) {
        AdErrorCode adErrorCode;
        AdErrorCode[] adErrorCodeArrValues = AdErrorCode.values();
        int length = adErrorCodeArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                adErrorCode = adErrorCodeArrValues[i3];
                if (adErrorCode.getErrorNumber() == i2) {
                    break;
                } else {
                    i3++;
                }
            } else {
                adErrorCode = i2 == 1204 ? AdErrorCode.INTERNAL_ERROR : AdErrorCode.UNKNOWN_ERROR;
            }
        }
        this(adErrorType, adErrorCode, str);
    }

    public AdError(AdErrorType adErrorType, AdErrorCode adErrorCode, String str) {
        super(str);
        this.f18936b = adErrorType;
        this.f18935a = adErrorCode;
    }

    public AdErrorCode getErrorCode() {
        return this.f18935a;
    }

    public int getErrorCodeNumber() {
        return this.f18935a.getErrorNumber();
    }

    public AdErrorType getErrorType() {
        return this.f18936b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public String toString() {
        String strValueOf = String.valueOf(this.f18936b);
        String strValueOf2 = String.valueOf(this.f18935a);
        String message = getMessage();
        int length = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf2.length() + String.valueOf(message).length());
        sb.append("AdError [errorType: ");
        sb.append(strValueOf);
        sb.append(", errorCode: ");
        sb.append(strValueOf2);
        sb.append(", message: ");
        sb.append(message);
        sb.append("]");
        return sb.toString();
    }
}
