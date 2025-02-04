package com.backend.backend;

public class Note {

    private int NoteID;
    private boolean status; 
    private String title;
    private String Content;
    private int UserID;
    public Note(int noteID, boolean status, String title, String content, int userID) {
        NoteID = noteID;
        this.status = status;
        this.title = title;
        Content = content;
        UserID = userID;
    }
    public int getNoteID() {
        return NoteID;
    }
    public void setNoteID(int noteID) {
        NoteID = noteID;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return Content;
    }
    public void setContent(String content) {
        Content = content;
    }
    public int getUserID() {
        return UserID;
    }
    public void setUserID(int userID) {
        UserID = userID;
    }
}


