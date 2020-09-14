package ru.netology.domain;

public class Post {
    private int id;
    private int ownerID;
    private int fromID;
    private int createdBy;
    private boolean friendsOnly;
    private int date;
    private String copyright;
    private String postLogoURL;
    private String profileName;
    private String reportButton;
    private String mainText;
    private String imageURL;
    private String likesCount;
    private String commentButton;
    private String repostButton;
    private int viewsCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getFromID() {
        return fromID;
    }

    public void setFromID(int fromID) {
        this.fromID = fromID;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getPostLogoURL() {
        return postLogoURL;
    }

    public void setPostLogoURL(String postLogoURL) {
        this.postLogoURL = postLogoURL;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getReportButton() {
        return reportButton;
    }

    public void setReportButton(String reportButton) {
        this.reportButton = reportButton;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(String likesCount) {
        this.likesCount = likesCount;
    }

    public String getCommentButton() {
        return commentButton;
    }

    public void setCommentButton(String commentButton) {
        this.commentButton = commentButton;
    }

    public String getRepostButton() {
        return repostButton;
    }

    public void setRepostButton(String repostButton) {
        this.repostButton = repostButton;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }
}