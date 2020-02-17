
package com.example.practicaldemo.rest.response;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Item {

    @SerializedName("creation_date")
    private Long mCreationDate;
    @SerializedName("last_activity_date")
    private Long mLastActivityDate;
    @SerializedName("last_edit_date")
    private Long mLastEditDate;
    @SerializedName("link")
    private String mLink;
    @SerializedName("owner")
    private Owner mOwner;
    @SerializedName("post_id")
    private Long mPostId;
    @SerializedName("post_type")
    private String mPostType;
    @SerializedName("score")
    private Long mScore;

    public Long getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(Long creationDate) {
        mCreationDate = creationDate;
    }

    public Long getLastActivityDate() {
        return mLastActivityDate;
    }

    public void setLastActivityDate(Long lastActivityDate) {
        mLastActivityDate = lastActivityDate;
    }

    public Long getLastEditDate() {
        return mLastEditDate;
    }

    public void setLastEditDate(Long lastEditDate) {
        mLastEditDate = lastEditDate;
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public Owner getOwner() {
        return mOwner;
    }

    public void setOwner(Owner owner) {
        mOwner = owner;
    }

    public Long getPostId() {
        return mPostId;
    }

    public void setPostId(Long postId) {
        mPostId = postId;
    }

    public String getPostType() {
        return mPostType;
    }

    public void setPostType(String postType) {
        mPostType = postType;
    }

    public Long getScore() {
        return mScore;
    }

    public void setScore(Long score) {
        mScore = score;
    }

}
