package com.example.square.data.models;

/**
 * Created by l1maginaire on 1/27/18.
 */

public class ContributorsData {
    private String login;
    private String profileUrl;
    private int contributions;
    private String avatarUrl;
    private String reposUrl;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public int getContributions() {
        return contributions;
    }

    public void setContributions(int contributions) {
        this.contributions = contributions;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }
}