package com.gn4k.boodpressure.data.model;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\fJ8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\tHÖ\u0001R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006*"}, d2 = {"Lcom/bloodpressurelog/heartpressure/bptracker/data/model/LanguageModel;", "Landroid/os/Parcelable;", "()V", "languageName", "", "isoLanguage", "isCheck", "", "image", "", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "getImage", "()Ljava/lang/Integer;", "setImage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Z", "setCheck", "(Z)V", "getIsoLanguage", "()Ljava/lang/String;", "setIsoLanguage", "(Ljava/lang/String;)V", "getLanguageName", "setLanguageName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)Lcom/bloodpressurelog/heartpressure/bptracker/data/model/LanguageModel;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "BloodPressure_v1.1.2_v113_07.19.2023_appProductRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: LanguageModel.kt */
public final class LanguageModel implements Parcelable {
    public static final Parcelable.Creator<LanguageModel> CREATOR = new Creator();
    private Integer image;
    private boolean isCheck;
    private String isoLanguage;
    private String languageName;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* compiled from: LanguageModel.kt */
    public static final class Creator implements Parcelable.Creator<LanguageModel> {
        public final LanguageModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LanguageModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public final LanguageModel[] newArray(int i) {
            return new LanguageModel[i];
        }
    }

    public static /* synthetic */ LanguageModel copy$default(LanguageModel languageModel, String str, String str2, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = languageModel.languageName;
        }
        if ((i & 2) != 0) {
            str2 = languageModel.isoLanguage;
        }
        if ((i & 4) != 0) {
            z = languageModel.isCheck;
        }
        if ((i & 8) != 0) {
            num = languageModel.image;
        }
        return languageModel.copy(str, str2, z, num);
    }

    public final String component1() {
        return this.languageName;
    }

    public final String component2() {
        return this.isoLanguage;
    }

    public final boolean component3() {
        return this.isCheck;
    }

    public final Integer component4() {
        return this.image;
    }

    public final LanguageModel copy(String str, String str2, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(str, "languageName");
        Intrinsics.checkNotNullParameter(str2, "isoLanguage");
        return new LanguageModel(str, str2, z, num);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageModel)) {
            return false;
        }
        LanguageModel languageModel = (LanguageModel) obj;
        return Intrinsics.areEqual((Object) this.languageName, (Object) languageModel.languageName) && Intrinsics.areEqual((Object) this.isoLanguage, (Object) languageModel.isoLanguage) && this.isCheck == languageModel.isCheck && Intrinsics.areEqual((Object) this.image, (Object) languageModel.image);
    }

    public int hashCode() {
        int hashCode = ((this.languageName.hashCode() * 31) + this.isoLanguage.hashCode()) * 31;
        boolean z = this.isCheck;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        Integer num = this.image;
        return i + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "LanguageModel(languageName=" + this.languageName + ", isoLanguage=" + this.isoLanguage + ", isCheck=" + this.isCheck + ", image=" + this.image + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.languageName);
        parcel.writeString(this.isoLanguage);
        parcel.writeInt(this.isCheck ? 1 : 0);
        Integer num = this.image;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }

    public LanguageModel(String str, String str2, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(str, "languageName");
        Intrinsics.checkNotNullParameter(str2, "isoLanguage");
        this.languageName = str;
        this.isoLanguage = str2;
        this.isCheck = z;
        this.image = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LanguageModel(String str, String str2, boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? null : num);
    }

    public final String getLanguageName() {
        return this.languageName;
    }

    public final void setLanguageName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.languageName = str;
    }

    public final String getIsoLanguage() {
        return this.isoLanguage;
    }

    public final void setIsoLanguage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isoLanguage = str;
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final void setCheck(boolean z) {
        this.isCheck = z;
    }

    public final Integer getImage() {
        return this.image;
    }

    public final void setImage(Integer num) {
        this.image = num;
    }

    public LanguageModel() {
        this("", "", false, 0);
    }
}