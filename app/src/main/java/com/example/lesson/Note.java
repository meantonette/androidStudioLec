package com.example.lesson;

public class Note {
    private String mTitle;
    private String mDesription;
    private String mIdea;
    private String mTodo;
    private String mImportant;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

//    public String getDesription() {
//        return mDesription;
//    }

    public void setDesription(String Desription) {
        this.mDesription = mDesription;
    }

    public boolean isIdea() {
        return Boolean.parseBoolean(mIdea);
    }

    public void setIdea(boolean mIdea) {
        this.mIdea = String.valueOf(mIdea);
    }

    public boolean isTodo() {
        return Boolean.parseBoolean(mTodo);
    }

    public void setTodo(boolean mTodo) {
        this.mTodo = String.valueOf(mTodo);
    }

    public boolean isImportant() {
        return Boolean.parseBoolean(mImportant);
    }

    public void setImportant(boolean mImportant) {
        this.mImportant = String.valueOf(mImportant);
    }

    public String setDescription(String toString) {
        return mDesription;
    }

    public String getDescription() {
        return mDesription;
    }
}
