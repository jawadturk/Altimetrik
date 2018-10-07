package com.example.altimetrik.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ProposalsItem implements Parcelable {

    @SerializedName("numDonors")
    private String numDonors;

    @SerializedName("teacherTypes")
    private List<Object> teacherTypes;

    @SerializedName("totalPrice")
    private String totalPrice;

    @SerializedName("city")
    private String city;

    @SerializedName("subject")
    private Subject subject;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("schoolUrl")
    private String schoolUrl;

    @SerializedName("title")
    private String title;

    @SerializedName("fundingStatus")
    private String fundingStatus;

    @SerializedName("proposalURL")
    private String proposalURL;

    @SerializedName("matchingFund")
    private MatchingFund matchingFund;

    @SerializedName("gradeLevel")
    private GradeLevel gradeLevel;

    @SerializedName("retinaImageURL")
    private String retinaImageURL;

    @SerializedName("freeShipping")
    private String freeShipping;

    @SerializedName("zone")
    private Zone zone;

    @SerializedName("snippets")
    private List<Object> snippets;

    @SerializedName("povertyLevel")
    private String povertyLevel;

    @SerializedName("imageURL")
    private String imageURL;

    @SerializedName("numStudents")
    private String numStudents;

    @SerializedName("id")
    private String id;

    @SerializedName("percentFunded")
    private String percentFunded;

    @SerializedName("state")
    private String state;

    @SerializedName("schoolName")
    private String schoolName;

    @SerializedName("stateFullName")
    private String stateFullName;

    @SerializedName("additionalSubjects")
    private List<AdditionalSubjectsItem> additionalSubjects;

    @SerializedName("longitude")
    private String longitude;

    @SerializedName("expirationDate")
    private String expirationDate;

    @SerializedName("zip")
    private String zip;

    @SerializedName("teacherName")
    private String teacherName;

    @SerializedName("resource")
    private Resource resource;

    @SerializedName("costToComplete")
    private String costToComplete;

    @SerializedName("studentLed")
    private boolean studentLed;

    @SerializedName("professionalDevelopment")
    private boolean professionalDevelopment;

    @SerializedName("shortDescription")
    private String shortDescription;

    @SerializedName("thumbImageURL")
    private String thumbImageURL;

    @SerializedName("schoolTypes")
    private List<SchoolTypesItem> schoolTypes;

    @SerializedName("povertyType")
    private PovertyType povertyType;

    @SerializedName("teacherId")
    private String teacherId;

    @SerializedName("fundURL")
    private String fundURL;

    @SerializedName("teacherFFPromoCodeFund")
    private TeacherFFPromoCodeFund teacherFFPromoCodeFund;

    @SerializedName("fulfillmentTrailer")
    private String fulfillmentTrailer;

    public void setNumDonors(String numDonors) {
        this.numDonors = numDonors;
    }

    public String getNumDonors() {
        return numDonors;
    }

    public void setTeacherTypes(List<Object> teacherTypes) {
        this.teacherTypes = teacherTypes;
    }

    public List<Object> getTeacherTypes() {
        return teacherTypes;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setSchoolUrl(String schoolUrl) {
        this.schoolUrl = schoolUrl;
    }

    public String getSchoolUrl() {
        return schoolUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setFundingStatus(String fundingStatus) {
        this.fundingStatus = fundingStatus;
    }

    public String getFundingStatus() {
        return fundingStatus;
    }

    public void setProposalURL(String proposalURL) {
        this.proposalURL = proposalURL;
    }

    public String getProposalURL() {
        return proposalURL;
    }

    public void setMatchingFund(MatchingFund matchingFund) {
        this.matchingFund = matchingFund;
    }

    public MatchingFund getMatchingFund() {
        return matchingFund;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setRetinaImageURL(String retinaImageURL) {
        this.retinaImageURL = retinaImageURL;
    }

    public String getRetinaImageURL() {
        return retinaImageURL;
    }

    public void setFreeShipping(String freeShipping) {
        this.freeShipping = freeShipping;
    }

    public String getFreeShipping() {
        return freeShipping;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Zone getZone() {
        return zone;
    }

    public void setSnippets(List<Object> snippets) {
        this.snippets = snippets;
    }

    public List<Object> getSnippets() {
        return snippets;
    }

    public void setPovertyLevel(String povertyLevel) {
        this.povertyLevel = povertyLevel;
    }

    public String getPovertyLevel() {
        return povertyLevel;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setNumStudents(String numStudents) {
        this.numStudents = numStudents;
    }

    public String getNumStudents() {
        return numStudents;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPercentFunded(String percentFunded) {
        this.percentFunded = percentFunded;
    }

    public String getPercentFunded() {
        return percentFunded;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setStateFullName(String stateFullName) {
        this.stateFullName = stateFullName;
    }

    public String getStateFullName() {
        return stateFullName;
    }

    public void setAdditionalSubjects(List<AdditionalSubjectsItem> additionalSubjects) {
        this.additionalSubjects = additionalSubjects;
    }

    public List<AdditionalSubjectsItem> getAdditionalSubjects() {
        return additionalSubjects;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Resource getResource() {
        return resource;
    }

    public void setCostToComplete(String costToComplete) {
        this.costToComplete = costToComplete;
    }

    public String getCostToComplete() {
        return costToComplete;
    }

    public void setStudentLed(boolean studentLed) {
        this.studentLed = studentLed;
    }

    public boolean isStudentLed() {
        return studentLed;
    }

    public void setProfessionalDevelopment(boolean professionalDevelopment) {
        this.professionalDevelopment = professionalDevelopment;
    }

    public boolean isProfessionalDevelopment() {
        return professionalDevelopment;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setThumbImageURL(String thumbImageURL) {
        this.thumbImageURL = thumbImageURL;
    }

    public String getThumbImageURL() {
        return thumbImageURL;
    }

    public void setSchoolTypes(List<SchoolTypesItem> schoolTypes) {
        this.schoolTypes = schoolTypes;
    }

    public List<SchoolTypesItem> getSchoolTypes() {
        return schoolTypes;
    }

    public void setPovertyType(PovertyType povertyType) {
        this.povertyType = povertyType;
    }

    public PovertyType getPovertyType() {
        return povertyType;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setFundURL(String fundURL) {
        this.fundURL = fundURL;
    }

    public String getFundURL() {
        return fundURL;
    }

    public void setTeacherFFPromoCodeFund(TeacherFFPromoCodeFund teacherFFPromoCodeFund) {
        this.teacherFFPromoCodeFund = teacherFFPromoCodeFund;
    }

    public TeacherFFPromoCodeFund getTeacherFFPromoCodeFund() {
        return teacherFFPromoCodeFund;
    }

    public void setFulfillmentTrailer(String fulfillmentTrailer) {
        this.fulfillmentTrailer = fulfillmentTrailer;
    }

    public String getFulfillmentTrailer() {
        return fulfillmentTrailer;
    }

    @Override
    public String toString() {
        return
                "ProposalsItem{" +
                        "numDonors = '" + numDonors + '\'' +
                        ",teacherTypes = '" + teacherTypes + '\'' +
                        ",totalPrice = '" + totalPrice + '\'' +
                        ",city = '" + city + '\'' +
                        ",subject = '" + subject + '\'' +
                        ",latitude = '" + latitude + '\'' +
                        ",schoolUrl = '" + schoolUrl + '\'' +
                        ",title = '" + title + '\'' +
                        ",fundingStatus = '" + fundingStatus + '\'' +
                        ",proposalURL = '" + proposalURL + '\'' +
                        ",matchingFund = '" + matchingFund + '\'' +
                        ",gradeLevel = '" + gradeLevel + '\'' +
                        ",retinaImageURL = '" + retinaImageURL + '\'' +
                        ",freeShipping = '" + freeShipping + '\'' +
                        ",zone = '" + zone + '\'' +
                        ",snippets = '" + snippets + '\'' +
                        ",povertyLevel = '" + povertyLevel + '\'' +
                        ",imageURL = '" + imageURL + '\'' +
                        ",numStudents = '" + numStudents + '\'' +
                        ",id = '" + id + '\'' +
                        ",percentFunded = '" + percentFunded + '\'' +
                        ",state = '" + state + '\'' +
                        ",schoolName = '" + schoolName + '\'' +
                        ",stateFullName = '" + stateFullName + '\'' +
                        ",additionalSubjects = '" + additionalSubjects + '\'' +
                        ",longitude = '" + longitude + '\'' +
                        ",expirationDate = '" + expirationDate + '\'' +
                        ",zip = '" + zip + '\'' +
                        ",teacherName = '" + teacherName + '\'' +
                        ",resource = '" + resource + '\'' +
                        ",costToComplete = '" + costToComplete + '\'' +
                        ",studentLed = '" + studentLed + '\'' +
                        ",professionalDevelopment = '" + professionalDevelopment + '\'' +
                        ",shortDescription = '" + shortDescription + '\'' +
                        ",thumbImageURL = '" + thumbImageURL + '\'' +
                        ",schoolTypes = '" + schoolTypes + '\'' +
                        ",povertyType = '" + povertyType + '\'' +
                        ",teacherId = '" + teacherId + '\'' +
                        ",fundURL = '" + fundURL + '\'' +
                        ",teacherFFPromoCodeFund = '" + teacherFFPromoCodeFund + '\'' +
                        ",fulfillmentTrailer = '" + fulfillmentTrailer + '\'' +
                        "}";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.numDonors);
        dest.writeString(this.totalPrice);
        dest.writeString(this.city);
        dest.writeString(this.title);
        dest.writeString(this.imageURL);
        dest.writeString(this.id);
        dest.writeString(this.percentFunded);
        dest.writeString(this.state);
        dest.writeString(this.schoolName);
        dest.writeString(this.stateFullName);
        dest.writeString(this.zip);
        dest.writeString(this.teacherName);
        dest.writeString(this.costToComplete);
        dest.writeString(this.shortDescription);
        dest.writeString(this.thumbImageURL);
        dest.writeString(this.teacherId);
        dest.writeString(this.fulfillmentTrailer);
    }

    public ProposalsItem() {
    }

    protected ProposalsItem(Parcel in) {
        this.numDonors = in.readString();
        this.totalPrice = in.readString();
        this.city = in.readString();
        this.title = in.readString();
        this.imageURL = in.readString();
        this.id = in.readString();
        this.percentFunded = in.readString();
        this.state = in.readString();
        this.schoolName = in.readString();
        this.stateFullName = in.readString();
        this.zip = in.readString();
        this.teacherName = in.readString();
        this.costToComplete = in.readString();
        this.shortDescription = in.readString();
        this.thumbImageURL = in.readString();
        this.teacherId = in.readString();
        this.fulfillmentTrailer = in.readString();
    }

    public static final Parcelable.Creator<ProposalsItem> CREATOR = new Parcelable.Creator<ProposalsItem>() {
        @Override
        public ProposalsItem createFromParcel(Parcel source) {
            return new ProposalsItem(source);
        }

        @Override
        public ProposalsItem[] newArray(int size) {
            return new ProposalsItem[size];
        }
    };
}