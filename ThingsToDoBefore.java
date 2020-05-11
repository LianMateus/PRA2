package com.example.agendiario;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "things")



public class thingstodobefore {

 
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "thingsId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "thingsDescription")
    private String mDescription;

    private Int mAge;

    public thingstodobefore(@Nullable String description, Int age, int grade, String creationDate) {
        mDescription = description;
        mAge = age;
        mGrade = grade;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDiscription(String description) {
        mDescription = description;
    }

    public Int getAge() {
        return mAge;
    }

    public void setAge(Int age) {
        mAge = age;
    }

    public int getGrade() {
        return mGrade;
    }

    public void setGrade(int grade) {
        mGrade = grade;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mGrade;
    private String mCreationDate;

}
